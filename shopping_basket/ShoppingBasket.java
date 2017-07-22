package shopping_basket;
import java.util.ArrayList;

public class ShoppingBasket{
  private ArrayList<Item> items;
  private double total;

  public ShoppingBasket(){
    this.items = new ArrayList<Item>();
    this.total = 0;
  }

  public ArrayList<Item> getItems(){
    return this.items;
  }

  public void addToShoppingBasket(Item item){
    items.add(item);
  }
  
  public void emptyShoppingBasket(){
    this.items.clear();
  }

  public void removeFromShoppingBasket(Item item){
    items.remove(item);
  }

  public int itemCount(){
    return this.items.size();
  }

  public double getShoppingBasketTotal(){
    double total = 0;
    for (Item item : items){
      total += item.getPrice();
  }
  this.updateTotal(total);
  return total;
}

  public void updateTotal(double newTotal){
    this.total = newTotal;
  }

}