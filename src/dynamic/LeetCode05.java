package dynamic;

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
/**
 *  动态规划解这道题
 *  dp[i][j] 表示从第i到第j个字段为止,此字段 是不是回文串
 *  S(i-1)==S(j-1) && dp[i+1][j-1] 当满足这2个条件时候,dp[i][j]为true
 *
 */
public class LeetCode05 {


    public static void main(String[] args) {
        String s = "aacabdkacaa";
        System.out.println(longestPalindrome(s));

    }


    public static String longestPalindrome(String s){
        if(s.length()<2){
            return s;
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        // 只有一个字符的时候都是回文字段
        for(int i=0;i<len;i++){
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        // Len表是会问长度,从长度为2的找起来
        for (int L = 2; L <=len ; L++) {
            // 索引,从第一个开始
            for (int i = 0; i <= len - L; i++) {
                //右边的位置
                int j = L + i - 1;
                // 先判断,左右2边是不是同一个,不是同一个字符串,不是回文串
                if (charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                   // 再判断,中间的是不是会问,如果中间的,只剩下一个字符串,那就不用判断了
                    if(j-i<=2){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
            }

        }
        String res = "";
        //最长的字段
        int maxLen = -1;
        for (int i = 0; i <len; i++) {
            for (int j = 0; j <len; j++) {
                // 回文字段
                if(dp[i][j]&&j-i>maxLen){
                    maxLen = j-i;
                    res =s.substring(i,j+1);
                }
            }
        }

        return res;

    }



}
