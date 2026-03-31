import java.util.*;

public class Collec1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       List<Integer> lt=new ArrayList<Integer>();
        System.out.println("Enter the no of elements");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
        }

       //Collections.addAll(lt,"geek","for","geeks");
      Collections.reverse(lt);
        //Collections.sort(lt);
//        List<Integer> lt2=new ArrayList<Integer>();
//        for(int j=lt.size()-1;j>=0;j--){
//            lt2.add(lt.get(j));
//
//        }
        System.out.println(lt);
         sc.close();
    }
}
//----------------------practice down---------------------------------------------
 class hy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> lt=new ArrayList<>();
            for(int i=0;i<n;i++){
            lt.add(sc.nextInt());}

            Collections.reverse(lt);

           // Collections.addAll(lt,"geek","ddd");
           Collections.sort(lt);

            List<Integer> lt2=new ArrayList<>();
            for(int j=lt.size()-1;j>=0;j--){
                lt2.add(lt.get(j));
            }

        System.out.println(lt2);
         sc.close();
    }
}
