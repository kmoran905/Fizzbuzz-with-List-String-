import java.util.ArrayList;
import java.util.List;

class Solution {
   
    public static List<String> fizzBuzz(int n) {

        List<String> stringArray = new ArrayList<>();

        String answer = "";
       
        for(int i = 1; i < n; i++) {
            if (i % 3 == 0  && i % 5 == 0) {
                answer = "Fizzbuzz";
                stringArray.add(answer);
            } else if (i % 3 == 0) {
                answer = "Fizz";
                stringArray.add(answer);
            } else if (i % 5 == 0) {
                answer = "Buzz";
                stringArray.add(answer);
            } else {
                answer = Integer.toString(i);
                stringArray.add(answer);
            }
        }
            return stringArray;    
    }
            
    

    public static void main(String[] args) {

        System.out.println(fizzBuzz(100));

    }

}