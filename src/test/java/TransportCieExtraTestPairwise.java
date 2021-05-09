import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportCieExtraTestPairwise {

    @Test
    public void express()
    {
        TransportCieExtra transportCie = new TransportCieExtra("01-04-2021", 1,
                "PostNL", 40);

        Assert.assertFalse(transportCie.express(0,true,"PostNL",60));
        Assert.assertFalse(transportCie.express(0,false,"OTHER",40));

        Assert.assertFalse(transportCie.express(5,true,"OTHER",60));
        Assert.assertTrue(transportCie.express(5,false,"PostNL",40));

        Assert.assertTrue(transportCie.express(15,true,"PostNL",40));
        Assert.assertFalse(transportCie.express(15,false,"OTHER",60));

    }


}