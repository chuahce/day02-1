// The package name
package sdf;

public class Car {

  // members
  private String registration;
  protected String color;
  private int year;
  private boolean started;

  // Constructors
  public Car {
    // default constructor
    this.color = "white"
  }

  public Car(String color, String registration) {
    this.color = color;
    this.registration = registration;
  }

  // Getters and setters
  public String getRegistration() {
    return this.registration;
  }

  public void setRegistration(String r) {
    this.registration = r;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year; 
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean isStarted() {
    return started;
  }

  // methods
  public void start() {
    this.started = true;
  }

  public void stop() {
    this.started = false;
  }

  public void getOutOfMyWay() {
    System.out.println("HONK......");
  }

  // private methods

}