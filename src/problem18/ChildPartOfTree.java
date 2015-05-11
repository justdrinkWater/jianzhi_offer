package problem18;

class BinaryTreeNode {
	int m_Value;
	BinaryTreeNode m_pLeft;
	BinaryTreeNode m_pRight;
}

/**
 * 输入两颗二叉树A和B，判断B是不是A的子结构
 * 
 * @author sunwei
 *
 */
public class ChildPartOfTree {
	/**
	 * 判断一个二叉树是否是另一个二叉树的子树，需要分两步：
	 * 第一步：找到相等的结点，
	 * 第二步：从这个结点开始，依次遍历左右子树，判断是否是这个树的子树
	 * @param pRoot1
	 * @param pRoot2
	 * @return
	 */
	public boolean verify(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
		boolean result = false;
		if (pRoot1 != null && pRoot2 != null) {
			// 找到相等的结点，然后用verify2()方法判断是否是子结构
			if (pRoot1.m_Value == pRoot2.m_Value)
				result = verify2(pRoot1, pRoot2);
			if (!result)
				result = verify(pRoot1.m_pLeft, pRoot2);
			if (!result)
				result = verify(pRoot1.m_pRight, pRoot2);
		}

		return result;
	}

	private boolean verify2(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
		if (pRoot2 == null)
			return true;
		if (pRoot1 == null)
			return false;
		if (pRoot1.m_Value != pRoot2.m_Value)
			return false;
		return verify2(pRoot1.m_pLeft, pRoot2.m_pLeft)
				&& verify2(pRoot1.m_pRight, pRoot2.m_pRight);
	}

}
