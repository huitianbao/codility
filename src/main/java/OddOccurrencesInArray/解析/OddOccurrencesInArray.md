![image-20191130104321339](C:\Users\16221\AppData\Roaming\Typora\typora-user-images\image-20191130104321339.png)



```java
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
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
```

分析总结

已检测到以下问题：超时错误。

分析

检测到的时间复杂度：

**O（N \** 2）**

[折叠所有](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)**示例测试**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

example1
示例测试

✔

**好**

1。

0.004秒

**好**

[折叠所有](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)**正确性测试**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

simple1
简单测试n = 5

✔

**好**

1。

0.008秒

**好**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

simple2
简单测试n = 11

✔

**好**

1。

0.008秒

**好**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

extreme_single_item
[42]

✔

**好**

1。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

small1
小随机检验n = 201

✔

**好**

1。

0.008秒

**好**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

small2
小随机检验n = 601

✔

**好**

1。

0.008秒

**好**

[折叠所有](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)**性能测试**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

medium1
中等随机检验n = 2,001

✔

**好**

1。

0.040秒

**好**

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

medium2
中等随机检验n = 100,003

✘

**超时错误已**
终止。达到硬限制：7.000秒。

1。

7.000秒

**超时错误**，已 终止。达到硬限制：7.000秒。

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

big1
大随机检验n = 999,999，多次重复

✘

**超时错误已**
终止。达到硬限制：14.000秒。

1。

14.000秒

**超时错误**，已 终止。达到硬限制：14.000秒。

[▶](https://app.codility.com/demo/results/trainingSUNHWB-MPE/#)

big2
大随机检验n = 999,999

✘

**超时错误已**
终止。达到硬限制：19.000秒。

1。

19.000秒

**超时错误**，已 终止。达到硬限制：19.000秒。