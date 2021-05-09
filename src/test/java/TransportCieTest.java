import org.junit.Test;

import static org.junit.Assert.*;

public class TransportCieTest {

    @Test
    public void expressDelivery() {
    }

    @Test
    public void express()
    {
        TransportCie transportCie = new TransportCie("01-04-2021", 1, "PostNL");

        assertTrue(transportCie.express(1, true, "PostNL"));
    }

    @Test
    public void setActualDeliveryDate() {
    }
}