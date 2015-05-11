package problem19;

class BinaryTreeNode {
	int m_Value;
	BinaryTreeNode m_pLeft;
	BinaryTreeNode m_pRight;
}

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 * 
 * @author sunwei
 *
 */
public class BinaryTreeMirrorRecursively {

	/**
	 * 自己的想法
	 * 
	 * @param pRoot
	 */
	public void mirrorRecursively(BinaryTreeNode pRoot) {
		if (pRoot == null)
			throw new RuntimeException("输入的根结点为空");
		mirrorRecursively2(pRoot);

	}

	public void mirrorRecursively2(BinaryTreeNode pRoot) {
		if (pRoot.m_pLeft != null && pRoot.m_pRight != null) {
			BinaryTreeNode node = pRoot.m_pLeft;
			pRoot.m_pLeft = pRoot.m_pRight;
			pRoot.m_pRight = node;
			mirrorRecursively2(pRoot.m_pLeft);
			mirrorRecursively2(pRoot.m_pRight);

		}
		if (pRoot.m_pLeft == null && pRoot.m_pRight != null) {
			pRoot.m_pLeft = pRoot.m_pRight;
			mirrorRecursively2(pRoot.m_pRight);
		}
		if (pRoot.m_pLeft != null && pRoot.m_pRight == null) {
			pRoot.m_pRight = pRoot.m_pLeft;
			mirrorRecursively2(pRoot);
		}
	}

	/**
	 * 书上的
	 */
	public void mirrorRecursive(BinaryTreeNode pRoot) {
		if (pRoot == null || pRoot.m_pLeft == null && pRoot.m_pRight == null)
			return;
		BinaryTreeNode temp = pRoot.m_pLeft;
		pRoot.m_pLeft = pRoot.m_pRight;
		pRoot.m_pRight = temp;

		if (pRoot.m_pLeft != null)
			mirrorRecursive(pRoot.m_pLeft);
		if (pRoot.m_pRight != null)
			mirrorRecursive(pRoot.m_pRight);
	}
}
