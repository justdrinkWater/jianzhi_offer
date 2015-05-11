package problem15;

class ListNode {
	int m_Value;
	ListNode m_Next;
}

public class FindKthToTail {
	public ListNode findKthToTail(ListNode pListHead, int k) {
		if (k <= 0 || pListHead == null)
			throw new RuntimeException("输入的参数有问题");
		ListNode pAhead = pListHead;
		ListNode pBehind = null;
		for (int i = 0; i < k - 1; i++) {
			if (pAhead.m_Next != null)
				pAhead = pAhead.m_Next;
			else// 当k大于链表的长度时
				return null;
		}
		pBehind = pListHead;
		while (pAhead.m_Next != null) {
			pAhead = pAhead.m_Next;
			pBehind = pBehind.m_Next;
		}
		return pBehind;
	}

}
