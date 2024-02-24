// Program 1 - Word length Count Program
//
// This file reads a specified text file and displays a word
// length count table of the text.
//
// REQUIRED OUTPUT:
// Your output is to be displayed EXACTLY as given below:
//
// Length 1 - 6
// Length 2 - 4
// Length 3 - 7
// etc.
// ---------------------------------------------------------------

import java.util.Scanner;
import java.io.*;

public class Main {
  public static void main(String[] args) {

    // -----------------------------------------------------------
    // Use array of size 16 (index values 0-15) to store the
    // number of words for words of length 1-15.
    // 
    // word_counts[1] stores the number of words of length 1,
    // word_counts[2] stores the number of words of length 2, etc.
    // (Note that word_counts[0] will not be used.)
    // -----------------------------------------------------------
    int[] word_counts = new int[16];

    // var declarations
    int word_length;
	
    String current_word;
    String file_name;
	
    boolean end_of_file = false;
    boolean valid_file_name = false;
	
    Scanner keyboard = new Scanner(System.in);
    Scanner input = null;
    
    // prompt for and open text file
    while(!valid_file_name) {
      try {
        // prompt for file name
        System.out.println("\nEnter File to process: ");
        file_name = keyboard.nextLine();
    
        // open text file
        input = new Scanner(new File(file_name));
        valid_file_name = true;  
      }
      catch (FileNotFoundException e) {
        System.out.println("* INVALID FILE NAME - PLEASE REENTER *");
      }
    }

    // read word of file
    while(!end_of_file)
    {
      if(!input.hasNext())
        end_of_file = true;
      else 
      {
        current_word = input.next();
        word_length = determineWordLength(current_word);
        updateWordCounts(word_counts, word_length);
      }
    }

    // display word counts
    displayWordCounts(word_counts);
  }

  // -----------------------------------------------------------
     public static int determineWordLength(String word) {
  // -----------------------------------------------------------
  // Returns the length of the word provided in parameter word.
  // If the word contains a last character that is punctuation 
  // and not a letter, then returns the length of the word
  // without the punctuation characters (e.g., "lake." and 
  // "lake," would both return as length 4.
  // -----------------------------------------------------------
  // (TO COMPLETE)
    
   }
  // -----------------------------------------------------------
     public static void updateWordCounts(int[] word_counts,
                                         int word_length) {
  // -----------------------------------------------------------
  // Updates array word_counts for the word_length given.
  // -----------------------------------------------------------
  // (TO COMPLETE)
     
   }
  
  // -----------------------------------------------------------
     public static void displayWordCounts(int[] word_counts) {
  // -----------------------------------------------------------
  // Display the contents of word_counts in which the array index
  // index of word_counts is the word length, and the value at
  // that array index contains the number of words of that length.
  //
  // Output formatted as follows:
  // Length 1 - 6
  // Length 2 - 4
  // Length 3 - 7
  // etc.
  // -----------------------------------------------------------
  // (TO COMPLETE)
     
  }
}