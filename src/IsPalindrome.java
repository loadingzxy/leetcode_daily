/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false

 */

public class IsPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            s = s.replace(" ","");
            int len = s.length();
            String str = "";
            for (int i = 0; i < len; i++) {
                char temp = s.charAt(i);
                if ((temp>='a'&&temp <= 'z')||(temp>='A'&&temp<='Z')||(temp>='0'&&temp<='9')){
                    str = str+temp;
                }
            }
            //2.统一转换为小写
            str = str.toLowerCase();
            System.out.println(str);
            len = str.length();
            //3.循环比较是否为回文
            for (int i = 0; i < len/2; i++) {
                if(str.charAt(i)!=str.charAt(len-i-1)){
                    return false;
                }
            }

            return true;

        }
    }
}
