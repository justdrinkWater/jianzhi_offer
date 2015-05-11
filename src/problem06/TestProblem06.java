package problem06;

public class TestProblem06 {
	public static void main(String[] args) {
		int[] preOrder = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] inOrder = { 4, 7, 2, 1, 5, 3, 8, 6 };
		BinaryTreeNode t_root = new ReconstructBinaryTree(preOrder, inOrder)
				.reconstruct(8);
		printInOrder(t_root);
		
		/**
		 *			 1
		 *	   	   /   \
		 *	       2     3
		 *	      /     / \
		 *	     4     5   6
		 *	      \       /
		 *	       7     8
		 */
		/*BinaryTreeNode root = new BinaryTreeNode();
		root.t_data = 1;
		BinaryTreeNode node2 = new BinaryTreeNode();
		node2.t_data = 2;
		BinaryTreeNode node3 = new BinaryTreeNode();
		node3.t_data = 3;
		BinaryTreeNode node4 = new BinaryTreeNode();
		node4.t_data = 4;
		BinaryTreeNode node5 = new BinaryTreeNode();
		node5.t_data = 5;
		BinaryTreeNode node6 = new BinaryTreeNode();
		node6.t_data = 6;
		BinaryTreeNode node7 = new BinaryTreeNode();
		node7.t_data = 7;
		BinaryTreeNode node8 = new BinaryTreeNode();
		node8.t_data = 8;
		
		root.t_leftNode = node2;
		root.t_rightNode = node3;
		
		node2.t_leftNode = node4;
		node4.t_rightNode = node7;
		node3.t_leftNode = node5;
		node3.t_rightNode = node6;
		node6.t_leftNode = node8;
		printperOrder(root);*/
	}

	//中序遍历  左中右
	public static void printInOrder(BinaryTreeNode p_root) {
		if(p_root != null){
			printInOrder(p_root.t_leftNode);
			System.out.print(p_root.t_data);
			printInOrder(p_root.t_rightNode);
		}
	}
	//前序遍历 中左右
	public static void printPerOrder(BinaryTreeNode p_root){
		if(p_root != null){
			System.out.print(p_root.t_data);
			printPerOrder(p_root.t_leftNode);
			printPerOrder(p_root.t_rightNode);
		}
	}
	//后序遍历 左右中
	public static void printAftOrder(BinaryTreeNode p_root){
		if(p_root != null){
			printPerOrder(p_root.t_leftNode);
			printPerOrder(p_root.t_rightNode);
			System.out.print(p_root.t_data);
		}
	}

}
