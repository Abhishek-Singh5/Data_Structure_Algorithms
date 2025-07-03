Given a binary tree having n nodes. Check whether all of its nodes have a value equal to the sum of their child nodes. 
  Return 1 if all the nodes in the tree satisfy the given properties, else it returns 0. For every node, the data value
  must be equal to the sum of the data values in the left and right children. Consider the data value 0 for a NULL child. 
  Also, leaves are considered to follow the property.

Examples:

Input:
Binary tree
       35
      /  \
     20   15
    / \   / \
   15  5 10  5

Output: 1
Explanation: 
Here, every node is sum of its left and right child.









/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

*/






  
class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        
        if(root == null){
            return 1;
        }

        if(root.left == null && root.right == null){
            return 1;
        }
        
        int leftChild = root.left == null ? 0 : root.left.data;
        int rightChild = root.right == null ? 0 : root.right.data;
        
        
        
        if((leftChild + rightChild) == root.data){

            int isValidLeft = isSumProperty(root.left);
            int isValidRight = isSumProperty(root.right);

            return (isValidLeft & isValidRight);

        }else{
            return 0;
        }
    }
}
