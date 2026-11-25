import java.util.Scanner;
import java.util.ArrayList;

public class VisionToneStart {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //Arraylist test
        ArrayList <Song> songs= new ArrayList<> ();




         //Display message
        System.out.println("Welcome to VisionTone, where producers ideas flow");

        System.out.println("\nPlease chose a option");

        System.out.println("\n1.Add Song");
        System.out.println("2.View Song Status");
        System.out.println("3.What Should I Work On Today?");
        System.out.println("4.Album Roadmap");

        // Input user options

        System.out.print("\nEnter choice: ");
        int userChoice = input.nextInt();


        /*switch statement is being used depending
        on the first set of options then later moves
        into a method that calls for each one
         */

        switch (userChoice){
            case 1:
                Song song = addSong(input);
                songs.add(song);
                System.out.println("Songs stored: " + songs.size());
                System.out.println(song.toString());
                break;
            case 2:
                viewSongStatus(songs);
                break;
            default:
                System.out.println("Error: invalid operator");
                return;
        }

        // Class options if they chose finish my song
        //Method Helpers

    }

    public static Song addSong (Scanner input){
        //Variables
        String completionStatus = "";
        String songNeed = "";
        String recommendedFocus = "";
        String smallGoal = "";
        String priority = "";
        String priorityReason = "";

        // Input for the name of the song and the percentage
        input.nextLine();
        System.out.print("\nWhat is your song name?: ");
        String songName = input.nextLine();
        System.out.println("\nHow complete is this song?");

        System.out.println("\n1.Idea only");
        System.out.println("2.25%");
        System.out.println("3.50%");
        System.out.println("4.80%");
        System.out.println("5.Almost Done");

        System.out.print("\nEnter choice: ");
        int completionChoice = input.nextInt();
        input.nextLine(); // clean buffer
        //Calling the seconde method
        int needsChoice = getNeedsChoice(input);

        //Switch statements depending on what their answer is
        switch (completionChoice){
            case 1:
                completionStatus = "Idea Only";
                break;
            case 2:
                completionStatus = "25%";
                break;
            case 3:
                completionStatus = "50%";
                break;
            case 4:
                completionStatus = "80%";
                break;
            case 5:
                completionStatus = "Almost Done";
                break;
            default:
                System.out.println("Invalid Stage");

        }
        switch(needsChoice) {
            case 1:
                songNeed = "Lyrics";
                priority = "CRITICAL";
                recommendedFocus = "Write without editing.";
                smallGoal = "Finish 8 bars.";
                priorityReason = "Lyrics are blocking all future production work.";
                break;
            case 2:
                songNeed = "Vocals";
                priority = "HIGH";
                recommendedFocus = "Capture ideas before perfection.";
                smallGoal = "Record one rough take.";
                priorityReason = "Vocals are the next dependency before arrangement, mixing, and mastering can move forward.";
                break;
            case 3:
                songNeed = "Arrangement";
                priority = "HIGH";
                recommendedFocus = "Create clear song sections.";
                smallGoal = "Build Intro, Verse, Hook.";
                priorityReason = "Without clear arrangement, the song can become repetitive and lack progression.";
                break;
            case 4:
                songNeed = "Mixing";
                priority = "MEDIUM";
                recommendedFocus = "Balance before adding plugins.";
                smallGoal = "Set levels and panning.";
                priorityReason = "The song can continue without a final mix.";
                break;
            case 5:
                songNeed = "Mastering";
                priority = "LOW";
                recommendedFocus = "Compare against reference tracks.";
                smallGoal = "Export a test master.";
                priorityReason = "Mastering should happen after all production is complete.";
                break;
            default:
                System.out.println("Invalid Choice");
        }
//        System.out.println("------------------------");
//        System.out.println("SONG ADDED SUCCESSFULLY");
//        System.out.println("------------------------");
//        System.out.println("song: " + songName);
//        System.out.println("Completion: " + completionStatus);
//        System.out.println("Needs: " + songNeed);
//        System.out.println("\nPriority: " + priority);
//        System.out.println("\nReason: " + priorityReason);
//        System.out.println("\nRecommended Focus: " + recommendedFocus);
//        System.out.println("\nSmall Goal: " + smallGoal);

        // calling the class Song
        Song song = new Song(songName,
                completionStatus,
                songNeed,
                priority,
                priorityReason,
                recommendedFocus,
                smallGoal
        );
        return song;



        //Seconde method based off the needs of the user input

    }
    public static int getNeedsChoice(Scanner input){
        String songNeed = "";

        //input for what they still need
        System.out.println("\nWhat does it still need??");

        System.out.println("\n1.Lyrics");
        System.out.println("2.Vocals");
        System.out.println("3.Arrangement");
        System.out.println("4.Mixing");
        System.out.println("5.Mastering");

        System.out.print("\nEnter choice: ");
        int needsChoice = input.nextInt();

        //Switch statements based on what the user answered
//        switch(needsChoice) {
//            case 1: System.out.println("Focus: start writing lyrics even if its bad or corny but start.");
//            break;
//            case 2: System.out.println("Focus: Try improvising for 10-15 minutes either acapella or with the "
//                    + "instrumental once you have the idea down either " + "use a voice memo or record on your DAW");
//            break;
//            case 3: System.out.println("Focus: what structure you want your song to be, "
//                    + "by arranging the 'A' section 'B' section or 'C' section ");
//            break;
//            case 4: System.out.println("Focus: Fader leveling, panning, EQ, Compression, Effects, "
//                    + "and automation for last, " + "most important listen to your mix in different locations,"
//                    + " and dont over mix 1 hour a day is good enough");
//            break;
//            case 5: System.out.println("Focus: This is the last stretch depending on the genre pay attention"
//                    + "to your LUF meter and use a reference track for loudness");
//            break;
//            default: System.out.println("Invalid Choice");
//        }



        return needsChoice;

    }
    public static void viewSongStatus(ArrayList<Song> songs){
        for (Song song : songs);
        System.out.println(songs);
    }


}
