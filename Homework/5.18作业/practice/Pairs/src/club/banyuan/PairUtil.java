package club.banyuan;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> pair) {
        pair.swap();
        return pair;
    }

    public static <T extends Measurable> Pair<T> minmax(T[] array) {
        T min = array[0];
        T max = array[0];

        for (T one : array) {
            if(one.getMeasure() < min.getMeasure()) {
                min = one;
            }
        }

        for (T one : array) {
            if(one.getMeasure() > max.getMeasure()) {
                max = one;
            }
        }

        return new Pair<>(min, max);
    }

    public static <T extends Comparable> Pair<T> minmax(T[] array) {
        T min = array[0];
        T max = array[0];

        for (T one : array) {
            if(one.compareTo(min) < 0)
                min = one;
        }

        for (T one : array) {
            if(one.compareTo(max) > 0)
                max = one;
        }

        return new Pair<>(min, max);
    }

}