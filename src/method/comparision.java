package method;

public class comparision {
    public static void main(String[] args) {
        int [] arr1 = {10,205,30,40};
        int [] arr2 = {10,20,30,40};
        System.out.println(compare(arr1, arr2));

    }

     public static boolean compare( int[] arr1,int[]arr2){
            if(arr1.length == arr2.length){
                for (int i = 0; i < arr1.length; i++) {
                    if(arr1[i] != arr2[i]){
                        return false;
                    }
                    
                }
                return true;
            } else {return false;
        }
    }
}
