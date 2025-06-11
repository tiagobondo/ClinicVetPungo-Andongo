public class Visita {
  // Data
  private String tipo_visita; // Consulta, Vacinação, Banho
  private String observacao;
  private double custo_servico;
  private String nome_veterinario;
  private String id_visita;
  public static int contador = 1;

  public String getTipoVisita() {
    return tipo_visita.toUpperCase();
  }

  // Metódo de acesso SET ao tipo de viista
  public void setTipoVisita(String tipo_visita) {
    this.tipo_visita = tipo_visita;
  }

  // Metódo de acesso GET ao observacao
  public String getObservacao() {
    return observacao.toUpperCase();
  }

  // Metódo de acesso SET ao observacao
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  // Metódo de acesso GET ao custo de servico
  public double getCusto_servico() {
    return custo_servico;
  }

  // Metódo de acesso SET ao custo de servico
  public void setCusto_servico(double custo_servico) {
    this.custo_servico = custo_servico;
  }

  // Metódo de acesso GET ao nome do veterinario
  public String getNome_veterinario() {
    return nome_veterinario.toUpperCase();
  }

  // Metódo de acesso SET ao nome do veterinario
  public void setNome_veterinario(String nome_veterinario) {
    this.nome_veterinario = nome_veterinario;
  }

  // Metódo de acesso SET ao id da visita
  public void setIdVisita() {
    String id;
    id = String.format("visi%03d\n", contador);
    this.id_visita = id;
    contador++;
  }

  // Metódo de acesso GET ao id da visita gerado de forma dinâmica
  public String getIdVisita() {
    return id_visita.toUpperCase();
  }

}