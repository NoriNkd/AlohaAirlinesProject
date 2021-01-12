/**
 * Required methods for CustConf class
 *
 */
public interface CustConfInterface {

    //----------------------------------------------------------------
    //          CONSTRUCTORS
    //----------------------------------------------------------------
    // Should accept customer name and confirmation number, in that order

    //----------------------------------------------------------------
    //          REQUIRED METHODS
    //----------------------------------------------------------------
    /**
     * Retrieves the customer's name
     *
     * @return     the confirmed customer's name
     */
    public String getName();

    /**
     * Retrieves the customer's confirmation number
     *
     * @return     the confirmation number for the reservation
     */
    public String getConfirmationCode();

}
