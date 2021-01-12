    //----------------------------------------------------------------
    //          ENUMERATED TYPES
    //----------------------------------------------------------------
/**
 * Required methods for Seat class
 */
public interface SeatInterface {

    //----------------------------------------------------------------
    //          ENUMERATED TYPES
    //----------------------------------------------------------------
    public enum MealType {GOURMET, FULL, SNACK}
    
    //----------------------------------------------------------------
    //          CONSTRUCTOR REQUIREMENTS
    //----------------------------------------------------------------
    // Seat constructor should take, in this order:
    // seat number (string)
    // price (double)
    // recline (integer)
    // meal type (enumerated type)
    
    //----------------------------------------------------------------
    //          REQUIRED METHODS
    //----------------------------------------------------------------
    //----------------------------------------------------------------
    //          ACCESSORS
    //----------------------------------------------------------------
    /**
     * Retrieves the seat number
     *
     * @return     the seat number for this seat
     */
    public String getNumber();

    /**
     * Retrieves the price for this seat
     *
     * @return     the price for this seat
     */
    public double getPrice();

    /**
     * Retrieves the recline amount for this seat
     *
     * @return     the recline amount for this seat
     */
    public int getRecline();
    
    /**
     * Retrieves the meal type for this seat
     *
     * @return     the meal type for this seat
     */
    public MealType getMealType();

    /**
     * Retrieves the customer confirmation for this seat
     *
     * @return     the customer confirmation associated with this seat
     */
    public CustConf getCustConf();

    /**
     * Sets the price for this seat
     * 
     * @param   price   the price for this seat
     */
    public void setPrice(double price);

    /**
     * Sets the recline for this seat
     * 
     * @param   recline     the number of inches this seat reclines
     */
    public void setRecline(int recline);

    /**
     * Sets the meal type for this seat
     * 
     * @param   mealType    the meal type assigned to this seat; must not be null
     */
    public void setMealType(MealType mealType);
    
    /**
     * Confirms a customer into this seat
     * 
     * @param   customerConfirmation    the customer booking confirmation
     */
    public void setCustConf(CustConf custConf);

}
