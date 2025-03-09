package domain.port.secondary;
import domain.Entity.Port;

public interface IPortRepository {
    public Port[] getPorts();
}
