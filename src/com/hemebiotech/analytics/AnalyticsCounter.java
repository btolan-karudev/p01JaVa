package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter {


    public static void main(String[] args) throws Exception {

        // 1. extraire les lignes d'un fichier dans une liste
        ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> results =  readSymptom.getSymptoms();

        // 2. faire une boucle sur la liste obtenue pour calculer le nombre de fois que les symptômes se répètent et la mettre dans un dictionnaire avec key value
        SymptomCounter symptomCountHashMap = new SymptomCounter();
        HashMap hashMapSym = symptomCountHashMap.symptomCounterMakeHash((ArrayList<String>) results);

        // 3. transformer notre dictionnaire en treeMap pour avoir l'ordre alphabétique
        ConvertHashToTreeMap symptomTreeMap = new ConvertHashToTreeMap();
        TreeMap treMp = symptomTreeMap.convertHashMapToTreeMap(hashMapSym);

        // 4. création du fichier final
        WriteSymptomsToFile writerSym = new WriteSymptomsToFile();
        writerSym.writeFile(treMp);

    }

}
