
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TextCounterTest {

    @Test
    //ta reda på hur många rader jag har skrivit
    public void testRowAmount() {
        //Arrange
        TextCounter count = new TextCounter();
        //Act
        int actual = count.getRowAmount();
        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
//spara antalet rader
    public void testSaveRows() {
        //Arrange
        TextCounter count = new TextCounter();
        //Act
        count.SaveRows();
        int actual = count.getRowAmount();
        //Assert

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
//ta reda på hur många tecken jag har skrivit
    public void testLetterAmount() {
        //Arrange
        TextCounter count = new TextCounter();
        //Act

        int actual = count.getLetterAmount();

        //Assert

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    //spara antalet tecken
    public void testSaveLetters() {
        //Arrange
        TextCounter count = new TextCounter();
        //Act
        count.SaveLetters("martin äter mat");
        int actual = count.getLetterAmount();

        //Assert

        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    // stop //har jag skrivit ordet stop
    public void testAreThereStop() {
        //Arrange
        TextCounter count = new TextCounter();
        //Act

        count.AreThereStop("stop");

        boolean actual = count.getStop();
        //Assert

        boolean expected = true;

        assertEquals(expected, actual);
    }


}
