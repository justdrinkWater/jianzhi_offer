package problem18;

public class TestProblem18 {
	public static void main(String[] args) {
		//测试
		/**
		 *				 8				 8
		 *			   /   \		   /  \
		 *			  8     7		  9    2
		 *			/   \
		 *		   9     2
		 *				/ \
		 *			   4   7
		 *
		 */
		//正常的输入，是子结构
		BinaryTreeNode pRoot1 = new BinaryTreeNode();
		pRoot1.m_Value = 8;
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
		pRoot1.m_pLeft = node1_1;
		pRoot1.m_pRight = node1_2;
		
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
		
		BinaryTreeNode pRoot2 = new BinaryTreeNode();
		pRoot2.m_Value = 8;
		BinaryTreeNode node2_1 = new BinaryTreeNode();
		node2_1.m_Value = 9;
		BinaryTreeNode node2_2 = new BinaryTreeNode();
		node2_2.m_Value = 2;
		
		pRoot2.m_pLeft = node2_1;
		pRoot2.m_pRight = node2_2;
		
		node2_1.m_pLeft = null;
		node2_1.m_pRight = null;
		
		node2_2.m_pLeft = null;
		node2_2.m_pRight = null;
		
		System.out.println(new ChildPartOfTree().verify(pRoot1, pRoot2));
		
		//正常的输入，不是子结构
		BinaryTreeNode pRoot3 = new BinaryTreeNode();
		pRoot3.m_Value = 8;
		BinaryTreeNode node3_1 = new BinaryTreeNode();
		node3_1.m_Value = 9;
		BinaryTreeNode node3_2 = new BinaryTreeNode();
		node3_2.m_Value = 4;
		
		pRoot3.m_pLeft = node3_1;
		pRoot3.m_pRight = node3_2;
		
		node3_1.m_pLeft = null;
		node3_1.m_pRight = null;
		node3_2.m_pLeft = null;
		node3_2.m_pRight = null;		
		System.out.println(new ChildPartOfTree().verify(pRoot1, pRoot3));
		
		//输入的是空值
		System.out.println(new ChildPartOfTree().verify(pRoot1, null));
		
	}
}
