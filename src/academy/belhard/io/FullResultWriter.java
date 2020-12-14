package academy.belhard.io;

import academy.belhard.util.ResultWriterUtil;

import java.io.FileWriter;
import java.io.IOException;

public class FullResultWriter {

    public static void writeDBResult() {

        try (FileWriter writer = new FileWriter(FilePathConstant.RESULT)) {

            String result = ResultWriterUtil.writeResult(FullResultReader.readAll());

            writer.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
