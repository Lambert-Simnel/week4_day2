package org.example.streamapi;

import java.util.Arrays;
import java.util.List;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        names.forEach(System.out::println);
        // Implement me :)
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(i -> i % 2 == 0).toList();

        // Implement me :(
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        return Arrays.stream(numbers).map(p -> (p * 2)).toArray();
        // Implement me :)
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        return Arrays.stream(input.split("")).map(p -> p.toUpperCase()).toList();
        // Implement me :)
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        return list.stream().filter(p -> p.substring(0, 1).equals(letter)).map(p -> p.toUpperCase()).sorted().toList();
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        return words.stream().filter(p -> p.length() < maxLength).filter(p -> p.substring(0,1).equals(firstLetter)).toList();
    }
}