public class trapping_rain_water {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.err.println(trappedwater(height));
    }
    static int trappedwater(int[] height){
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        int max_left = 0, max_right = 0;

        while (left<=right) {
            if (height[left] <= height[right]) {
                if (height[left] >= max_left) max_left = height[left];
                else res += max_left - height[left];

                left++;
            }
            else{
                if (height[right] >= max_right) max_right = height[right];
                else res += max_right - height[right];

                right--;
            }
        }
        return res;
    }
}
