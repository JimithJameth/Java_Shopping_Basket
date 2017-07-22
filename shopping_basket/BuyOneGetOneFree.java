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
    double total = shoppingbasket.getShoppingBasketTotal();
    double price = item.getPrice();

    int numberOfBasketItems = shoppingbasket.countItem(this.item);
    int discountedAmount = numberOfBasketItems / 2;
    total -=(discountedAmount * price);
    shoppingbasket.updateBasketTotal(total);
  }
}