package problem13;


class ListNode{
	int m_Value;
	ListNode m_pNext;
}

/**
 * 给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间内删除该
 * 结点
 * @author sunwei
 *
 */
public class DeleteListNodeInO1 {

	public void deleteNode(ListNode pHead,ListNode pToDeleteNode){
		//头结点为空或者要删除的结点为空
		if(pHead == null || pToDeleteNode == null)
			return;
		//要删除的节点不是尾结点
		if(pToDeleteNode.m_pNext != null){
			ListNode pNext = pToDeleteNode.m_pNext;
			pToDeleteNode.m_Value = pNext.m_Value;
			pToDeleteNode.m_pNext = pNext.m_pNext;
			pNext = null;
		}
		//链表只有一个节点，删除头结点（也是尾结点）
		else if(pHead == pToDeleteNode){
			pToDeleteNode = null;
			pHead = null;
		}
		//链表有多个节点，删除的是尾结点
		else{
			ListNode pNode = pHead;
			//找到需要删除结点（尾结点）的前一个结点
			while( pToDeleteNode != pNode.m_pNext){
				pNode = pNode.m_pNext;
			}
			pNode.m_pNext = null;
			pToDeleteNode = null;
		}
	}
}
