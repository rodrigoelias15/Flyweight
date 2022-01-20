import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaDeAuditorioTest {

    @Test
    void deveRetornarParticipantes() {
        ProgramaDeAuditorio programa = new ProgramaDeAuditorio();
        programa.inscrever("Felipe", "São João Nepomuceno", "MG");
        programa.inscrever("Walkiria", "Juiz de Fora", "MG");
        programa.inscrever("Michel", "Cabo Frio", "RJ");

        List<String> saida = Arrays.asList(
            "Participante{nome='Felipe', cidade='São João Nepomuceno', UF='MG'}",
            "Participante{nome='Walkiria', cidade='Juiz de Fora', UF='MG'}",
            "Participante{nome='Michel', cidade='Cabo Frio', UF='RJ'}"
        );

        assertEquals(saida, programa.obterParticipantes());
    }

    @Test
    void deveRetornarTotalCidades() {
        ProgramaDeAuditorio programa = new ProgramaDeAuditorio();
        programa.inscrever("Felipe", "São João Nepomuceno", "MG");
        programa.inscrever("Walkiria", "Juiz de Fora", "MG");
        programa.inscrever("Michel", "Cabo Frio", "RJ");

        assertEquals(3, CidadeFactory.getTotalCidades());
    }
}