import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestL3Utils {

    private static double Utils_grade = 0.0;

    @Before
    public void setUp() {

    }

    @AfterClass
    public static void afterClass() {

        System.out.println(TestUtils.DIV);

        System.out.println("Grade for Utils.findAndReplace (out of possible 5.0): " + Utils_grade);

        System.out.println(TestUtils.DIV);

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testNullParameter1() {

      String[] text = null;
  		String[] query = { "hi" };
  		String[] replacement = { "ho" };
  		String[] expected = null;
  		String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testNullParameter2() {

      String[] text = null;
      String[] query = null;
      String[] replacement = null;
      String[] expected = null;
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testNullString1() {

      String[] text = { null };
  		String[] query = { null };
  		String[] replacement = { null };
  		String[] expected = null;
  		String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testNullString2() {

      String[] text = { null };
      String[] query = { "hi" };
      String[] replacement = { "ho" };
      String[] expected = null;
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testMismatchLength() {

      String[] text = { "hi", "ho" };
      String[] query = { "hi" };
      String[] replacement = { "hi", "ho" };
      String[] expected = null;
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testChangeFirst() {

      String[] text = { "I", "understand" };
      String[] query = { "I" };
      String[] replacement = { "You" };
      String[] expected = { "You", "understand" };
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testChangeSecond() {

      String[] text = { "I", "understand" };
      String[] query = { "understand" };
      String[] replacement = { "see" };
      String[] expected = { "I", "see" };
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testChangeLeft() {

      String[] text = { "I", "understand" };
      String[] query = { "understand", "understand" };
      String[] replacement = { "see", "grasp" };
      String[] expected = { "I", "see" };
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testChangeMulti1() {

      String[] text = { "I", "like", "Java" };
      String[] query = { "I", "like", "Java" };
      String[] replacement = { "You", "love", "cats" };
      String[] expected = { "You", "love", "cats" };
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    @Test
    public void testChangeMulti2() {

      String[] text = { "I", "like", "Java" };
      String[] query = { "I", "Java", "like" };
      String[] replacement = { "You", "cats", "love" };
      String[] expected = { "You", "love", "cats" };
      String[] result = Utils.findAndReplace( text, query, replacement );

      assertArrayEquals(expected, result);
      Utils_grade += 0.5;
    }

    public static void main(String[] args) {

        TestUtils.runClass(TestL3Utils.class);

    }

}
