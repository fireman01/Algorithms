package numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * 常见的数字问题
 * @author 林军雄
 *
 */
public class Numbers {
	
	/**
	 * a和b交换， 要求不用中间变量
	 * @author 林军雄
	 * @param a
	 * @param b
	 */
	public static void numSwap(int a, int b){
		a = a^b;
		b = a^b;
		a = a^b;
	}
/***************************************a，b交换结束**************************************/	
	/**
	 * 求a，b中的最大值，要求不用"if","?:","switch"语句
	 * @author 林军雄
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getMaxValue(int a, int b){
		return ((a+b)+Math.abs(a-b))/2;
	}
/***************************************求a，b较大值结束**************************************/	
	/**
	 * 求最大公约数GCD和最小公倍数LCM
	 * @author 林军雄
	 * @param a
	 * @param b
	 */
	public static void getGCDandLCM(int a, int b){
		int max = a * b;
		int n = 0;
		int GCD = 0;
		int LCM = 0;
		if(a<b){//保证a比b大
			int c = a;
			a = b;
			b = c;
		}
		while(b!=0){
			n = b;
			b = a % b;
			a = n;
		}
		GCD = max/n;
		LCM = n;
		System.out.println("最大公约数："+GCD);
		System.out.println("最小公倍数："+LCM);
	}
/***************************************求最大公约数和最小公倍数结束**************************************/			
	/**找出数组中的第二大的数
 	 * @param arr
 	 * @return
 	 */
 	public static int findNumber(int[] arr){
 		int result = 0;
 		for(int i=0; i<arr.length; i++){
 			for(int j=i+1; j<arr.length; j++){
 				if(arr[i]<arr[j]){
 					int temp = arr[i];
 					arr[i] = arr[j];
 					arr[j] = temp;
 				}
 			}
 		}
 		for(int k=1;k<arr.length;k++){
 			if(arr[k]<arr[0]){
 				result = arr[k];
 				break;
 			}
 		}
 		return result;
 	}
/***************************************找出数组中的第二大的数结束**************************************/
 	
 	/**二分搜索算法
 	 * @param array
 	 * @param key
 	 * @return
 	 */
 	public static int BinarySearch(int[] array, int key){
 		 int left = 0;
 		 int right= array.length - 1;
 		 while(left<=right){
 			int middle = (left+right)/2;
 			if(array[middle]<key){
 				left = middle + 1;
 			}else if(array[middle]>key){
 				right = middle - 1;
 			}else{
 				return middle;
 			}
 		}
 		return -1;
 	}
/**********************************************二分搜索结束*****************************************/
 	
 	/**跳台阶函数，跳到最后一个台阶返回true，数字代表可以跳几个台阶
	 * @param array
	 * @param size
	 * @return
	 */
	/*
	 * 问题描述：
	 * 有一排台阶，每个台阶上有一个非负整数，代表在该台阶上时能最多向前跳几个台阶。从第0个台阶开始跳，实现一个函数，判断是否能到达最后一个台阶。
     * 例如： 4 2 2 1 0 2 返回 false
     *      2 1 3 1 1 0 返回 true
	 */
	public static Boolean jump(int array[], int size){
		for(int i=0; i<array.length; i++){
			if(i+array[i]==size){
				return true;
			}
		}
		return false;
	}
/*******************************************跳台阶结束*****************************************/
	 
	/**
	 * 返回最小的N个素数
	 * @author 林军雄
	 * @param n 素数个数
	 * @return 最小的N个素数
	 */
	public static List<Integer> getPrimes(int n) {
	     List<Integer> ret = new ArrayList<Integer>();
	     int P = 3;
	     ret.add(2);
	     while(ret.size()<n){
	    	 boolean flag = false;
	    	 for(int A=2;A<P; A++){
	    		 long tmp = A;
	    		 for(int k=1; k<P-1; k++){
	    			 tmp*=A;
	    		 }
	    		 if(tmp%P!=1){
	    			 flag = true;
	    			 break;
	    		 }
	    	 }
	    	 if(flag==false){
	    		ret.add(P); 
	    	 }
	    	 P+=2;
	    	 
	     }
	     return ret;
	 }
/*******************************************返回最小的N个素数结束*****************************************/
    /**
     * 数组排序，使得各个元素依次拼接后的值最小
     * 例如  {1,3,2,8} 排序后为{1,2,3,8}
     * @author 林军雄
     * @param arr
     */
    public static void sort(int[] arr){
    	for(int i=0; i<arr.length-1; i++){
    		for(int j=i+1; j<arr.length; j++){
    			int tmpi = arr[i];
    			int tmpj = arr[j];
    			int counti = 0;
    			int countj = 0;
    			while(tmpi>10){
    				counti++;
    				tmpi = tmpi/10;
    			}
    			while(tmpj>10){
    				countj++;
    				tmpj = tmpj/10;
    			}
    			if(tmpi>tmpj){
    				int tmp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = tmp;
    			}else if(tmpi==tmpj){
    				while(Math.max(counti, countj)>=0){
    					if(counti==0){
    						break;
    					}
    					if(countj==0){
    						int tmp = arr[i];
    	    				arr[i] = arr[j];
    	    				arr[j] = tmp;
    	    				break;
    					}
    					int tmpim = 0 ,tmpjn = 0; 
    					for(int m=0; m<counti; m++){
    						tmpim = arr[i]/10;
    					}
    					for(int n=0; n<countj; n++){
    						tmpjn = arr[j]/10;
    					}
    					if(tmpim>tmpjn){
    						int tmp = arr[i];
    	    				arr[i] = arr[j];
    	    				arr[j] = tmp;
    					}
    					counti--;
    					countj--;
    				}
    			}
    			
    		}
    	}
    }
/*******************************************排序结束*****************************************/
   
  	/**
  	 * 求最大的矩阵和，要求不同行，不同列的值
  	 * @author 林军雄
  	 * @param arr
  	 * @return
  	 */
  	public static int fandMaxSum(int[][] arr){
  		  int max = 0;
  		  int[][] tmp = new int[arr.length][arr[0].length];
  		  for(int i = 0;i<arr.length; i++){
  			  for(int j = 0; j<arr[i].length; j++){
  				  tmp[i][j] = 0;
  			  }
  		  }
  			
  			for(int i=0;i<arr.length;i++){
  				for(int j=0; j<arr[i].length; j++){
  					 max+=findmax(arr, tmp);
  				}
  			}
  		  
  		  return max;
  	  }
  	
  	private static int findmax(int[][] arr, int[][] tmp) {
  		int tmpmax = 0,flagi = 0,flagj = 0;
  		  for(int i = 0;i<arr.length; i++){
  			  for(int j = 0; j<arr[i].length; j++){
  				  if(arr[i][j]>tmpmax){
  					  tmpmax = arr[i][j];
  					  flagi = i;
  					  flagj = j;
  				  }
  			  }
  		  }
  		  for(int j=0; j<tmp[flagi].length; j++){
  			  if(tmp[flagi][j]==1){
  				  arr[flagi][flagj] = Integer.MIN_VALUE;
  				  tmpmax = 0;
  				  return  tmpmax ;
  			  }
  		  }
  		  for(int i = 0; i<tmp.length;i++){
  			  if(tmp[i][flagj]==1){
  				  arr[flagi][flagj] = Integer.MIN_VALUE;
  				  tmpmax = 0;
  				  return  tmpmax ;
  			  }
  		  }
  		  tmp[flagi][flagj] = 1; 
  		 return  tmpmax ;
  	}
/*******************************************最大矩阵和结束*****************************************/
  	/**
  	 * 数组求交集
  	 * @author 林军雄
  	 * @param a
  	 * @param b
  	 * @return
  	 */
  	public static int[] getUnion(int[] a, int[] b){
		int[] union = new int[100];
		int flag = 0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					union[flag++] = a[i];
					break;
				}
			}
		}
		return union;
	}
/*******************************************数组求交结束*****************************************/
  	/**
	 *	求需要排序的最短子数组长度
	 *	输入：数组arr
	 *	返回：需要排序的最短子数组长度
	 */
	public int getMinSortLength(int[] arr) {
		int MinSortLength = 0;
		int len = arr.length;
		int tmp;
		int lflag = 0;
		int rflag = len-1;
		int b[] = new int[len];
		if(len==0||len==1){
			return MinSortLength;
		}
		for(int i=0; i<len; i++){
			b[i] = arr[i];
		}
		 for(int i=0; i<len; i++){
        	 for(int j=i+1; j<len; j++){
        		 if(b[i]>b[j]){
        			tmp = b[i];
        			b[i] = b[j];
        			b[j] = tmp;
        		 }
        	 }
          }
		 for(int i=0; i<len; i++){
			 if(b[i]!=arr[i]){
				 lflag = i;
				 break;
			 }
		 }
		 for(int j=len-1; j>0; j--){
			 if(b[j]!=arr[j]){
				 rflag = j;
				 break;
			 }
		 }
		 MinSortLength = rflag-lflag+1;
		return MinSortLength;

	}
/*******************************************求需要排序的最短子数组长度结束*****************************************/
	/**
	 *	奇数位上都是奇数或者偶数位上都是偶数
	 *	输入：数组arr，长度大于2
	 *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
	 */
	public void oddInOddEvenInEven(int[] arr) {
		int k=0;
		for(int i=0;i<arr.length; i++){
			if(arr[i]%2==0){
				int tmp = arr[k];
				arr[k] = arr[i];
				arr[i] = tmp;
				k=k+2;
			}
			
			if(i==arr.length-1){
				if(i%2==0){
					if(arr[i]%2==0){
						break;
					}else{
						if(arr[i+1]%2==0){
							arr[i]=arr[i+1];
						}else{
							break;
						}
					}
				}
			}
			if(k>=arr.length){
				break;
			}
		}
	}
/***********************************奇数位上都是奇数或者偶数位上都是偶数结束************************************/	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
