package io;

import Util.PlanesUtil;
import entity.Planes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaneReader {

    private final String filePath;

    public PlaneReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Planes> readItems() {

        List<Planes> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String s;
            while ((s = reader.readLine()) != null) {

                Planes planes = PlanesUtil.toObject(s);

                result.add(planes);
            }
        } catch (IOException e) {
            System.out.println("file error");
        }
        return result;
    }
}
