package ar.com.ditomatto.opencsvtest;

import java.io.IOException;


public class OpenCsvTest {
     public static void main(String[] args) throws IOException{
        if (args.length>0){
             if ("r".equals(args[0])) {
                 if(args.length==2){
                    //Convoco al Metodo que hace la lectura con el nombre de archivo indicado
                    OpenCsvReader.leerRegistrosUnoAUno(args[1]);
                    OpenCsvReader.leerTodosLosRegistrosDeUnaVez(args[1]);
                    }
                 else
                     System.out.println("Debe especificar el nombre del archivo.csv a leer");
                }
             else
                 if ("w".equals(args[0])) {
                    if(args.length==2){
                    //Convoco al Metodo que hace la escritura con el nombre de archivo indicado
                    OpenCsvWriter.openCsvWriter(args[1]);
                    }
                 else
                     System.out.println("Debe especificar el nombre del archivo.csv en donde desea escribir");
                }
            }
        else{
            System.out.println("Uso: OpenCsvTest tipoOperacion nombreArchivo");
            System.out.println("tipoOperacion puede ser r para lectura o w para escritura");
            }
        } 
            
}
