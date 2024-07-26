package desafio.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente");
    }

    @Override
    public void acao(){
        System.out.println("Atacando");
    }
}

