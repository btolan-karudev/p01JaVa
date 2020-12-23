package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomsToFile {

    public void writeFile(TreeMap<String, Integer> treeName) throws IOException {

        FileWriter writer = new FileWriter("result.out");
        for (Map.Entry<String, Integer> entry : treeName.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            writer.write(key + ": " + value + "\n");
            System.out.println(key + " => " + value);
        }

        writer.close();
    }


}
