package problem19;


public class TestProblem19 {
	public static void main(String[] args) {
		//测试
				/**
				 *				 8	
				 *			   /   \		
				 *			  8     7		 
				 *			/   \
				 *		   9     2
				 *				/ \
				 *			   4   7
				 *
				 */
		BinaryTreeNode pRoot = new BinaryTreeNode();
		pRoot.m_Value = 8;
		BinaryTreeNode node1_1 = new BinaryTreeNode();
		node1_1.m_Value = 8;
		BinaryTreeNode node1_2 = new BinaryTreeNode();
		node1_2.m_Value = 7;
		BinaryTreeNode node1_3 = new BinaryTreeNode();
		node1_3.m_Value = 9;
		BinaryTreeNode node1_4 = new BinaryTreeNode();
		node1_4.m_Value = 2;
		BinaryTreeNode node1_5 = new BinaryTreeNode();
		node1_5.m_Value = 4;
		BinaryTreeNode node1_6 = new BinaryTreeNode();
		node1_6.m_Value = 7;
		pRoot.m_pLeft = node1_1;
		pRoot.m_pRight = node1_2;

		node1_1.m_pLeft = node1_3;
		node1_1.m_pRight = node1_4;

		node1_2.m_pLeft = null;
		node1_2.m_pRight = null;

		node1_3.m_pLeft = null;
		node1_3.m_pRight = null;

		node1_4.m_pLeft = node1_5;
		node1_4.m_pRight = node1_6;

		node1_5.m_pLeft = null;
		node1_5.m_pRight = null;

		node1_6.m_pLeft = null;
		node1_6.m_pRight = null;

		System.out.println("反转前。。。。。");
		printperOrder(pRoot);

		new BinaryTreeMirrorRecursively().mirrorRecursive(pRoot);

		System.out.println("反转后。。。。");
		printperOrder(pRoot);
	}

	public static void printperOrder(BinaryTreeNode pRoot) {
		if (pRoot != null) {
			System.out.println(pRoot.m_Value);
			printperOrder(pRoot.m_pLeft);
			printperOrder(pRoot.m_pRight);
		}
	}

}
