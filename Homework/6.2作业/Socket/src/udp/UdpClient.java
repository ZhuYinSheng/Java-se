package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {

  public static void main(String[] args) throws IOException {
    while (true) {
      DatagramSocket ds = new DatagramSocket();
//    String word = "你好";
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入：");
      String word = sc.nextLine();
      byte[] bytes = word.getBytes();
      DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
          InetAddress.getByName("127.0.0.1"), 10000);
      ds.send(dp);
      ds.close();
    }
  }
}
