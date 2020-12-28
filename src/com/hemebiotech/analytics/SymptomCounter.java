package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SymptomCounter {


    public HashMap<String, Integer> symptomCounterMakeHash(ArrayList<String> symptomList) {

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

}
