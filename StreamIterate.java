 import java.util.stream.Stream;
public class StreamIterate{
   public static void main(String[] args) {
      Stream.iterate(1, i -> i < 5, i -> i + 1).forEach(System.out::println); // iterate()
   }
