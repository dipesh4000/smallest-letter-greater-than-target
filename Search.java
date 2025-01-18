import java.util.Arrays;
public class Search {
    public static void main(String[] args) {
       char[] let = {'c','f','j'};
        System.out.println(nextGreatestLetter(let,'c'));

    }
    public  static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        if(letters[s] > target){
            return letters[0];
        }
        if(letters[e] <= target){
            return letters[0];
        }

        while( e >= s){
            int m = s + (e-s)/2;
            if(letters[m] > target) e = m - 1;
            if(letters[m] <= target) s = m + 1;

        }


        return letters[s];
    }
}






























