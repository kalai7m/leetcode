package Recursion;

public class Countx {
//    static int countX(String str){
//        if(str.isEmpty()) return 0;
//        int n = str.charAt(0) == 'x' ? 1:0;
//        return n+countX(str.substring(1));
//    }

//    static  int countHi(String str){
//        if(str.isEmpty()) return 0;
//        int n = str.startsWith("hi")  ? 1:0;
//        return n+countHi(str.substring(1));
//    }
//static String changeXY(String str) {
//    if(str.isEmpty()) return "";
//    char a=str.charAt(0)=='x'?'y':str.charAt(0);
//    //+ here is concatenation of chars. This will convert to string object
//    return a+changeXY(str.substring(1));
//}
//    static String changeXY(String str) {
//        if(str.isEmpty()) return "";
//        String a = str.startsWith("pi")?"3.14":String.valueOf(str.charAt(0));
//        int i = str.startsWith("pi") ? 2 :1;
//        //+ here is concatenation of chars. This will convert to string object
//        return a+changeXY(str.substring(i));
//    }
//static String noX(String str) {
//    if(str.isEmpty()) return "";
//    if(str.charAt(0)=='x'){
//        return noX(str.substring(1));
//    }
//    return str.charAt(0)+noX(str.substring(1));
//}
//    static boolean array220(int[] nums, int index) {
//        if(index+1==nums.length) return false;
//        if(nums[index]*10 == nums[index+1])return true;
//        return array220(nums,++index);
//    }
//
    static String countPairs(String str) {
    if(str.length()<2) return str;
    if(str.charAt(0)!=str.charAt(1)) return str.charAt(0)+countPairs(str.substring(1));
    return countPairs(str.substring(1));
    }
    public static void main(String[] args) {
//        System.out.println(countX("xxihxxm"));
//        System.out.println(countHi("xxihxxm"));
//        System.out.println(changeXY("xxhixx"));
//        System.out.println(changeXY("xxpixx"));
//        System.out.println(noX("xxpixx"));
//        System.out.println(array220(new int[]{1,5,11,110},0));
//        System.out.println(allStar("xxhe"));
//        System.out.println(countPairs("yyyzzzzaab"));
        long a= (9999999999L);
        float n = (float)12.56;
        System.out.println(a);
    }
}
