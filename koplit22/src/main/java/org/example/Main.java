package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{20, -10, -11, 2, 4, 299};

        int max = arr.length;
        int count= 1;
        boolean breakCase = false;

        while(count<max){
            int save=0;
            for(int i=0; i<max-count; i++){
                save = arr[i];
                if(arr[i+1]<save){
                    arr[i] = arr[i+1];
                    arr[i+1] = save;
                    breakCase = true;
                }
            }
            if(!breakCase){
                break;
            }
            count+=1;
            breakCase= false;
        }

        for(int num : arr){
            System.out.println("num = " + num);
        }



    }
}