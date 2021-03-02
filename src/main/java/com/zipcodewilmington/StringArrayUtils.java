package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) { return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contained = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i].contains(value)){
                contained = true;
                break;
            } else contained = false;
        }
        return contained;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int start = 0;
        int end = array.length - 1;
        String placeholder;

        while(start < end) {
            placeholder = array[start];
            array[start] = array[end];
            array[end] = placeholder;
            start++;
            end--;

        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPali = false;
        int checker = 1;
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(array[array.length-checker])) {
                isPali = true;
            } else isPali = false;
            checker++;
        }
        return isPali;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        System.out.println('a' > 'Z');
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int timesOccured = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                timesOccured++;
            }
        }
        return timesOccured;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray;
        int counter = 0;
        int newIndex = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(valueToRemove)) {
                counter++;
            }
        }

        newArray = new String[array.length - counter];

        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals(valueToRemove)) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] newArray;
        int counter = 0;
        int newIndex = 0;
        String currentValue = "";

        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals(currentValue)) {
                currentValue = array[i];
            } else counter++;
        }

        newArray = new String[array.length - counter];

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(currentValue)) {
                newArray[newIndex] = array[i];
                currentValue = array[i];
                newIndex++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] newArray;
        int counter = 0;
        int newIndex = 0;
        String tempValue = "";
        String currentValue = "";

        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals(currentValue)) {
                currentValue = array[i];
            } else counter++;
        }

        newArray = new String[array.length - counter];
        String testValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(testValue)) {
                newArray[newIndex] = tempValue;
                tempValue = array[i];
                testValue = array[i];
                newIndex++;
            } else if (array[i].equals(testValue)) {
                tempValue += array[i];
            } else
                newArray[newIndex] = array [i];
        }
        newArray[newIndex] = tempValue;


        return newArray;
    }


}
