package dolphinsPlay;

//TODO write unit tests

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class PlayDolphinsTests
{
    Dolphin dolphin;
    DolphinsPlay dolphinsPlay;
    @Test
    public void test_Dolphin_Constructor_Should_Initialize_Correctly()
    {
        dolphin = new Dolphin("mammal", "Ludmil", 10);
        Assert.assertEquals("mammal", dolphin.getType());
        Assert.assertEquals("Ludmil", dolphin.getName());
        Assert.assertEquals(10, dolphin.getEnergy());
    }
    @Test
    public void test_DolphinsPlay_Constructor_Should_Initialize_Correctly()
    {
       dolphinsPlay = new DolphinsPlay("Vetren", 5);
       Assert.assertEquals("Vetren", dolphinsPlay.getName());
       Assert.assertEquals(5, dolphinsPlay.getCapacity());
       Assert.assertEquals(0, dolphinsPlay.getCount());
       Assert.assertEquals(0, dolphinsPlay.getDolphins().size());
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_DolphinsPlay_setCapacity_Should_Throw_Exception_Negative_Capacity()
    {
        dolphinsPlay = new DolphinsPlay("Vetren", -1);

    }
    @Test(expected = IllegalArgumentException.class)
    public void test_DolphinsPlay_addDolphin_Should_Throw_Exception_Null_Dolphin()
    {
        dolphinsPlay = new DolphinsPlay("Vetren", 5);
        dolphin = null;
        dolphinsPlay.addDolphin(dolphin);

    }
    @Test(expected = IllegalArgumentException.class)
    public void test_DolphinsPlay_addDolphin_Should_Throw_Exception_Full_Capacity()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 5);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T2", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T3", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);
        Dolphin dolphin6 = new Dolphin("T6", "N6", 6);
        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        dolphinsPlay.addDolphin(dolphin6);

    }
    @Test(expected = IllegalArgumentException.class)
    public void test_DolphinsPlay_addDolphin_Should_Throw_Exception_If_Dolphin_Exist()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 10);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T2", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T3", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);

        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        dolphinsPlay.addDolphin(dolphin5);

    }
    @Test
    public void test_DolphinsPlay_addDolphin_Should_Increase_Dolphins_Count()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 10);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T2", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T3", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);

        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        Assert.assertEquals(5, dolphinsPlay.getCount());
        Assert.assertEquals(5, dolphinsPlay.getDolphins().size());
    }
    @Test
    public void test_DolphinsPlay_removeDolphin_Should_Remove_Existing_Dolphin_And_Return_True()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 10);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T2", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T3", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);

        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        Assert.assertTrue(dolphinsPlay.removeDolphin("N3"));
    }
    @Test
    public void test_DolphinsPlay_removeDolphin_Should_Return_False_If_Dolphin_Does_Not_Exist()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 10);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T2", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T3", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);

        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        Assert.assertFalse(dolphinsPlay.removeDolphin("N6"));
    }
    @Test
    public void test_DolphinsPlay_getTheDolphinWithTheMaxEnergy_Should_Return_Dolphin_With_Max_Energy()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 10);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T2", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T3", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);

        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        Assert.assertEquals("N5", dolphinsPlay.getTheDolphinWithTheMaxEnergy());
    }
    @Test
    public void test_DolphinsPlay_findAllDolphinsByType_Should_Return_All_Dolphins_By_Given_Type_As_List()
    {

        dolphinsPlay = new DolphinsPlay("Vetren", 5);
        Dolphin dolphin1 = new Dolphin("T1", "N1", 1);
        Dolphin dolphin2 = new Dolphin("T1", "N2", 2);
        Dolphin dolphin3 = new Dolphin("T1", "N3", 3);
        Dolphin dolphin4 = new Dolphin("T4", "N4", 4);
        Dolphin dolphin5 = new Dolphin("T5", "N5", 5);

        dolphinsPlay.addDolphin(dolphin1);
        dolphinsPlay.addDolphin(dolphin2);
        dolphinsPlay.addDolphin(dolphin3);
        dolphinsPlay.addDolphin(dolphin4);
        dolphinsPlay.addDolphin(dolphin5);
        List<Dolphin> expected = new ArrayList<>();
        expected.add(dolphin1);
        expected.add(dolphin2);
        expected.add(dolphin3);
        Assert.assertEquals(expected, dolphinsPlay.findAllDolphinsByType("T1"));
    }

}
