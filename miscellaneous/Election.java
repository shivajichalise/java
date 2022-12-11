import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Election {

  // The ArrayList class is a resizable array.
  // In easy words ArrayList does exactly what array does but better.

  // indexes arraylist is created to store the index of votes of candidates who
  // got same number of votes
  public static ArrayList<Integer> indexes = new ArrayList<>();

  // count method takes an arraylist and a integer that checks if the same integer
  // exists more than once in the given array list.
  // This method was required to check if two candidates got equal number of votes
  public static int count(ArrayList<Integer> list, int element) {
    int count = 0;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == element) {
        indexes.add(i);
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput;
    boolean keepGoing = true;

    ArrayList<String> candidatesList = new ArrayList<>(); // created to store candidates as an array
    ArrayList<Integer> votesList = new ArrayList<>(); // created to store the votes the candidates got

    // the data with same index between above two arraylist is related
    // eg.
    // candidatesList = ['Ram', 'Shyam', 'Hari']
    // arraylist = [2, 4, 5]
    // this means Ram got 2 votes, Shyam got 4 and Hari got 5 votes.

    System.out.println("Start voting by entering the candidate names: ");
    do {
      userInput = scanner.nextLine();

      try {
        Integer.parseInt(userInput);
        keepGoing = false;
        System.out.println("Please enter correct data. Numeric value or empty line is not allowed.");
        break;
      } catch (Exception e) {
      }

      if (userInput.trim().isEmpty()) { // if given input is an empty line the program stops
        keepGoing = false;
        break;
      }

      // what this if else does is: if the name of same candidate is entered then the
      // vote is increased by one and if name of a new candidate is entered then the
      // candidate is added into the candidate list
      if (!(candidatesList.indexOf(userInput) >= 0)) {
        // this runs if new candidate name is entered and the candidate is added into
        // the candidate list
        candidatesList.add(userInput);
        votesList.add(1);
      } else {
        // this runs when previously entered candidate name is entered and the votes the
        // candidate got is increased by one
        int index = candidatesList.indexOf(userInput);
        votesList.set(index, (votesList.get(index) + 1));
      }
    } while (keepGoing);

    // System.out.println(candidatesList);
    // System.out.println(votesList);

    // this for loop prints the candidates names and the number of votes they got
    for (int i = 0; i < candidatesList.size(); i++) {
      System.out.println(candidatesList.get(i) + " received " + votesList.get(i) + " votes.");
    }

    System.out.println("---------------------------------------");

    // is checks if two candidate got equal number of votes
    if (count(votesList, Collections.max(votesList)) > 1) { // Collections.max returns the maximum value that is in the
                                                            //
                                                            // provided arraylist
      // this runs if two candidates do get equal number of votes

      System.out.println("Election concluded with a draw between: ");

      for (int i = 0; i < indexes.size(); i++) {
        System.out.print(candidatesList.get(indexes.get(i)));
        System.out.print(" ");
        System.out.print('\n');
      }
      // System.out.println(indexes);
    } else {
      // this runs if no candidatesList get same number of votes
      int index = votesList.indexOf(Collections.max(votesList));
      System.out.println("The winner is " + candidatesList.get(index) + " with " + votesList.get(index) + " votes.");
    }

    scanner.close();
  }
}
