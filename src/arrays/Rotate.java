package arrays;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * 示例 1:
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * 示例 2:
 *
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 *
 */

public class Rotate {
    class Solution {
        public void rotate(int[][] matrix) {
            int a = 0;
            int b = 0;
            int c = matrix.length-1;
            int d = matrix.length-1;
            while (a<=c){
                swapCircle(matrix,a++,b++,c--,d--);
            }
        }

        public  void swapCircle(int[][] arr ,int x1,int y1,int x2,int y2){

            int times = x2-x1;
            int temp = 0;
            for (int i=0;i<times;i++){
                //对于模拟 笛卡尔 坐标系来说   纵轴是x 横轴是y
                temp = arr[x1][y1+i];
                arr[x1][y1+i] = arr[x2-i][y1];
                arr[x2-i][y1] = arr[x2][y2-i];
                arr[x2][y2-i] = arr[x1+i][y2];
                arr[x1+i][y2] = temp;

            }

        }
    }
}
