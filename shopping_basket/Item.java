package shopping_basket;
import behaviours.*;

public class Item {
  private String name;
  private Double price;
  private Type type;

public Item(String name, Double price, Type type){

  this.name = name;
  this.price = price;
  this.type = type;
}

public String getName(){
  return this.name;
}

public Type getType(){
  return this.type;
}

public void setPrice(double price){
  this.price = price;
}

public double getPrice(){
  return this.price;
}

}
