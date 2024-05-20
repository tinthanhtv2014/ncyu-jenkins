import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GradeConverterTest {
  private GradeConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new GradeConverter();
  }

  @Test
  public void testConvert1() {
    String expected = "A";
    String actual = converter.convert(100);
    assertEquals(expected, actual);
  }

  @Test
  public void testConvert2() {
    String expected = "A";
    String actual = converter.convert(90);
    assertEquals(expected, actual);
  }

  public void testConvert3() {
    String expected = "A";
    String actual = converter.convert(-10);
    assertEquals(expected, actual);
  }

  public void testConvert4() {
    String expected = "A";
    String actual = converter.convert(-20);
    assertEquals(expected, actual);
  }
  public void testConvert4() {
    String expected = "A";
    String actual = converter.convert(-30);
    assertEquals(expected, actual);
  }
  public void testConvert5() {
    String expected = "A";
    String actual = converter.convert(-40);
    assertEquals(expected, actual);
  }
}
