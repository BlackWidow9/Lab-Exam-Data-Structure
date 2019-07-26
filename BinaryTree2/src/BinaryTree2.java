
public class BinaryTree2 {
class Node 
{
    int key;
    Node leftchild,rightchild;
    public Node(int item)
    { 
      key = item;
      leftchild = rightchild = null;
    }
}
    Node root;
    BinaryTree2()
    {
        root = null;
    }
void insert(int key){
    root = insertRec(root,key);
}
Node insertRec(Node root,int key)
{   if(root == null)
{
    root = new Node(key);
    return root;
}
if(key<root.key)
{
    root.leftchild = insertRec(root.leftchild,key);
}
else if(key>root.key)
{
    root.rightchild = insertRec(root.rightchild,key);
}
    return root;
}
void inorder()
{
    inorderRec (root);
}
    void inorderRec (Node root)
    {
        if(root !=null)
        {
            inorderRec(root.leftchild);
            System.out.println(root.key);
            inorderRec(root.rightchild);
        }
    }
    public static void main(String[] args) {
      BinaryTree2 tree = new BinaryTree2();
      tree.insert(50);
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(70);
      tree.insert(70);
      tree.insert(80);
      tree.inorder();
    }
    
}
