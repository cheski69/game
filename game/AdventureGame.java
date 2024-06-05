import java.util.Scanner;

public class AdventureGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Your journey begins in a dark forest...");
        firstDecision();
    }

    private static void firstDecision() {
        System.out.println("You see a path split into two directions. Do you go left or right?");
        System.out.print("Enter 'left' or 'right': ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("left")) {
            leftPath();
        } else if (choice.equalsIgnoreCase("right")) {
            rightPath();
        } else {
            System.out.println("Invalid input. Please enter 'left' or 'right'.");
            firstDecision();
        }
    }

    private static void leftPath() {
        System.out.println("You encounter a wild animal. Do you fight or flee?");
        System.out.print("Enter 'fight' or 'flee': ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("fight")) {
            System.out.println("You bravely fight and win!");
            secondDecisionLeftPath();
        } else if (choice.equalsIgnoreCase("flee")) {
            System.out.println("You run away safely.");
            secondDecisionLeftPath();
        } else {
            System.out.println("Invalid input. Please enter 'fight' or 'flee'.");
            leftPath();
        }
    }

    private static void secondDecisionLeftPath() {
        System.out.println("After moving forward, you find a river. Do you swim across or build a raft?");
        System.out.print("Enter 'swim' or 'build': ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("swim")) {
            System.out.println("You swim across the river and reach the other side safely.");
            ending();
        } else if (choice.equalsIgnoreCase("build")) {
            System.out.println("You build a raft and safely float across the river.");
            ending();
        } else {
            System.out.println("Invalid input. Please enter 'swim' or 'build'.");
            secondDecisionLeftPath();
        }
    }

    private static void rightPath() {
        System.out.println("You find a treasure chest. Do you open it or leave it?");
        System.out.print("Enter 'open' or 'leave': ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("open")) {
            System.out.println("You find a treasure!");
            secondDecisionRightPath();
        } else if (choice.equalsIgnoreCase("leave")) {
            System.out.println("You decide to leave it and continue your journey.");
            secondDecisionRightPath();
        } else {
            System.out.println("Invalid input. Please enter 'open' or 'leave'.");
            rightPath();
        }
    }

    private static void secondDecisionRightPath() {
        System.out.println("You walk further and find a cave. Do you enter or continue walking?");
        System.out.print("Enter 'enter' or 'walk': ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("enter")) {
            System.out.println("You enter the cave and find more treasure inside.");
            ending();
        } else if (choice.equalsIgnoreCase("walk")) {
            System.out.println("You continue walking and eventually find your way out of the forest.");
            ending();
        } else {
            System.out.println("Invalid input. Please enter 'enter' or 'walk'.");
            secondDecisionRightPath();
        }
    }

    private static void ending() {
        System.out.println("Congratulations! You have completed your adventure.");
        System.out.println("Thank you for playing the Adventure Game.");
    }
}
