import org.junit.Before;
import org.junit.Test;

import  static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void waterBottleVolume(){
        assertEquals(100, waterBottle.getVolume());
    }


    @Test
    public void volumeEquals100(){
        assertEquals(true, waterBottle.startsWith100());
    }

    @Test
    public void volumeLessThan100(){
        WaterBottle bottle = new WaterBottle(90);
        assertEquals(false, bottle.startsWith100());
    }

    @Test
    public void reduceVolumeBy10EachTime(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());

    }

    @Test
    public void emptyWaterBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());

    }

    @Test
    public void fillWaterBottle(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

}
