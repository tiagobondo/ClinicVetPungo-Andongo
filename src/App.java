
//Importação
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.time.LocalDate;

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

  // Função Registar animal Recebendo param(teclado, animais)
  public static void registarAnimal(Scanner teclado, ArrayList<Animal> animais, int anoActual) {
    while (true) {
      Animal animal = new Animal(); // Variavel auxiliar

      System.out.print("Nome do animal: ");
      String nome = teclado.nextLine();
      animal.setNome(nome);

      System.out.print("Espécie: ");
      String especie = teclado.nextLine();
      animal.setEspecie(especie);

      System.out.print("Raça: ");
      String raca = teclado.nextLine();
      animal.setRaca(raca);

      System.out.print("Ano de nascimento do animal: ");
      int ano = teclado.nextInt();
      // Certificando que o cálculo da idade não seja superior a 5
      if (ano < (anoActual - 5)) {
        System.out.print("Ano inválido!");
      } else {
        animal.setAnoNasc(ano);
      }
      // Gerando id automaticamente
      animal.setId_animal();

      animais.add(animal);
      break;
    }
  }

  // Função Registar animal Recebendo param(teclado, animais)
  public static void registarVisita(Scanner teclado, ArrayList<Visita> visitas) {
    while (true) {
      Visita visita = new Visita();// Variavel auxiliar

      System.out.print("Tipo de  visita: ");
      String tipo_visita = teclado.nextLine();
      visita.setTipoVisita(tipo_visita);

      System.out.print("Custo do serviço: ");
      Double custo_servico = teclado.nextDouble();
      visita.setCusto_servico(custo_servico);

      teclado.nextLine();// Limpando o buffer do teclado

      System.out.print("Nome do  veterinario: ");
      String nome_veterinario = teclado.nextLine();
      visita.setNome_veterinario(nome_veterinario);

      System.out.print("Observação: ");
      String observacao = teclado.nextLine();
      visita.setObservacao(observacao);

      // Gerando id automaticamente
      visita.setIdVisita();

      visitas.add(visita);
      break;
    }

  }

  public static void main(String[] args) {
    // Declaração do arrayList proprietarios
    ArrayList<Propretario> proprietarios = new ArrayList<Propretario>();
    // Declaração do arrayList animais
    ArrayList<Animal> animais = new ArrayList<Animal>();
    // Declaração do arrayList viiitas
    ArrayList<Visita> visitas = new ArrayList<Visita>();

    Scanner teclado = new Scanner(System.in);
    int op;
    boolean estado = true;
    //
    LocalDate anoSystem = LocalDate.now();
    int anoActual = anoSystem.getYear();

    while (estado) {
      try {
        // Opções de escolhas
        System.out.print("\n");
        System.out.println("SEJA BEM-VINDO À CLÍNICA VETERINÁRIA PUNGO-ANDONGO");
        System.out.println("1 - Proprietário");
        System.out.println("2 - Animal");
        System.out.println("3 - Visita");
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
            teclado.nextLine();// Limpando o buffer do teclado
            registarAnimal(teclado, animais, anoActual);
            break;
          case 3:
            teclado.nextLine();// Limapando o buffer do teclado
            registarVisita(teclado, visitas);
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