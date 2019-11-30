package binarygap;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
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
