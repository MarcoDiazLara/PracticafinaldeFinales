package Practicas;
import javax.swing.JTextArea;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Hilo extends Thread {
    private JTextArea area;
    
    private RCompartido rc;
    private final static int ini = 195;
    private final static int fin = 200;
    private boolean dead = false;
    private Lock mutex;
    private int algoritmo = 0;
    private boolean H[];
    private int turno;
    private boolean D[] = {false, false};
    private boolean D2[] = {false, false};
    private boolean D3[] = {false, false};
    boolean d1, d2, d3, d4;
    
    Hilo(JTextArea area, RCompartido rc){
        this.area = area;
        this.rc = rc;
        mutex = new ReentrantLock();
        turno = rc.getTurno();
        
    }
    public void run(){
        switch(getAlgoritmo()){
            case 0:
               
                while(true){
                    try{
                        rc.setDatoCompartido(this.getName());
                        area.append(rc.getDatoCompartido() + "\n");
                        if(isDead()){
                            stop();
                        }
                       
                        Thread.sleep((int)(ini + Math.random() * fin));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                
                }
            case 1:
                while(true){
                    try{
                        if(rc.isEntra()){
                            rc.bloquea();
                            rc.setDatoCompartido(this.getName());
                            area.append(rc.getDatoCompartido() + "\n");
                            if(isDead()){
                                stop();
                            }
                            rc.desbloquea();
                        }else{
                            area.append("Esperando...\n");
                        }
                        Thread.sleep((int)(ini + Math.random() * fin));
                    }catch(Exception e){
                        //System.out.println(e.getMessage());
                    }
                }
            case 2:
                
                while(true){
                    try{
                        if(!rc.isCerradura()){
                            rc.setCerradura(true);
                            rc.setDatoCompartido(this.getName());
                            area.append(rc.getDatoCompartido() + "\n");
                            if(isDead()){
                                stop();
                            }
                            rc.setCerradura(false);
                        }else{
                            area.append("Esperando...\n");
                        }
                        Thread.sleep((int)(ini + Math.random() * fin));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            case 3:
             while(true){
                    try{
                        d1 = false;
                        d2 = false;
                        d3 = false;
                        d4 = false;
                        if(rc.getTurno() == 0 || rc.getTurno() == 1){
                            D[0] = true;
                        }
                        if(rc.getTurno() == 2 || rc.getTurno() == 3){
                            D[1] = true;
                        }
                        if(rc.getTurno() == 0 || rc.getTurno() == 1){
                            while(D[1]){
                                if(rc.getTurno() == 2 || rc.getTurno() == 3){
                                    D[0] = false;
                                    while(rc.getTurno() == 2 || rc.getTurno() == 3){}
                                    D[0] = true;
                                }
                            }
                            //System.out.println(rc.getTurno() + "0" + "Seccion Critica\n\n");
                            while(!d1 && !d2){
                                if(rc.getTurno() == 0){
                                    D2[0] = true;
                                }
                                if(rc.getTurno() == 1){
                                    D2[1] = true;
                                }
                                if(rc.getTurno() == 0 && !d1){
                                    while(D2[1]){
                                        if(rc.getTurno() != 0){
                                            D2[0] = false;
                                            while(rc.getTurno() != 0){}
                                            D2[0] = true;
                                        }
                                    }
                                    rc.setDatoCompartido(this.getName());
                                    area.append(rc.getDatoCompartido() + "\n");
                                    if(isDead()){
                                        stop();
                                    }
                                    d1 = true;
                                    System.out.println(getName());
                                }else{
                                    if(rc.getTurno() == 1 && !d2){
                                        while(D2[0]){
                                            if(rc.getTurno() != 1){
                                                D2[1] = false;
                                                while(rc.getTurno() != 1){}
                                                D2[1] = true;
                                            }
                                        }
                                        rc.setDatoCompartido(this.getName());
                                        area.append(rc.getDatoCompartido() + "\n");
                                        if(isDead()){
                                            stop();
                                        }
                                        d2 = true;
                                        System.out.println(getName());
                                    }
                                }
                                if(rc.getTurno() == 0){
                                    D2[0] = false;
                                    rc.setTurno(1);
                                }
                                if(rc.getTurno() == 1){
                                    D2[1] = false;
                                    rc.setTurno(2);
                                }
                            }
                        }else{
                            if(rc.getTurno() == 2 || rc.getTurno() == 3){
                                while(D[0]){
                                    if(rc.getTurno() == 0 || rc.getTurno() == 1){
                                        D[1] = false;
                                        while(rc.getTurno() == 0 || rc.getTurno() == 1){}
                                        D[1] = true;
                                    }
                                }
                                //System.out.println(rc.getTurno() + "2" + "Seccion Critica\n\n");
                                while(!d3 && !d4){
                                    if(rc.getTurno() == 2){
                                        D3[0] = true;
                                    }
                                    if(rc.getTurno() == 3){
                                        D3[1] = true;
                                    }
                                    if(rc.getTurno() == 2 && !d3){
                                        while(D3[1]){
                                            if(rc.getTurno() != 2){
                                                D3[0] = false;
                                                while(rc.getTurno() != 2){}
                                                D3[0] = true;
                                            }
                                        }
                                        rc.setDatoCompartido(this.getName());
                                        area.append(rc.getDatoCompartido() + "\n");
                                        if(isDead()){
                                            stop();
                                        }
                                        d3 = true;
                                        System.out.println(getName());
                                    }else{
                                        if(rc.getTurno() == 3 && !d4){
                                            while(D3[0]){
                                                if(rc.getTurno() != 3){
                                                    D3[1] = false;
                                                    while(rc.getTurno() != 3){}
                                                    D3[1] = true;
                                                }
                                            }
                                            rc.setDatoCompartido(this.getName());
                                            area.append(rc.getDatoCompartido() + "\n");
                                            if(isDead()){
                                                stop();
                                            }
                                            d4 = true;
                                            System.out.println(getName());
                                        }
                                    }    
                                    if(rc.getTurno() == 2){
                                        D3[0] = false;
                                        rc.setTurno(3);
                                    }
                                    if(rc.getTurno() == 3){
                                        D3[1] = false;
                                        rc.setTurno(0);
                                    }
                                }
                            }
                        }
                        if(rc.getTurno() == 1 || rc.getTurno() == 2){
                            D[0] = false;
                        }else{
                            D[1] = false;
                        }
                        Thread.sleep((int)(ini + Math.random() * fin));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
              
            
            case 4:
              break;
            case 5:
                
                while(true){
                    try{
                        mutex.lock();
                        rc.setDatoCompartido(this.getName());
                        area.append(rc.getDatoCompartido() + "\n");
                        if(isDead()){
                            stop();
                        }
                        mutex.unlock();
                        Thread.sleep((int)(ini + Math.random() * fin));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }   
        }
    }
    public boolean isDead() {
        return dead;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }
    public int getAlgoritmo() {
        return algoritmo;
    }
    public void setAlgoritmo(int algoritmo) {
        this.algoritmo = algoritmo;
    } 
    public int Ocupada(){
        boolean b[] = rc.getH();
        for(int i=0;i<b.length;i++){
            if(rc.getTurno() != i){
                if(b[i]){
                    return i; 
                }
            }
        }
        return -1;
    }
}