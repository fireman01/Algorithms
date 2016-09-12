package trees;

/**
 * 二叉树常见问题
 * @author ljx
 *
 */
public class TreeNode {
	
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
/*****************************二叉树定义结束***********************************/	
	/**
	 * 二叉树排序
	 *@author 林军雄
	 * @param root
	 * @return
	 */
	/*
	 * 问题描述：
	 * 对一棵二叉树进行排序，使其左子树小于根节点，右子树大于根节点
	 */
	public static TreeNode sort(TreeNode root){
		if(root==null){
			return null;
		}else{
			if(root.left.value>root.value){
				int tmp = root.left.value;
				root.left.setValue(root.value);
				root.setValue(tmp);
				sort(root.left);
			}if(root.right.value<root.value){
				int temp = root.right.value;
				root.right.setValue(root.value);
				root.setValue(temp);
				sort(root.right);
			}
		}
		return root;
	}
/**********************************二叉树排序结束**************************************/	
	/**
	 * 求最大路径和
	 * 问题描述：求根节点到叶子节点的一条路径上的最大和
	 *@author 林军雄
	 * @param root
	 * @return
	 */
	public static int maxPathSum(TreeNode root){
		sort(root);
	  int maxPathSum = root.value;
	  maxPathSum+=maxRightPathSum(root);
	  maxPathSum+=maxRightPathSum(root.left);
	     return maxPathSum;
	    
	}
	
	public static int maxRightPathSum(TreeNode root){
		int  maxRight = 0;
	    if(root.right!=null){
	    	maxRight+=root.right.value;
	    	maxPathSum(root.right);
	    }
	    return maxRight;
	}
/**********************************求二叉树的最大路径和结束**************************************/
	
	 /**
	  * 返回二叉树的最大深度
	  * 问题描述：求二叉树的最大深度
	 *@author 林军雄
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
	        if(root==null){
	          return 0;
	        }
	         return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	      }
/**********************************求二叉树的最大深度结束**************************************/		
	
	/**
	 * 求二叉树的最小值
	 * 问题描述：求二叉树的最小值
	 *@author 林军雄
	 * @param t
	 * @return
	 */
	public int getMinValue(TreeNode t){
		int min = t.value;
		if(t.value>t.left.value){
			min = getMinValue(t.left);
		}
		if(t.value>t.right.value){
			min = getMinValue(t.right);
		}
		return min;
	}
/**********************************求二叉树的最小值结束**************************************/	
	
	/**
	 * 求二叉树的最大值
	 * 问题描述：求二叉树的最大值
	 *@author 林军雄
	 * @param t
	 * @return
	 */
	public int getMaxValue(TreeNode t){
		int max = t.value;
		if(t.value<t.left.value){
			max = getMaxValue(t.left);
		}
		if(t.value<t.right.value){
			max = getMaxValue(t.right);
		}
		return max;
	}
/**********************************求二叉树的最大值结束**************************************/		
	/**
	 * 求二叉树的最大值和最小值的差
	 * 问题描述： 对二叉树的所有节点，返回其最大的差值
	 *@author 林军雄
	 * @param t
	 * @return
	 */
	public int getMaxMinValue(TreeNode t){
		
		return getMaxValue(t)-getMinValue(t);
		
	}
/**********************************求二叉树的最大差值结束**************************************/
	/**
	 * 查找值所在二叉树的层数
	 * 问题描述： 在二叉树中查找一个值，并返回所在的层数，未找到则返回1
	 *@author 林军雄
	 * @param root
	 * @param val
	 * @return
	 */
	public static int find(TreeNode root, int val){
	   if(root==null){
		   return 0;
	   }
	   int result = 1;
	   if(root.value!=val){
		   result++;
		   if(root.left!=null){
			   find(root.left,val);
		   }
		   if(root.right!=null){
			   find(root.right,val);
		   }
	   }
	   return result;
    }
/**********************************查找值所在二叉树的层数结束**************************************/	
	 
	/**
	 * 求根节点到叶子节点的和
	 *@author 林军雄
	 * @param root
	 * @return
	 */
	/* 
	 * 问题描述：
	 *  Given a binary tree containing digits from0-9only, each root-to-leaf path could 
	 *  represent a number. An example is the root-to-leaf path1->2->3which represents the number123.
     *  Find the total sum of all...
	 */
	public int sumNumbers(TreeNode root) {
		  int sum = 0;
	        sum = addNumbers(root, 0);
	        return sum;
	    }
    public int addNumbers(TreeNode root, int sum) {
    	  if ( root == null ) return 0;
    	    if ( root.left == null && root.right == null )
    	    return sum * 10 + root.value;
    	    return addNumbers(root.left, sum * 10 + root.value) + addNumbers(root.right, sum * 10 + root.value); 
    }
/**********************************求根节点到叶子节点的和结束****************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
