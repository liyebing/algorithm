package tree;

/**
 * @author liyebing created on 18/8/29.
 * @version v1.0
 */
public class TreeNode<T> {
    //节点值
    private T element;
    //第一个子节点
    private TreeNode<T> firstChild;
    //兄弟节点
    private TreeNode<T> nextSibling;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public TreeNode<T> getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(TreeNode<T> firstChild) {
        this.firstChild = firstChild;
    }

    public TreeNode<T> getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(TreeNode<T> nextSibling) {
        this.nextSibling = nextSibling;
    }
}
