public class Main {
    public static void main(String[] args) {

        int len = 20;
        String result = makeString("", len);


        System.out.println("result = " + result);
    }

    public static  boolean check(String str){
        int leng = str.length();
        int halfLeng = (int) str.length()/2;
        for(int i=1; i<=halfLeng; i++){
            if(str.substring(leng-(2*i), leng-i).equals(str.substring(leng-i, leng))) return false;
        }
        return true;
    }

    public  static String makeString(String str, int len){
        if(str.length() ==len) return str;

        String barcode ="123";
        for(int i=0; i<barcode.length(); i++){
            String addStr = str + barcode.charAt(i);
            if(check(addStr)) {
                addStr=makeString(addStr, len);
                if(addStr!=null) return addStr;
            }
        }
        return null;
    }

}