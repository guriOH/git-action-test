import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void getInt() {
    App app = new App();

    assertEquals(app.getInt(),1);
  }
}