
//Importação
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class App {

  // Função Registar proprietário
  public static void registarProprietario(Scanner teclado) {
    // Declaração do arrayList
    ArrayList<Propretario> proprietarios = new ArrayList<Propretario>();
    Propretario proprietario = new Propretario(); // Variavel auxiliar

    System.out.print("Nome do proprietário: ");
    String nome = teclado.nextLine();
    proprietario.setNome(nome);

    System.out.print("Numero de telefone: ");
    int contacto = teclado.nextInt();
    proprietario.setContacto(contacto);

    // Adicionar todas as pessoas no ArrayList
    proprietarios.add(proprietario);
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int op;
    boolean estado = true;

    while (estado) {
      try {
        // Opções de escolhas
        System.out.print("\n");
        System.out.println("SEJA BEM-VINDO À CLÍNICA VETERINÁRIA PUNGO-ANDONGO");
        System.out.println("1 - Registar proprietário");
        System.out.println("2 - Registar animal");
        System.out.println("3 - Registar visita");
        System.out.println("4 - Consultar dados");
        System.out.println("5 - Guardar dados em ficheiro");
        System.out.println("6 - Carregar dados do ficheiro");
        System.out.println("7 - Sair");
        System.out.print("\n");

        System.out.print("Opção: ");
        op = teclado.nextInt();

        switch (op) {
          case 1:
            teclado.nextLine();// Limpando o buffer do teclado
            registarProprietario(teclado);
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