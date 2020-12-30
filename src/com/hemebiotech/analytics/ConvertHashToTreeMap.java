package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;

public class ConvertHashToTreeMap {

    public <String, Integer> TreeMap<String, Integer> convertHashMapToTreeMap(HashMap<String, Integer> hm)
    {
        return new TreeMap<>(hm);
    }
}
