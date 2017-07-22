import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

  Item item1;

  @Before
  public void before(){

    item1 = new Item ("eggs",1.99, Type.FRESHFOOD);
    
  }

  @Test
  public void testItemHasName(){
    assertEquals("eggs", item1.getName());
  }
}