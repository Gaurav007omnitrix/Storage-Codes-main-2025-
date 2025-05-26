public class gkhk {
    public static void main(String[] args) {
        String s="middle-Outz";
        String s2 = "";
        char[] arr=s.toCharArray();
        int k=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z'){
                if(arr[i]>='A'&&arr[i]<='Z'){
                    int intchar = (((int)s.charAt(i)+(k%26))%90);
                    if (intchar <= 65 && intchar >= 90) {
                        s2 += (char) intchar;
                    }
                    else if(intchar==0){
                        s2+='Z';
                    } else{
                        //System.out.println(intchar+97);
                        s2 += (char) (intchar%64 + 64);
                    }
                }
                if(arr[i]>='a'&&arr[i]<='z'){
                    int intchar = (((int)s.charAt(i)+(k%26))%122);
                    if (intchar <= 97 && intchar >= 122) {
                        s2 += (char) intchar;
                    } else if(intchar==0){
                        s2+='z';
                    } else{
                        s2 += (char) (intchar%96 + 96);
                    }
                }

            }else{
                s2+=arr[i];
            }
        }

        System.out.println(s2);
    }
}
