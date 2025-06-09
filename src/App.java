
//Importação
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int op;
    boolean estado = true;
    // Opções de escolhas
    System.out.println("ESCOLHA UMA DAS OPÇÕES");
    System.out.println("1 - Registar proprietário");
    System.out.println("2 - Registar animal");
    System.out.println("3 - Registar visita");
    System.out.println("4 - Consultar dados");
    System.out.println("5 - Guardar dados em ficheiro");
    System.out.println("6 - Carregar dados do ficheiro");
    System.out.println("7 - Sair");

    while (estado) {
      try {
        System.out.print(": ");
        op = teclado.nextInt();

        switch (op) {
          case 1:
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
            estado = false;
            break;
          default:
            System.out.println("Opção inválida!");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Escolha apenas numeros!");
        teclado.nextLine();
      }
    }
  }
}