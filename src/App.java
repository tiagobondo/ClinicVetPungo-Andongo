
//Importação
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class App {

  // Função Registar proprietário Recebendo params(teclado, proprietarios)
  public static void registarProprietario(Scanner teclado, ArrayList<Propretario> proprietarios) {

    while (true) {
      Propretario proprietario = new Propretario(); // Variavel auxiliar

      System.out.print("Nome do proprietário: ");
      String nome = teclado.nextLine();
      proprietario.setNome(nome);

      System.out.print("Numero de telefone: ");
      int contacto = teclado.nextInt();
      proprietario.setContacto(contacto);

      // Gerando o Id do proprietário
      proprietario.setId_proprietario();

      // Adicionar todas as pessoas no ArrayList
      proprietarios.add(proprietario);
      break;
    }

    /*
     * System.out.format("DADOS\n");
     * for (Propretario propretario : proprietarios) {
     * System.out.println(propretario.getNome());
     * System.out.println(propretario.getContacto());
     * System.out.println(propretario.getIdProprietario());
     * }
     */

    // System.out.print("SIZE " + proprietarios.size());

  }

  public static void main(String[] args) {
    // Declaração do arrayList
    ArrayList<Propretario> proprietarios = new ArrayList<Propretario>();
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
            registarProprietario(teclado, proprietarios);
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