public class revernum {
    public static void main(String[] args) {
        int num = 43747923;
        int ans=0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
// ans = ans * 10 +rem eg: num= 23597  rem =7 /ans = 0*10+7 =7 7*10+9 =79 79*10+5=795 795*10+3=7953 7953*10+2=79532
