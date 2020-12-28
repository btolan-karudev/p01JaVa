package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;

public class ConvertHashToTreeMap {

    public <String, Integer> TreeMap<String, Integer> convertHashMapToTreeMap(HashMap<String, Integer> hm)
    {
        TreeMap<String, Integer> treeMap = new TreeMap<>(hm);

        return treeMap;
    }
}
