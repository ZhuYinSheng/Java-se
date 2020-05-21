package club.banyuan;

public interface Measurer <T>{

  /**
   * 计算对象的数量.
   * @return
   */
  int measure(T anObject);
}