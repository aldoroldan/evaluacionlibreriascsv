package ar.com.ditomatto.commonscsvtest;
import java.io.IOException;

public class CommonsCsvTest {
    public static void main(String[] args) throws IOException{
        if (args.length>0){
             if ("r".equals(args[0])) {
                 if(args.length==2){
                    //Convoco al Metodo que hace la lectura con el nombre de archivo indicado
                    CommonsCsvReader.CsvReader(args[1]);
                    }
                 else
                     System.out.println("Debe especificar el nombre del archivo.csv a leer");
                }
             else
                 if ("w".equals(args[0])) {
                    if(args.length==2){
                    //Convoco al Metodo que hace la escritura con el nombre de archivo indicado
                    CommonsCSVWriter.CsvWriter(args[1]);
                    }
                 else
                     System.out.println("Debe especificar el nombre del archivo.csv en donde desea escribir");
                }
            }
        else{
            System.out.println("Uso: CommonsCsvTest tipoOperacion nombreArchivo");
            System.out.println("tipoOperacion puede ser r para lectura o w para escritura");
            }
        } 
              
    }
