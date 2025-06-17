public class Propretario {
  private String nome;
  private int contacto;
  private String id_proprietario;
  public static int contador = 1;

  // Metódo de acesso GET ao nome do proprietário
  public String getNomeProprietario() {
    return nome.toUpperCase();
  }

  // Metódo de acesso SET ao nome do proprietário
  public void setNomeProprietario(String nome) {
    this.nome = nome;
  }

  // Metódo de acesso GET ao contacto do proprietário
  public int getContacto() {
    return contacto;
  }

  // Metódo de acesso SET ao contacto do proprietário
  public void setContacto(int contacto) {
    this.contacto = contacto;
  }

  // Metódo de acesso SET ao id do proprietário
  public void setId_proprietario() {
    String id;
    id = String.format("pro%03d%s", contador, "dao");
    this.id_proprietario = id;
    contador++;
  }

  // Metódo de acesso GET ao id do proprietário gerado de forma dinâmica
  public String getIdProprietario() {
    return id_proprietario.toUpperCase();
  }
}