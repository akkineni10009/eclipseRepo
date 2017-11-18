package TreesAndTries;

public class Trie {

  public static TrieNode root;
  public static TrieNode current=root;
  
  public Trie()
  {
    root= new TrieNode();
  }
  
  public static void insert(String word)
  {
    char currentchar;
    TrieNode current=root;
    
    for(int i=0;i<word.length();i++)
    {
      currentchar=word.charAt(i);
      TrieNode node=current.children.get(currentchar);
      if(node==null)
      {
        node=new TrieNode();
        current.children.put(currentchar, node);
      }
      current=node;
    }
    current.hasEndOfWord=true;
  }
  
  public static void recurisveInsert(String word)
  {
    insertRecurisve(word,0);
  }
  
  public static void insertRecurisve(String word,int index)
  {
    if(index==word.length())
    {
      // For the last word make the hasEndOfWord value true.
      current.hasEndOfWord=true;
      return;
    }
    
    // Get the first character of the word
    char currentchar=word.charAt(index); 
    
    //If the character doesn't have any mapping ..means it doesn't exist
    TrieNode node= current.children.get(currentchar); 
    
    if(node==null)
    {
      //create a new trie node
      node=new TrieNode(); 
      
      // Insert the mapping in the current node
      current.children.put(currentchar, node); 
    }
    
    //Recursively do this for all the characters in the word
    insertRecurisve(word,index++); 
  }
  
  public static boolean search(String word)
  {
    TrieNode current=root;
    for(int i=0;i<word.length();i++)
    {
      char currentchar=word.charAt(i);
      TrieNode node=current.children.get(currentchar);
      if(node==null)
      {
        return false;
      }
      current=node;
    }
    /*if(current.hasEndOfWord==false)
    {
      return false;
    }
    
    return true;*/
    
    return current.hasEndOfWord;
    //The above comment can be simply written this way
    
  }
  
  public static void recursiveSearch(String word, int index)
  {
    searchRecursive(word,0);
  }
  
  public static boolean searchRecursive(String word, int index)
  {
    if(index==word.length())
    {
      return current.hasEndOfWord;
    }
    
    char currentchar=word.charAt(index);
    TrieNode node =current.children.get(currentchar);
    
    if(node==null)
    {
      return false;
    }
    
    return searchRecursive(word,index++);  
  }
  
  public void delete(String word)
  {
    delete(word, 0,root);
  }
  
  public static boolean delete(String word, int index, TrieNode current)
  {
    if(index==word.length())
    {
      //If the last hasEndOfWord is false, then the word doesn't exist. So return false
      if(!current.hasEndOfWord)
      {
        return false;
      }
      
      //If the hasEndOfWord is true, make it false and return true if there are no 
      current.hasEndOfWord=false;
      
      // If there are no more elements return so that that after the recursive call, the node is deleted
      return current.children.size()==0;
    }
    
    char currentchar=word.charAt(index);
    TrieNode node= current.children.get(currentchar);
    if(node==null)
    {
      return false;
    }
    
    boolean shouldDelete= delete(word,index++,node);
    
    if(shouldDelete)
    {
      current.children.remove(currentchar);
      
      return current.children.size()==0;
    }
    
    return false;
  }
}
