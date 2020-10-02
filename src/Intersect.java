import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *  
 *
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶：
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *

 */
public class Intersect {

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> list = new ArrayList<Integer>();
            //声明一个长度可变的list 列表

            //将两个数组转换成可变长度的列表

            List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
            List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

            //以小数组为基准遍历大数组 将相同结果存入到新数组中并删除大数组中的元素
            if (list1.size()>list2.size()) {
                for (int i = 0; i < list2.size(); i++) {
                    for(int j=0;j<list1.size();j++) {
                        if(list1.get(j).equals(list2.get(i))) {
                            list1.remove(j);
                            list.add(list2.get(i));
                            break;
                        }
                    }

                }
            }else {
                for (int i = 0; i < list1.size(); i++) {
                    for(int j=0;j<list2.size();j++) {
                        if(list1.get(i).equals(list2.get(j))) {
                            list2.remove(j);
                            list.add(list1.get(i));
                            break;
                        }
                    }

                }
            }



            //列表转数组
            int[] nums = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
            return nums;

        }
    }
}
