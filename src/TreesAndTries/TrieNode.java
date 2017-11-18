package TreesAndTries;

import java.util.HashMap;

public class TrieNode {
  
  HashMap<Character,TrieNode> children;
  boolean hasEndOfWord;
  
  public TrieNode()
  {
    children = new HashMap();
    hasEndOfWord=false;
  }
}
