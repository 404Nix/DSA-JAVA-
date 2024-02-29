public class sumofdigits {
    public static void main(String[] args) {
        int n = 2345; //----> 2+3+4+5 = 14

        System.out.println(digitsum(n));
    }
    static int digitsum(int n){
        if (n<10) {
            return n;
        }
        return digitsum(n/10) + n%10;
    }
}
