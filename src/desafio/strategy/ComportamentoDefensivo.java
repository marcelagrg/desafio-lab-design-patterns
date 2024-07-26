package desafio.strategy;

public class ComportamentoDefensivo implements Comportamento {

    public void mover() {
        System.out.println("Movendo-se defensivamente");
    }

    @Override
    public void acao(){
        System.out.println("Defendendo");
    }
}


