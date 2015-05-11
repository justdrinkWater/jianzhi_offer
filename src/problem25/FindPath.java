package problem25;

import java.util.Stack;

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}

/**
 * 输入一个二叉树和一个数，找出这个二叉树中从根节点到叶节点和为这个数的路径并打印出来
 * 
 * @author sunwei
 *
 */
public class FindPath {
	public void findPath(BinaryTreeNode pRoot, int exceptedsum) {
		if (pRoot == null)
			return;
		Stack<Integer> stack = new Stack<Integer>();
		int currentSum = 0;
		findPath(pRoot, exceptedsum, stack, currentSum);
	}

	private void findPath(BinaryTreeNode pRoot, int exceptedSum,
			Stack<Integer> stack, int currentSum) {
		currentSum += pRoot.data;
		stack.push(pRoot.data);

		// 判断是否为叶子节点
		boolean isLeaf = pRoot.leftNode == null && pRoot.rightNode == null;
		// 如果是叶子节点并且当前的和是输入的树，则打印栈中的内容
		if (currentSum == exceptedSum && isLeaf) {
			System.out.println("A path is found");
			for (Integer integer : stack)
				System.out.print(integer + "\t");
			System.out.println();
		}
		// 如果不是叶节点，则遍历它的左孩子节点或右孩子节点
		if (pRoot.leftNode != null)
			findPath(pRoot.leftNode, exceptedSum, stack, currentSum);
		if (pRoot.rightNode != null)
			findPath(pRoot.rightNode, exceptedSum, stack, currentSum);
		// 在返回到父节点之前，在路径上删除当前节点，并在currentSum中减去当前节点的值
		currentSum -= pRoot.data;
		stack.pop();
	}

}
