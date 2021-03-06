import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingBasketTest {
  ShoppingBasket shoppingbasket;
  Item item1;
  Item item2;
  Item item3;

  @Before

  public void before() {
    shoppingbasket = new ShoppingBasket();
    item1 = new Item("eggs", 1.99, Type.FRESHFOOD);
    item2 = new Item("1 Litre of irn-bru", 1.99, Type.DRINKS);
    item3 = new Item("Sony headphones", 35.00, Type. ELECTRONICS);
  }

  @Test
  public void testAddsItem(){
    shoppingbasket.addToShoppingBasket(item1);
    assertEquals(1, shoppingbasket.itemCount());
  }

  @Test 
  public void testRemovesItem(){
    shoppingbasket.addToShoppingBasket(item2);
    shoppingbasket.removeFromShoppingBasket(item2);
    assertEquals(0, shoppingbasket.itemCount());
  }

  @Test
  public void testEmptyBasket(){
    shoppingbasket.addToShoppingBasket(item1);
    shoppingbasket.addToShoppingBasket(item2);
    shoppingbasket.addToShoppingBasket(item3);
    shoppingbasket.emptyShoppingBasket();
    assertEquals(0, shoppingbasket.itemCount());

  }

  @Test
  public void testShoppingBasketTotal(){
    shoppingbasket.addToShoppingBasket(item1);
    shoppingbasket.addToShoppingBasket(item2);
    shoppingbasket.addToShoppingBasket(item3);
    assertEquals(38.98, shoppingbasket.getShoppingBasketTotal(),.01);

  }

  @Test
  public void testUpdateShoppingBasketTotal(){
    shoppingbasket.updateBasketTotal(25.99);
    assertEquals(25.99, shoppingbasket.getTotal(),.01);
  }

  @Test
  public void testCountNumberOfBasketItems(){
    shoppingbasket.addToShoppingBasket(item3);
    assertEquals(1, shoppingbasket.countNumberOfBasketItems("Sony headphones"));
  }
}