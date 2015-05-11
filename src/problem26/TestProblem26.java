package problem26;

public class TestProblem26 {
	public static void main(String[] args) {
		ComplexListNode pHead = new ComplexListNode();
		pHead.data = 0;
		ComplexListNode pNode1 = new ComplexListNode();
		pNode1.data = 1;
		ComplexListNode pNode2 = new ComplexListNode();
		pNode2.data = 2;
		ComplexListNode pNode3 = new ComplexListNode();
		pNode3.data = 3;
		ComplexListNode pNode4 = new ComplexListNode();
		pNode4.data = 4;

		pHead.m_pNext = pNode1;
		pNode1.m_pNext = pNode2;
		pNode2.m_pNext = pNode3;
		pNode3.m_pNext = pNode4;
		pNode4.m_pNext = null;

		pHead.m_pSibling = pNode2;
		pNode1.m_pSibling = pNode3;
		pNode3.m_pSibling = pNode1;

		ComplexListNode copyNode = new CopyLinkedList(pHead).copy();
		while (copyNode != null) {
			System.out.println(copyNode.data);
			copyNode = copyNode.m_pNext;
		}

	}

}
