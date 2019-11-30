

![](C:\Users\16221\Desktop\codity\3\3.JPG)



```java
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


//思路1 
/*
k 是多少，就分离数组后  K 位，放到数组arrayAfter 中

把后面的往后移动 k位


再从头开始遍历

有bug

思路2 


写个方法，每次移动一位

调用k次

*/


class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
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
```

分析总结

已检测到以下问题：运行时错误。

例如，对于输入`（[]，1）` ，解决方案意外终止。

分析

[折叠所有](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)**示例测试**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

示例
第一个示例测试

✔

**好**

1。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

example2
第二个示例测试

✔

**好**

1。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

example3
第三示例测试

✔

**好**

1。

0.004秒

**好**

[折叠所有](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)**正确性测试**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

extreme_empty
空数组

✘

经过运行时**错误**
测试的程序以退出代码1终止

1。

0.004秒

**好**

2。

0.004秒

**RUNTIME ERROR**， 测试的程序以退出代码1终止

stderr：

```
线程“主”中的异常java.lang.ArrayIndexOutOfBoundsException：-1
	在Solution.moveOneStep（Solution.java:40）
	在Solution.solution（Solution.java:34）
	在Exec.run（exec.java:49）
	在Exec.main（exec.java:35）
```

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

单
一个元件，0 <= K <= 5

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

3。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

双重
两个元素，K <= N

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

small1
小型功能测试，K <N

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

small2
小型功能测试，K> = N

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

3。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

small_random_all_rotations
小随机序列，所有旋转，N = 15

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

3。

0.004秒

**好**

4。

0.004秒

**好**

5，

0.004秒

**好**

6。

0.004秒

**好**

7。

0.004秒

**好**

8。

0.004秒

**好**

9。

0.004秒

**好**

10。

0.004秒

**好**

11。

0.004秒

**好**

12

0.004秒

**好**

13

0.004秒

**好**

14。

0.004秒

**好**

15

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

medium_random
中随机序列，N = 100

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

[▶](https://app.codility.com/demo/results/trainingGVEQMA-6NB/#)

最大
最大N和K

✔

**好**

1。

0.004秒

**好**

2。

0.004秒

**好**

3。

0.004秒

**好**

4。

0.004秒

**好**