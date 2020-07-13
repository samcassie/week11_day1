public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;
    private int copiesMade;

    public Printer(int sheetsOfPaper, int tonerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public int getCopiesMade() {
        return copiesMade;
    }

    public void print(int number){
        if ((number <= sheetsOfPaper) && (number <= tonerVolume)){
            sheetsOfPaper -= number;
            copiesMade += number;
            tonerVolume -= number;
        }
    }
}
