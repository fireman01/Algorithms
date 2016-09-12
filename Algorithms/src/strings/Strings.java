package strings;

import java.util.LinkedList;
import java.util.List;

/**
 * 常见的字符串问题
 * @author 林军雄
 *
 */
public class Strings {
	
	/** 字符串截取函数
	 * 例如 “anxcbsydxga” 截取 “anx” 后为 “cbsydg”
	 * @param str 源字符串
	 * @param exp 目标字符串
	 * @return  删除目标字符串的子串
	 */
	public static String delString(String str, String exp){
		char[] str1 = str.toCharArray();
		char[] str2 = exp.toCharArray();
		char[] result = new char[100];
		int flag = 0;
		for(int i=0; i<str2.length; i++){
			for(int j=0; j<str1.length; j++){
				if(str2[i]==str1[j]){
					str1[j] = '\0';
				}
			}
		}
		for(int i=0; i<str1.length; i++){
			if(str1[i]!='\0'){
				result[flag++] = str1[i];
			}
		}
		return String.valueOf(result);
	}
/*************************************字符串截取函数结束***************************************/
	
	/**字符串左移函数
	 * 比如ABCDEFG，移3位变DEFGABC，时间复杂度为O(n),空间复杂度为O(1)
	 * @param pszString 字符串
	 * @param nCharsRotate 移动的个数
	 * @return
	 */
	public static char[] pszStringRotate(char[] pszString, int nCharsRotate){
		for(int i=0; i<pszString.length; i++){
			if(pszString.length-i==nCharsRotate&&nCharsRotate!=0){
				nCharsRotate = nCharsRotate-1;
			}
			if(i+nCharsRotate>pszString.length-1){
				break;
			}
			char tmp = pszString[i];
			pszString[i] = pszString[i+nCharsRotate];
			pszString[i+nCharsRotate] = tmp;
		}
		return pszString;
	}
/*************************************字符串左移函数结束***************************************/
	/**字符串匹配
	 * 给定一个 query 和一个 text,均由小写字母组成。要求在 text 中找出以同样的顺序连 续出现在 query 中的最长连续字母序列的长度。
	 * 例如, query 为“acbac”,text 为 “acaccbabb”,那么 text 中的“cba”为最长的连续出现在 query 中的字母序列,
	 * 因此, 返回结果应该为其长度 3。请注意程序效率。
	 * @param text 源文本
	 * @param query 匹配的字符串
	 * @return
	 */
	public static int getMaxLength(String text, String query){
		int maxLength = 0;
		for(int i=0; i<text.length(); i++){
			int flag = 0;
			for(int j=0; j<query.length(); j++){
				int temp = 0;
				if(text.charAt(i)==query.charAt(j)){
					temp = temp + 1;
					for(int k=1; k<query.length(); k++){
						if(i+k>text.length()||j+k>query.length()){
							break;
						}
						if(text.charAt(i+k)==query.charAt(j+k)){
							temp++;
						}else{
							maxLength = Math.max(maxLength, temp);
							flag = 1;
							break;
						}
					}
				}
				if(flag==1){
					break;
				}
			}
			if(maxLength+i>text.length()){
				break;
			}
		}
		return maxLength;
	}
/*************************************字符串匹配结束***************************************/	
	/**
	 *	判断str1是否是str2的旋转词
	 *	输入：字符串str1，字符串str2
	 *	返回：true代表str1是str2的旋转词；false代表不是
	 */
	public boolean isRotation(String str1, String str2) {
		String str = str2.concat(str2);
		if(str.contains(str1)){
			return true;
		}else{
			return false;
		}
	}
/*************************************判断旋转词结束***************************************/		
	/**查找第一次出现两个相同的字符
 	 * @param s
 	 * @return
 	 */
 	public static char findChar(String s){
 		List<Character> list = new LinkedList<Character>();
 		list.add(s.charAt(0));
 		for(int i=1; i<s.length(); i++){
 			for(int j=0; j<list.size(); j++){
 				if(s.charAt(i)!=list.get(j)){
 	 				list.add(s.charAt(i));
 	 			}else{
 	 				return s.charAt(i);
 	 			}
 			}
 		}
 		return (Character) null;
 	}
/*************************************查找第一次出现两个相同的字符结束***************************************/

    /**旋转数组
	 * 将“abcdefgh”旋转n个位置成“defghabc”，实例中n=3
	 * 
	 * 实现如下：
	 * 1、reverse（字符数组，0，旋转的位置n-1）
	 * 2、reverse（字符数组，n，数组的长度len-1）
	 * 3、reverse（字符数组，0， 数组的长度len-1）
	 * 
	 * 测试方法为test1
	 * 
	 * @param arr
	 * @param left
	 * @param right
	 */
	public static void reverse(char[] arr, int left, int right){
		char c;
		while(left<right){
			 c = arr[left];
			 arr[left] = arr[right];
			 arr[right] = c;
			 left++;
			 right--;
		}
	}
	public static void test1() {
		char[] a = {'a','b','c','d','e','f','g','h'};
		reverse(a,0,2);
		reverse(a, 3, 7);
		reverse(a, 0, 7);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	
/*************************************旋转数组 结束***************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
