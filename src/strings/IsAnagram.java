package strings;

import java.util.HashMap;
import java.util.Map;


/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class IsAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            Map<Character,Integer> maps = tongji(s);
            Map<Character,Integer> mapt = tongji(t);
            for (Map.Entry<Character,Integer> entry: maps.entrySet()){
                char key = entry.getKey();
                int value = entry.getValue();
                System.out.println();
                if (mapt.get(key)==null||mapt.get(key)!=value){
                    //找不到key  或者数量不对
                    return false;
                }

            }

            return true;
        }

        public  Map<Character,Integer> tongji(String s){
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if(map.get(temp) == null){
                    map.put(temp,1);
                }else {
                    map.put(temp,map.get(temp)+1);
                }
            }
            return map;
        }
    }
}
