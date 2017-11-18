package Hashing;

public class HashTable {
  public static int table_size=4; 
  public static HashEntity[] table = new HashEntity[table_size];
  
  /**
   * Hash Map and Hash table concept is same.
   * Hash table is synchronized where as Hash map is not synchronized.
   * We have to explicitly implement synchronization if we are using Hash map
   * Hash table doesn't allow null values where as Hash map allows null values
   */
  
  public HashTable()
  {
  }
  public static void main(String[] args)
   {
    put(1,2); 
    put(2,4);
    put(3,6);
    put(6,8);
    put(5,8);
    
    System.out.println(getValue(1));
    System.out.println(getValue(2));
    System.out.println(getValue(3));
    System.out.println(getValue(6));
    
   }
  
   public static int getValue(int key)
   {
     int hash = (key % table_size);
     while(table[hash]!=null && table[hash].getKey()!=key)
     {
       hash=(hash+1) % table_size;
       System.out.println("Collision occured");
     }
     
     if(table[hash]==null) 
     {
       return -1;
     }
     else
     {
       return table[hash].getKey();
     }
   }
   
   public static void put(int key,int value)
   {
     int hash= (key % table_size);
     while(table[hash]!=null && table[hash].getKey()!=key)
     {
       hash=(hash+1) % table_size;
     }
     table[hash] = new HashEntity(key,value);
     
   }
}
