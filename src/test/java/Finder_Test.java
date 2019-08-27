import org.junit.*;
import static org.junit.Assert.assertEquals;
public class Finder_Test {
    @Test
    public void test_findMax() {
        Finder myobj = new Finder();
        int[] input = {1,2,3,4,5};
        Integer actualResult = myobj.findMax(input);
        Integer expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMin() {
        Finder myobj = new Finder();
        int[] input = {1,2,3,4,5};
        Integer actualResult = myobj.findMin(input);
        Integer expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMax_empty() {
        Finder myobj = new Finder();
        int[] input = {};
        Integer actualResult = myobj.findMax(input);
        Integer expectedResult = null;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMax_null() {
        Finder myobj = new Finder();
        Integer actualResult = myobj.findMax(null);
        Integer expectedResult = null;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMin_empty() {
        Finder myobj = new Finder();
        int[] input = {};
        Integer actualResult = myobj.findMin(input);
        Integer expectedResult = null;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMin_null() {
        Finder myobj = new Finder();
        Integer actualResult = myobj.findMin(null);
        Integer expectedResult = null;
        assertEquals(expectedResult, actualResult);
    }
}
