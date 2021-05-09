public class TransportCie extends Delivery implements DaysCalculation
{
    private Boolean expressDelivery = false;
    private String date;
    private String nameTransportCie;
    private String orderDate;
    private Integer countryNumberSupplier;

    /**
     * input of order details
     *
     * @param orderDate for TransportCie is actualDeliveryDate of the supplier => starting date of the transport
     * @param countryNumberSupplier residence of supplier
     */
    public TransportCie(String orderDate, Integer countryNumberSupplier, String nameTransportCie)
    {
        super(orderDate,countryNumberSupplier,nameTransportCie);
        this.orderDate = orderDate;
        this.countryNumberSupplier = countryNumberSupplier;
        this.nameTransportCie = nameTransportCie;
    }

    /**
     * Method to determine standard delivery times based on standard Boolean countrySupplier number 1 through 10 or 11 and higher,
     * Boolean expressDelivery and Boolean PostNL (number||express)&PostNL
     * NL | express| PostNL| result (1 day is 1, 3 days is 0)
     * ____________________________________________
     * 0  |   0    |    0  |   0
     * 0      0         1      0
     * 0      1         0      0
     * 0      1         1      1
     * 1      0         0      0
     * 1      0         1      1
     * 1      1         0      0
     * 1      1         1      1
     *
     */

    public void expressDelivery(Boolean expressDelivery)
    {

    }

    public Boolean express (String countrySupplier, Boolean expressDelivery, String nameTransportCie)
    {

    }

    public void setActualDeliveryDate()
    {

    }



}