package strings;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *

 */
public class Reverse {
    class Solution {
        public int reverse(int x) {
            int res = 0;
            try {
                String xStr = String.valueOf(x);
                char[] xChar = xStr.toCharArray();
//            System.out.println(Arrays.toString(xChar));
                if(x<0){
                    xStr = "";
                    for (int i = 0; i <xChar.length-1; i++) {
//                    System.out.println(i);
                        xStr = xStr+xChar[xChar.length-i-1];
                    }
//                System.out.println(xStr);
                    res = Integer.parseInt(xStr)*-1;
                }else {
                    xStr = "";
                    for (int i=0;i < xChar.length;i++){
                        xStr = xStr+xChar[xChar.length-i-1];
                    }
                    res = Integer.parseInt(xStr);
                }
            }catch (Exception e){
                res = 0;
            }
            return res;
        }
    }
}
