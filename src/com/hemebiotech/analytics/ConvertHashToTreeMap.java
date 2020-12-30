package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * convert HashMAp to TreeMap for obtaining a sorted list
 */
public class ConvertHashToTreeMap {

    /**
     * this function requires a HashMap in parameter and then it returns a TreeMap
     *
     * @param hm
     * @param <String>
     * @param <Integer>
     * @return
     */
    public <String, Integer> TreeMap<String, Integer> convertHashMapToTreeMap(HashMap<String, Integer> hm) {
        return new TreeMap<>(hm);
    }
}
