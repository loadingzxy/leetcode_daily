/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *
 * 上图是一个部分填充的有效的数独。
 *
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: true
 * 示例 2:
 *
 * 输入:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: false
 * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
 *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
 * 说明:
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 给定数独序列只包含数字 1-9 和字符 '.' 。
 * 给定数独永远是 9x9 形式的。
 *

 */

public class IsValidSudoku {
    static class Solution {
        public static boolean isValidSudoku(char[][] board) {
//        boolean flag = false;
            //0.循环遍历数字

            for(int i=0;i<board.length;i++){
                for (int j=0;j<board.length;j++){
                    if(board[i][j]!='.'){
                        //1.判断横向数据
                        //2.判断纵向数据
                        //3.判断分区数据
                        if(judgeHeng(board,board[i][j],i,j)==false){
                            System.out.println("heng");
                            return false;
                        }
                        if ( judgeShu(board,board[i][j],i,j) == false) {
                            System.out.println("shu");
                            return false;
                        }
                        if (judgeKuai(board,board[i][j],i,j)==false)        {
                            System.out.println("kuai");
                            return false;
                        }

                    }
                }
            }


            return true;
        }

        private static boolean judgeKuai(char[][] board, char c, int i, int j) {
            boolean flag = true;
            //方案一  分9种情况
            //方案二  动态根据ij 来划分pq区域 然后判断块内
            int p = getKuai(i);
            int q = getKuai(j);

            for (int i1 = p-2;i1<=p;i1++){
                for (int j1 = q-2;j1<=q;j1++){
                    if(i1==i&&j1==j){
                        continue;
                    }
                    if (board[i1][j1] == c){
                        return false;
                    }
                }
            }
            return true;
        }

        private static int getKuai(int i) {
            int p = 2;
            if (i<=2){
                p = 2;
            }else if (i<=5){
                p = 5;
            }else {
                p = 8;
            }
            return p;
        }

        private static boolean judgeShu(char[][] board, char c, int i, int j) {
//        boolean flag = true;
            for(int k=0;k<board.length;k++){
                if (k==i){
                    continue;
                }
                if (board[k][j]==c){
                    return false;
                }
            }
            return true;
        }

        private static boolean judgeHeng(char[][] board, char c, int i, int j) {
//        boolean flag = true;
            for(int k=0;k<board[i].length;k++){
                if (k==j){
                    continue;
                }
                if (board[i][k]==c){
                    return false;
                }
            }
            return true;
        }
    }
}
