import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Election {

  public static ArrayList<Integer> indexes = new ArrayList<>();

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

    ArrayList<String> candidatesList = new ArrayList<>();
    ArrayList<Integer> votesList = new ArrayList<>();

    System.out.println("Start voting by entering the candidate names: ");
    do {
      userInput = scanner.nextLine();

      try {
        Integer.parseInt(userInput);
        keepGoing = false;
        break;
      } catch (Exception e) {
      }

      if (userInput.trim().isEmpty()) {
        keepGoing = false;
        break;
      }

      if (!(candidatesList.indexOf(userInput) >= 0)) {
        candidatesList.add(userInput);
        votesList.add(1);
      } else {
        int index = candidatesList.indexOf(userInput);
        votesList.set(index, (votesList.get(index) + 1));
      }
    } while (keepGoing);

    // System.out.println(candidatesList);
    // System.out.println(votesList);

    for (int i = 0; i < candidatesList.size(); i++) {
      System.out.println(candidatesList.get(i) + " received " + votesList.get(i) + " votes.");
    }

    System.out.println("---------------------------------------");

    if (count(votesList, Collections.max(votesList)) > 1) {
      System.out.println("Election concluded with a draw between: ");
      for (int i = 0; i < indexes.size(); i++) {
        System.out.print(candidatesList.get(indexes.get(i)));
        System.out.print(" ");
        System.out.print('\n');
      }
      // System.out.println(indexes);
    } else {
      int index = votesList.indexOf(Collections.max(votesList));
      System.out.println("The winner is " + candidatesList.get(index) + " with " + votesList.get(index) + " votes.");
    }

    scanner.close();
  }
}
