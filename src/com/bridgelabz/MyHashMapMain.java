/*
 *Ability to find frequency of words in a sentence like “To be or not to be”
 */
package com.bridgelabz;

public class MyHashMapMain {

	public static void main(String[] args) {
		givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency();
	}

	public static void givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To Be or not To be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myHashMap.add(word, value);
		}
		System.out.println(myHashMap);
		int frequency = myHashMap.get("to");
		System.out.println("frequency = " + frequency);
	}
}
