package com.georgidinov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MeanderingArray {


    public static List<Integer> meanderingArray(List<Integer> unsorted) {
        List<Integer> result = new ArrayList<>();
        if (checkSizeConstraints(unsorted) && checkElementConstraints(unsorted)) {
            Collections.sort(unsorted);
            int lastElement = unsorted.size() - 1;
            for (int i = 0; i < unsorted.size() / 2; i++) {
                result.add(unsorted.get(lastElement - i));
                result.add(unsorted.get(i));
            }
        }
        return result;
    }


    public static boolean checkSizeConstraints(List<Integer> unsorted) {
        if (unsorted != null) {
            return unsorted.size() >= 2 && unsorted.size() <= (Math.pow(10, 4));
        } else {
            return false;
        }
    }//end of method checkSizeConstraints

    public static boolean checkElementConstraints(List<Integer> unsorted) {
        int min = -(int) Math.pow(10, 6);
        int max = (int) Math.pow(10, 6);
        for (Integer integer : unsorted) {
            if (integer < min || integer > max) {
                return false;
            }
        }
        return true;
    }//end of method checkElementConstraints

}//end of class MeanderingArray
