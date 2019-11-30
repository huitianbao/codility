package jump.demo1;

/**
 * @description: 没有性能，因为用的 是加法
 * @author: htb
 * @createDate: 2019/11/30
 * @version: 1.0
 */
        /*
一只小青蛙想去马路的另一边。青蛙当前位于位置X，并且想要到达大于或等于Y的位置。小青蛙始终跳固定距离D
*/

public class Solution {


    /**
     * @Description:
     * @param: [k, X, Y]  X初始位置 Y目标  D 每一步的距离
     * @return: int 跳的次数
     * @date: 2019/11/30 11:26
     */
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = 0;
        Y = Y - X;
        while (Y > 0) {
            Y = Y - D;
            count++;

        }
        return count;


    }
}




