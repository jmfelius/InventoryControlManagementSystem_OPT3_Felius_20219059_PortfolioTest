import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportCieTestCC {
    /**
     * Method to determine standard delivery times based on standard Boolean countrySupplier number 1 through 10 or 11 and higher,
     * Boolean expressDelivery and Boolean PostNL (countryNumber||express)&PostNL
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

    @Test
    public void express() {
        TransportCie transportCie = new TransportCie("01-04-2021", 1, "PostNL");

        assertTrue(transportCie.express(1, true, "PostNL"));
        assertFalse(transportCie.express(15, false, "DHL" ));
    }
}