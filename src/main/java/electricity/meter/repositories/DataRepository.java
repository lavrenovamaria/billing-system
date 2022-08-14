package electricity.meter.repositories;

import electricity.meter.models.Input;

import java.sql.SQLException;

public interface DataRepository {
    public void save(Input input) throws SQLException;
}
