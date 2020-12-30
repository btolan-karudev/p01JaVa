package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * this class writes the data in a file
 */
public class WriteSymptomsToFile {

    /**
     * this function requires a TreeMap in parameter and it use it to write a file with the key as the symptom and
     * the value the number of occurrences
     *
     *
     * @param treeName
     * @throws IOException
     */
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
