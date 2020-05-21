package club.banyuan;

import java.util.Iterator;

public class Print {
//    public static<T> void print(Iterable<T> iterable) {
//        Iterator<T> iterator = iterable.iterator();
//        StringBuilder stringBuilder = new StringBuilder();
//        while(iterator.hasNext()) {
//            stringBuilder.append(iterator.next().toString());
//            stringBuilder.append("");
//        }
//        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
//        System.out.println(stringBuilder.toString());
        public static <T extends Iterable<T>> void print(T t) {
            Iterator<T> iterator = t.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next()+",");
            }
            System.out.println();

        }
    }
//}
