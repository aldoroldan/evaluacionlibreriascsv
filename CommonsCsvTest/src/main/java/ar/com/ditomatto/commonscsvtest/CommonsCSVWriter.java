package ar.com.ditomatto.commonscsvtest;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CommonsCSVWriter {
    

    public static void CsvWriter(String nombreArchivo) throws IOException {

        try (
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(nombreArchivo));

            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                    .withHeader("id", "Nombre", "Cargo", "Empresa"));
        ) {
            csvPrinter.printRecord("1", "Sundar Pichai", "CEO", "Google");
            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
            csvPrinter.printRecord("3", "Tim Cook", "CEO", "Apple");

            csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO", "Facebook"));

            csvPrinter.flush();
        }
    }
}
