

public class newh {
    public static void main(String[] args) {
//        int x=0;
//       int n=5;
//       int sum = 0;
//       for(int i=1;i<=n;i++){
//           x=x*10+5;
//           sum= sum+ x;
//       }
//        System.out.println(sum);

//5+55+555+5555+....+n
//        n=5
//  -----------------------------------------------------------------------------------------------------
//HashMap<Integer,String> map=new HashMap<>();
//map.put(1,"hello");
//map.put(2,"gello");
//map.put(3,"mello");
//
//System.out.println(map.get(3));
//        System.out.println(map);
//        map.remove(3);
//        if(map.containsKey(0)){
//            System.out.println("hello");
//        }
//        else{
//            System.out.println(map.size());
//
//        }
//
//System.out.println(map);
//        for(Map.Entry<Integer,String> e : map.entrySet())
//            System.out.println(e.getKey() +" "+" " +e.getValue());

//------------------------------------------------------------------------------------------------------------
//       List<Integer> al= new ArrayList<>();
//        Collections.addAll(al,303,7,8,1,3,6);
        //  al.stream().map(n-> n*2).forEach(System.out::println);
//al.stream().filter(n -> n.startsWith("s")).forEach(System.out::println);
        //Long sl=al.stream().distinct().count();
        //  long d= al.stream().mapToInt(i->i).sum(); //sum of list

//        ListIterator lt=al.listIterator();
//        while(lt.hasNext()){
//            System.out.println(lt.next());
//        }

        //
        //____________________________________
//        System.out.println(isPalindrome("apple"));
//        System.out.println(isPalindrome("mom"));
//    }
//
//    public static boolean isPalindrome(String os) {
//
//        String revS = new StringBuilder(os).reverse().toString();
//        return os.equals(revS);

//        int s=al.size();
//        int sum = s/2;
//        System.out.println(al.get(al.size()-sum-1)); //middle number print

//____________________________________

//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the range");
//        int  count= sc.nextInt();
//        int n1=0,n2=1,n3;
//        System.out.println(n1+"\n"+n2);
//        for(int i=2;i<count;i++){
//             n3=n1+n2;
//            System.out.println(n3);
//            n1=n2;
//            n2=n3;
//        }

        // 0+1+1+2+3+5+8
////------------------------------------------------------------------------------------------------------------
//        for (Integer i:al
//             ) {
//            System.out.println(i);
//        }
//
//        String s= "hello";
//        String c="";
//        char  ch;
//        for(int i=0;i<s.length();i++){
//            ch=s.charAt(i);
//            c=ch+c;
//
//        }
//        System.out.println(c);

//        String s="hello to the codes";
////        StringBuilder a=new StringBuilder();
////        a.append(s);
////        a.reverse();
//        String a=s.toUpperCase();
//        System.out.println(a);
        //      -------------------------------------------------------------------------------------------------
//x=x+y;y=x-y;x=x-y; S2NWUTV
//        write a java 8 progrmme to demonstate steram api to filter even no leass tha 20
////        {1,2,3,4,5,6,8,9,20,36,80}

//        List<Integer> s= new ArrayList<>();
//        Collections.addAll(s,1,2,3,4,5,6,8,9,20,36,80);
//       s.stream().filter(n->n%2==0).filter(n->n<=20).forEach(System.out::println);
        //  --------------------------------------------------------------------------------------------
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        if (n <= 1) {
//            System.out.println(n+" "+"is not prime");
//            return;
//        }for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }if (count > 1) {
//            System.out.println(n+" "+"is not prime");
//        } else {
//            System.out.println(n+" "+"is prime");
//        }


//17: 1,2,3,5,7,11,13,17
//HashMap<Integer,String> mp= new HashMap<>();
//mp.put(111,"gaurav");
//mp.put(222,"srv");
//mp.put(333,"kamilya");
//
//    int x= mp.entrySet().stream().map(n->n.getKey()).max(Integer::compareTo).get();
//        System.out.println(x);
//------------------------------------------------------------------------------------------------

//
//List<Integer> al=new ArrayList<>();
//Collections.addAll(al,2,4,4,7,7,1,14,15,8,9,23,45);

//al.stream().filter(n->n%2==0).forEach(System.out::println);
// al.stream().map(n->n.toString()).filter(n->n.startsWith("1")).forEach(System.out::println);
//        Set<Integer> a=new HashSet<>();
//al.stream().filter(n->!a.add(n)).forEach(System.out::println);
//Integer l=al.stream().findFirst().get();
//        System.out.println(l);
//List<Integer> l=al.stream().sorted().collect(Collectors.toList());
//        System.out.println(l);

//        Integer x=121;
//        String s=x.toString();
//        StringBuilder g=new StringBuilder(s);
//        StringBuilder y= g.reverse();
//        System.out.println(y);
//          if( y.toString().equals(s)){
//              System.out.println("pdrome");
//          }else{
//              System.out.println("not pdrome");
//          }
//-----------------------------------------------------------------------------------------------------------

//List<Integer> lt=new ArrayList<>();
//Collections.addAll(lt,1,4,6,7,8,9,0,34,23,15);
//int size=lt.size()/2;
//Integer len=lt.stream().filter(n->lt.indexOf(n)==size).collect(Collectors.toList()).get(0);
//        System.out.println(len);





















































































//SELECT MAX(SALARY) FROM Employee WHERE SALARY < (SELECT MAX(SALARY) FROM Employee);





























































    }
}