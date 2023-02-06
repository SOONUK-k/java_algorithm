public class Main {
    public static void main(String[] args) {



        String str = "dsafdasfffffs";

        String output ="";
        String tSave = Character.toString(str.charAt(0));
        int count =1;
        for(int i=1; i<str.length(); i++){
            String c =Character.toString(str.charAt(i));
            //같은지 확인 카운
            if(tSave.equals(c)){
                count ++;
                System.out.println("++");
            }
            //값이 다른 경우
            //3보다 작은 경우
            //3보다 큰 경우
            else{
                if(count >=3){
                    output = output + Integer.toString(count) + tSave;
                }

                else if(count==2){
                    output = output + tSave + tSave;
                }
                else{
                    output += tSave;
                }
                count =1;
                tSave = c;

            }
        }
        System.out.println("output = " + output);



    }
}