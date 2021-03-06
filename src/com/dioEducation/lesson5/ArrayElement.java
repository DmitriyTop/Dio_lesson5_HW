package com.dioEducation.lesson5;

public class ArrayElement {
    private final String elementName;
    private final int elementValue;

    private ArrayElement(Builder builder) {
        this.elementName = builder.elementName;
        this.elementValue = builder.elementValue;
    }

    public String getElementName() {
        return elementName;
    }
    public int getElementValue() {
        return elementValue;
    }

    public static class Builder {
        private String elementName;
        private int elementValue;

        public Builder() {        }

        public Builder(ArrayElement original) {
            this.elementName = original.elementName;
            this.elementValue = original.elementValue;
        }
        public Builder elementName(String elementName){
            this.elementName = elementName;
            return this;
        }
        public Builder elementValue(int elementValue){
            this.elementValue = elementValue;
            return this;
        }
        public ArrayElement build() {
            return new ArrayElement(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayElement that = (ArrayElement) o;

        if (elementValue != that.elementValue) return false;
        return getElementName().equals(that.getElementName());
    }
    @Override
    public int hashCode() {
        int result = elementName != null ? elementName.hashCode() : 0;
        result = 31 * result + elementValue;
        return result;
    }
}

