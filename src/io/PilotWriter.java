package io;

import Util.DBConnectionUtil;
import entity.Pilots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotWriter {

    private final List<Pilots> pilots;
    private static final String ADD = "INSERT INTO pilots (id, first_name,last_name,rank,pilot_code) VALUES(?, ?, ?, ?, ?)";

    public PilotWriter(List<Pilots> pilots) {
        this.pilots = pilots;
    }

    public void saveAll() {

        for (Pilots pilots : pilots) {
            save(pilots);
        }
    }

    private void save(Pilots pilots) {

        Connection connection = DBConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, pilots.getId());
            statement.setString(2, pilots.getFirst_name());
            statement.setString(3, pilots.getLast_name());
            statement.setString(4, String.valueOf(pilots.getRank()));
            statement.setString(5, pilots.getPilot_code());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

