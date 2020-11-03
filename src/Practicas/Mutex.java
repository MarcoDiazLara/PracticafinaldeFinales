package Practicas;
public class Mutex {
    private boolean pase = false;
    Mutex(){
    
    }
    public void lock(){
        try{
            wait();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void unlock(){
        notify();
    }
    public boolean trylock(){
        try{
            wait();
        }catch(Exception e){}
        finally{
            unlock();
            return false;
        }
    }
    
}
