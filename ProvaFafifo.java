public class ProvaFafifo extends ProvaUniversidade{
     public ProvaFafifo (double av1, double av2){
        super(av1, av2);}
     
     public boolean aprovado() {
        return CalcularMedia() >= 6.0;
    }
}
