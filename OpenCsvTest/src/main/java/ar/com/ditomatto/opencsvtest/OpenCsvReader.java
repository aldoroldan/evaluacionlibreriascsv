package ar.com.ditomatto.opencsvtest;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OpenCsvReader {
        
        public static void leerRegistrosUnoAUno(String nombreArchivo) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            CSVReader csvReader = new CSVReaderBuilder(reader)
                    .withSkipLines(1)
                    .build();
        ) {
            // Leo los Registros Uno a Uno en un array de String 
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Nombre : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Telefono : " + nextRecord[2]);
                System.out.println("Pais : " + nextRecord[3]);
                System.out.println("==========================");
            }
        }
        catch(Exception ex){
            System.out.println("Error"+ex.getMessage());
        }
    }

    public static void leerTodosLosRegistrosDeUnaVez(String nombreArchivo) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading All Records at once into a List<String[]>
            List<String[]> records = csvReader.readAll();
            for (String[] record : records) {
                System.out.println("Nombre : " + record[0]);
                System.out.println("Email : " + record[1]);
                System.out.println("Telefono : " + record[2]);
                System.out.println("Pais : " + record[3]);
                System.out.println("---------------------------");
            }
        }
    }
    
}
