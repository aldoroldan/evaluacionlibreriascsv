package ar.com.ditomatto.commonscsvtest;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CommonsCsvReader {
    
    public static void CsvReader(String nombreArchivo) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
        ) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                // Accedo a los valores del Encabezado

                String name = csvRecord.get("Nombre");
                String email = csvRecord.get("Email");
                String phone = csvRecord.get("Telefono");
                String country = csvRecord.get("Pais");

                System.out.println("Registro No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Nombre : " + name);
                System.out.println("Email : " + email);
                System.out.println("Telefono : " + phone);
                System.out.println("Pais : " + country);
                System.out.println("---------------\n\n");
            }
        }
    }

}
