package DivideAndConquer;

public class MergeSort {

  public static int[] array = {3,1,6,7,8,5,2};
  public static void main(String[] args)
  {
    
    mergeSort(array,new int[array.length],0,array.length-1);
    for(int i=0;i<array.length;i++)
    {
      System.out.println(array[i]);
    }
  }
  
  public static void mergeSort(int[] array, int[] temp, int leftstart, int rightend)
  {
    if(leftstart>=rightend) 
    {
        return;
    }
    int middle=(leftstart+rightend)/2;
    mergeSort(array,temp,leftstart,middle);
    mergeSort(array,temp,middle+1,rightend);
    mergeHalves(array,temp,leftstart,rightend);
    
  }
  
  public static void mergeHalves(int[] array, int[] temp, int leftstart, int rightend)
  {
    int leftEnd= (leftstart+rightend)/2;;
    int rightStart= leftEnd+1;
    
    int index= leftstart;
    int left=leftstart;
    int right=rightStart;
    
    int size=rightend-leftstart+1;
    
    while(left<=leftEnd && right<=rightend)
    {
      if(array[left]<=array[right])
      {
        temp[index]= array[left];
        left++;
      }
      
      else
      {
        temp[index]=array[right];
        right++;
      }
      
      index++;
    }
    
    
    System.arraycopy(array,left,temp,index,leftEnd-left+1);
    System.arraycopy(array, right, temp, index, rightend-right+1);
    System.arraycopy(temp, leftstart, array, leftstart, size);
    
  }
}
