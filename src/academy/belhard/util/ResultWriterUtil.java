package academy.belhard.util;

import academy.belhard.entity.ResInfoFlight;

import java.util.List;

public class ResultWriterUtil {

    public static String writeResult(List<ResInfoFlight> list) {

        StringBuilder s = new StringBuilder();

        for (ResInfoFlight res : list) {

            s.append(res.getFlight_number())
                    .append(";")
                    .append(res.getDate())
                    .append(";")
                    .append(res.getTime())
                    .append(";")
                    .append(res.getBoard_number())
                    .append(";")
                    .append(res.getPlane())
                    .append(";")
                    .append(res.getCapacity())
                    .append(";")
                    .append(res.getFio())
                    .append(";")
                    .append(res.getPilot_number())
                    .append("\n");
        }
        return s.toString();
    }
}
