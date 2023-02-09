package com.georgidinov;

import java.util.HashMap;
import java.util.Map;

public class ShallowCopyCashClass {

    private static final Map<String, ShallowCloneVariation> theMap = new HashMap<>();

    public static void loadData() {
        ShallowCloneVariation man = new MalePerson("Georgi", 36);
        theMap.put(man.getName(), man);

        ShallowCloneVariation woman = new FeMalePerson("Mariya", 35);
        theMap.put(woman.getName(), woman);
    }//end of method loadData

    public static ShallowCloneVariation getPerson(String personId) throws CloneNotSupportedException {
        ShallowCloneVariation person = theMap.get(personId);
        return person.clone();
    }//end of method getPerson;

}//end of class ShallowCopyCashClass
