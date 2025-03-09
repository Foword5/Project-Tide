package domain.port.primary;

import domain.entity.*;

public interface IPortUseCase {
    public String[] getPortsName(); // get all port names

    public MareeJour getMareejour(int jour, int mois, String port);
}
