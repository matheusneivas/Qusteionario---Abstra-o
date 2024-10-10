public class Teste {
    public static void main(String[] args) {
        ProvaUCB provaUCB = new ProvaUCB(7.1, 9.0);
        System.out.println("Aluno UCB: " + (provaUCB.aprovado() ? "Aprovado" : "Reprovado"));
    
        ProvaFafifo provaFafifo = new ProvaFafifo(6.3, 9.0);
        System.out.println("Aluno Fafifo: " + (provaFafifo.aprovado() ? "Aprovado" : "Reprovado"));
    }}
