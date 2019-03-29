import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

import static org.junit.Assert.*;

public class TestL3Rational {

  @Rule
    public Timeout globalTimeout = Timeout.seconds(1); // 1 seconds max per method tested

    private static double Rational_grade = 0.0;

    @Before
    public void setUp() {

    }

    @AfterClass
    public static void afterClass() {

        System.out.println(TestUtils.DIV);

        System.out.println("Grade for Rational (out of possible 5.0): " + Rational_grade);

        System.out.println(TestUtils.DIV);

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testConstructor1() {
      Rational x = new Rational(3);
      assertEquals(3, x.getNumerator());
      assertEquals(1, x.getDenominator());

      Rational_grade += 0.5;
    }

    @Test
    public void testConstructor2() {
      Rational x = new Rational(3,2);
      assertEquals(3, x.getNumerator());
      assertEquals(2, x.getDenominator());

      Rational_grade += 0.5;
    }

    @Test
    public void testConstructorReduce1() {
      Rational x = new Rational(15,6);
      assertEquals(5, x.getNumerator());
      assertEquals(2, x.getDenominator());

      Rational_grade += 0.5;
    }

    @Test
    public void testConstructorReduce2() {
      Rational x = new Rational(10,2);
      assertEquals(5, x.getNumerator());
      assertEquals(1, x.getDenominator());

      Rational_grade += 0.5;
    }

    @Test
    public void testPlusInstanceMethod() {
      Rational x = new Rational(1,2);
      Rational y = new Rational(1,4);
      Rational z = x.plus(y);

      assertEquals(3, z.getNumerator());
      assertEquals(4, z.getDenominator());

      Rational_grade += 0.5;
    }

    @Test
    public void testPlusClassMethod() {
      Rational x = new Rational(5,4);
      Rational y = new Rational(-13,9);
      Rational z = Rational.plus(x,y);

      assertEquals(-7, z.getNumerator());
      assertEquals(36, z.getDenominator());

      Rational_grade += 0.5;
    }

    @Test
    public void testEquals1() {
      Rational x = new Rational(1,2);
      Rational y = new Rational(7,2);

      assertEquals(false, x.equals(y));

      Rational_grade += 0.5;
    }

    @Test
    public void testEquals2() {
      Rational x = new Rational(1,2);
      Rational y = new Rational(-2,-4);

      assertEquals(true, x.equals(y));

      Rational_grade += 0.5;
    }

    @Test
    public void testCompareTo1() {
      Rational x = new Rational(1,2);
      Rational y = new Rational(3,4);

      assertEquals(true, x.compareTo(y) < 0);
      assertEquals(true, y.compareTo(x) > 0);
      Rational_grade += 0.5;
    }

    @Test
    public void testCompareTo2() {
      Rational x = new Rational(1,2);
      Rational y = new Rational(2,4);

      assertEquals(true, x.compareTo(y) == 0);
      assertEquals(true, y.compareTo(x) == 0);
      Rational_grade += 0.5;
    }

    public static void main(String[] args) {

        TestUtils.runClass(TestL3Rational.class);

    }

}
