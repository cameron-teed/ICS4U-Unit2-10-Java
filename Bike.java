/*
* This class creates a bike.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-28
*/

public class Bike extends Vehicle {

  /**
   * This sets the cadence.
   */
  private double cadence;
  /**
   * This is the value needed to convert mph of a bike with 80 inch
   * wheels to rpm.
   */
  private final double cadenceCalc = 13.2;
  /**
   * This is the tires constant.
   */
  private final int tireNum = 2;

  /**
   * Constructor for this class.
   *
   * @param bikeColor
   * @param mass
   */
  public Bike(final String bikeColor, final double mass) {
    super(bikeColor, mass);
    cadence = 0;
  }

  /**
   * Gets the cadence.
   *
   * @return cadence
   */
  public double getCadence() {
    this.cadence = getSpeed() * cadenceCalc;
    return this.cadence;
  }

  /**
   * Gets the tireNums.
   *
   * @return tireNum
   */
  public int getTires() {
    return tireNum;
  }

  /**
   * Gets what sound the bell makes.
   *
   * @return "Ding!"
   */
  public String ringBell() {
    return "Ding!";
  }
}
