package ar.com.ditomatto.opencsvtest;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;


public class OpenCsvWriter {
                
    public static void openCsvWriter(String nombreArchivo) throws IOException {
        try (
            Writer writer = Files.newBufferedWriter(Paths.get(nombreArchivo));

            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
        ) {
            String[] headerRecord = {"id","Nombre", "Cargo", "Empresa"};
            csvWriter.writeNext(headerRecord);

            csvWriter.writeNext(new String[]{"1","Sundar Pichai","CEO", "Google"});
            csvWriter.writeNext(new String[]{"2","Satya Nadella","CEO", "Microsoft"});
            csvWriter.writeNext(new String[]{"3","Tim Cook", "CEO", "Apple"});
            csvWriter.writeNext(new String[]{"4","Mark Zuckerberg", "CEO", "Facebook"});
        }
    }
}
