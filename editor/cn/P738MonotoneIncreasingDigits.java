//给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。 
//
// （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。） 
//
// 示例 1: 
//
// 输入: N = 10
//输出: 9
// 
//
// 示例 2: 
//
// 输入: N = 1234
//输出: 1234
// 
//
// 示例 3: 
//
// 输入: N = 332
//输出: 299
// 
//
// 说明: N 是在 [0, 10^9] 范围内的一个整数。 
// Related Topics 贪心算法 
// 👍 128 👎 0

package cn;

import java.util.Arrays;

public class P738MonotoneIncreasingDigits{
    public static void main(String[] args) {
        Solution solution = new P738MonotoneIncreasingDigits().new Solution();
        System.out.println(solution.monotoneIncreasingDigits(1234));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int monotoneIncreasingDigits(int N) {
        if (N < 10) {
            return N;
        }
        char[] strN = Integer.toString(N).toCharArray();
        int i = 1;
        int nLen = strN.length;
//        while (i < nLen && strN[i - 1] <= strN[i]) {
//            i++;
//        }
        while (i < strN.length && strN[i - 1] <= strN[i]) {
            i += 1;
        }
        if (i < strN.length) {
            while (i > 0 && strN[i - 1] > strN[i]) {
                strN[i - 1]--;
                i--;
            }
            for (i++; i < nLen; i++) {
                strN[i] = '9';
            }
        }
        return Integer.parseInt(new String(strN));



    }


}
//leetcode submit region end(Prohibit modification and deletion)

}