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

  @Test
  public void testItemHasPrice(){
    assertEquals(1.99, item1.getPrice(),.01);
  }

  @Test
  public void testItemHasType(){
    assertEquals(Type.FRESHFOOD,item1.getType());
  }
}