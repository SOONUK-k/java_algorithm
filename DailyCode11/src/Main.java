public class Main {
    public static void main(String[] args) {
     String[] arr = new String[]{"where", "is", "the", "longest", "word"};


        String[] result = new String[arr.length-2];
        int shortest =21;
        int shortIndex = 0;
        int longest = 0;
        int longIndex = 0;



        //가장 긴, 가장 짧은 문자열의 인덱스 찾기
        for(int i=0; i<arr.length; i++){
            int leng = arr[i].length();
            if(leng>=longest) {
                longest = leng;
                longIndex = i;
            }
            if(leng <= shortest) {
                shortest = leng;
                shortIndex = i;
            }
        }
        int first = (shortIndex < longIndex) ? shortIndex : longIndex;
        int snd = (longIndex > shortIndex)? longIndex : shortIndex;

        System.out.println("first = " + first);
        System.out.println("snd = " + snd);

        System.arraycopy(arr, 0, result, 0, first);
        System.arraycopy(arr, first+1, result, first, snd - first -1);
        System.arraycopy(arr, snd+1, result, snd-1, arr.length - snd -1);

        for (String s : result) {
            System.out.println("s = " + s);

        }
    }
}