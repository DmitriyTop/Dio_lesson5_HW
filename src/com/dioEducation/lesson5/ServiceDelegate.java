package com.dioEducation.lesson5;

public class ServiceDelegate {
    private final ArrayHelper arrayResource;

    public ServiceDelegate (ArrayHelper arrayResource) {
        this.arrayResource = arrayResource;
    }

    public ArrayElement[] mergeArrays(ArrayElement[] objectLeftArray, ArrayElement[] objectRightArray) {
        printObjectArray(objectLeftArray);
        printObjectArray(objectRightArray);
        ArrayElement[] objectResultArray = arrayResource.mergeArrays(objectLeftArray, objectRightArray);
        printObjectArray(objectResultArray);
        return objectResultArray;
    }

    public static void printObjectArray(ArrayElement[] objectArray) {
        System.out.println("{ ");
        for (ArrayElement x : objectArray) {
            System.out.println(x.getElementValue());
            System.out.println(" ");
        }
        System.out.println(" }");
    }
}