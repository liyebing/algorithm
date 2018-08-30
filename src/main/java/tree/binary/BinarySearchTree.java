package tree.binary;

/**
 * 二叉查找树
 *
 * @author liyebing created on 18/8/30.
 * @version v1.0
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private static class BinaryNode<T> {
        public BinaryNode(T theElement) {
            this(theElement, null, null);
        }

        public BinaryNode(T theElement, BinaryNode<T> lt, BinaryNode<T> rt) {
            this.element = theElement;
            this.left = lt;
            this.right = rt;
        }

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


    private BinaryNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public boolean contains(T x) {
        return contains(x, root);
    }

    public T findMin() {
        if (isEmpty())
            throw new RuntimeException();
        return findMin(root).element;
    }

    public T findMax() {
        if (isEmpty())
            throw new RuntimeException();
        return findMax(root).element;
    }

    public void insert(T x) {
        this.root = insert(x, root);
    }

    public void remove(T x) {
        //this.root = remove(x, root);
    }

    public void printTree() {

    }

    private boolean contains(T x, BinaryNode<T> t) {
        if (t == null) {
            return false;
        }

        int compareResult = x.compareTo(t.element);
        if (compareResult < 0) {
            return contains(x, t.left);
        } else if (compareResult > 0) {
            return contains(x, t.right);
        } else {
            return true;
        }
    }

    private BinaryNode<T> findMin(BinaryNode<T> t) {
        if (t == null) {
            return null;
        } else if (t.left == null) {
            return t;
        }
        return findMin(t.left);
    }

    private BinaryNode<T> findMax(BinaryNode<T> t) {
        if (t == null) {
            return null;
        } else if (t.right == null) {
            return t;
        }
        return findMax(t.right);
    }

    private BinaryNode<T> insert(T x, BinaryNode<T> t) {
        if (t == null) {
            return new BinaryNode<T>(x, null, null);
        }
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0) {
            t.left = insert(x, t.left);
        } else if (compareResult > 0) {
            t.right = insert(x, t.right);
        } else
            ;
        return t;
    }

//    private BinaryNode<T> remove(T x, BinaryNode<T> t) {
//
//    }


    public static void main(String[] args) {
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<Integer>();
        searchTree.insert(1);
        searchTree.insert(4);
        searchTree.insert(6);
        searchTree.insert(3);
        searchTree.insert(2);
        searchTree.insert(5);

        System.out.println(searchTree.contains(3));
        System.out.println(searchTree.findMax());
        System.out.println(searchTree.findMin());
    }
}
