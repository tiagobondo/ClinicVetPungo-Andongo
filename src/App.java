
//Importação
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.time.LocalDate;

public class App {
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

      teclado.nextLine();

      // Gerando id automaticamente
      animal.setId_animal();

      System.out.print("Nome do proprietário: ");
      String nomeProprietario = teclado.nextLine();
      animal.setNomeProprietario(nomeProprietario);

      System.out.print("Contacto: ");
      int contactoProprietario = teclado.nextInt();
      animal.setContacto(contactoProprietario);

      // Gerando Id automaticamente do proprietario
      animal.setId_proprietario();

      animais.add(animal);
      break;
    }

    /*
     * System.out.format("DADOS\n");
     * for (Animal animal : animais) {
     * System.out.println(animal.getNome());
     * System.out.println(animal.getEspecie());
     * System.out.println(animal.getRaca());
     * System.out.println(animal.getIdAnimal());
     * System.out.println(animal.getContacto());
     * System.out.println(animal.getNomeProprietario());
     * System.out.println(animal.getIdProprietario());}
     */
  }

  // Função Registar visita Recebendo param(teclado, animais)
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
        System.out.println("1 - Registar Animal");
        System.out.println("2 - Registar Visita");
        System.out.println("3 - Consultar");// Historico de um animal, Animal por proprietario,
        System.out.println("4 - Listar");// Proprietário, Animal, Listar animal por proprietario
        System.out.println("5 - Ficheiros");// Guardar ficheiros, carregar ficheiros
        System.out.println("6 - Sair");
        System.out.print("\n");//

        System.out.print("Opção: ");
        op = teclado.nextInt();

        switch (op) {
          case 1:
            teclado.nextLine();// Limpando o buffer do teclado
            registarAnimal(teclado, animais, anoActual);
            break;
          case 2:
            teclado.nextLine();// Limapando o buffer do teclado
            registarVisita(teclado, visitas);
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
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