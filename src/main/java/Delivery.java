import java.util.Date;
import java.util.Scanner;

/**
 * In this class an order is processed by inputting dates of reception of order by supplier/transportcie,
 * updates of dates and actual delivery dates
 */
public  class Delivery implements DaysCalculation
{

    private final String orderDate;
    private String date;
    protected String finalDeliveryDate;
    private Integer countryNumberSupplier;
    private String nameTransportCie;

    /**
     * input of order details
     * @param orderDate initial date of order
     */
    public Delivery(String orderDate)
    {
        this.orderDate = orderDate;
    }

    public Delivery(String orderDate, Integer countryNumberSupplier, String nameTransportCie)
    {
        this.orderDate = orderDate;
        this.countryNumberSupplier = countryNumberSupplier;
        this.nameTransportCie = nameTransportCie;
    }

    /**
     * Based on input supplier/transportcie expected date is established;
     * this method remains empty in this class; is being implemented in subclasses.
     */
    public void setExpectedDeliveryDate (String date)
    {
        this.date = date;
    }

    /**
     * Based on updated info of supplier/transportcie a new expected deliverydate is established
     * @param today date of today dd-MM-yyyy
     */
    public void updateExpectedDeliveryDate (String today)
    {

    }

    /**
     * When the supplier/transportcie has delivered the order to the next chain (i.e.
     * transportcie or customer respectively), the actual delivery date is inputted.
     * @param date actual delivery date to transportcie or customer
     */
    public void setActualDeliveryDate (String date)
    {
        this.finalDeliveryDate = date;
    }

    /**
     * returns actual date of delivery
     * @return date of expected delivery to customer
     */
    public String getExpectedDeliveryDate()
    {

    }

    /**
     * returns actual date of delivery to customer
     * @return actual date of delivery to customer
     */
    public String getActualDeliveryDate()
    {
        return finalDeliveryDate;
    }

    /**
     * Based on order date and actual deliverydate the time from order to
     * delivery per logistical chain is returned
     * @return int delivery time in days
     */
    public long getActualDeliveryTime()
    {

    }
}