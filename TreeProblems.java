/*
 * *** Sanjana Kaushik / COMP 272 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    // Create two new TreeSets to avoid modifying the original sets
    Set<Integer> typeA = new TreeSet<>(setA); 
    Set<Integer> typeB = new TreeSet<>(setB);

    Set<Integer> commonElements = new TreeSet<>(setA); // Create a third set to store common elements
    commonElements.retainAll(setB); // Keep only elements that exist in both sets

    // Remove common elements from both sets
    typeA.removeAll(commonElements);
    typeB.removeAll(commonElements);

    Set<Integer> combinedElements = new TreeSet<>(); // Create a new set to store combined elements

    // Add remaining unique elements from both sets
    combinedElements.addAll(typeA);
    combinedElements.addAll(typeB);

    return combinedElements; // Return the final set
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    Iterator<Integer> iterator = treeMap.keySet().iterator(); // Create an iterator for the keys of the treeMap

    while (iterator.hasNext()) { // Loop through each key in the map
      int key = iterator.next();

      if (key % == 0) { // Check if the key is even
        iterator.remove(); // If the key is even, remove the entry from the map
      }

    }  
    
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    return tree1.equals(tree2); // Check if both trees are equal by comparing their key-value pairs

  }

} // end treeProblems class
