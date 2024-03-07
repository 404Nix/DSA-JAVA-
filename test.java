public class test {
    public boolean isAcronym(String[] words, String s) {
        if (words.length != s.length()) {
            return false;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        test solution = new test();
        String[] words = {"apple", "banana"};
        String s = "ab";
        System.out.println(solution.isAcronym(words, s));  // Output: true
    }
}