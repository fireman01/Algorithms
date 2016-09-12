package common;

/**
 * 常用排序算法
 * @author 林军雄
 *
 */
/*
 * 问题描述：
 * 对一个整型数组进行排序，排序后数组为非递减
 */
public class Sort {
	
	
	/**
	 * 快速排序
	 *@author 林军雄
	 * @param array  待排序的数组
	 * @param left   起始位置
	 * @param right  终止位置
	 */
	public static void quickSort(int[] array, int left, int right){
		int cutoff = 10;//截止范围
		if(left+cutoff<=right){//在终止范围用快速排序
			int pivot = median3(array, left, right);//标记值
			int i = left;
			int j = right - 1;
			for(;;){
				while(array[++i]<pivot){}
				while(array[--j]>pivot){}
				if(i<j){
					swap(array, i, j);
				}else{
					break;
				}
			}
			swap(array, i, right-1);//交换i和right-1的值
			quickSort(array, left, i-1);//递归前半部分
			quickSort(array, i+1, right);//递归后半部分
		}else{//在终止范围外用插入排序
			insertSort(array);
		}
	}
	/**三值分割法
	 * 避免出现快排的最坏情况
	 * @param array 待排序数组
	 * @param left  起始位置
	 * @param right 终止位置
	 * @return 标记值
	 */
	public static int median3(int[] array, int left,int right){
		int middle = (left+right)/2;
		if(array[middle]<array[left]){
			swap(array,left,middle);
		}
		if(array[right]<array[left]){
			swap(array,left,right);
		}
		if(array[middle]>array[right]){
			swap(array,middle,right);
		}
		swap(array,middle,right-1);
		return array[right-1];
	}
		

	/**
	 * 交换两个位置的值
	 *@author 林军雄
	 * @param array 
	 * @param i
	 * @param j
	 */
	public static final void swap(int[] array,int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
/*************************************快速排序结束****************************************************/

	/**
	 * 直接插入排序
	 * 算法的时间复杂度为O(n*n)
	 *@author 林军雄
	 * @param array 待排序的数组
	 */
	public static  void insertSort(int[] array){
		int j;
		for(int i=1; i<array.length; i++){
			if(array[i]<array[i-1]){//出现递减序列
				int temp = array[i];//临时变量储存
				for(j=i; j>0; j--){//找到插入的位置，元素往后移动
					if(temp<array[j-1]){
						array[j] = array[j-1];
					}else{
						break;
					}
				}
				array[j] = temp;//插入
			}
		}
	}
/*************************************直接插入排序结束****************************************************/	
	
	/**
	 * 折半插入排序时间复杂度为O(nlogn)
	 *@author 林军雄
	 * @param array 待排序数组
	 */
	public static void bineryInsSort(int[] array){
		
		int temp;
		int left;
		int right;
		for(int i=0; i<array.length; i++){
			left = 0;
			right = i-1;
			temp = array[i];
			while(left<=right){
				int middle = (left+right)/2;
				if(temp<array[middle]){
					right = middle - 1;
				}else{
					left = middle + 1;
				}
			}
			for(int j=i-1; j>=left; j--){
				array[j+1] = array[j];
			}
			array[left] = temp;
		}
		
	}
/*************************************折半插入排序结束****************************************************/	
	
	/**
	 * 希尔排序
	 * 最快的平均时间复杂度能达到O(n的7/6次方)
	 *@author 林军雄
	 * @param array 待排序的数组
	 */
	public static void shellSort(int[] array){
		int j;
		for(int gap=array.length/2; gap>0; gap/=2){//步长因子为原长的一半
			for(int i=gap; i<array.length; i++){
				int temp = array[i];
				for(j=i; j>=gap; j-=gap){
					if(temp<array[j-gap]){//出现递减序列,进行插入排序
						array[j] = array[j-gap];
					}else{
						break;
					}
				}
				array[j] = temp;//插入
			}
		}
	}
/*************************************希尔排序结束****************************************************/
	
	/**
	 * 堆排序
	 *@author 林军雄
	 * @param array
	 */
	public static void heapSort(int[] array){
		for(int i=array.length/2; i>=0; i--){//建立最大堆
			filterDown(array, i, array.length-1);//自顶向下调整
		}
		for(int i=array.length-1; i>0; i--){
			swap(array, 0, i);
			filterDown(array, 0, i-1);
		}
	}
	/**
	 * 自顶向下调整堆
	 *@author 林军雄
	 * @param array 待排序的数组
	 * @param i 
	 * @param length
	 */
	public static void filterDown(int[] array, int i, int length){
		int current = i; //当前的位置
		int child = 2*i+1; //子节点
		int tmp = array[i]; 
		while(child<=length){
			if(child+1<length&&array[child]<array[child+1]){
				child = child + 1;//选两个子女中比较大的
			}
			if(tmp>=array[child]){
				break;
			}else{
				array[current] = array[child];//大的往上移
				current = child;//向下继续调整
				child = 2*child+1;
			}
		}
		array[current] = tmp;//回放到合适的位置
	}
/*************************************堆排序结束****************************************************/
	
	/**
	 * 归并排序
	 *@author 林军雄
	 * @param array 待排序的数组
	 * @param tmpArray  临时数组
	 * @param left  起始位置
	 * @param right 终止位置
	 */
	public static void mergeSort(int[] array, int[] tmpArray, int left, int right){
		if(left<right){
			int middle = (left+right)/2;
			mergeSort(array,tmpArray,left,middle);
			mergeSort(array,tmpArray,middle,right);
			merge(array,tmpArray,left,middle+1,right);
		}
	}
	/**
	 * 归并
	 *@author 林军雄
	 * @param array 待排序的数组
	 * @param tmpArray 临时的数组
	 * @param leftPos 起始位置
	 * @param rightPos 右边的起点
	 * @param rightEnd 终止位置
	 */
	public static void merge(int[] array, int[] tmpArray, int leftPos, int rightPos, int rightEnd){
		int leftEnd = rightPos - 1; //左边的终止位置
		int tmpPos = leftPos; //起始位置
		int numElements = rightEnd - leftPos + 1; //元素个数
		while(leftPos<=leftEnd&&rightPos<=rightEnd){//按顺序把左右各部分的元素放进临时数组中
			if(array[leftPos]<array[rightPos]){
				tmpArray[tmpPos++] = array[leftPos++];
			}else{
				tmpArray[tmpPos++] = array[rightPos++];
			}
		}
		while(leftPos<=leftEnd){//左边的有剩余的则继续放进临时数组中
			tmpArray[tmpPos++] = array[leftPos++];
		}
		while(rightPos<=rightEnd){//右边的有剩余的则继续放进临时数组中
			tmpArray[tmpPos++] = array[rightPos++];
		}
		
		for(int i=0; i<numElements; i++,rightEnd--){
			array[rightEnd] = tmpArray[rightEnd];//把临时数组的拷贝到原数组中
		}
	}
/*************************************归并排序结束****************************************************/	
	
	/**
	 * 桶排序(满足两个条件：1、数组元素为非负整数，2、上界为maxItem)
	 *@author 林军雄
	 * @param array 待排序的数组
	 * @param arraySize  数组长度
	 * @param maxItem  数组上界
	 */
	public static void BucketSort(int[] array, int arraySize, int maxItem)    
	{    
	    int Count[] = new int[maxItem+1];    
	    // 置空    
	    for (int i = 0; i <= maxItem; ++i)    
	    {    
	        Count[i] = 0;    
	    }    
	    // 遍历待排序数组    
	    for (int i = 0; i < arraySize; ++i)    
	    {    
	        ++Count[array[i]];    
	    }    
	    
	    // 桶排序输出    
	    // 也可以存储在数组中，然后返回数组    
	    int flag = 0;
	    for (int i = 0; i <= maxItem; ++i)    
	    {    
	        for (int j = 1; j <= Count[i]; ++j)    
	        {    
	        	array[flag++] = i;
//	           System.out.println(i);    
	        }    
	    }    
	}    
/*************************************桶排序结束****************************************************/		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] array = {51,2,5,14,3,6,7,8,9,23,36,24,44,17};
//		heapSort(array);
		BucketSort(array,array.length,51);
//		quickSort(array, 0, array.length-1);
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}

	}

}
