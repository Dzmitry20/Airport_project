package Util;

import entity.Planes;

public class PlanesUtil {

    public static Planes toObject(String s) {

        String[] planesArgs = s.split(";");
        int id = Integer.parseInt(planesArgs[0]);
        String mark = planesArgs[1];
        String model = planesArgs[2];
        int capacity = Integer.parseInt(planesArgs[3]);
        String board_number = planesArgs[4];

        return new Planes(id, mark, model, capacity, board_number);
    }
}
