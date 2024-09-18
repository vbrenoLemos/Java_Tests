package Projects.domain;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
        }
        else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void lutar(){
      if(this.aprovada){
          System.out.println("---DESAFIADO---");
          this.desafiado.apresentar();
          System.out.println("---DESAFIANTE---");
          this.desafiante.apresentar();

          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3);

          switch (vencedor){
              case 0:
                  System.out.println("Empate !!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
              case 1:
                  System.out.println("Vitória de "+ desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
              case 2:
                  System.out.println("Vitória de " + desafiante.getNome());
                  desafiante.ganharLuta();
                  desafiado.perderLuta();
                  break;
          }
      }
      else {
          System.out.println("Luta não foi aprovada");
      }
    }
}
