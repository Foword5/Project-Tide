package domain.port.primary;

import domain.Entity.*;

public interface IPortUseCase {
    public String[] getPortsName(); // get all port names

    public void getMareejour(Date date, Port port);
}
