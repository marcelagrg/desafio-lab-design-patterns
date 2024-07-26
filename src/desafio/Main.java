package desafio;

import desafio.strategy.Comportamento;
import desafio.strategy.ComportamentoAgressivo;
import desafio.strategy.ComportamentoDefensivo;
import desafio.strategy.ComportamentoNormal;

public class Main {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.RoboPronto();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.acao();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.acao();
        robo.mover();
        robo.DesligarRobo();
    }
}