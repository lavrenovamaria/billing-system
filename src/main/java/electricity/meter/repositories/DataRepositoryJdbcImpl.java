package electricity.meter.repositories;

import electricity.meter.models.Input;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRepositoryJdbcImpl implements DataRepository{

    private DataSource ds = null;

    public DataRepositoryJdbcImpl(DataSource ds) throws SQLException {
        this.ds = ds;
    }

    public void save(Input input) throws SQLException {
        Connection conn = ds.getConnection();
        String sql = "INSERT INTO data (id, period, data) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setLong(1, input.getId());
        ps.setInt(2, input.getPeriod());
        ps.setDouble(3, input.getData());

        ps.executeUpdate();
        ps.close();
    }
}
