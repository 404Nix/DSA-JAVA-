public class reversestring3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
        static String reverseWords(String s) {
            char[] arr = s.toCharArray();
            int n = arr.length;
            int sp = 0;
            int ep = 0;
            for(ep = 0; ep<= n; ep++){
                if(ep==n || arr[ep] == ' '){
                    reverse(arr, sp, ep-1);
                    sp = ep+1;
                }
            }
            return new String(arr);
        }
        static void reverse(char arr[], int sp, int ep){
            
            while(sp<ep){
                char temp = arr[sp];
                arr[sp] = arr[ep];
                arr[ep] = temp;
                sp++;
                ep--;
            }
            
        }
    }
