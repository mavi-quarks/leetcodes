package quizzes.strings_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] candies = {12,1,12};
        int extra = 10;
        List<Boolean> list = kidsWithCandies(candies, extra);
        list.forEach(i -> {System.out.print(i +", ");});
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultsBool =  new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            // check if current candy + extra is greatest
            resultsBool.add((candy + extraCandies) >= max);
        }
        return resultsBool;
    }
}
