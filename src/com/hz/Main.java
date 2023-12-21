package com.hz;
import com.hz.io.ConsoleReader;
import com.hz.io.ConsoleWriter;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {
        // Lets print some cards
        Printer printer = new Console();
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        Card card1 = new PostCard(printer);
        Card card2 = new GraduationCard(printer);
        Card card3 = new ChristmasCard(printer);

        writer.writeLine("Which card do you want?");
        writer.writeLine("Options:");
        writer.writeLine("1: PostCard");
        writer.writeLine("2: GraduationCard");
        writer.writeLine("3: ChristmasCard");
        int cardChoice = Integer.parseInt(reader.readLine());

        if (cardChoice == 1) {
            card1.print();
        } else if (cardChoice == 2) {
            card2.print();
        } else if (cardChoice == 3) {
            card3.print();
        } else {
            printer.printLine("sorry, this card does not exist (yet)!");
        }
    }
}
