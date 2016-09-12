package common;

/**
 * 八皇后问题，回溯
 * @author 林军雄
 *
 */
/*
 * 问题描述：
 * 8x8格的国际象棋盘上摆放8个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
 */
public class Queen {
	
	static char[][] queen = new char[8][8];
	static int a[] = new int[8] ;
	static int b[] = new int[15];
	static int c[] = new int[15];
	static int iQueenNum = 0;//记录总的棋盘状态数
	
	public static void qu(int i){//参数i代表行
		int iColumn;
		for(iColumn=0; iColumn<8; iColumn++){
			if(a[iColumn]==0&&b[i-iColumn+7]==0&&c[i+iColumn]==0){//如果没有冲突
				queen[i][iColumn] = '@';//放皇后
				a[iColumn] = 1;//标记，下一次该列上不能放皇后
				b[i-iColumn+7] = 1;//标记，下一次该主对角先上不能放皇后
				c[i+iColumn] = 1;//标记，下一次该从对角线上不能放皇后
				if(i<7)qu(i+1);//如果行没有遍历完，进入下一行
				else{//否则输出
					int iLine, tmpColumn;
					System.out.println("第"+(++iQueenNum)+"种状态为：");
					for(iLine=0; iLine<8; iLine++){
						for(tmpColumn=0; tmpColumn<8; tmpColumn++){
							System.out.print(queen[iLine][tmpColumn]+" ");
						}
						System.out.println("");
					}
					System.out.println("*********************************************************");
				}
				//如果前次的皇后放置导致后面的放置无论如何都不能满足要求，则回溯，重置
				queen[i][iColumn] = '*';
				a[iColumn] = 0;
				b[i-iColumn+7] = 0;
				c[i+iColumn] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int iLine, iColumn;
		//棋盘初始化，空格为*，放置皇后的地方为@
		for(iLine=0; iLine<8; iLine++){
			a[iLine] = 0;//列标记初始化，表示无列冲突
			for(iColumn=0; iColumn<8; iColumn++){
				queen[iLine][iColumn] = '*';
			}
		}
		//主，从对角线标记初始化，表示没有冲突
		for(iLine=0; iLine<15; iLine++){
			b[iLine] = c[iLine] = 0;
		}
		qu(0);

	}

}
