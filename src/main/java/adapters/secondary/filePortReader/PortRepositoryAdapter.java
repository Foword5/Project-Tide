package adapters.secondary.filePortReader;

import domain.entity.MareeJour;
import domain.entity.Port;
import domain.port.secondary.IPortRepository;

import java.io.File;

import org.springframework.stereotype.Repository;

import adapters.secondary.filePortReader.constant.Constantes;
import adapters.secondary.filePortReader.models.*;
import adapters.secondary.filePortReader.src.*;

@Repository
public class PortRepositoryAdapter implements IPortRepository {
    public Port[] getPorts() {

        PortReaderPort[] ports = null;

        File fichier = new File(Constantes.LIEN_FICHIERS_SAUVEGARDE);
        if (fichier.length() != 0) {
            ports = (PortReaderPort[]) LectureEcriture.lecture(fichier);
        } else {
            ports = LectureFichierTxt.getPorts().toArray(new PortReaderPort[0]);
            LectureEcriture.ecriture(fichier, ports);
        }

        // transformation des objets de type PortReaderPort en Port

        Port[] portsDomain = new Port[ports.length];
        for (int i = 0; i < ports.length; i++) {
            portsDomain[i] = new Port(ports[i].toString());
            for (int j = 1; j <= 12; j++) {
                for (int k = 1; k <= 31; k++) {
                    PortReaderMareeJour mareeJour = ports[i].getValue(k, j);
                    MareeJour mareeJourDomain = new MareeJour(
                            mareeJour.getHeurePleineMer(),
                            mareeJour.getHauteurPleineMer(),
                            mareeJour.getHeureBasseMer(),
                            mareeJour.getHauteurBasseMer(),
                            mareeJour.getCoef(),
                            mareeJour.getHauteurs()
                    );
                    portsDomain[i].setJour(k, j, mareeJourDomain);
                }
            }
        }

        return portsDomain;
    }
}
