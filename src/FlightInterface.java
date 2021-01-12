
/**
 * Write a description of interface FlightInterface here.
 *
 */
public interface FlightInterface {

    //----------------------------------------------------------------
    //          CONSTRUCTOR
    //----------------------------------------------------------------
    // Should take these parameters, in this order:
    // flight number (string)
    // origin (string)
    // destination (string)
    // date (string)

    //----------------------------------------------------------------
    //          REQUIRED METHODS
    //----------------------------------------------------------------

    /**
     * Retrieves this flight's flight number
     * 
     * @return  this flight's flight number
     */
    public String getFlightNum();

    /**
     * Retrieves this flight's point of origin
     * 
     * @return  this flight's origin airport code
     */
    public String getOrigin();

    /**
     * Retrieves this flight's destination
     * 
     * @return  this flight's destination airport code
     */
    public String getDestination();

    /**
     * Retrieves the date for this flight
     * 
     * @return  the date for this flight
     */
    public String getDate();

    /**
     * Retrieves a specific list from the seat array
     * 
     * @param   rowIdx      the index of the row in which the seat exists
     * @param   seatIdx     the index of the seat (within the row) to retrieve
     * @return              the Seat object at the specified position in the array
     */
    public Seat getSeat(int rowIdx, int seatIdx);

    /**
     * Retrieves a specific list from the seat array, via seat number
     * 
     * @param   seatNumber      the seat number to retrieve; must be in nA or nnA format and must be valid for this flight's seat configuration
     * @return                  the corresponding Seat object from the array
     */
    public Seat getSeat(String seatNumber);

    /**
     * Gets a count of the confirmed passengers on the flight
     * 
     * @return      the count of confirmed passengers
     */
    public int getPassengerCount();

    /**
     * Reads confirmation information from the confirmation text file (format:  flightnum.txt, e.g., 21.txt)
     * 
     * @return      true, if confirmation information could be read from the file; false, if not
     */
    public boolean readConfirmationFile();

    /**
     * Returns a string listing all seat information for the flight
     * 
     * @return      a String with an entry for each seat
     */
    public String getSeatInfo();

}
