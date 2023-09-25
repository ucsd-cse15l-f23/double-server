import java.io.IOException;
import java.net.URI;

class DoubleHandler implements URLHandler {
  String template = "Doubling %d produces %d.";
  public String handleRequest(URI url) {
    if (url.getPath().equals("/double")) {
      String[] params = url.getQuery().split("=");
      if (params[0].equals("num")) {
        int num = Integer.parseInt(params[1]);
        int doubl = num * 2; // supposed to be * not +
        return String.format(template, num, doubl);
      }
    }
    return "404 Not Found!";
  }
}






class DoubleMain {
  public static void main(String[] args) throws IOException {
    Server.start(4000, new DoubleHandler());
  }
}