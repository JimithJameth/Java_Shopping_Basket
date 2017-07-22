package shopping_basket;



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

  public double setPrice(){
    return this.price = price;
  }
  public double getPrice(){
    return this.price;
  }

}
