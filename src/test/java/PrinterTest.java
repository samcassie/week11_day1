import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(30, 10);
    }

    @Test
    public void hasSheetsOfPaper() {
        assertEquals(30, printer.getSheetsOfPaper());
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(10, printer.getTonerVolume());
    }

    @Test
    public void paperAfterPrint(){
        printer.print(10);
        assertEquals(20, printer.getSheetsOfPaper());
    }

    @Test
    public void tonerAfterPrint(){
        printer.print(5);
        assertEquals(5, printer.getTonerVolume());
    }

    @Test
    public void failedPrint(){
        printer.print(100);
        assertEquals(30, printer.getSheetsOfPaper());
    }
    
}