import java.util.*;
import java.util.stream.Collectors;

public class start {
    public static void main(String[] args){

        List<Integer> ls = Arrays.asList(9,2,4,5,6,7,8);

       //List<Integer> st= ls.stream().filter(i->i%2==0).collect(Collectors.toList());
        Collections.sort(ls);
        Collections.reverse(ls);
       System.out.println(ls);


    }
}

class even {
    public static void main(String[] args) {

        int[] arr = {6,4,2,8,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}


class bv{
    public static void main(String[] args) {

        int[] arr={5,7,8,9,0,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
