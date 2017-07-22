import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingBasketTest {
  ShoppingBasket shoppingbasket;
  Item item1;
  Item item2;

  @Before

  public void before() {
    shoppingbasket = new ShoppingBasket();
    item1 = new Item("eggs", 1.99, Type.FRESHFOOD);
    item2 = new Item("1 Litre of irn-bru", 1.99, Type.DRINKS);
  }

  @Test
  public void testAddsItem(){
    shoppingbasket.addToShoppingBasket(item1);
    assertEquals(1, shoppingbasket.itemCount());
  }
}