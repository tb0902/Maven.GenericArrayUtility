package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

  private T[] inputArray;

  public ArrayUtility(T[] inputArray) {
    this.inputArray = inputArray;
  }

  public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
    Integer counter = 0;
    for (T item1 : arrayToMerge) {
      if (item1 == valueToEvaluate) {
        counter++;
      }
    }

    for (T item2 : inputArray) {
      if (item2 == valueToEvaluate) {
        counter++;
      }
    }
    return counter;
  }

  public Integer getNumberOfOccurrences(T valueToEvaluate) {
    Integer counter = 0;
    for (T item1 : inputArray) {
      if (item1 == valueToEvaluate) {
        counter++;
      }
    }
    return counter;
  }

  public T getMostCommonFromMerge(T[] arrayToMerge) {
    ArrayList<T> mergedArrayList = new ArrayList<>(Arrays.asList(arrayToMerge));
    mergedArrayList.addAll(Arrays.asList(inputArray));

    HashMap<T, Integer> map = new HashMap<>();
    T keyToRet = null;
    for (T key : mergedArrayList) { // for every key in the array
      if (!map.containsKey(key)) {
        map.put(key, 0);
      } else {
        map.put(key, map.get(key)+1);
      }
    }
    Integer value = 0;
    for (Map.Entry<T, Integer> entry : map.entrySet()) {


      if (entry.getValue() > value) {
        value = entry.getValue();
        keyToRet = entry.getKey();
      }
    }
    return keyToRet;
  }

  public T[] removeValue(T valueToRemove) {

    ArrayList<T> newList = new ArrayList<>(Arrays.asList(inputArray));

    for (int i = 0; i < newList.size(); i++) {
        if (newList.get(i) == valueToRemove) {
          newList.remove(valueToRemove);
        }
    }
    T[] array = newList.toArray((T[]) Array.newInstance(valueToRemove.getClass(), newList.size())); // reflection to turn it back to array : )
    return array;
  }
}