import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * count the number of voter
 */


public class MapTest1 {
    public static void main(String[] args) {
        //gather student's  data
        String[] selects = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);

        }
        System.out.println(sb);
        //define a hashmap
     Map<Character,Integer>infos = new HashMap<>();
        //traversal 80 student's
        for (int i = 0; i < sb.length(); i++) {
         char ch = sb.charAt(i);
         if(infos.containsKey(ch)){
             //increased by 1
             infos.put(ch,infos.get(ch)+ 1 );
         }else{infos.put(ch,1);}




        }
        System.out.println(infos);
    }


}
