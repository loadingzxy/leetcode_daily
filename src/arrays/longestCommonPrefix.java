package arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 */

public class longestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0){
                return "";
            }
            if(strs.length<2){
                return strs[0];
            }
            String prefix = checkTwo(strs[0],strs[1]);
            for (int i = 2; i <strs.length ; i++) {
                prefix = checkTwo(strs[i],prefix);
                if("".equals(prefix)){
                    break;
                }
            }

            return prefix;
        }

        private  String checkTwo(String str1,String str2){
            int len = 0;
            if(str1.length()<=str2.length()){
                len = str1.length();
            }else {
                len = str2.length();
            }
            String prefix = "";

            for (int i = 0; i <len ; i++) {
                if(str1.charAt(i)==str2.charAt(i)){
                    prefix = prefix+str1.charAt(i);
                }else {
                    break;
                }
            }
            return prefix;
        }
    }
}
