import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void getInt() {
    App app = new App();

    assertEquals(app.getInt(),1);
  }

  @Test
  public void testGetLong() {
    App app = new App();

    assertEquals(app.getLong(),1L);
  }
}