package com.ecspresso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.exit(1);
        }

        File file = new File(args[0]);
        if(file.createNewFile()) {
            System.out.println(file.getAbsoluteFile());
            if(args.length > 1) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, Charset.defaultCharset()));
                for(int i = 1; i < args.length; i++) {
                    bw.write(args[i]);
                }
                bw.close();
            }
        }
    }
}
