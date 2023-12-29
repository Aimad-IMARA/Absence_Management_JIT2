import com.absenceManagement.entities.Seance;
import com.absenceManagement.entities.dto.SeanceDto;
import com.absenceManagement.mapper.SeanceDtoToSeance;
import com.absenceManagement.web.Web;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
            SeanceDto seanceDto = Web.getDatasFromApi("https://raw.githubusercontent.com/BeCreasy/Presence/main/presence.json");
            Seance seance = SeanceDtoToSeance.seanceDtoToSeance(seanceDto);
    }
}