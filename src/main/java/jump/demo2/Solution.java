package jump.demo2;

/**
 * @description:这种解法性能好，用的是乘法
 * @author: htb
 * @createDate: 2019/11/30
 * @version: 1.0
 */
public class Solution {
    /**
     * @Description:
     * @param: [k, X, Y]  X初始位置 Y目标  D 每一步的距离
     * @return: int 跳的次数
     * @date: 2019/11/30 11:26
     */
    public int solution(int X, int Y, int D) {
        //剩余的距离
        int leftover=Y-X;
        //余数
        int toReturn=leftover/D;
        if ((leftover%D)>0){
            toReturn+=1;
        }

        return toReturn;
    }
}
