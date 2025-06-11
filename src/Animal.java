import java.time.LocalDate;

public class Animal {
  private String nome;
  private String especie;
  private String raca;
  private int anoNasc;
  private String id_animal;
  public static int contador = 1;
  // Trazendo o ano do sistema
  LocalDate ano = LocalDate.now();
  int anoActual = ano.getYear();

  // Metódo de acesso GET ao nome do animal
  public String getNome() {
    return nome.toUpperCase();
  }

  // Metódo de acesso SET ao nome do animal
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Metódo de acesso GET a especie
  public String getEspecie() {
    return especie.toUpperCase();
  }

  // Metódo de acesso SET a especie
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  // Metódo de acesso GET a raca
  public String getRaca() {
    return raca.toUpperCase();
  }

  // Metódo de acesso SET a raca
  public void setRaca(String raca) {
    this.raca = raca;
  }

  // Metódo de acesso GET idade
  public int getIdade() {
    int idade = anoActual - anoNasc;
    return idade;
  }

  // Metódo de acesso SET a idade
  public void setAnoNasc(int anoNasc) {
    this.anoNasc = anoNasc;
  }

  // Metódo de acesso SET ao id do proprietário
  public void setId_animal() {
    String id;
    id = String.format("cli%03dao\n", contador);
    this.id_animal = id;
    contador++;
  }

  // Metódo de acesso GET ao id do proprietário gerado de forma dinâmica
  public String getIdAnimal() {
    return id_animal.toUpperCase();
  }
}