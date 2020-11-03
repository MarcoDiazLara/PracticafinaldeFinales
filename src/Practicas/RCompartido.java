package Practicas;
import java.util.ArrayList;
public class RCompartido {
    private String  datoCompartido;
    private Cerradura cerradura;
    private ArrayList<Interrupcion> interrupciones;
    private Mutex mutex;
    private boolean H[] = {false, false, false, false};
    private int turno;
    RCompartido(Cerradura c){
        datoCompartido = "";
        cerradura = c;
        interrupciones = new ArrayList<Interrupcion>();
        for(int i=0;i<10;i++){
            interrupciones.add(new Interrupcion());
        }
        mutex = new Mutex();
        turno = 0;
    }
    public String getDatoCompartido() {
        return datoCompartido;
    }
    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
    public boolean isCerradura() {
        return cerradura.getCerradura();
    }
    public void setCerradura(boolean C) {
        this.cerradura.setCerradura(C);
    }
    public ArrayList<Interrupcion> getInterrupciones(){
        return interrupciones;
    }
    public void setInterrupciones(ArrayList<Interrupcion> interrupciones){
        this.interrupciones = interrupciones;
    }
    public void bloquea(){
        for(Interrupcion i: interrupciones){
            i.setInter(false);
        }
    }
    public void desbloquea(){
        for(Interrupcion i: interrupciones){
            i.setInter(true);
        }    
    }
    public boolean isEntra(){
        boolean ban = false;
        for(Interrupcion i: interrupciones)
            if(i.isInter()){
                ban=true;
            }else {
                return false;
            }
        return ban;
    }
    public boolean[] getH() {
        return H;
    }
    public void setH(int p, boolean f) {
        this.H[p] = f;
    }
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
}