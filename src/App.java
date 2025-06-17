
//Importação
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.time.LocalDate;

public class App {
  // Função historico do animal
  public static void historicoAnimal(Scanner teclado, ArrayList<Animal> animais) {
    String idAnimal;
    boolean estado1 = true;
    while (estado1) {
      System.out.print("ID do Animal: ");
      idAnimal = teclado.nextLine();
      if (idAnimal.isEmpty()) {
        System.out.println("");
        System.out.print("Por favor informe o ID do animal!\n");
        System.out.println("");
      } else {
        if (animais.size() == 0) {
          System.out.println("");
          System.out.println("Ainda não existe nenhum registo!");
          System.out.println("");
          estado1 = false;
        } else {
          System.out.println("______HISTÓRICO DE CONSULTA DO ANIMAL______");
          for (Animal animal : animais) {
            System.out.println("");
            if (animal.getIdAnimal().equalsIgnoreCase(idAnimal)) {
              System.out.println("ID_ANIMAL: " + animal.getIdAnimal());
              System.out.println("NOME DO ANIMAL: " + animal.getNome());
              System.out.println("ESPECÍE: " + animal.getEspecie());
              System.out.println("IDADE: " + animal.getIdade());
              System.out.println("RAÇA: " + animal.getRaca());
              System.out.println("ID_PROPRIETÁRIO: " + animal.getIdProprietario());
              System.out.println("NOME PROPRIETÁRIO: " + animal.getNomeProprietario());
              System.out.println("CONTACTO: " + animal.getContacto());
              System.out.println("");
              estado1 = false;
            } else {
              // System.out.println("Animal não encontrado!\n");
              estado1 = false;
            }
          }
        }
        /*
         * for (Animal animal : animais) {
         * System.out.println(animal.getNome());
         * System.out.println(animal.getEspecie());
         * System.out.println(animal.getRaca());
         * System.out.println(animal.getIdAnimal());
         * System.out.println(animal.getNomeProprietario());
         * System.out.println(animal.getContacto());
         */
        /*
         * System.out.println(visita.getRaca());
         * System.out.println(visita.getIdAnimal());
         * System.out.println(visita.getContacto());
         * System.out.println(visita.getNomeProprietario());
         * System.out.println(visita.getIdProprietario());}
         */
      }
    }
  }

  // Função de consulta por proprietário
  public static void consultaAnimalPorProprietario(Scanner teclado, ArrayList<Animal> animais) {
    String idProprietario;
    boolean estado2 = true;
    while (estado2) {
      System.out.print("ID do proprietário: ");
      idProprietario = teclado.nextLine();
      if (idProprietario.isEmpty()) {
        System.out.println("");
        System.out.print("Por favor informe o ID do proprietário!\n");
        System.out.println("");
      } else {
        if (animais.size() == 0) {
          System.out.println("");
          System.out.println("Não existe nenhum registo!");
          System.out.println("");
          estado2 = false;
        } else {
          System.out.println("______ANIMAIS POR PROPRIETÁRIO______");
          for (Animal animal : animais) {
            System.out.println("");
            if (animal.getIdProprietario().equalsIgnoreCase(idProprietario)) {
              System.out.println("ID_ANIMAL: " + animal.getIdAnimal());
              System.out.println("NOME DO ANIMAL: " + animal.getNome());
              System.out.println("ESPECÍE: " + animal.getEspecie());
              System.out.println("IDADE: " + animal.getIdade());
              System.out.println("RAÇA: " + animal.getRaca());
              System.out.println("ID_PROPRIETÁRIO: " + animal.getIdProprietario());
              System.out.println("NOME PROPRIETÁRIO: " + animal.getNomeProprietario());
              System.out.println("CONTACTO: " + animal.getContacto());
              System.out.println("");
              estado2 = false;
            } else {
              // System.out.println("Proprietário não encontrado!\n");
              estado2 = false;
            }
          }
        }
      }
    }
  }

  // Função de consulta Dados do proprietário
  public static void consultaDadosProprietario(Scanner teclado, ArrayList<Animal> animais) {
    String idProprietario;
    boolean estado2 = true;
    while (estado2) {
      System.out.print("ID do proprietário: ");
      idProprietario = teclado.nextLine();
      if (idProprietario.isEmpty()) {
        System.out.println("");
        System.out.print("Por favor informe o ID do proprietário!\n");
        System.out.println("");
      } else {
        if (animais.size() == 0) {
          System.out.println("");
          System.out.println("Não existe nenhum registo!");
          System.out.println("");
          estado2 = false;
        } else {
          System.out.println("______DADOS DO PROPRIETÁRIO______");
          for (Animal animal : animais) { // Alterar a busca por id do proprietario
            System.out.println("");
            if (animal.getNomeProprietario().equalsIgnoreCase(idProprietario)) {
              System.out.println("ID_PROPRIETÁRIO: " + animal.getIdProprietario());
              System.out.println("NOME PROPRIETÁRIO: " + animal.getNomeProprietario());
              System.out.println("CONTACTO: " + animal.getContacto());
              System.out.println("");
              estado2 = false;
            } else {
              // System.out.println("Proprietário não encontrado!\n");
              estado2 = false;
            }
          }
        }
      }
    }
  }

  // Função de listagem de todos Animais
  public static void listagemTodosAnimais(Scanner teclado, ArrayList<Animal> animais) {
    System.out.println("______DADOS DOS ANIMAIS______");
    while (true) {
      for (Animal animal : animais) {
        System.out.println("");
        System.out.println("ID_ANIMAL: " + animal.getIdAnimal());
        System.out.println("NOME DO ANIMAL: " + animal.getNome());
        System.out.println("ESPECÍE: " + animal.getEspecie());
        System.out.println("IDADE: " + animal.getIdade());
        System.out.println("RAÇA: " + animal.getRaca());
        System.out.println("ID_PROPRIETÁRIO: " + animal.getIdProprietario());
        System.out.println("NOME PROPRIETÁRIO: " + animal.getNomeProprietario());
        System.out.println("CONTACTO: " + animal.getContacto());
        System.out.println("");
      }
      break;
    }
  }

  // Função de listagem de todos os proprietários
  public static void listagemTodosProprietarios(Scanner teclado, ArrayList<Animal> animais) {
    System.out.println("______DADOS DOS PROPRIETÁRIOS______");
    while (true) {
      for (Animal animal : animais) {
        System.out.println("ID_PROPRIETÁRIO: " + animal.getIdProprietario());
        System.out.println("NOME PROPRIETÁRIO: " + animal.getNomeProprietario());
        System.out.println("CONTACTO: " + animal.getContacto());
        System.out.println("");
      }
      break;
    }
  }

  // Função de histórico de visita por animal
  public static void historicoVisitaPorAnimal(Scanner teclado, ArrayList<Visita> visitas) {

  }

  // Função Registar animal Recebendo param(teclado, animais)
  public static void registarAnimal(Scanner teclado, ArrayList<Animal> animais, int anoActual) {
    while (true) {
      Animal animal = new Animal(); // Variavel auxiliar

      // Validação individualmente
      while (true) {
        System.out.print("Nome do animal: ");
        String nome = teclado.nextLine();

        if (nome.isEmpty()) {
          System.out.print("Nome não pode estar vazio!\n");
        } else {
          animal.setNome(nome);
          break;
        }
      }

      // Simulando dados vindo dum banco de dados
      String especiesAnimais[] = { "Canina", "Felina", "Aves", "Roedores", "Réptil", "Peixe", "Exótico" };
      String racasAnimais[][] = {
          { "Pastor alemão", "Labrador", "Pitbul", "Rafeiro", "Outro" },
          { "Siâmes", "Persa", "Outro" },
          { "Papagaio", "Arara", "Outro" },
          { "Coelho anão", "Outro" },
          { "Iguana Verde", "Gecko", "Outro" },
          { "Betta", "Neon", "Outro" },
          { "Cacatua", "Ferrent", "Outro" }
      };

      System.out.print("\n");
      System.out.print("Escolha a especíe: \n");
      for (int i = 0; i < especiesAnimais.length; i++) {
        System.out.println((i + 1) + " - " + especiesAnimais[i]);
      }

      while (true) {
        try {
          int opcaoEspecie = teclado.nextInt();
          if ((opcaoEspecie < 1) || (opcaoEspecie > especiesAnimais.length)) {
            System.out.print("Opção inválida!\n");
            teclado.nextLine();
          } else {
            animal.setEspecie(especiesAnimais[opcaoEspecie - 1]);
            System.out.print("Escolha a raça: \n");
            for (int c = 0; c < racasAnimais[opcaoEspecie - 1].length; c++) {
              System.out.println((c + 1) + " - " + racasAnimais[opcaoEspecie - 1][c]);
            }
            int opcaoRaca = teclado.nextInt();
            if ((opcaoRaca < 1) || (opcaoRaca > racasAnimais[opcaoEspecie - 1].length)) {
              System.out.print("Opção inválida!\n");
            } else {
              animal.setRaca(racasAnimais[opcaoEspecie - 1][opcaoRaca - 1]);
              break;
            }
          }

        } catch (InputMismatchException e) {
          System.out.print("Apenas numeros!\n");
          teclado.nextLine();
        }
      }

      while (true) {
        System.out.print("Ano de nascimento do animal: ");
        try {
          int ano = teclado.nextInt();
          if (ano < 0 || ano > anoActual || ano < 2000) {
            System.out.print("Informe um ano válido!\n");
          } else {
            // Certificando que o cálculo da idade não seja superior a 5
            if (ano < (anoActual - 5)) {
              System.out.print("Informe um ano em que quando retornar a idade seja menor que 5 anos!\n");
            } else {
              animal.setAnoNasc(ano);
              break;
            }
          }
        } catch (InputMismatchException e) {
          System.out.print("Apenas numero!\n");
          teclado.nextLine();
        }
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
  public static void registarVisita(Scanner teclado, ArrayList<Visita> visitas, ArrayList<Animal> animais) {
    while (true) {
      Visita visita = new Visita();// Variavel auxiliar
      int n = 0, limit = 0;

      if (animais.size() == 0) {
        System.out.println("Não existe nenhum animal cadastrado!");
        break;
      } else {
        System.out.print("Tipo de  visita: ");
        String tipo_visita = teclado.nextLine();
        visita.setTipoVisita(tipo_visita);

        System.out.println("O animal: ");
        do {
          for (Animal animal : animais) {
            System.out.println(((n++) + 1) + " - " + animal.getNome());
          }
          // n++;
          limit = ((n++) + 1);
          break;
        } while (true);

        while (true) {
          try {
            int opcao = teclado.nextInt();
            if (opcao < 0 || opcao > (limit - 1)) {
              System.out.println("Opção inválida!");
            } else {
              visita.setNome(animais.get(opcao - 1).getNome());
              break;
            }
          } catch (InputMismatchException e) {
            System.out.print("Informe apenas numero!");
            teclado.nextInt();
          }
        }

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
    /*
     * System.out.format("DADOS\n");
     * for (Visita visita : visitas) {
     * System.out.println(visita.getIdVisita());
     * System.out.println(visita.getNome_veterinario());
     * System.out.println(visita.getCusto_servico());
     * System.out.println(visita.getIdVisita());
     * System.out.println(visita.getNome());
     * }
     */
  }

  public static void consultas(Scanner teclado, ArrayList<Animal> animais) {
    int opcao;
    boolean estado = true;

    while (estado) {
      try {
        System.out.print("1 - Histórico de um animal\n");
        System.out.print("2 - Animais por proprietário\n");
        System.out.print("3 - Proprietário\n");
        System.out.print("4 - Voltar\n");
        opcao = teclado.nextInt();
        switch (opcao) {
          case 1:
            teclado.nextLine();
            historicoAnimal(teclado, animais);
            break;
          case 2:
            teclado.nextLine();
            consultaAnimalPorProprietario(teclado, animais);
            break;
          case 3:
            teclado.nextLine();
            consultaDadosProprietario(teclado, animais);
            break;
          case 4:
            estado = false;
            break;
          default:
            System.out.print("Opção inválida!\n");
        }
      } catch (InputMismatchException e) {
        System.out.print("Apenas Numeros!\n");
        teclado.nextLine();
      }
    }

  }

  public static void listar(Scanner teclado, ArrayList<Animal> animais, ArrayList<Visita> visitas) {
    int opcao;
    boolean estado = true;

    while (estado) {
      try {
        System.out.print("1 - Todos Animais\n");
        System.out.print("2 - Todos Proprietários\n");
        System.out.print("3 - Histórico de visita por animal\n");
        System.out.print("4 - Voltar\n");
        opcao = teclado.nextInt();
        switch (opcao) {
          case 1:
            teclado.nextLine();
            listagemTodosAnimais(teclado, animais);
            break;
          case 2:
            teclado.nextLine();
            listagemTodosProprietarios(teclado, animais);
            break;
          case 3:
            teclado.nextLine();
            historicoVisitaPorAnimal(teclado, visitas);
            break;
          case 4:
            estado = false;
            break;
          default:
            System.out.print("Opção inválida!\n");
        }
      } catch (InputMismatchException e) {
        System.out.print("Apenas Numeros!\n");
        teclado.nextLine();
      }
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
            registarVisita(teclado, visitas, animais);
            break;
          case 3:
            consultas(teclado, animais);
            break;
          case 4:
            listar(teclado, animais, visitas);
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