package io;

import Util.ResultWriterUtil;

import java.io.FileWriter;
import java.io.IOException;

import static io.FilePathConstant.RESULT;

public class FullResultWriter {

    public static void writeDBResult() {

        try (FileWriter writer = new FileWriter(RESULT)) {

            String result = ResultWriterUtil.writeResult(FullResultReader.readAll());

            writer.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
