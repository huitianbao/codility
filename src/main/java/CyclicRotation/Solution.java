package CyclicRotation;

/**
 * @description:给出了由N个整数组成的数组A。旋转数组意味着将每个元素右移一个索引，并将数组的最后一个元素移到第一位。例如，数组A = [3、8、9、7、6]的旋转为[6、3、8、9、7]（元素右移一个索引，而6移到第一位）。
 *
 * 目标是旋转阵列AK次；也就是说，A的每个元素将向右移K次。
 *
 * 编写一个函数：
 *
 * 类解决方案{public int [] solution（int [] A，int K）; }
 *
 * 如果给定一个由N个整数和一个整数K组成的数组A，则返回旋转了K次的数组A。
 *
 * 例如，给定
 *
 *     A = [3，8，9，7，6]
 *     K = 3
 * 该函数应返回[9，7，6，6，3，8]。进行了三个轮换：
 *
 *     [3、8、9、7、6]-> [6、3、8、9、7]
 *     [6、3、8、9、7]-> [7、6、3、8、9]
 *     [7 ，6、3、8、9]-> [9、7、6、3、8]
 * 再举一个例子
 *
 *     A = [0，0，0]
 *     K = 1
 * 该函数应返回[0，0，0]
 *
 * 给定
 *
 *     A = [1,2,3,4]
 *     K = 4
 * 该函数应返回[1、2、3、4]
 *
 * 假使，假设：
 *
 * N和K分别在范围[内的整数0 .. 100 ];
 * 数组A的每个元素都是[ -1,000 .. 1,000 ] 范围内的整数。
 * @author: htb
 * @createDate: 2019/11/30
 * @version: 1.0
 */

/*
思路：先写一个方法，每次移动一位
      再 调用 K次
      缺点，性能不佳

思路2 ：找到每次循环下标移动的规律

 */
public class Solution {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
//        int[] toReturn=new int[A.length];
        for(int i=1;i<=K;i++){
            A=moveOneStep(A);
        }
        return A;


    }

    public int[] moveOneStep(int[] array){
        int last=array[array.length-1];

        for (int i=array.length-2;i>=0;i--){
            array[i+1]=array[i];
        }
        array[0]=last;

        return array;


    }

}
