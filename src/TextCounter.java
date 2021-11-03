public class TextCounter {
    private int Rows;
    private int Letters;
    private boolean Stop;

    public TextCounter() {
        Rows = 0;
        Letters = 0;

    }

    public int getRowAmount() {
        return Rows;
    }

    public void SaveRows() {
        Rows = Rows + 1;
    }

    public int getLetterAmount() {
        return Letters;
    }

    public void SaveLetters(String Text) {
        Letters = Letters + Text.length();

    }

    public void AreThereStop(String Text) {
        Stop = Text.contains("stop");

    }

    public boolean getStop() {
        return Stop;
    }


    // public int getInputText() {
    //   String text = "hej";
    // return text;


}
