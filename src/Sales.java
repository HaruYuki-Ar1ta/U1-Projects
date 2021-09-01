import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args) {

     int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many items are you buying? "));
     double pricePer = Double.parseDouble(JOptionPane.showInputDialog("How much is the item you are purchasing? "));
     int discount = Integer.parseInt(JOptionPane.showInputDialog("Do you have a discount? "));
     int salesTax = Integer.parseInt(JOptionPane.showInputDialog("What is sales tax? "));

     DecimalFormat currency = new DecimalFormat("###.##");

     double price =  pricePer * quantity;
     double subtotal = price - (price * (discount / 100));
     double taxTotal = price - (price * (salesTax / 100));
     double totalCost = subtotal + taxTotal ;

     JOptionPane.showMessageDialog(" Your price is: " + totalCost + " Your subtotal is: " + subtotal + " Your Tax is: " + taxtTotal);











    }

}
