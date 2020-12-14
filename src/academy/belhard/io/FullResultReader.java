package academy.belhard.io;

import academy.belhard.entity.ResInfoFlight;
import academy.belhard.util.DBConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FullResultReader {

    private static final String SELECT = "SELECT  flights.flight_number, flights.date_ , flights.time_ , planes.board_number , CONCAT (planes.mark, ' ' ,planes.model) AS plane, planes.capacity , CONCAT(pilots.first_name, ' ', CONCAT(LEFT(pilots.last_name,1), '.'))  AS fio , CONCAT(pilots.pilot_code, ' (',  pilots.pilot_rank, ')') AS pilot_number  FROM pilots  JOIN flights ON pilots.id = flights.pilot_id JOIN planes ON  flights.plane_id = planes.id ORDER BY pilots.id";

    public static List<ResInfoFlight> readAll() {

        List<ResInfoFlight> list = new ArrayList<>();

        Connection connection = DBConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {

                String flight_number = result.getString("flights.flight_number");
                java.sql.Date date = new Date(result.getDate("flights.date_").getTime());
                java.sql.Time time = new Time(result.getTime("flights.time_").getTime());
                String board_number = result.getString("planes.board_number");
                String plane = result.getString("plane");
                int capacity = result.getInt("planes.capacity");
                String fio = result.getString("fio");
                String pilot_number = result.getString("pilot_number");

                ResInfoFlight res = new ResInfoFlight(flight_number, date, time, board_number, plane, capacity, fio, pilot_number);

                list.add(res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}


