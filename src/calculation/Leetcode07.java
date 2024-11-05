package calculation;

/**
 * 7. 整数反转
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 *
 *
 * 提示：
 *
 * -231 <= x <= 231 - 1
 */
/**
 * 解题思路:
 * 记住java中进制转换思路,下面是10进制转换
 *  result = result * 10 + rev;
 */
public class Leetcode07 {


    public static void main(String[] args) {
        int reverse = reverse(0);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            int rev = x % 10;
            if (result> Integer.MAX_VALUE/10||(result < Integer.MIN_VALUE/10)){
                // 越界
                return 0;
            }
            x = x / 10;
            // 10进制转换
            result = result * 10 + rev;
        }

        return result;
    }

}
