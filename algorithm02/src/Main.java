public class Main {
    public static void main(String[] args) {

        int k = 4972;
        //To do
        int[] coins = new int[]{500, 100, 50, 10,5, 1};
        int coinCount = 0;

        for(int coin: coins){
            int coinNum = (int) k / coin;
            coinCount +=coinNum;
            k -= coinNum * coin;
            if(k==0) break;

        }
        System.out.println("coinCount = " + coinCount);


    }
}