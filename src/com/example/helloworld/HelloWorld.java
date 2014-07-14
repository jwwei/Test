package com.example.helloworld;

//import java.util.Calendar;
import java.util.Stack;

/**
 * Created by Weiwei Jiang on 2014/7/10.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int[] height = new int[]{2, 1, 5, 6, 2, 3, 2, 3};
        System.out.println(largestRectangleArea(height));
    }


    public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int ans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < height.length; ++i) {
            //如果高度递增，那么一次入栈。
            if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i);
            }
            //如果当前柱比栈顶的低，那么把栈顶的拿出来，计算所有已经出栈的最大面积。
            else {
                int start = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, height[start] * width);
                --i;
            }
        }

        //循环过后栈中是递增的条目，计算在栈中递增条目的最大面积。
        while (!stack.isEmpty()) {
            int start = stack.pop();
            int width = stack.isEmpty() ? height.length : height.length - stack.peek() - 1;
            ans = Math.max(ans, height[start] * width);
        }
        return ans;
    }
}
