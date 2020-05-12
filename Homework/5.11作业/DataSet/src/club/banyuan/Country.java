package club.banyuan;

// TODO: 实现 Measurable 接口. getMeasure() 返回国家的人口总数. 提供构造方法，让DataSetTester运行正常
public class Country  implements Measurable {

    private int population;

    @Override
    public double getMeasure() {
        return population;
    }

    public Country(int population) {
        this.population = population;
    }

}
