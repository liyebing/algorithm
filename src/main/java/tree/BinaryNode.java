package tree;

/**
 * 二叉树节点
 *
 * @author liyebing created on 18/8/29.
 * @version v1.0
 */
public class BinaryNode<T> {
    private T element;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
}
