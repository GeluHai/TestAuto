/*
2. Create a class and demonstrate proper encapsulation techniques, the class will be called Printer.
It will simulate a real Computer Printer, it should have fields for the toner Level, number of pages printed,
and also whether its a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page
(which should increase the number of pages printed).
 */

package exercise2;


public class Test {

    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.printDetails();

        printer.setDuplex(true);
        printer.setTonerLevel(100);
        printer.setNumberOfPagesPrinted(0);

        printer.printDetails();

        printer.printPages(50);

        printer.printDetails();
    }
}
