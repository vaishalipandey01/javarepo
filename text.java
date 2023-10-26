public class text{
    static class Node{
        int data;
        Node left;   //define variables
        Node right;   //node is like int and all
         Node(int data){
            this.data=data;
            this.left = null;
            this.right =null;

         } 

    }
    static class BinaryTree{
        static int  idx = -1;
        public static Node createtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null ;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = createtree(nodes);
            newNode.right = createtree(nodes);
            return newNode;
        }
    }

public static void main(String args[]){
    int nodes[]= { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.createtree(nodes);
    System.out.println(root.data);
}
}
    

 