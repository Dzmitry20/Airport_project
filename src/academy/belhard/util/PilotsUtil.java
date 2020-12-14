package academy.belhard.util;

import academy.belhard.entity.Pilots;
import academy.belhard.entity.Rank;

public class PilotsUtil {

    public static Pilots toObject(String s) {

        String[] pilotsArgs = s.split(";");
        int id = Integer.parseInt(pilotsArgs[0]);
        String first_name = pilotsArgs[1];
        String last_name = pilotsArgs[2];
        Rank rank = Rank.valueOf(pilotsArgs[3]);
        String pilot_code = pilotsArgs[4];

        return new Pilots(id, first_name, last_name, rank, pilot_code);
    }
}
