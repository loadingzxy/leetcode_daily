package arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *

 */

public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            int temp = ++digits[len-1];
            int[] newarr = new int[len+1];
            if(temp==10) {
                //如果有末位进位
                for(int i=0;i<len;i++) {
                    //处理进位
                    newarr[len-i] = digits[len-1-i]+newarr[len-i];
                    if(newarr[len-i]==10) {
                        newarr[len-i]=0;
                        newarr[len-i-1]++;
                    }
                }
            }else {
                return digits;
            }
            if(newarr[0]==0) {
                //用来处理特殊结果类似[0,9,0,0]
                for (int i = 1; i < newarr.length; i++) {
                    digits[i-1] = newarr[i];

                }
                return digits;
            }
            return newarr;
        }
    }
}
