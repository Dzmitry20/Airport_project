package academy.belhard.io;

import academy.belhard.entity.Flights;
import academy.belhard.util.DBConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightWriter {

    private final List<Flights> flights;
    private static final String ADD = "INSERT INTO flights (id, plane_id,pilot_id,date_,time_,flight_number) VALUES(?, ?, ?, ?, ?, ?)";

    public FlightWriter(List<Flights> flights) {
        this.flights = flights;
    }

    public void saveAll() {
        for (Flights flights : flights) {
            save(flights);
        }
    }

    private void save(Flights flights) {

        Connection connection = DBConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, flights.getId());
            statement.setInt(2, flights.getPlane_id());
            statement.setInt(3, flights.getPilot_id());
            statement.setDate(4, new java.sql.Date(flights.getDate().getTime()));
            statement.setTime(5, new java.sql.Time(flights.getTime().getTime()));
            statement.setString(6, flights.getFlight_number());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
