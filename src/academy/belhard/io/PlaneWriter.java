package academy.belhard.io;

import academy.belhard.util.DBConnectionUtil;
import academy.belhard.entity.Planes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlaneWriter {

    private final List<Planes> planes;
    private static final String ADD = "INSERT INTO planes (id, mark, model,capacity,board_number) VALUES(?, ?, ?, ?, ?)";

    public PlaneWriter(List<Planes> planes) {
        this.planes = planes;
    }

    public void saveAll() {
        for (Planes planes : planes) {
            save(planes);
        }
    }

    private void save(Planes planes) {

        Connection connection = DBConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, planes.getId());
            statement.setString(2, planes.getMark());
            statement.setString(3, planes.getModel());
            statement.setInt(4, planes.getCapacity());
            statement.setString(5, planes.getBoard_number());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
