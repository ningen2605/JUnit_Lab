package Gradebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class GradeBookTest {
    GradeBook g1;
    GradeBook g2;
    @Before
    public void SetUp(){
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        g1.addScore(80);
        g1.addScore(57);
        g1.addScore(25);
        g1.addScore(30);
        g1.addScore(87);

        g2.addScore(24);
        g2.addScore(85);
        g2.addScore(10);
        g2.addScore(90);
        g2.addScore(72);


    }
    @After
    public void tearDown (){
        g1 = null;
        g2 = null;
    }

    @Test
    public void addScoreTest()
    {



        assertTrue(g1.toString().equals("80.0 57.0 25.0 30.0 87.0 "));
        assertTrue(g2.toString().equals("24.0 85.0 10.0 90.0 72.0 "));

        assertEquals(5,g1.getScoresSize());
        assertEquals(5,g2.getScoresSize());
    }

    @Test
    public void TestSum()
    {

        assertEquals(279,g1.sum(), .0001);
        assertEquals(281,g2.sum(), .0001);
    }

    @Test
    public void TestMinimum()
    {
      assertEquals(25, g1.minimum(), .001);
      assertEquals(10, g2.minimum(), .001);
    }

    @Test
    public void finalScoreTest()
    {
        assertEquals(254,g1.finalScore());
        assertEquals(271,g2.finalScore());
    }

}