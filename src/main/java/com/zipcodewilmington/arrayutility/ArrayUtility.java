package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    return 0;
  }

  public Integer getMostCommonFromMerge(T[] arrayToMerge) {
    return null;
  }

  public Integer[] removeValue(T valueToRemove) {
    return null;
  }
}