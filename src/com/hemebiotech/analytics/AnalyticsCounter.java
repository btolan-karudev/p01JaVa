package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {

        // 1. extraire les lignes du fichier symptom.txt dans une liste OK
        ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> results =  readSymptom.getSymptoms();

        // 2. appeler la methode symptomCounterMakeHash qui calule le nombre de fois que le sym et le stocker dans une hashMap
        SymptomCounter symptomCountHashMap = new SymptomCounter();
        HashMap hashMapSym = new HashMap<>();
        hashMapSym = symptomCountHashMap.symptomCounterMakeHash((ArrayList<String>) results);

        // 3. apeler la metode sort de Collection pour metre mon hasMAp en ordre aplhabetique (voir TreeMap)
        ConvertHashToTreeMap symptomTreeMap = new ConvertHashToTreeMap();
        TreeMap treMp = symptomTreeMap.convertHashMapToTreeMap(hashMapSym);

        // 4. creation du fichier final avec
        WriteSymptomsToFile writerSym = new WriteSymptomsToFile();
        writerSym.writeFile(treMp);

    }

}
