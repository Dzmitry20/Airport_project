package academy.belhard.io;

import academy.belhard.util.FlightsUtil;
import academy.belhard.entity.Flights;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightReader {

    private final String filePath;

    public FlightReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Flights> readItems() {

        List<Flights> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = reader.readLine()) != null) {

                Flights flights = FlightsUtil.toObject(s);

                result.add(flights);
            }
        } catch (IOException e) {
            System.out.println("file error");
        }
        return result;
    }
}
