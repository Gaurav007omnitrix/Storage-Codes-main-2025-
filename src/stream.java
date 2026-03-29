import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
//        int num = 121;
//        boolean isPalindrome = num == Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
//        System.out.println("Is palindrome? " + isPalindrome);
//        int num = 121, rev = 0, temp = num;
//        while (temp != 0) { rev = rev * 10 + temp % 10;
//            temp /= 10; }
//        System.out.println("Is palindrome? " + (num == rev));


        record Product(String name,String category, int price) {}
        Stream<Product> products = Stream.of(
                new Product("Laptop", "Electronics", 1200),
                new Product("Smartphone", "Electronics", 800),
                new Product("Desk Chair", "Furniture", 150),
                new Product("Notebook", "Stationery", 5),
                new Product("Pen", "Stationery", 2)
        );

//        Map<String, List<Product>> groupedByCategory = products.collect(Collectors.groupingBy(Product::category));
//        System.out.println(groupedByCategory);
        Map<String, Integer> totalPriceByCategory = products.collect(
                Collectors.groupingBy(Product::category, Collectors.summingInt(Product::price))
        );
        System.out.println(totalPriceByCategory);
    }
}
