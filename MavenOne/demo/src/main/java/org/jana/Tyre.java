package org.jana;

public class Tyre {

  private String brand;
  private int year;

//  public Tyre(String brand, int year) {
//    this.brand = brand;
//    this.year = year;
//  }

    public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    //return "Tyre{" + "brand='" + brand + '\'' + ", year=" + year + '}';
    return "Tyre is working";
  }
}
