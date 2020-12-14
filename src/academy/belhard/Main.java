package academy.belhard;


import academy.belhard.util.ResultWriterUtil;
import academy.belhard.entity.Flights;
import academy.belhard.entity.Pilots;
import academy.belhard.entity.Planes;
import academy.belhard.io.*;


import java.util.List;

import static academy.belhard.io.FilePathConstant.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------");

        PilotReader readerPilot = new PilotReader(PILOTS_FILE);

        List<Pilots> pilots = readerPilot.readItems();

        PilotWriter writerPilot = new PilotWriter(pilots);

        System.out.println("Старт записи в таблицу [pilots] :");
        System.out.println();

        writerPilot.saveAll();

        for (Pilots pilot : readerPilot.readItems()) {
            System.out.println(pilot);
        }
        System.out.println();
        System.out.println("Запись в таблицу [pilots] завершена. ");

        System.out.println("-------------------------------------------------------------------------------------------");

        PlaneReader readerPlane = new PlaneReader(PLANES_FILE);

        List<Planes> planes = readerPlane.readItems();

        PlaneWriter writerPlane = new PlaneWriter(planes);

        System.out.println("Старт записи в таблицу [planes] :");
        System.out.println();

        writerPlane.saveAll();

        for (Planes plane : readerPlane.readItems()) {
            System.out.println(plane);
        }
        System.out.println();
        System.out.println("Запись в таблицу [planes] завершена. ");

        System.out.println("-------------------------------------------------------------------------------------------");

        FlightReader readerFlight = new FlightReader(FLIGHTS_FILE);

        List<Flights> flights = readerFlight.readItems();

        FlightWriter writerFlight = new FlightWriter(flights);

        System.out.println("Старт записи в таблицу [flights] :");
        System.out.println();

        writerFlight.saveAll();

        for (Flights flight : readerFlight.readItems()) {
            System.out.println(flight);
        }
        System.out.println();
        System.out.println("Запись в таблицу [flights] завершена. ");

        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Вывод результирующей выборки :");
        System.out.println();
        System.out.println(ResultWriterUtil.writeResult(FullResultReader.readAll()));
        System.out.println("-------------------------------------------------------------------------------------------");

        FullResultWriter.writeDBResult();

    }
}
