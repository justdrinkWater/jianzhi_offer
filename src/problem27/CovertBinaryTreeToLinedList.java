package problem27;

class BinaryTreeNode {
	int data;
	BinaryTreeNode m_pLeft;
	BinaryTreeNode m_pRight;
}

class BothLinkedNode {
	int data;
	BothLinkedNode m_pLeft;
	BothLinkedNode m_pRight;
}

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。 要求不能创建任何新的节点，只能调整数中节点的指针的指向。
 * 
 * @author sunwei
 *
 */
public class CovertBinaryTreeToLinedList {

	public BinaryTreeNode convert(BinaryTreeNode pRootOfTree) {
		BinaryTreeNode pLastNodeInList = null;
		converNode(pRootOfTree, pLastNodeInList);

		BinaryTreeNode pHeadOfList = pLastNodeInList;
		while (pHeadOfList != null && pHeadOfList.m_pLeft != null)
			pHeadOfList = pLastNodeInList.m_pLeft;
		return pHeadOfList;
	}

	private void converNode(BinaryTreeNode pNode, BinaryTreeNode pLastNodeInList) {
		if (pNode == null)
			return;
		BinaryTreeNode pCurrent = pNode;

		if (pCurrent.m_pLeft != null)
			converNode(pCurrent.m_pLeft, pLastNodeInList);
		pCurrent.m_pLeft = pLastNodeInList;
		
		if (pLastNodeInList != null)
			pLastNodeInList.m_pRight = pCurrent;
		pLastNodeInList = pCurrent;
		
		if (pCurrent.m_pRight != null)
			converNode(pCurrent.m_pRight, pLastNodeInList);

	}
}
