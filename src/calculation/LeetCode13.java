package calculation;

import java.util.HashMap;

/**
 * 13. 罗马数字转整数
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。
 */

/**
 * 找规律
 * XXVII 可视作 X+X+V+I+I=10+10+5+1+1=27
 * XIV 可视作 X−I+V=10−1+5=14
 * 如果左边的数比右边的大,就加上,比右边的小,就减去
 */
public class LeetCode13 {
    private static HashMap<Character, Integer> romanNumMap = new HashMap<>();

    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romanToInt(s));
    }

    static {
        romanNumMap.put('I', 1);
        romanNumMap.put('V', 5);
        romanNumMap.put('X', 10);
        romanNumMap.put('L', 50);
        romanNumMap.put('C', 100);
        romanNumMap.put('D', 500);
        romanNumMap.put('M', 1000);
    }


    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer num = romanNumMap.get(c);
            if(i<s.length()-1&&num<romanNumMap.get(s.charAt(i+1))){
                ans-=num;
            }else {
                ans+=num;
            }
        }
        return ans;
    }
}
