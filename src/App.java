
//Importação
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.time.LocalDate;

public class App {

  // Função Carregar Arquivo Animal
  public static void carregarArquivosAnimal(Scanner teclado) {
    try {
      File ficheiroAnimal = new File("animal.txt");
      teclado = new Scanner(ficheiroAnimal);

      System.out.print("\n");
      while (teclado.hasNextLine()) {
        String linha = teclado.nextLine();
        System.out.println(linha);
      }
      System.out.print("\n");
      teclado.close();
    } catch (FileNotFoundException e) {
      System.out.println("Fincheiro nao encontrado!");
      e.printStackTrace();
    }
  }

  // Função Carregar Arquivo Visita
  public static void carregarArquivosVisita(Scanner teclado) {
    try {
      File ficheiroVisita = new File("visita.txt");
      teclado = new Scanner(ficheiroVisita);

      System.out.print("\n");
      while (teclado.hasNextLine()) {
        String linha = teclado.nextLine();
        System.out.println(linha);
      }
      System.out.print("\n");
      teclado.close();
    } catch (FileNotFoundException e) {
      System.out.println("Fincheiro nao encontrado!");
      e.printStackTrace();
    }
  }

  // Funcao para carregar os arquivos
  public static void carregarDadosArquivos(Scanner teclado) {
    int opcao;
    boolean estado = true;

    while (estado) {
      try {
        System.out.print("1 - Dados do Arquivo Animal\n");
        System.out.print("2 - Dados do Arquivo Visita\n");
        System.out.print("3 - Voltar\n");
        opcao = teclado.nextInt();
        switch (opcao) {
          case 1:
            teclado.nextLine();
            carregarArquivosAnimal(teclado);
            break;
          case 2:
            teclado.nextLine();
            carregarArquivosVisita(teclado);
            break;
          case 3:
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

  // Função historico do animal
  public static void historicoAnimal(Scanner teclado, ArrayList<Animal> animais) {
    String idAnimalOUNOME;
    boolean estado1 = true;
    while (estado1) {
      System.out.print("ID do Animal e/ou Nome: ");
      idAnimalOUNOME = teclado.nextLine();
      if (idAnimalOUNOME.isEmpty()) {
        System.out.println("");
        System.out.print("Por favor informe o ID do animal e/ou Nome!\n");
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
            if (animal.getIdAnimal().equalsIgnoreCase(idAnimalOUNOME)
                || animal.getNome().equalsIgnoreCase(idAnimalOUNOME)) {
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
    String idProprietarioOUNOME;
    boolean estado2 = true;
    while (estado2) {
      System.out.print("ID do proprietário e/ou Nome: ");
      idProprietarioOUNOME = teclado.nextLine();
      if (idProprietarioOUNOME.isEmpty()) {
        System.out.println("");
        System.out.print("Por favor informe o ID do proprietário e/ou Nome!\n");
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
            if (animal.getIdProprietario().equalsIgnoreCase(idProprietarioOUNOME)
                || animal.getNomeProprietario().equalsIgnoreCase(idProprietarioOUNOME)) {
              System.out.println("ID_PROPRIETÁRIO: " + animal.getIdProprietario());
              System.out.println("NOME PROPRIETÁRIO: " + animal.getNomeProprietario());
              System.out.println("CONTACTO: " + animal.getContacto());
              System.out.println("ID_ANIMAL: " + animal.getIdAnimal());
              System.out.println("NOME DO ANIMAL: " + animal.getNome());
              System.out.println("ESPECÍE: " + animal.getEspecie());
              System.out.println("IDADE: " + animal.getIdade());
              System.out.println("RAÇA: " + animal.getRaca());
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
            if (animal.getIdProprietario().equalsIgnoreCase(idProprietario)) {
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
    String nomeAnimalOUID;
    boolean estado2 = true;
    while (estado2) {
      System.out.print("Nome do animal e/ou ID de visita: ");
      nomeAnimalOUID = teclado.nextLine();
      if (nomeAnimalOUID.isEmpty()) {
        System.out.println("");
        System.out.print("Por favor informe o nome do animal!\n");
        System.out.println("");
      } else {
        if (visitas.size() == 0) {
          System.out.println("");
          System.out.println("Não existe nenhum histórico!");
          System.out.println("");
          estado2 = false;
        } else {
          System.out.println("______HISTÓRICO ANIMAL______");
          for (Visita visita : visitas) {
            System.out.println("");
            if (visita.getNome().equalsIgnoreCase(nomeAnimalOUID)
                || visita.getIdVisita().equalsIgnoreCase(nomeAnimalOUID)) {
              System.out.println("ID VISITA: " + visita.getIdVisita());
              System.out.println("NOME DO ANIMAL: " + visita.getNome());
              System.out.println("TIPO DE VISITA: " + visita.getTipoVisita());
              System.out.println("CUSTO (AOA, USD, EUR): " + visita.getCusto_servico());
              System.out.println("NOME DO VETERINÁRIO: " + visita.getNome_veterinario());
              System.out.println("OBSERVAÇÃO: " + visita.getObservacao());
              System.out.println("QUANTIDADE DE VISITA: " + visita.getQntyVisita());
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

  // Função Registar animal Recebendo param(teclado, animais)
  public static void registarAnimal(Scanner teclado, ArrayList<Animal> animais, int anoActual, FileWriter escritor)
      throws IOException {
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
          // escrevendo os dados do animal no arquivo de texto
          escritor.write("DADOS DO ANIMAL\n");
          escritor.write("Nome do animal: " + nome + "\n");
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
            // escrevendo os dados do animal no arquivo de texto
            escritor.write("Espécie: " + especiesAnimais[opcaoEspecie - 1] + "\n");
            System.out.print("Escolha a raça: \n");
            for (int c = 0; c < racasAnimais[opcaoEspecie - 1].length; c++) {
              System.out.println((c + 1) + " - " + racasAnimais[opcaoEspecie - 1][c]);
            }
            int opcaoRaca = teclado.nextInt();
            if ((opcaoRaca < 1) || (opcaoRaca > racasAnimais[opcaoEspecie - 1].length)) {
              System.out.print("Opção inválida!\n");
            } else {
              animal.setRaca(racasAnimais[opcaoEspecie - 1][opcaoRaca - 1]);
              // escrevendo os dados do animal no arquivo de texto
              escritor.write("Raça: " + racasAnimais[opcaoEspecie - 1][opcaoRaca - 1] + "\n");
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
              // escrevendo os dados do animal no arquivo de texto
              escritor.write("Idade: " + (anoActual - ano) + "\n");
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

      escritor.write("PROPRIETÁRIO\n");

      System.out.print("Nome do proprietário: ");
      String nomeProprietario = teclado.nextLine();
      animal.setNomeProprietario(nomeProprietario);
      // escrevendo os dados do animal no arquivo de texto
      escritor.write("Nome do proprietário: " + nomeProprietario + "\n");

      while (true) {
        System.out.print("contacto: ");
        String contactoProprietario = teclado.nextLine();

        if (contactoProprietario.matches("9\\d{8}")) {
          animal.setContacto(contactoProprietario);
          // escrevendo os dados do animal no arquivo de texto
          escritor.write("Contacto do proprietário: " + contactoProprietario + "\n");
          break;
        } else {
          System.out.println("Número inválido, tente novamente!");
        }
      }
      // Gerando Id automaticamente do proprietario
      animal.setId_proprietario();
      animais.add(animal);

      escritor.close();
      break;
    }
  }

  // Função Registar visita Recebendo param(teclado, animais)
  public static void registarVisita(Scanner teclado, ArrayList<Visita> visitas, ArrayList<Animal> animais,
      FileWriter escritor2) throws IOException {
    while (true) {

      Visita visita = new Visita();// Variavel auxiliar
      int n = 0, limit = 0;
      String tipoVisitas[] = { "Consulta", "Vacinação", "Higiene(Banho)" };
      boolean conditionOption = true;

      if (animais.size() == 0) {
        System.out.println("Não existe nenhum animal cadastrado!");
        break;
      } else {

        System.out.print("\n");
        System.out.print("Escolha o tipo de  visita: \n");
        for (int i = 0; i < tipoVisitas.length; i++) {
          System.out.println((i + 1) + " - " + tipoVisitas[i]);
        }

        while (conditionOption) {
          System.out.print(": ");
          try {
            int opcaoTipoVisita = teclado.nextInt();
            if ((opcaoTipoVisita < 1) || (opcaoTipoVisita > tipoVisitas.length)) {
              System.out.print("Opção inválida!\n");
              teclado.nextLine();
            } else {
              visita.setTipoVisita(tipoVisitas[opcaoTipoVisita - 1]);
              // escrevendo os dados da visita no arquivo de texto
              escritor2.write("\n DADOS DA VISITA\n");
              escritor2.write("Tipo de visita: " + tipoVisitas[opcaoTipoVisita - 1] + "\n");
              break;
            }

          } catch (Exception e) {
            System.out.print("Escolha apenas número!");
            teclado.nextLine();
          }
        }

        System.out.println("Escolha o animal");
        System.out.print(": ");
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
              escritor2.write("Animal: " + animais.get(opcao - 1).getNome() + "\n");
              break;
            }
          } catch (InputMismatchException e) {
            System.out.print("Informe apenas numero!");
            teclado.nextInt();
          }
        }

        while (true) {
          System.out.print("Custo do serviço: ");
          try {
            Double custo_servico = teclado.nextDouble();
            if (custo_servico <= 0) {
              System.out.println("Informe um valor aceitável!");
            } else {
              visita.setCusto_servico(custo_servico);
              escritor2.write("Custo: " + custo_servico + "\n");
              break;
            }
          } catch (InputMismatchException e) {
            System.out.println("Custo inválido!");
            teclado.nextLine();
          }
        }

        teclado.nextLine();// Limpando o buffer do teclado

        System.out.print("Nome do  veterinario: ");
        while (true) {
          String nome_veterinario = teclado.nextLine();
          if (nome_veterinario.isEmpty()) {
            System.out.println("Informe o nome do  veterinario: ");
          } else {
            visita.setNome_veterinario(nome_veterinario);
            escritor2.write("Nome do veterinário: " + nome_veterinario + "\n");
            break;
          }
        }

        System.out.print("Observação: ");
        while (true) {
          String observacao = teclado.nextLine();
          if (observacao.isEmpty()) {
            System.out.print("Observação por favor: ");
          } else {
            visita.setObservacao(observacao);
            escritor2.write("Observação: " + observacao + "\n");
            break;
          }
        }

        // Gerando id automaticamente
        visita.setIdVisita();

        //
        visita.setQntyVisita();
        // escritor2.write();

        visitas.add(visita);
        escritor2.close();
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
        System.out.println("1 - Registar Animal"); // Registar Animal
        System.out.println("2 - Registar Visita"); // Registar Visitas
        System.out.println("3 - Consultar");// Marcação de consulta
        System.out.println("4 - Listar");// Listagem dos dados
        System.out.println("5 - Ficheiros");// Guardar ficheiros, carregar ficheiros
        System.out.println("6 - Sair"); // Sair do sistema
        System.out.print("\n");//

        System.out.print("Opção: ");
        op = teclado.nextInt();

        switch (op) {
          case 1:
            teclado.nextLine();// Limpando o buffer do teclado
            try {
              FileWriter escritor = new FileWriter("animal.txt", true);
              registarAnimal(teclado, animais, anoActual, escritor);
            } catch (IOException e) {
              e.printStackTrace();
            }
            break;
          case 2:
            teclado.nextLine();// Limapando o buffer do teclado
            try {
              FileWriter escritor2 = new FileWriter("visita.txt", true);
              registarVisita(teclado, visitas, animais, escritor2);
            } catch (IOException e) {
              e.printStackTrace();
            }
            break;
          case 3:
            consultas(teclado, animais);
            break;
          case 4:
            listar(teclado, animais, visitas);
            break;
          case 5:
            teclado.nextLine();
            carregarDadosArquivos(teclado);
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