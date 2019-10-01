
package questao4;

public class ControleRemoto {
    
    Televisão tv = new Televisão();
    
    public void aumentarvolume(){
        if(tv.volume <100){
            tv.volume = tv.volume + 1;
        }
    }
     public void diminuirvolume(){
        if(tv.volume > 0){
            tv.volume = tv.volume - 1;
        }
    }
     
     public void subircanal(){
        if(tv.canais < 10){
            tv.canais = tv.canais + 1;
        }
    }
     
     public void descercanal(){
        if(tv.canais > 0){
            tv.canais = tv.canais - 1;
        }
    }
     
     public int consultarvol(){
         return tv.volume;
     }
     
     public int consultarcan(){
         return tv.canais;
     }
    
}
