package domain.port.secondary;
import domain.entity.Port;

public interface IPortRepository {
    public Port[] getPorts();
}
