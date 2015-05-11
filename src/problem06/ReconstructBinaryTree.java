package problem06;

class BinaryTreeNode {
	int t_data;
	BinaryTreeNode t_leftNode;
	BinaryTreeNode t_rightNode;
}
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建二叉树。
 * 假如输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1，2，4，7，3，5，6，8}和中序遍历序列
 * {4，7，2，1，5，3，8，6}，则重建出二叉树并输出它的头结点
 * 			 1
 * 		   /   \
 *        2     3
 *       /     / \
 *      4     5   6
 *       \       /
 *        7     8
 * @author sunwei
 *
 */
public class ReconstructBinaryTree {
	private int[] perOrder;
	private int[] inOrder;

	public ReconstructBinaryTree(int[] perOrder, int[] inOrder) {
		this.perOrder = perOrder;
		this.inOrder = inOrder;
	}

	public BinaryTreeNode reconstruct(int length) {
		if (perOrder == null || inOrder == null || length <= 0)
			return null;
		return constructCore(0, perOrder.length - 1, 0, inOrder.length - 1);
	}

	private BinaryTreeNode constructCore(int startPerOrder, int endPreOrder,
			int startInOrder, int endInOrder) {
		// 前序遍历第一个是结点
		int rootValue = perOrder[startPerOrder];
		BinaryTreeNode root = new BinaryTreeNode();
		root.t_data = rootValue;
		root.t_leftNode = root.t_rightNode = null;

		if (startPerOrder == endPreOrder) {
			if (startInOrder == endInOrder
					&& perOrder[startPerOrder] == inOrder[startInOrder])
				return root;
			else
				throw new RuntimeException("输入的序列不合法！！");
		}

		// 在中序遍历中找到根节点的值
		int rootInOrderIndex = startInOrder;
		while (rootInOrderIndex <= endInOrder
				&& inOrder[rootInOrderIndex] != rootValue)
			++rootInOrderIndex;

		if (rootInOrderIndex == endInOrder
				&& inOrder[rootInOrderIndex] != rootValue)
			throw new RuntimeException("输入的序列不合法！！");
		int leftLength = rootInOrderIndex - startInOrder;
		int leftPreOrderEnd = startPerOrder + leftLength;
		if (leftLength > 0) {
			// 构建左子树
			root.t_leftNode = constructCore(startPerOrder + 1, leftPreOrderEnd,
					startInOrder, rootInOrderIndex - 1);
		}
		if (leftLength < endPreOrder - startPerOrder) {
			// 构建右子树
			root.t_rightNode = constructCore(leftPreOrderEnd + 1, endPreOrder,
					rootInOrderIndex + 1, endInOrder);
		}
		return root;
	}

}