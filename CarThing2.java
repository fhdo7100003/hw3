public class CarThing2 {
  static class Manufacture {
    private int id;
    private String make;
    private String model;
    private int manufacturingYear;
    private String color;
    private int price;
    private int registrationNumber;

    public Manufacture(
        int id,
        String make,
        String model,
        int manufacturingYear,
        String color,
        int price,
        int registrationNumber) {
      this.id = id;
      this.make = make;
      this.model = model;
      this.manufacturingYear = manufacturingYear;
      this.color = color;
      this.price = price;
      this.registrationNumber = registrationNumber;
    }

    public void setId(int id) {
      this.id = id;
    }

    public void setMake(String make) {
      this.make = make;
    }

    public String getModel() {
      return model;
    }

    public void setModel(String model) {
      this.model = model;
    }

    public int getManufacturingYear() {
      return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
      this.manufacturingYear = manufacturingYear;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }

    public int getPrice() {
      return price;
    }

    public void setPrice(int price) {
      this.price = price;
    }

    public int getRegistrationNumber() {
      return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
      this.registrationNumber = registrationNumber;
    }

    public String toString() {
      return String.format(
          "Manufacture(id=%d, make=%s, model=%s, manufacturingYear=%d, color=%s, price=%d, registrationNumber=%d)",
          id, make, model, manufacturingYear, color, price, registrationNumber);
    }
  }

  static class Engine {
  }

  static class CombustionEngine extends Engine {
  }

  static class ElectricEngine extends Engine {
  }

  static class HybridEngine extends Engine {
  }

  static abstract class Vehicle {
    abstract void ShowCharacteristics();
  }

  static class ICEV extends Vehicle {
    Manufacture m;
    Engine e = new CombustionEngine();

    public ICEV(Manufacture m) {
      this.m = m;
    }

    void ShowCharacteristics() {
      System.out.printf("ICEV(manufacture=%s)\n", m);
    }
  }

  static class BEV extends Vehicle {
    Manufacture m;
    Engine e = new ElectricEngine();

    public BEV(Manufacture m) {
      this.m = m;
    }

    void ShowCharacteristics() {
      System.out.printf("BEV(manufacture=%s)\n", m);
    }
  }

  static class HybridV extends Vehicle {
    Manufacture m;
    Engine e = new HybridEngine();

    public HybridV(Manufacture m) {
      this.m = m;
    }

    void ShowCharacteristics() {
      System.out.printf("HybridV(manufacture=%s)\n", m);
    }
  }

  public static void main(String[] args) {
    Vehicle[] cars = {
        new BEV(new Manufacture(1, "Honda", "Civic", 2012, "silver", 1000, 32424)),
        new ICEV(new Manufacture(2, "Honda", "Jazz", 2012, "orange", 3000, 32256)),
        new HybridV(new Manufacture(3, "Volkswagen", "Golf", 2021, "beige", 3000, 4356)),
    };

    for (var c : cars) {
      c.ShowCharacteristics();
    }
  }
}
