
public class Maximum_Ascending_Subarray_Sum {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0], sum = nums[0];
        for (int i = 0; i < (nums.length - 1); i++) {

            if (nums[i + 1] > nums[i]) {
                sum += nums[i + 1];
            } else {
                sum = nums[i + 1];
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { 100, 10, 1 };

        int result = new Maximum_Ascending_Subarray_Sum().maxAscendingSum(arr);

        System.out.println(result);
    }
}
