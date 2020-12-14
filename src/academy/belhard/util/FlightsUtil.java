package academy.belhard.util;

import academy.belhard.entity.Flights;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightsUtil {

    public static Flights toObject(String s) {

        String[] flightsArgs = s.split(";");
        int id = Integer.parseInt(flightsArgs[0]);
        int plane_id = Integer.parseInt(flightsArgs[1]);
        int pilot_id = Integer.parseInt(flightsArgs[2]);

        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.parse(flightsArgs[3]);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Date time = null;
        try {
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
            time = timeFormat.parse(flightsArgs[4]);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        String flight_number = flightsArgs[5];

        return new Flights(id, plane_id, pilot_id, date, time, flight_number);
    }
}
