package problem16;

class ListNode {
	int m_nKey;// 节点的值
	ListNode m_pNext;// 下一个节点
}

/**
 * 反转链表
 * @author sunwei
 *
 */
public class ConvertLinkedList {
	private ListNode pHead;

	public ConvertLinkedList(ListNode pHead) {
		if (pHead != null) {
			this.pHead = pHead;
		} else {
			System.out.println("输入的链表为空");
		}
	}

	/**
	 * 需要三个指针，一个指向当前节点，一个指向前一个节点，一个保存后一个节点
	 * 当反转时，
	 * 1.需要判断当前节点的后一个节点是否为空，如果为空，则当前节点为反转
	 * 	   之前的最后一个节点，现在则是反转之后的头结点
	 * 2.当前节点指向前一节点，
	 * 3.前一节点变成当前节点
	 * 4.当前节点办成后一个节点
	 * @return
	 */
	public ListNode convert() {
		ListNode pReversedHead = null;
		ListNode pNode = pHead;
		ListNode pPrev = null;
		while (pNode != null) {
			ListNode pNext = pNode.m_pNext;
			if (pNext == null)
			//1.需要判断当前节点的后一个节点是否为空，如果为空，则当前节点为反转
			//之前的最后一个节点，现在则是反转之后的头结点
				pReversedHead = pNode;
			//2.当前节点指向前一节点，
			pNode.m_pNext = pPrev;
			//3.前一节点变成当前节点
			pPrev = pNode;
			//4.当前节点办成后一个节点
			pNode = pNext;
		}
		return pReversedHead;
	}

}
