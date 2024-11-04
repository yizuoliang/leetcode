package string;

/**
 * 5. 最长回文子串
 * 尝试过
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个字符串 s，找到 s 中最长的
 * 回文
 *
 * 子串
 * 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 */
public class LeetCode05 {


    public static void main(String[] args) {

        String s = "cbbd";
        System.out.println(longestPalindrome(s));

    }


    public static String longestPalindrome(String s){
        int len = s.length();
        while (len>0){
            int start = 0;
            while (start + len<=s.length()){
                String substring = s.substring(start, start + len);
                if(isPalindrome(substring)){
                    return substring;
                }
                start++;
            }
            len--;
        }
        return null;
    }

    public static boolean  isPalindrome(String s){
        int left = 0,right = s.length()-1;
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

}
