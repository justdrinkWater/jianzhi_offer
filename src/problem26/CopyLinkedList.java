package problem26;

class ComplexListNode {
	int data;
	ComplexListNode m_pNext;
	ComplexListNode m_pSibling;
}

/**
 * 复杂链表的拷贝
 * 
 * @author sunwei
 *
 */
public class CopyLinkedList {
	private ComplexListNode pHead;

	public CopyLinkedList(ComplexListNode pHead) {
		if (pHead != null) {
			this.pHead = pHead;
		} else {
			System.out.println("输入的链表头节点有错误！！");
		}
	}

	// 1.首先拷贝每个节点放在每个节点的后面
	public ComplexListNode copy() {
		ComplexListNode pNode = pHead;
		while (pNode != null) {
			ComplexListNode copyNode = new ComplexListNode();
			copyNode.data = pNode.data;
			copyNode.m_pNext = pNode.m_pNext;
			pNode.m_pNext = copyNode;
			pNode = pNode.m_pNext.m_pNext;
		}
		return copym_pSiblig();
	}

	// 2.接着拷贝节点的m_pSibling
	public ComplexListNode copym_pSiblig() {
		ComplexListNode pNode = pHead;
		while (pNode != null) {
			if (pNode.m_pSibling != null)
				pNode.m_pNext.m_pSibling = pNode.m_pSibling.m_pNext;
			pNode = pNode.m_pNext.m_pNext;
		}
		return divide();
	}

	// 3.再将复制后的链表分开
	public ComplexListNode divide() {
		ComplexListNode pNode = pHead.m_pNext;
		ComplexListNode pCopyHead = null;
		ComplexListNode pCopyNode = null;
		if (pNode != null) {
			pCopyHead = pCopyNode = pNode;
		}
		while (pCopyNode.m_pNext != null) {
			pNode.m_pNext = pCopyNode.m_pNext;
			pNode = pCopyNode.m_pNext;
			pCopyNode.m_pNext = pNode.m_pNext;
			pCopyNode = pNode.m_pNext;
		}
		return pCopyHead;
	}
}
