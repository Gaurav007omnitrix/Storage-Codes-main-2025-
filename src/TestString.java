public class TestString {
    public static void main(String[] args) {
        String str = "T   his    is G  a u   r  a  v   ";
         str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
