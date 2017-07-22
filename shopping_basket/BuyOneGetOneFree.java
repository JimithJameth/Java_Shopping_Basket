package shopping_basket;

public class BuyOneGetOneFree{

  private ShoppingBasket shoppingbasket;
  private Item item;
  private int discountedAmount;

  public BuyOneGetOneFree(ShoppingBasket shoppingbasket, Item item){
    this.shoppingbasket = shoppingbasket;
    this.item = item;
  }

  public void addBuyOneGetOneFree(){
    double total = shoppingBasket.getShoppingBaskettotal();
    double price = item.getPrice();

    int numberOfItems = shoppingbasket.countItems
    int discountedAmount = numberOfItems / 2;
    total -=(discountedAmount * price);
    shoppingbasket.updateTotal(total);
  }
}