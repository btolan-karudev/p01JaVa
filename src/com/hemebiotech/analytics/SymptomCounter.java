package com.hemebiotech.analytics;

import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SymptomCounter {


    public HashMap<String, Integer> symptomCounterMakeHash(ArrayList<String> symptomList) {
        // 1.
        HashMap<String, Integer> symptomsHash = new HashMap<>();


        for (String item : symptomList) {
            if (symptomsHash.containsKey(item)){
                symptomsHash.put(item, symptomsHash.get(item)+1);
            }else{
                symptomsHash.put(item, 1);
            }

            System.out.println(item);
        }


        System.out.println(symptomsHash);

        symptomsHash.remove(null);

        return symptomsHash;

    }



    // next generate output
    public void resultWriter() throws IOException {
        FileWriter writer = new FileWriter("result.out");
        //writer.write("headache: " + headacheCount + "\n");
        //writer.write("rash: " + rashCount + "\n");


    }
}
