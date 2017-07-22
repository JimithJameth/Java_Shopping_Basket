import shopping_basket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class BuyOneGetOneFreeTest{

  BuyOneGetOneFree buyonegetonefree;
  ShoppingBasket shoppingbasket;
  Item item1;

  @Before
  public void before(){

    shoppingbasket = new ShoppingBasket();
    item1 = new Item("Eggs",1.99,Type.FRESHFOOD);
    buyonegetonefree = new BuyOneGetOneFree(shoppingbasket, item1);
  }

  @Test 
  public void testBuyOneGetOneFree(){
    shoppingbasket.addToShoppingBasket(item1);
    shoppingbasket.addToShoppingBasket(item1);
    buyonegetonefree.addBuyOneGetOneFree();
    assertEquals(1.99, shoppingbasket.getTotal(),.01);
  }

}