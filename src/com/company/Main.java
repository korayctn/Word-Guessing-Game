/*
    This program was coded by Koray Çetin for MIS 131 Assignment 3
    Instructor = Nazım Taşkın, Reydan Yaşar

 */

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String q1fourletters = "The day of the month or year as specified by a number ?";
        String q2fourletters = "A thing given willingly to someone without payment; a present ?";
        String q3fourletters = "Of a colour intermediate between green and violet, as of the sky or sea on a sunny day?";
        String a1fourletters = "date";
        String a2fourletters = "gift";
        String a3fourletters = "blue";

        String q1fiveletters = "A colourless, transparent, odourless liquid that forms the seas, lakes, rivers, and rain and is the basis of the fluids of living organisms?";
        String q2fiveletters = "An anxious awareness of danger.?";
        String q3fiveletters = "The period from sunset to sunrise in each twenty-four hours.?";
        String a1fiveletters = "water";
        String a2fiveletters = "alarm";
        String a3fiveletters = "night";

        String q1sixletters = "A spiral curve, shape, pattern, or object?";
        String q2sixletters = "A celestial body distinguished from the fixed stars by having an apparent motion of its own (including the moon and sun), especially with reference to its supposed influence on people and events.?";
        String q3sixletters = "A porous device for removing impurities or solid particles from a liquid or gas passed through it.?";
        String a1sixletters = "spiral";
        String a2sixletters = "planet";
        String a3sixletters = "filter";

        String[][] qandAnswers4Letters = {{q1fourletters,a1fourletters},{q2fourletters,a2fourletters},{q3fourletters,a3fourletters}};
        String[][] qandAnswers5Letters = {{q1fiveletters,a1fiveletters},{q2fiveletters,a2fiveletters},{q3fiveletters,a3fiveletters}};
        String[][] qandAnswers6Letters = {{q1sixletters,a1sixletters},{q2sixletters,a2sixletters},{q3sixletters,a3sixletters}};

        int questionNumbers = 3;
        int questionCounter = 1;


        int gainedPoints=0;
        int fourletterPoints=0;
        int fiveletterPoints=0;
        int sixletterPoints=0;

        System.out.println("Welcome to word guessing game.");

        while(questionCounter <= questionNumbers){

            String answer4letters;
            String question4letters;
            String answer5letters;
            String question5letters;
            String answer6letters;
            String question6letters;


            ArrayList <Character> revealedLetters = new ArrayList<>();

            // **************************************** 4 LETTERS ****************************************

            if(questionCounter==1){

                boolean isFinished = false;

                int revealedCounter = 0;
                int fourLettersPoints = 0;
                // random  question selection part
                String[] randPart = qandAnswers4Letters[rand.nextInt(qandAnswers4Letters.length)];
                answer4letters = randPart[1];
                question4letters = randPart[0];


                System.out.println(question4letters); // ASK QUESTION

                ArrayList <Integer> nums4letters = new ArrayList<>(); // arraylist for random numbers

                for (int i = 0;i< answer4letters.length();i++){
                    nums4letters.add(i);
                }

                int current4Letters = 4;
                // ********************* QUESTION PARTS *********************

                while(!(isFinished) &&  revealedCounter < answer4letters.length()){

                    System.out.println("Enter the answer 1 or request a letter 2: ");
                    int choice = input.nextInt();

                    int randomNum = rand.nextInt(current4Letters);
                    int returnerNum = nums4letters.get(randomNum);

                    if (choice == 2){ // GETTING LETTER PART

                        revealedLetters.add(answer4letters.charAt(returnerNum));

                        // LOOP THAT RETURNS THE LETTERS
                        for (int i = 0;i < answer4letters.length();i++){
                            if(revealedLetters.contains(answer4letters.charAt(i))){
                                System.out.print(answer4letters.charAt(i));
                            }
                            else{
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                        revealedCounter++;

                    }
                    else if( choice == 1 ){  // ANSWERING PART

                        System.out.println("What is the answer ?");
                        input.nextLine();
                        String answer = input.nextLine().toLowerCase();
                        if (answer.equals(answer4letters)){ // CORRECT ANSWER PART

                            fourLettersPoints = (4 - revealedCounter) * 100;
                            gainedPoints += fourLettersPoints;
                            System.out.printf("You gained %d points\n",fourLettersPoints);
                            isFinished = true;
                        }
                        else if (!(answer.equals(answer4letters))){ // INCORRECT ANSWER PART
                            fourLettersPoints = (4 - revealedCounter) * 100;
                            System.out.printf("You lost %d points\n",fourLettersPoints);
                        }
                    }
                    else{
                        System.out.println("Wrong input.");
                    }
                    nums4letters.remove(randomNum);
                    current4Letters--;
                }
                questionCounter++;
                fourletterPoints = fourLettersPoints;
            }
            // **************************************** 5 LETTERS ****************************************
            else if(questionCounter==2) {

                boolean isFinished = false;

                int revealedCounter = 0;
                int fiveLettersPoints = 0;

                // random  question selection part
                String[] randPart = qandAnswers5Letters[rand.nextInt(qandAnswers5Letters.length)];
                answer5letters = randPart[1];
                question5letters = randPart[0];


                System.out.println(question5letters); // ASK QUESTION

                ArrayList<Integer> nums5letters = new ArrayList<>(); // arraylist for random numbers

                for (int i = 0; i < answer5letters.length(); i++) {
                    nums5letters.add(i);
                }

                int current5Letters = 5;
                // ********************* QUESTION PARTS *********************

                while (!(isFinished) && revealedCounter < answer5letters.length()) {

                    System.out.println("Enter the answer 1 or request a letter 2: ");
                    int choice = input.nextInt();

                    int randomNum = rand.nextInt(current5Letters);
                    int returnerNum = nums5letters.get(randomNum);

                    if (choice == 2) { // GETTING LETTER PART

                        revealedLetters.add(answer5letters.charAt(returnerNum));

                        // LOOP THAT
                        for (int i = 0; i < answer5letters.length(); i++) {
                            if (revealedLetters.contains(answer5letters.charAt(i))) {
                                System.out.print(answer5letters.charAt(i));
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                        revealedCounter++;

                    } else if (choice == 1) {  // ANSWER PART

                        System.out.println("What is the answer ?");
                        input.nextLine();
                        String answer = input.nextLine().toLowerCase();
                        if (answer.equals(answer5letters)) {

                            fiveLettersPoints = (5 - revealedCounter) * 100;
                            gainedPoints += fiveLettersPoints;
                            System.out.printf("You gained %d points\n", fiveLettersPoints);
                            isFinished = true;
                        } else if (!(answer.equals(answer5letters))) {
                            fiveLettersPoints = (5 - revealedCounter) * 100;
                            System.out.printf("You lost %d points\n", fiveLettersPoints);
                        }
                    }
                    nums5letters.remove(randomNum);
                    current5Letters--;
                }
                fiveletterPoints = fiveLettersPoints;
                questionCounter++;
            }
            // **************************************** 6 LETTERS ****************************************
            else if(questionCounter==3){

                boolean isFinished = false;

                int revealedCounter = 0;
                int sixLettersPoints = 0;

                // random  question selection part
                String[] randPart = qandAnswers6Letters[rand.nextInt(qandAnswers6Letters.length)];
                answer6letters = randPart[1];
                question6letters = randPart[0];


                System.out.println(question6letters); // ASK QUESTION

                ArrayList <Integer> nums6letters = new ArrayList<>(); // arraylist for random numbers

                for (int i = 0;i< answer6letters.length();i++){
                    nums6letters.add(i);
                }

                int current6Letters = 6;
                // ********************* QUESTION PARTS *********************

                while(!(isFinished) &&  revealedCounter < answer6letters.length()){

                    System.out.println("Enter the answer 1 or request a letter 2: ");
                    int choice = input.nextInt();

                    int randomNum = rand.nextInt(current6Letters);
                    int returnerNum = nums6letters.get(randomNum);

                    if (choice == 2){ // GETTING LETTER PART

                        revealedLetters.add(answer6letters.charAt(returnerNum));

                        // LOOP THAT
                        for (int i = 0;i < answer6letters.length();i++){
                            if(revealedLetters.contains(answer6letters.charAt(i))){
                                System.out.print(answer6letters.charAt(i));
                            }
                            else{
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                        revealedCounter++;

                    }
                    else if( choice == 1 ){  // ANSWER PART

                        System.out.println("What is the answer ?");
                        input.nextLine();
                        String answer = input.nextLine().toLowerCase();
                        if (answer.equals(answer6letters)){

                            sixLettersPoints = (6 - revealedCounter) * 100;
                            gainedPoints += sixLettersPoints;
                            System.out.printf("You gained %d points\n",sixLettersPoints);
                            isFinished = true;
                        }
                        else if (!(answer.equals(answer6letters))){
                            sixLettersPoints = (6 - revealedCounter) * 100;
                            System.out.printf("You lost %d points\n",sixLettersPoints);
                        }
                    }
                    nums6letters.remove(randomNum);
                    current6Letters--;
                }
                sixletterPoints = sixLettersPoints;
                questionCounter++;
            }

        }
        int overallPoints = fourletterPoints + fiveletterPoints + sixletterPoints;
        System.out.println("---------------------");
        System.out.printf("4 letters points : %d\n5 letters points : %d\n6 letters points : %d\nOverall points : %d",fourletterPoints,fiveletterPoints,sixletterPoints,overallPoints);
    } // end main

} // end class
