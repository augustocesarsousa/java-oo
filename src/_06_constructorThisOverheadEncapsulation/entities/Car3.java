package _06_constructorThisOverheadEncapsulation.entities;

public class Car3 {

  private String name;
  private String color;
  private double price;

  public Car3() {
  }

  public Car3(String name, String color, double price) {
    this.name = name;
    this.color = color;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
