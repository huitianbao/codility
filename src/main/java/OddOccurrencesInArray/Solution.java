package OddOccurrencesInArray;

/**
 * @description:给出了一个由N个整数组成的非空数组A。该数组包含奇数个元素，并且该数组的每个元素都可以与另一个具有相同值的元素配对，除了一个未配对的元素。
 *
 * 例如，在数组A中这样：
 *
 *   A [0] = 9 A [1] = 3 A [2] = 9
 *   A [3] = 3 A [4] = 9 A [5] = 7
 *   A [6] = 9
 * 索引0和2处的元素的值为9，
 * 索引1和3的元素的值为3，
 * 索引4和6的元素的值为9，
 * 索引5处的元素的值为7，并且未配对。
 * 编写一个函数：
 *
 * 类Solution {public int solution（int [] A）; }
 *
 * 给定一个由满足上述条件的N个整数组成的数组A，则返回未配对元素的值。
 *
 * 例如，给定数组A使得：
 *
 *   A [0] = 9 A [1] = 3 A [2] = 9
 *   A [3] = 3 A [4] = 9 A [5] = 7
 *   A [6] = 9
 * 该函数应返回7，如上面示例中所述。
 *
 * 针对以下假设编写有效的算法：
 *
 * N是[1..1,000,000]范围内的奇数整数；
 * 数组A的每个元素都是[ 1 .. 1,000,000,000 ] 范围内的整数；
 * A中除一个值以外的所有值都出现偶数次
 * @author: htb
 * @createDate: 2019/11/30
 * @version: 1.0
 */
public class Solution {
    public int solution(int[] A) {

        // write your code in Java SE 8
        //创建一个位图 初始全是0 配对之后，改成1
        int[] bytePic=new int[A.length];
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                //如果已经被匹配过，就跳过
                if(bytePic[i]==1){
                    continue;
                }else {
                    if (A[i]==A[j]){
                        //设置位图
                        bytePic[i]=1;
                        bytePic[j]=1;
                        //第一次找到就退出本次循环
                        break;
                    }
                }
            }

        }

        //找到位图中仅存的 0
        int index=-1;
        for (int i=0;i<bytePic.length;i++){
            if (bytePic[i]==0){
                index=i;
            }
        }
        return A[index];
    }

}
