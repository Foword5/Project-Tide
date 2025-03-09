package domain.service;

import java.util.Arrays;

import domain.Entity.Port;
import domain.Entity.MareeJour;
import domain.port.primary.IPortUseCase;
import domain.port.secondary.IPortRepository;

public class PortUseCase implements IPortUseCase {
    private IPortRepository portRepository;

    public PortUseCase(IPortRepository portRepository) {
        this.portRepository = portRepository;
    }

    @Override
    public String[] getPortsName() {
        Port[] ports = portRepository.getPorts();
        return Arrays.stream(ports)
                     .map(Port::toString)
                     .toArray(String[]::new);
    }

    @Override
    public MareeJour getMareejour(int jour, int mois, String port) {
        Port[] ports = portRepository.getPorts();
        for (Port p : ports) {
            if (p.toString().equals(port)) {
                return p.getValue(jour, mois);
            }
        }
        return null;
    }
    
}
