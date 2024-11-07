package string;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 14. 最长公共前缀
 * 简单
 * 相关标签
 * 相关企业
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 * 提示：
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 */

/**
 * 解题思路:
 * 直接对数组排序(ASCII码进行排序),然后第一个
 */
public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length<2){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String preStr = strs[0];
        String lasteStr = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<preStr.length()){
            if(preStr.charAt(i)==lasteStr.charAt(i)){
                sb.append(preStr.charAt(i));
            }else {
               break;
            }
            i++;
        }
        return sb.toString();
    }
}
