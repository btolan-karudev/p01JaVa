package com.hemebiotech.analytics;

import java.util.*;

/**
 * this class counts the number of symptoms
 */
public class SymptomCounter {


    /**
     * this function requires an ArrayList in parameter, then it crates a HashMap with the symptoms
     * in the key and the number of occurrences in the value and returns the HashMap
     *
     * @param symptomList
     * @return
     */
    public HashMap<String, Integer> symptomCounterMakeHash(ArrayList<String> symptomList) {

        HashMap<String, Integer> symptomsHash = new HashMap<>();

        for (String item : symptomList) {
            if (symptomsHash.containsKey(item)) {
                symptomsHash.put(item, symptomsHash.get(item) + 1);
            } else {
                symptomsHash.put(item, 1);
            }
        }

        return symptomsHash;

    }

}
