public class Main {

    private TreeNode root;

    private class TreeNode{
        private  int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root,value);
    }
    public TreeNode insert(TreeNode root, int value){
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }

//    public void inOrder(){
//        inOrder(root);
//    }
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public TreeNode search(TreeNode root, int key){
        if (root == null || root.data == key){
            return root;
        }
        if (key< root.data){
            return search(root.left,key);
        }else {
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {

        Main sll = new Main();
        sll.insert(5);
        sll.insert(3);
        sll.insert(7);
        sll.insert(1);

        sll.inOrder(sll.root);

    }
}