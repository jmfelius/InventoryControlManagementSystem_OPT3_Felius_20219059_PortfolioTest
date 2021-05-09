import org.junit.Assert;
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

    /**
     * Deze test werkt nog niet, maar is voor OPT3 Test Portfolio niet relevant.
     */
    @Test
    public void setActualDeliveryDate()
    {
        TransportCie postNL = new TransportCie("25-05-2021", 1, "PostNL");
        postNL.express(1,true, "PostNL");
        Assert.assertEquals("26-05-2021", postNL.finalDeliveryDate);
    }
}