public class TestString {
    public static void main(String[] args) {
        String str = "T   his    is G  a u   r  a  v   ";
         str = str.replaceAll("\\s","");
        System.out.println(str); //remove white spaces

        String s = "programming";
        s.chars().mapToObj(ch -> (char) ch)
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .distinct()
                .forEach(System.out::print); //print non repeating characters
    }
}
