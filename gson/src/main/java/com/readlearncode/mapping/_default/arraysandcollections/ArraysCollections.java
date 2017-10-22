package com.readlearncode.mapping._default.arraysandcollections;

import java.util.*;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ArraysCollections {

    private int[] intArray = new int[]{1, 2, 3, 5};
    private String[] stringArray = new String[]{"one", "two"};

    Collection<Object> objectCollection = new ArrayList<Object>() {{
        add("one");
        add("two");
    }};

    private Map<String, Integer> stringIntegerMap = new HashMap<String, Integer>() {{
        put("one", 1);
        put("two", 2);
    }};

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public Collection<Object> getObjectCollection() {
        return objectCollection;
    }

    public void setObjectCollection(Collection<Object> objectCollection) {
        this.objectCollection = objectCollection;
    }

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public void setStringIntegerMap(Map<String, Integer> stringIntegerMap) {
        this.stringIntegerMap = stringIntegerMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArraysCollections that = (ArraysCollections) o;
        return Arrays.equals(intArray, that.intArray) &&
                Arrays.equals(stringArray, that.stringArray) &&
                Objects.equals(objectCollection, that.objectCollection) &&
                Objects.equals(stringIntegerMap, that.stringIntegerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intArray, stringArray, objectCollection, stringIntegerMap);
    }

    @Override
    public String toString() {
        return "ArraysCollections{" +
                "intArray=" + Arrays.toString(intArray) +
                ", stringArray=" + Arrays.toString(stringArray) +
                ", objectCollection=" + objectCollection +
                ", stringIntegerMap=" + stringIntegerMap +
                '}';
    }
}