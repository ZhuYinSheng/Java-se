package club.banyuan;

import org.junit.Assert;
import org.junit.Test;

public class PairUtilTest {
    @Test
    public void swap() {
        Pair<Integer> pair = new Pair<>(1, 2);
        PairUtil.swap(pair);
        Assert.assertEquals(2, pair.getFirst().intValue());
        Assert.assertEquals(1, pair.getSecond().intValue());
    }

    @Test
    public void minmaxCountry() {
        Country[] country = new Country[] {new Country(1000), new Country(2000), new Country(3000),new Country(4000)};
        Pair<Country> pair = PairUtil.minmax(country);
        Assert.assertEquals(4000, pair.getFirst().getMeasure(), 0);
        Assert.assertEquals(1000, pair.getSecond().getMeasure(), 0);
    }

    @Test
    public void minmax() {
        Integer[] integers = new Integer[] {1, 2, 3, 4, 5};
        Pair<Integer> pair = PairUtil.minmax(integers);
        Assert.assertEquals(5, pair.getFirst().intValue());
        Assert.assertEquals(1, pair.getSecond().intValue());
    }
}
