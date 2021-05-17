import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    // Modify the printer so that it reduces the toner by 1 for each page printed

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 500);
    }

    @Test
    public void hasSheetsOfPaper(){
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrintIfHasEnoughPaper(){
//        First assertEquals is to check if it has printed
        assertEquals(true, printer.print(25,2));
//        Second assertEquals is to check sheetsOfPaper has updated
        assertEquals(50, printer.getSheetsOfPaper());
//        And third is for checking the toner has updated
        assertEquals(450, printer.getToner());
    }

    @Test
    public void cannotPrintIfNotEnoughPaper(){
        assertEquals(false, printer.print(10, 11));
//        Checking that sheetsOfPaper has NOT been updated, since it did NOT print
        assertEquals(100, printer.getSheetsOfPaper());
//        Likewise for toner
        assertEquals(500, printer.getToner());
    }

    @Test
    public void canPrintAtExtreme(){
        assertEquals(true, printer.print(50, 2));
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getToner());
    }

    @Test
    public void canReduceToner(){
        printer.reduceToner(50);
        assertEquals(450, printer.getToner());
    }


}
