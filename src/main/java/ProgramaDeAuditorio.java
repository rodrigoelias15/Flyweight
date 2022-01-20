import java.util.ArrayList;
import java.util.List;

public class ProgramaDeAuditorio {
    private List<Participante> participantes = new ArrayList<>();

    public void inscrever(String nomeParticipante, String nomeCidade, String UF) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, UF);
        Participante participante = new Participante(nomeParticipante, cidade);
        participantes.add(participante);
    }

    public List<String> obterParticipantes() {
        List<String> saida = new ArrayList<String>();
        for (Participante participante : this.participantes) {
            saida.add(participante.obterParticipante());
        }
        return saida;
    }
}
