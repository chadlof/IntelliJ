package moviePick;

import java.util.Scanner;

/**
 * Created by valjesc on 12/18/2016.
 */
public class Person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start;
        String PERSON[] = {"Chad", "Jesse", "Shane"};
        String GENRE[] = {"Action", "Comedy", "Drama", "Family", "Horror", "Sci-Fi & Fantasy"};
        String CHAD[] = {"Gladiator", "Mean Girls", "Titanic", "Minions", "Friday the 13th", "Star Wars"};
        String JESSE[] = {"Indiana Jones", "O Brother, Where Art Thou?", "Good Will Hunting", "Trolls", "Nightmare on Elm Street", "Batman"};
        String SHANE[] = {"The Rock", "Meet the Parents", "Forrest Gump", "Lion King", "Jaws", "Avatar"};
        int person, genre;
        String name;
        int STOP = -1;
        MoviePerson aPerson = new MoviePerson();
        System.out.println("This program will let you know the favorite movie of any group member.");
        System.out.println("Please enter 1 to start or -1 to quit.");
        while (!input.hasNextInt()) {
                input.next();
                System.out.print("Please enter an integer. Enter 1 to start or -1 to quit. ");
            }
            start = input.nextInt();
        while (start != 1 & start != -1){
            System.out.println("Invalid entry. Please enter either 1 to start or -1 to quit.");
            while (!input.hasNextInt()){
                input.next();
                System.out.println("Please enter an integer. Enter 1 to start or -1 to quit.");
            }
            start = input.nextInt();
        }
        while (start != STOP) {
            System.out.println("#1 is Chad, #2 is Jesse, #3 is Shane");
            System.out.println("Please enter the number of the group member from the list: ");
            while (!input.hasNextInt())
            {
                input.next();
                System.out.print("Please enter an integer. Enter 1 for Chad, 2 for Jesse, or 3 for Shane. ");
            }
            person = input.nextInt() - 1;
            while (person < 0 || person > 2){
                System.out.println("Invalid entry. Enter 1 for Chad, 2 for Jesse, or 3 for Shane.");
                while (!input.hasNextInt()){
                    input.next();
                    System.out.println("Please enter an integer. Enter 1 for Chad, 2 for Jesse, or 3 for Shane.");
                }
                person = input.nextInt() - 1;
            }
            name = PERSON[person];
            aPerson.setName(name);
            System.out.println("You picked " + aPerson.getName() + ". Please pick a movie genre from the following choices:");
            System.out.println("#1 is Action, #2 is Comedy, #3 is Drama, #4 is Family, #5 is Horror, #6 is Sci-Fi & Fantasy");
            while (!input.hasNextInt())
            {
                input.next();
                System.out.print("Please enter an integer. Enter 1 for Action, 2 for Comedy, 3 for Drama, 4 for Family, 5 for Horror, or 6 for Sci-Fi/Fantasy ");
            }
            genre = input.nextInt() - 1;
            while (genre < 0 || genre > 5){
                System.out.println("Invalid entry. Enter 1 for Action, 2 for Comedy, 3 for Drama, 4 for Family, 5 for Horror, or 6 for Sci-Fi/Fantasy");
                while (!input.hasNextInt()){
                    input.next();
                    System.out.println("Please enter an integer. Enter 1 for Action, 2 for Comedy, 3 for Drama, 4 for Family, 5 for Horror, or 6 for Sci-Fi/Fantasy ");
                }
                genre = input.nextInt() - 1;
            }
            if (person == 0) {
                System.out.println(aPerson.getName() + "'s favorite " + GENRE[genre] + " movie is " + CHAD[genre]);
            } else if (person == 1) {
                System.out.println(aPerson.getName() + "'s favorite " + GENRE[genre] + " movie is " + JESSE[genre]);
            } else {
                System.out.println(aPerson.getName() + "'s favorite " + GENRE[genre] + " movie is " + SHANE[genre]);
            }
            System.out.println("You can run the program again by entering 1, or you can quit by entering -1");
            while (!input.hasNextInt())
            {
                input.next();
                System.out.print("Please enter an integer. Enter 1 to start again or -1 to quit. ");
            }
            start = input.nextInt();
            while (start != 1 & start != -1){
                System.out.println("Invalid entry. Please enter either 1 to start again or -1 to quit.");
                while (!input.hasNextInt()){
                    input.next();
                    System.out.println("Please enter an integer. Enter 1 to start again or -1 to quit.");
                }
                start = input.nextInt();
            }
        }
        System.out.println("Thank you for using this program. Go watch a movie :)");
    }
}
