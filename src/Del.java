public class Del {
    public static void main(String[] args) {
        String str = "India   Is My     Country";
        char[] char1 = str.toCharArray();
        char[] char2 = new char[char1.length];
        String str2 = null;
        int k =0;

        for (int i = 0; i < char1.length; i++) {
            if(char1[i] == ' ') {
                continue;
            }
            else {
                char2[k++] = char1[i];
            }
        }
        //str2 = char2.toString();
        System.out.println(new String(char2));

    }
}
