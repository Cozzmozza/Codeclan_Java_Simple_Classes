public class Printer {

    private int sheetsOfPaper;
    private int toner;

    public Printer(int sheetsOfPaper, int toner){
        this.sheetsOfPaper = sheetsOfPaper;
        this.toner = toner;
    }


    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int getToner(){
        return toner;
    }

    public boolean print(int numOfPages, int numOfCopies) {

//      Could just do this as a void, and get the test to check num of copies only, but I wanted to play with a boolean
//      Multiply numOfPages by numOfCopies
//      If sheetsOfpaper => this number, the 'print' can proceed
//      Subtract this from sheetsOfPaper, to return the new remaining sheetsOfPaper
        int pagesRequired = numOfPages * numOfCopies;
        if (sheetsOfPaper >= pagesRequired){
            sheetsOfPaper -= pagesRequired;
            reduceToner(pagesRequired);
            return true;
        }
        return false;

    }

    public void reduceToner(int value) {
        toner -= value;
    }
}
