public class Main {
    public static void main(String[] args) {
        String str = "YlQO uT9";
        double output =0;
        int length = 0;
        for(char c: str.toCharArray()){
            String oneword = Character.toString(c);
            System.out.println("oneword = " + oneword+"1");
            if(oneword.trim().isEmpty()){
                System.out.println("It is empty");
                continue;
            }

            else if(!isNum(oneword)) {
                length +=1;
                System.out.println("length = " + length);
                continue;
            }
            output += Integer.parseInt(oneword);
        }
        System.out.println("output = " + output);
        output /= length;
        System.out.println("output = " + output);
        System.out.println("length = " + length);
        int result = (int) Math.round(output);

        System.out.println("result = " + result);



    }
    public static boolean isNum(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }
}