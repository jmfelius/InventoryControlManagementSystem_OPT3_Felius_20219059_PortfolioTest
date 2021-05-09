public class TransportCieExtra extends Delivery implements DaysCalculation
    {
        private Boolean expressDelivery = false;
        //private String date;
        private String nameTransportCie;
        //private String orderDate;
        private Integer countryNumberSupplier;

        /**
         * input of order details
         *
         * @param orderDate for TransportCie is actualDeliveryDate of the supplier => starting date of the transport
         * @param countryNumberSupplier residence of supplier
         */
        public TransportCieExtra(String orderDate, Integer countryNumberSupplier, String nameTransportCie, Integer productWeight)
        {
            super(orderDate, countryNumberSupplier, nameTransportCie, productWeight);

            super.orderDate = orderDate;
            super.countryNumberSupplier = countryNumberSupplier;
            super.nameTransportCie = nameTransportCie;
            super.productWeight = productWeight;
        }

        /**
         * Method to determine standard delivery times based on standard Boolean countrySupplier number 1 through 10 or 11 and higher,
         * Boolean expressDelivery Boolean PostNL and Boolean productWeight <50kg. (number||express)&PostNL&productWeight
         *
         *
         */

        public void expressDelivery(Boolean expressDelivery)
        {
            this.expressDelivery = expressDelivery;
        }

        public Boolean express (Integer countryNumberSupplier, Boolean expressDelivery, String nameTransportCie, Integer productWeight)
        {
            return (((countryNumberSupplier >=1 & countryNumberSupplier <= 10) || (expressDelivery == true))
                    & nameTransportCie.equals("PostNL") & (productWeight < 50));
        }

        public void setActualDeliveryDate()
        {
            if (express(countryNumberSupplier, expressDelivery,nameTransportCie, productWeight))
            {
                super.finalDeliveryDate = (addDaysToDate(super.orderDate,1));
            }
            else
            {
                super.finalDeliveryDate = (addDaysToDate(super.orderDate, 3));
            }

        }
    }

