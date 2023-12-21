package com.hz;

public class ChristmasCard extends Card {

    private final Printer printer;

    public ChristmasCard(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    public void printHeader() {
        String header = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(header);
    }

    public void printMessage() {
        String msg = "Merry Christmas! Wishing you joy, peace, and festive cheer!";
        this.printer.printLine(msg);
    }

    public void printImage() {
        this.printer.printLine("    ,--.");
        this.printer.printLine("   ()   \\");
        this.printer.printLine("     /    \\__");
        this.printer.printLine("    (       _)                           _.--,");
        this.printer.printLine("     `-.      \\                        .\'   /\\ \\,");
        this.printer.printLine("        )   (\\_|              __     /    /  \\ \\");
        this.printer.printLine("       /  .-\\              .-\'  `--./\\/\\/    / /\\ \\");
        this.printer.printLine("      /  /   |            /           \\_\\ \\    / /\\ \\");
        this.printer.printLine("      \\  \\__) \\_         /|               \\ \\__/ /\\ \\");
        this.printer.printLine("       \\   __   \\      __\\_\\_--._          \\    / /\\ \\");
        this.printer.printLine("        \\ /  \\    \\_.-\'        \\          \\__/ /\\ \\");
        this.printer.printLine("         \\    |     \\           \\              /\\ \\");
        this.printer.printLine("          \\   \\      \\           \\            /\\ \\");
        this.printer.printLine("           \\   \\      \\___________\\          / /\\ \\");
        this.printer.printLine("            \\   \\______\\___________\\        / /\\ \\ \\");
        this.printer.printLine("             \\_________|           \\______ / /  \\ \\ \\");
        this.printer.printLine("                     \\|___________________|/    \\ \\ \\ \\");
        this.printer.printLine("                                              \\ \\ \\ \\ \\");
        this.printer.printLine("                                               \\ \\ \\ \\ \\");
        this.printer.printLine("                                                \\ \\ \\ \\ \\");
        this.printer.printLine("                                                 \\ \\ \\ \\ \\");
        this.printer.printLine("                                                  \\ \\_\\_\\_\\");
        this.printer.printLine("                                                   \\________");


    }

    public void printFooter() {
        String footer = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(footer);
    }
}
