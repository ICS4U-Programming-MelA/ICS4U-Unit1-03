/* Calculates and displays the amount of time it takes to heat either subs, soups, or pizzas given
 * the quantity specified by the user.
 */
import java.util.Scanner;

class Microwave {
  public static void main(String[] args) {
    System.out.print("This program displays in minutes and seconds how long it would take for a"
                   + " small microwave to heat either subs, soups, or pizzas when given the food"
                   + " and quantity.");
    Scanner input = new Scanner(System.in);
    System.out.print("\n" + "Enter your desired food (sub, soup, or pizza): ");
    String userFood = input.next();
    System.out.print("Enter the quantity of your food (1 to 3): ");
    double userFoodQuantity = input.nextDouble();
    input.close();
    if (userFoodQuantity < 1 || userFoodQuantity > 3) {
      System.out.print("\n" + userFoodQuantity + " isn’t a valid quantity. Please try again.");
      System.out.print("\n");
    } else {
      switch (userFood) {
        case "sub":
          final double subHeatTime = 60;
          double subQuantityHeatTime = 0;
          if (userFoodQuantity > 1) {
            if (userFoodQuantity > 2) {
              subQuantityHeatTime = (subHeatTime * 2);
            } else {
              subQuantityHeatTime = (subHeatTime * 1.5);
            }
          } else {
            subQuantityHeatTime = subHeatTime;
          }
          double subMinutes = subQuantityHeatTime / 60;
          double subMinutesRounded = (int) subMinutes;
          double subSeconds = (subMinutes - subMinutesRounded) * 60;
          System.out.print("\n" + "The correct heating time is: " + subMinutesRounded
                          + " minute(s) and " + subSeconds + " second(s)");
          System.out.print("\n");
          break;

        case "soup":
          final double soupHeatTime = 105;
          double soupQuantityHeatTime = 0;
          if (userFoodQuantity > 1) {
            if (userFoodQuantity > 2) {
              soupQuantityHeatTime = (soupHeatTime * 2);
            } else {
              soupQuantityHeatTime = (soupHeatTime * 1.5);
            }
          } else {
            soupQuantityHeatTime = soupHeatTime;
          }
          double soupMinutes = soupQuantityHeatTime / 60;
          double soupMinutesRounded = (int) soupMinutes;
          double soupSeconds = (soupMinutes - soupMinutesRounded) * 60;
          System.out.print("\n" + "The correct heating time is: "
                         + soupMinutesRounded + " minute(s) and " + soupSeconds + " second(s)");
          System.out.print("\n");
          break;

        case "pizza":
          final double pizzaHeatTime = 45;
          double pizzaQuantityHeatTime = 0;
          if (userFoodQuantity > 1) {
            if (userFoodQuantity > 2) {
              pizzaQuantityHeatTime = (pizzaHeatTime * 2);
            } else {
              pizzaQuantityHeatTime = (pizzaHeatTime * 1.5);
            }
          } else {
            pizzaQuantityHeatTime = pizzaHeatTime;
          }
          double pizzaMinutes = pizzaQuantityHeatTime / 60;
          double pizzaMinutesRounded = (int) pizzaMinutes;
          double pizzaSeconds = (pizzaMinutes - pizzaMinutesRounded) * 60;
          System.out.print("\n" + "The correct heating time is: "
                         + pizzaMinutesRounded + " minute(s) and " + pizzaSeconds + " second(s)");
          System.out.print("\n");
          break;

        default:
          System.out.print("\n" + userFood + " isn't a valid food item. Please try again.");
          System.out.print("\n");
          break;
      }
    }
  }
}
