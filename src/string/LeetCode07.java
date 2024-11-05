package string;

/**
 * 9. 回文数
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数
 * 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 *
 * 示例 1：
 *
 * 输入：x = 121
 * 输出：true
 * 示例 2：
 *
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3：
 *
 * 输入：x = 10
 * 输出：false
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。
 *
 *
 * 提示：
 *
 * -231 <= x <= 231 - 1
 *
 *
 * 进阶：你能不将整数转为字符串来解决这个问题吗？
 */
/**
 * 如果转成字符串来解决,就可以想到用双指针的方式,这里还是采用用数学方式
 * 把数字的前一半,反转后,与后一半进行比较,如果相等,则是回文数
 * 如果是负数就肯定不是回文数
 *
 * 有2种情况
 * 121 1221
 *
 */
public class LeetCode07 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        // 负数和以0结尾的
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        // 让反转数字大于等于x
        int revertedNumber = 0;
        while (x>revertedNumber){
            revertedNumber = revertedNumber*10+x%10;
            x = x/10;
        }
        return x==revertedNumber||x==revertedNumber/10;

    }

}
