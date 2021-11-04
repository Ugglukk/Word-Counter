import java.util.Scanner;

public class MyTextCounter {
    // Skriv ett program som läser in text ifrån kommandoraden
    // rad för rad tills användaren skriver ordet stop.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TextCounter count = new TextCounter();

        System.out.println("Enter a text and I shall calculate the number of Letters and rows you have typed.");
        System.out.println("You stop with the word stop.");

        String Text;

        while (!count.getStop()) {
            Text = scan.nextLine();
            count.SaveRows();
            count.SaveLetters(Text);
            count.AreThereStop(Text);

            if (count.getStop()) {
                count.SaveIgnoredRow();
                count.SaveIgnoredLetters();
                break;
            }
        }
//   När användaren är klar skriver programmet ut
//   antal tecken och hur många rader som användaren har skrivit,
//   exklusive raden med ordet stop

        System.out.println("You have written on " + (count.getRowAmount() - count.getIgnoredRow()) + " Lines ");
        System.out.println("You have entered " + (count.getLetterAmount() - count.getIgnoredLetters()) + " letters ");
        System.out.println("Stopped = " + count.getStop());

    }
}

