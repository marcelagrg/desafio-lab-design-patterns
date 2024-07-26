package desafio;

import desafio.facade.Desligar;
import desafio.facade.LerComandos;
import desafio.facade.Ligar;
import desafio.facade.VerificarBateria;
import desafio.strategy.Comportamento;

public class Robo {

    private Ligar ligar;
    private Desligar desligar;
    private VerificarBateria verificarBateria;
    private LerComandos lerComandos;

    public Robo(){
        this.ligar = new Ligar();
        this.verificarBateria = new VerificarBateria();
        this.lerComandos = new LerComandos();
        this.desligar = new Desligar();

    }

    public void RoboPronto(){
        ligar.ligando();
        verificarBateria.bateria();
        lerComandos.comandos();
        System.out.println("Robô pronto para a batalha.");
    }

    public void DesligarRobo(){
        desligar.desligando();
    }


    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }
    public void mover(){
        comportamento.mover();
    }

    public void acao(){
        comportamento.acao();

    }
}
