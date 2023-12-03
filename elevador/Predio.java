/**
 * Classe Predio: Manipula e controla a movimentação do elevador
 *
 * @author Mauricio Soto, Rodrigo Pereira
 * @version 2021.1010
 */
import java.util.Scanner;

public class Predio {

  static void menu() {
    System.out.println();
    System.out.println("========== MENU ELEVADOR ==========");
    System.out.println("1 - Entra pessoas");
    System.out.println("2 - Sai Pessoas");
    System.out.println("3 - Vai para andar");
    System.out.println("9 - Encerra programa");
  }

  public static void main(String[] args) {
    Elevador elevador = new Elevador(10, 20);

    boolean sai = false;
    while (!sai) {
      Scanner prompt = new Scanner(System.in);
      int op, pessoas, andar;

      elevador.painel();
      menu();
      System.out.println("Opção: ");

      op = prompt.nextInt();

      // Testa a opção
      switch (op) {
        case 1:
          System.out.println("Quantas pessoas deseja adicionar?");
          pessoas = prompt.nextInt();
          elevador.entra(pessoas);
          break;
        case 2:
          System.out.println("Quantas pessoas deseja remover?");
          pessoas = prompt.nextInt();
          elevador.sai(pessoas);
          break;
        case 3:
          System.out.println("Para qual andar deseja ir?");
          andar = prompt.nextInt();
          elevador.goTo(andar);
          break;
        case 9:
          sai = true;
          System.out.println("PROGRAMA ENCERRADO !!!");
          break;
        default:
          System.out.println("Opção inexistente!");
          break;
      }
    }
  }
}
