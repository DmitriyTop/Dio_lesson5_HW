package com.dioEducation.lesson5;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static ArrayElement[] generateObjectArray (int[] intArray) {
        ArrayElement[] objectArray = new ArrayElement[intArray.length]; // create our array of objects
        for (int i = 0; i < intArray.length; i++) {                     // cycle to define every array element
            objectArray[i] = new ArrayElement();                        // define type of element as object-type
            objectArray[i].setElementName(String.valueOf(intArray[i])); // redefine Name as String from int array
            objectArray[i].setElementValue(intArray[i]);                // assign name to array object
        }
        return objectArray;
    }
}
