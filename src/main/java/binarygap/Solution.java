package binarygap;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:例如，数字9的二进制表示形式为1001，并且包含长度为2的二进制间隙。数字529的二进制表示形式为1000010001，并且包含两个二进制间隙：长度4之一，长度为3。数字20具有二进制表示形式10100，并且包含一个长度为1的二进制间隙。数字15具有二进制表示1111，并且没有二进制间隙。数字32具有二进制表示形式100000，并且没有二进制间隔。
 *
 * 编写一个函数：
 *
 * 类Solution {public int solution（int N）; }
 *
 * 给定正整数N，则返回其最长二进制间隙的长度。如果N不包含二进制间隔，则函数应返回0。
 *
 * 例如，给定N = 1041，该函数应返回5，因为N具有二进制表示形式10000010001，因此其最长二进制间隙为长度5。给定N = 32，该函数应返回0，因为N具有二进制表示形式'100000'，因此没有二进制间隙。
 *
 * 针对以下假设编写有效的算法：
 *
 * N是在范围[内的整数1 .. 2147483647 ]。
 * Codility Limited版权所有2009-2019。版权所有。禁止未经授权的复制，发布或披露。
 * @author: htb
 * @createDate: 2019/11/30
 * @version: 1.0
 */
public class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        // Integer integer=new Integer(N);
        String binaryString=toB(N);
        char[] chars=binaryString.toCharArray();

        //创建一个数组 保存每次的length
        List<Integer> list=new LinkedList<Integer>();


        int start=0;
        int end=0;

        int length=-1;

        int count=0;//表示 是第几次遇到1
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='1'){

                count++;
                if(count==1){
                    //此时是第一次遇到1
                    start=i;
                }
                if(count==2){
                    //此时是第二次遇到1
                    end=i;

                    //这里遇到了第二个 1，开始计数
                    length=end-start-1;
                    list.add(length);


                }

            }

        }


        return findMax(list);


    }

    public int findMax(List<Integer> list){
        if (list.size()>=1){
            int max=list.get(0);

            for(int i=0;i<list.size();i++){
                if(list.get(i)>max){
                    max=list.get(i);
                }
            }
            return max;
        }else{
            return 0;
        }

    }

    public String toB(Integer n){

        return n.toBinaryString(n);
    }
}
