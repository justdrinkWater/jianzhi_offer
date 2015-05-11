package problem17;

class ListNode {
	int m_nValue;
	ListNode m_pNext;
}

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是按照递增排序的。
 * 
 * @author sunwei
 *
 */

public class CombineOrderedLinkedList {

	/**
	 * 采用递归的方式
	 * @param nodeHead1
	 * @param nodeHead2
	 * @return
	 */
	public ListNode combine(ListNode nodeHead1, ListNode nodeHead2) {
		if (nodeHead1 == null)
			return nodeHead2;
		if (nodeHead2 == null)
			return nodeHead1;
		ListNode pMergedHead = null;
		if (nodeHead1.m_nValue < nodeHead2.m_nValue) {
			pMergedHead = nodeHead1;
			pMergedHead.m_pNext = combine(nodeHead1.m_pNext, nodeHead2);
		} else {
			pMergedHead = nodeHead2;
			pMergedHead.m_pNext = combine(nodeHead1, nodeHead2.m_pNext);
		}
		return pMergedHead;
	}
}
