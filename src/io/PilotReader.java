package io;

import Util.PilotsUtil;
import entity.Pilots;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotReader {

    private final String filePath;

    public PilotReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Pilots> readItems() {

        List<Pilots> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String s;
            while ((s = reader.readLine()) != null) {

                Pilots pilots = PilotsUtil.toObject(s);

                result.add(pilots);
            }
        } catch (IOException e) {
            System.out.println("file error");
        }
        return result;
    }
}




