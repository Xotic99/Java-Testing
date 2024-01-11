/*
 * Represents a clothing item
 */
package.testing;

public class Clothes {

    private String size;    // The size of a clothing item
    private double price;   // The price of a clothing item
  
    /*
     * Sets the size to small and price to 10.99
     */
    public Clothes() {
      size = "small";
      price = 10.99;
    }
  
    /*
     * Sets the size to the specified size and
     * the price to the specified price
     */
    public Clothes(String size, double price) {
      this.size = size;
      this.price = price;
    }
  
    /*
     * Returns the value of size of the clothing item
     */
    public String getSize() {
      return size;
    }
  
    /*
     * Returns the value of price of the clothing item
     */
    public double getPrice() {
      return price;
    }
  
    /*
     * Sets the size of the clothing item to the specified size
     */
    public void setSize(String newSize) {
      size = newSize;
    }
  
    /*
     * Sets the price of the clothing item to the specified price
     */
    public void setPrice(double newPrice) {
      price = newPrice;
    }
    
  }