package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter {

    private static int headacheCount = 0;    // initialize to 0
    private static int rashCount = 0;        // initialize to 0
    private static int pupilCount = 0;        // initialize to 0


    public static void main(String args[]) throws Exception {

        // 1. extraire le lignes du fichie symptom.txt dans une list OK
        ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> results =  readSymptom.getSymptoms();


        // 2. appeler la methode symptomCounterMakeHash qui calule le nomre de fois que le sym et le stoquer dans une hashMap
        SymptomCounter syCountHash = new SymptomCounter();
        HashMap hashMapSym = new HashMap<>();
        hashMapSym = syCountHash.symptomCounterMakeHash((ArrayList<String>) results);




        System.out.println(hashMapSym);


        TreeMap treMp = new TreeMap();

        treMp = convertHmToTm(hashMapSym);

        System.out.println(treMp);

        WriteSymptomsToFile writerSym = new WriteSymptomsToFile();

        writerSym.writeFile(treMp);







        // 3. apeler la metode sort de Collection pour metre mon hasMAp en ordre aplhabetique (voir TreeMap)
        // 4. creation du fichier final avec

    }
    public static <String, Integer> TreeMap<String, Integer> convertHmToTm(HashMap<String, Integer> hm)
    {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.putAll(hm);

        return treeMap;
    }

}
