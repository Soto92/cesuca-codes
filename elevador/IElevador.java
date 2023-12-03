/**
 * Interface IElevador: Define os métodos a serem implementados
 *
 * @author Mauricio Soto, Rodrigo Pereira
 * @version 2022.06.13
 */
public interface IElevador {
  public void entra(int pessoas);

  public void sai(int pessoas);

  public void sobe();

  public void desce();

  public void setAndarAtual(int andar);

  public int getAndarAtual();

  public void setTotalAndares(int total);

  public int getTotalAndares();

  public void setPessoasDentro(int npessoas);

  public int getPessoasDentro();

  public void setCapacidade(int capacidade);

  public int getCapacidade();
}
