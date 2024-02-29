public class printSubset {
    public static void main(String[] args) {
        System.out.println();
        printsubset("ABC", "", 0);
    }

    static void printsubset(String str, String cur, int index){
        if (index == str.length()) {
            System.out.println(cur);
            return;
        }
        printsubset(str, cur, index+1);
        printsubset(str, cur+str.charAt(index), index+1);
    }
}
