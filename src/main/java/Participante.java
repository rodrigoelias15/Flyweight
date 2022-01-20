public class Participante {
    private String nome;
    private Cidade cidadeResidencia;

    public Participante(String nome, Cidade cidadeResidencia) {
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterParticipante() {
        return "Participante{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeResidencia.getNome() + '\'' +
                ", UF='" + cidadeResidencia.getUf() + '\'' +
                '}';
    }
}
