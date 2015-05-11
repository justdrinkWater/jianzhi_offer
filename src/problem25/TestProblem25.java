package problem25;

public class TestProblem25 {
	public static void main(String[] args) {
		BinaryTreeNode pRoot = new BinaryTreeNode();
		BinaryTreeNode leftNode1_1 = new BinaryTreeNode();
		BinaryTreeNode rightNode1_2 = new BinaryTreeNode();
		BinaryTreeNode leftNode2_1 = new BinaryTreeNode();
		BinaryTreeNode rightNode2_2 = new BinaryTreeNode();
		leftNode2_1.data = 4;
		rightNode2_2.data = 7;
		leftNode1_1.data = 5;
		leftNode1_1.leftNode = leftNode2_1;
		leftNode1_1.rightNode = rightNode2_2;
		rightNode1_2.data = 12;
		pRoot.data = 10;
		pRoot.leftNode = leftNode1_1;
		pRoot.rightNode = rightNode1_2;
		new FindPath().findPath(pRoot, 22);
	}
}
