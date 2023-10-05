package quizzes.strings_arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] list = {-1,1,0,-3,3};
        List<Integer> temp = Arrays.stream(productExceptSelf(list )).boxed().collect(Collectors.toList());
        temp.forEach( i-> {System.out.print(i +",");});
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate right products and multiply with left products to get the final result
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

//    public static int[] productExceptSelf(int[] nums) {
//        List<Integer> answers = new ArrayList<>();
//        for (int i=0; i<nums.length; i++){
//            int product = 1;
//            // forward multiply
//            for (int x=i+1; x < nums.length; x++) {
//                product *= nums[x];
//            }
//            // backward multiply
//            for (int v=0; v<i; v++) {
//                product *= nums[v];
//            }
//            answers.add(product);
//        }
//        return answers.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//    }
}
