import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String expectedString = "Leon got modified";

        //When
        String actualString=hamletParser.changeHamletToLeon("Hamlet got modified");

        //Then
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String expectedString = "Tariq got modified";

        //When
        String actualString=hamletParser.changeHoratioToHamlet("Horatio got modified");

        //Then
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void testFindHoratio() {
        //Given
        HamletParser hamletParser = new HamletParser();
        Boolean expectedBoolean1  = true;
        Boolean expectedBoolean2  = false;

        //When
        Boolean actualBoolean1=hamletParser.findHoratio("Horatio got modified");
        Boolean actualBoolean2=hamletParser.findHoratio("got modified");

        //Then
        Assert.assertEquals(expectedBoolean1,actualBoolean1);
        Assert.assertEquals(expectedBoolean2,actualBoolean2);
    }

    @Test
    public void testFindHamlet() {
        //Given
        HamletParser hamletParser = new HamletParser();
        Boolean expectedBoolean1  = true;
        Boolean expectedBoolean2  = false;

        //When
        Boolean actualBoolean1=hamletParser.findHamlet("Hamlet got modified");
        Boolean actualBoolean2=hamletParser.findHamlet("got modified");

        //Then
        Assert.assertEquals(expectedBoolean1,actualBoolean1);
        Assert.assertEquals(expectedBoolean2,actualBoolean2);
    }
}