 class Node{
    int data;
    Node left;
    Node right;
    //call constructor
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryHeight{
    // public static int treeHeight(Node root){
    //     //base case 
    //     if(root ==null){
    //         return 0;
    //     }
    //     int leftpart =treeHeight(root.left);
    //     int Rightpart = treeHeight(root.right);

    //     int ans = Math.max(leftpart, Rightpart)+1;
    //     return ans;
    // }
    // public static int countNodes(Node root){
    //     //base case 
    //     if(root==null){
    //         return 0;
    //     }
    //     int Left_Count = countNodes(root.left);
    //     int Right_Count = countNodes(root.right);

    //     int ans = Left_Count+Right_Count+1;

    //     return  ans;  
    // }
    public static int sum(Node root){
        //base case 
        if(root==null){
            return 0;
        }
        //call recursively for right and left portion to cal the sum 
        int left_Sum = sum(root.left);
        int right_Sum = sum(root.right);

        int ans = left_Sum+right_Sum+root.data;
        return ans;
    }
    public static void main(String[] args){
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(1);
        root.right.left =new Node(4);
        root.right.right =new Node(5);
       System.out.println("Sum is "+ sum(root));
    }
}