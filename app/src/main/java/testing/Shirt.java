package testing;

public class Shirt extends Clothes {

    private boolean hasButtons;    // Whether or not a shirt has buttons
  
    /*
     * Sets the size to small, price to 10.99, and hasButtons to true
     */
    public Shirt() {
      hasButtons = true;
    }
  
    /*
     * Sets the size to the specified size, the price to the specified
     * price, and hasButtons to the specified status
     */
    public Shirt(String size, double price, boolean hasButtons) {
      super(size, price);
      this.hasButtons = hasButtons;
    }
  
    /*
     * Returns whether or not the shirt has buttons
     */
    public boolean getHasButtons() {
      return hasButtons;
    }
  
    /*
     * Sets hasButtons to the specified status
     */
    public void setHasButtons(boolean newHasButtons) {
      hasButtons = newHasButtons;
    }
    
  }
