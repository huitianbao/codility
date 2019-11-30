package CyclicRotation;

import java.util.Arrays;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/30
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr={3, 8, 9, 7, 6};
//        System.out.println(Arrays.toString(solution.moveOneStep(arr)));
        System.out.println(Arrays.toString(solution.solution(arr,3)));
//        Arrays.toString(arr);

    }
}
