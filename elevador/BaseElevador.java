/**
 * Classe Abstrata BaseElevador: Implementa as funções base do Elevador
 *
 * @author Mauricio Soto, Rodrigo Pereira
 * @version 2022.06.13
 */
import java.util.concurrent.TimeUnit;

public abstract class BaseElevador implements IElevador {

  // Atributos da Classe
  protected int andar_atual = 0;
  protected int total_andares;
  protected int capacidade;
  protected int pessoas_dentro;

  // Constantes
  private final int SOBE = 1;
  private final int DESCE = -1;

  /*
   * Método painel: Exibe painel do Elevador
   */
  public void painel() {
    System.out.print('\u000C');
    for (int i = this.getTotalAndares(); i >= 0; i--) {
      if (this.getAndarAtual() == i) {
        System.out.printf("%2d [%2d] %n", i, this.getPessoasDentro());
      } else {
        System.out.printf("%2d ---- %n", i);
      }
    }
  }

  /*
   * Método GoTo: movimenta o elevador para o andar desejado (to)
   */
  public void goTo(int to) {
    int total_andares = this.getTotalAndares();
    int from = this.getAndarAtual();
    /* Testa se é possível ir para o andar */
    if (to >= 0 && to <= total_andares) {
      // movimenta o elevador
      if (to > from) {
        for (int i = from; i < to; i++) {
          this.movimenta(this.SOBE);
        }
      } else {
        for (int i = from; i > to; i--) {
          this.movimenta(this.DESCE);
        }
      }
    }
  }

  /*
   * Método movimenta: faz elevador subir ou descer conforme a direcao
   */
  public void movimenta(int direcao) {
    timer(1);
    if (direcao == this.SOBE) {
      this.sobe();
    } else {
      this.desce();
    }
    this.painel();
  }

  /*
   * Function timer: espera seconds (s) para continuar
   */
  static void timer(int seconds) {
    try {
      TimeUnit.SECONDS.sleep(seconds);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public void entra(int pessoas) {
    int capacidadeAtual = this.getCapacidade() - this.getPessoasDentro();
    if (pessoas <= capacidadeAtual) {
      this.setPessoasDentro(this.getPessoasDentro() + pessoas);
    } else {
      this.setPessoasDentro(this.capacidade);
    }
  }

  public void sai(int pessoas) {
    if (pessoas <= this.getPessoasDentro()) {
      this.setPessoasDentro(this.getPessoasDentro() - pessoas);
    } else {
       this.setPessoasDentro(0);
    }
  }

  public void sobe() {
    if (this.getAndarAtual() < this.getTotalAndares()) {
      this.setAndarAtual(this.getAndarAtual() + 1);
    } else {
      System.out.println("O elevador já está no último andar.");
    }
  }

  public void desce() {
    if (this.getAndarAtual() > 0) {
      this.setAndarAtual(this.getAndarAtual() - 1);
    } else {
      System.out.println("O elevador já está no térreo. Não é possível descer mais.");
    }
  }

  public void setAndarAtual(int andar) {
    this.andar_atual = andar;
  }

  public int getAndarAtual() {
    return this.andar_atual;
  }

  public void setTotalAndares(int total) {
    this.total_andares = total;
  }

  public int getTotalAndares() {
    return this.total_andares;
  }

  public void setPessoasDentro(int npessoas) {
    this.pessoas_dentro = npessoas;
  }

  public int getPessoasDentro() {
    return this.pessoas_dentro;
  }

  public int getCapacidade() {
    return this.capacidade;
  }
}
