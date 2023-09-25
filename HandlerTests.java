import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;

public class HandlerTests {
  void testRequest(int num, int expect) throws Exception {
    DoubleHandler h = new DoubleHandler();
    String url = "http://localhost:8080/double?num=" + num;
    URI input = new URI(url);
    String expected = "Doubling " + num + " produces " + expect + ".";
    assertEquals(expected, h.handleRequest(input));
  }
  @Test
  public void handleRequest1() throws Exception {
    testRequest(1, 2);
  }
  @Test
  public void handleRequest2() throws Exception {
    testRequest(2, 4);
  }
  @Test
  public void handleRequest3() throws Exception {
    testRequest(0, 0);
  }
}
