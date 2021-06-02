/*
* This program receives and outputs information about a car when prompted.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-25
*/

// Import the Scanner class
import java.util.Scanner;

final class VehicleMain {

  private VehicleMain() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
   * This function allows the user to have two cars and change the
   * properties of the cars.
   *
   * @param args
   */
  public static void main(final String[] args) {
    // create scanner object
    Scanner userInput = new Scanner(System.in);

    try {
      // accepts input on bike colour
      System.out.println("Enter the colour you wish your bike to be: ");
      String vehicleColour = userInput.nextLine();

      // Sets the mass
      final double mass = 0.02;

      // initializing bike with colour choice
      Bike userBike = new Bike(vehicleColour, mass);

      // This has been commented out so the program can run withour errors.
      // Vehicle userVehicle = new Vehicle(vehicleColour, mass);

      System.out.println("Your bikes colour is: " + userBike.getColour());
      System.out.println();

      // accepts input on truck colour
      System.out.println("Enter the colour you wish your truck to be: ");
      vehicleColour = userInput.nextLine();

      // Sets the mass
      final double mass2 = 80;
      //initializing truck with colour choice
      Truck userTruck = new Truck(vehicleColour, mass2);

      //printing bike and truck colours
      System.out.println("Your trucks colour is: " + userTruck.getColour());
      System.out.println();

      System.out.println("Enter the license plate of the truck: ");
      String licensePlate = userInput.nextLine();
      userTruck.setLicensePlate(licensePlate);

      System.out.println("Your trucks plate is: "
                          + userTruck.getLicensePlate());
      System.out.println();

      //honking horns
      System.out.println("Ringing the bell of the bike...");
      System.out.println("Bike: " + userBike.ringBell());
      System.out.println();

      // Outputting tires
      System.out.println("Your bike has " + userBike.getTires() + " tires.");
      System.out.println("Your truck has " + userTruck.getTires() + " tires.");
      System.out.println();

      // Outputting tires
      System.out.println("Your bike weighs " + userBike.getWeight()
                         + " Tonnes.");
      System.out.println("Your truck weighs " + userTruck.getWeight()
                         + " Tonnes.");
      System.out.println();

      //riding the bike
      System.out.println("You go for a bike ride. How fast would you like"
                         + " to bike (mph)");
      float bikeSpeed = userInput.nextFloat();
      userBike.accelerate(bikeSpeed);

      // printing speed
      System.out.println("You accelerate to " +  userBike.getSpeed()
                         + " (mph)");

      // printing speed
      System.out.println("Current cadence: " +  userBike.getCadence()
                         + " RPM");

      // slow down
      System.out.println();
      System.out.println("You begin to decelerate. How many mph's do you "
                         + "slow down by?: ");
      float bikeSlow = userInput.nextFloat();
      userBike.deccelerate(bikeSlow);

      // printing speed
      System.out.println("Your current speed: " +  userBike.getSpeed()
                         + " mph");

      // printing cadence
      System.out.println("Current cadence: " +  userBike.getCadence()
                         + " RPM");

      // begin truck sequence
      System.out.println();
      System.out.println("You reach your home and begin to drive your truck."
                         + " How much do you accelerate by?");
      float truckSpeed = userInput.nextFloat();
      userTruck.accelerate(truckSpeed);

      // printing speed
      System.out.println("You accelerate to " +  userTruck.getSpeed()
                         + " mph");

      // slow down
      System.out.println();
      System.out.println("You want to stop, how many pound feet of air would "
                         + "you like to use to stop?: ");
      float truckSlow = userInput.nextFloat();

      // printing speed
      System.out.println("Your current speed: "
                         +  userTruck.provideAir(truckSlow)
                         + " mph");

      // sequence end
      System.out.println();
      System.out.println("Done.");

    // catch for general problems like bad user inputs
    } catch (Exception err) {
      System.out.println("Invalid Input");
    }
  }
}
