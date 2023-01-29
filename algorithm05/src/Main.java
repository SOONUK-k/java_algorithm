import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int rounds =5;
        ArrayList<String[]> result = new ArrayList<String[]>();
        String[] arr = new String[]{"rock", "paper", "scissors"};
        result = permutation(rounds, 0, result, arr, new String[]{});

        System.out.println("result = " + result);


    }

    public static ArrayList<String[]> permutation(int rounds, int depth, ArrayList<String[]> result, String[] arr, String[] currentStr){
        if(depth ==rounds){
            result.add(currentStr);
            return result;
        }
        else{
            for(int i=0; i<arr.length; i++){
//                String[] newCurrentStr = new String[currentStr.length+1];
                String [] newCurrentStr = Arrays.copyOf(currentStr,currentStr.length+1);
                newCurrentStr[newCurrentStr.length-1] = arr[i];
                permutation(rounds, depth+1, result, arr, newCurrentStr);
            }

        }
        return result;


    }


}