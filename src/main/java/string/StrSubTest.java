package string;

/**
 * @ClassName StrSubTest
 * @Description TODO
 * @Author zzzzitai
 * @Date 2019/3/26 16:57
 * @Version 1.0
 **/

public class StrSubTest {
    public static String subString (String str, int[] index) {
        
        StringBuilder result = new StringBuilder();
        char[] a1 = str.toCharArray();
        char[] a2 = new char[a1.length - index.length];

        for (int k =0; k < a1.length; k++) {
            if (k == index[k]) {
                
            }
            System.arraycopy(a1,0,a2,index[k], 1);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello, world";
        int[] index = {0,4};
        String result = subString(str, index);
        System.out.println(result);
    }
}
