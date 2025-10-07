import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        // add scores to g1
        g1.addScore(50);
        g1.addScore(75);

        // add scores to g2
        g2.addScore(90);
        g2.addScore(80);
        g2.addScore(70);
    }

    @After
    public void tearDown() throws Exception {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        // check g1
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertEquals(2, g1.getScoreSize());

        // check g2
        assertTrue(g2.toString().equals("90.0 80.0 70.0 "));
        assertEquals(3, g2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(125.0, g1.sum(), 0.0001); // 50 + 75
        assertEquals(240.0, g2.sum(), 0.0001); // 90 + 80 + 70
    }

    @Test
    public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.0001);
        assertEquals(70.0, g2.minimum(), 0.0001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(75.0, g1.finalScore(), 0.0001);   // 50 + 75 - 50
        assertEquals(170.0, g2.finalScore(), 0.0001);  // 90 + 80 + 70 - 70
    }
}
