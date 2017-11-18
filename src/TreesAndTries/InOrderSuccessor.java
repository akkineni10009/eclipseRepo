package TreesAndTries;
class InOrderSuccessor {

    static Node head;

    /* Given a binary search tree and a number, 
    inserts a new node with the given number in 
    the correct place in the tree. Returns the new 
    root pointer which the caller should then use 
    (the standard trick to avoid using reference 
    parameters). */
    Node insert(Node node, int data) {

        /* 1. If the tree is empty, return a new,    
        single node */
        if (node == null) {
            return (new Node(data));
        } else {

            Node temp = null;
            
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                //temp.parent = node;

            } else {
                temp = insert(node.right, data);
                node.right = temp;
                //temp.parent = node;
            }

            /* return the (unchanged) node pointer */
            return node;
        }
    }

    Node inOrderSuccessor(Node root, Node n) {

        Node temp=root;
        Node inOrderSucc=null;
        System.out.println(temp.data);
        System.out.println(n.data);
        while(temp!=null && temp.data!=n.data)
        {
            if(n.data<temp.data)
            {
                inOrderSucc=temp;
                temp=temp.left;
            }
            
            else
            {
                temp=temp.right;
            }
        }
        if(temp.right!=null)
        {
            inOrderSucc=minValue(temp.right);
        }
        return inOrderSucc;
    }

    /* Given a non-empty binary search tree, return the minimum data 
    value found in that tree. Note that the entire tree does not need
    to be searched. */
    static Node minValue(Node node) {
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Driver program to test above functions
    public static void main(String[] args) {
      InOrderSuccessor tree = new InOrderSuccessor();
        Node root = null, temp = null, suc = null, min = null;
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        temp = root.left.left;
        suc = tree.inOrderSuccessor(root, temp);
        if (suc != null) {
            System.out.println("Inorder successor of " + temp.data + 
                                                    " is " + suc.data);
        } else {
            System.out.println("Inorder successor does not exist");
        }
    }
}

// This code has been contributed by Mayank Jaiswal
