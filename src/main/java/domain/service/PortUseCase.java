package domain.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.entity.MareeJour;
import domain.entity.Port;
import domain.port.primary.IPortUseCase;
import domain.port.secondary.IPortRepository;

@Service
public class PortUseCase implements IPortUseCase {
    private IPortRepository portRepository;

    @Autowired
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
