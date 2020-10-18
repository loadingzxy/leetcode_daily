package strings;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *  
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *

 */

public class FirstUniqChar {
    class Solution {
        public int firstUniqChar(String s) {
            int res = -1;
            char[] str = s.toCharArray();
//        boolean flag = false;

            for (int i = 0; i <str.length ; i++) {
//            s.charAt()
                int j = 0;
                for ( j = 0; j <str.length ; j++) {
                    if (j == i){
                        continue;
                    }
                    if(str[i] == str[j]){
                        break;
                    }

                }
                if (j==str.length){
                    res = i;
                    return  res;
                }
            }
            return res;
        }
    }
}
