package strings;

public class p1108_defanging_an_ip_address {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }

//    static String defangIPaddr(String address) {
//        return address.replace(".", "[.]");
//    }

    static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') sb.append("[.]");
            else sb.append(c);
        }

        return sb.toString();
    }
}
