/*
2. Create a class and demonstrate proper encapsulation techniques, the class will be called Printer.
It will simulate a real Computer Printer, it should have fields for the toner Level, number of pages printed,
and also whether its a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page
(which should increase the number of pages printed).
 */

package exercise2;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex; //capable of printing on both sides of the paper


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean getDuplex() {
        return duplex;
    }


    public void setTonerLevel(int newTonerLevel) {
        tonerLevel = newTonerLevel;
    }

    public void setNumberOfPagesPrinted(int newNumberOfPagesPrinted) {
        numberOfPagesPrinted = newNumberOfPagesPrinted;
    }

    public void setDuplex(boolean newDuplex) {
        duplex = newDuplex;
    }


    public void fillUpTheToner() {
        if (tonerLevel < 100) {
            tonerLevel = 100;
        } else System.out.println("The toner level is at 100%");
    }

    public void printPages(int numberOfPages) {
        if (tonerLevel > 10) {
            tonerLevel = tonerLevel - (numberOfPages / 10);
        } else {
            System.out.println("Toner lever to low, fill up toner");
            return;
        }

        numberOfPagesPrinted = numberOfPagesPrinted + numberOfPages;
    }

    public void printDetails() {
        System.out.println("\n\n");
        System.out.println("The toner is at " + tonerLevel + "%");
        System.out.println("The number of pages printed is " + numberOfPagesPrinted);
        System.out.println("Is the printer a duplex " + duplex);
        System.out.println("\n");
    }
}
