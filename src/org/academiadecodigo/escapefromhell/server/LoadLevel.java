package org.academiadecodigo.escapefromhell.server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadLevel {


    static String result = "";
    private String aux = "";

    public String readFile(){

        FileReader reader = null;

        try {

            reader = new FileReader("Nivel1.txt");
            BufferedReader br = new BufferedReader(reader);

            while ((aux = br.readLine()) != null) {

                result += (aux + "/");

            }
        }
        catch (IOException ex){
            System.out.println("error");
        }
        finally {
            try {
                reader.close();

            }catch (IOException ex){

            }
        }
        return result;
    }
}