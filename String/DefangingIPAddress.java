package String;

public class DefangingIPAddress {
    static String defangIPaddr(String address) {
//        String res = address.replaceAll("\\.","[.]");
        String res = address.replace(".","[.]");
        return res;
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
