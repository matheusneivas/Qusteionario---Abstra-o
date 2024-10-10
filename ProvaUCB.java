public class ProvaUCB extends ProvaUniversidade{
    public ProvaUCB (double av1, double av2){
        super(av1, av2);}
   
    public boolean aprovado() {
        return CalcularMedia() >= 7.0;
    }

}
