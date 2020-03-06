package dojo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class N1 {
    public static void main(final String[] args) throws Exception {
        String file = "jquery-3.4.1.js";
        String conteudo = "";
        try {
            conteudo = new String(Files.readAllBytes(Paths.get(file)));
            conteudo = conteudo.replaceAll("(?s:/\\*.*?\\*/)|//.*", "")
                    .replaceAll("/\\*[^*]*(?:\\*(?!/)[^*]*)*\\*/|//.*", "").replaceAll("\\s+", "");
            FileWriter fw = new FileWriter("silas.txt");
            fw.write(conteudo);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}