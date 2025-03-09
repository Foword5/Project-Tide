package domain.port.primary;

import domain.Entity.*;

public interface IPortUseCase {
    public String[] getPortsName(); // get all port names

    public MareeJour getMareejour(int jour, int mois, String port);
}
