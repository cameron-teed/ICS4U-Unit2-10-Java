/*
* This class holds information about a Truck.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-25
*/

public class Truck extends Vehicle {

  /**
   * This creates the licensePlate.
   */
  private String licensePlate;
  /**
   * This creates the air break..
   */
  private float airBreak;
  /**
   * This creates the air break..
   */
  private float stopConstant;
  /**
   * This creates the tire constant.
   */
  private final int tireNum = 18;

  /**
   * Constructor for the Bike.
   *
   * @param carColour
   * @param mass
   */
  public Truck(final String carColour, final double mass) {
    super(carColour, mass);
    licensePlate = null;
    stopConstant = 2;
    airBreak = 0;
  }

  /**
   * This sets the license plate.
   *
   * @param plateNum
   */
  public void setLicensePlate(final String plateNum) {
    this.licensePlate = plateNum;
  }

  /**
   * Getter for the tire nums.
   *
   * @return tireNum
   */
  public int getTires() {
    return tireNum;
  }

  /**
   * This is the getter for the license plate.
   *
   * @return licensePlate
   */
  public String getLicensePlate() {
    return this.licensePlate;
  }

  /**
   * This returns how much braking force their truck has.
   *
   * @param airAmount
   * @return airBreak
   */
  public float provideAir(final float airAmount) {

    this.airBreak = getSpeed() - (this.stopConstant * airAmount);

    return this.airBreak;
  }
}
