import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class FindMeanMedianMode {
	
	static ArrayList<Integer> input = new ArrayList<Integer>();
	
	protected FindMeanMedianMode()
	{
		
	}
	
	public static void main(String[] args)
	{
		/*System.out.println("Enter the values Enter ';' to terminate");
		Scanner sc = new Scanner(System.in);
		
		while(sc.nextInt()!=0){
			input.add(sc.nextInt());
		}*/
		
		input.add(5);
		input.add(12);
		input.add(31);
		input.add(2);
		input.add(2);
		input.add(13);
		input.add(13);
		input.add(13);
		input.add(16);
		
		
		findMean();
		findMedian();
		findMode();
		
	}
	
	private static void findMean()
	{
		int mean=0,sum=0;
		for(int i : input)
		{
			sum=sum+i;
		}
		
		mean=sum/input.size();
		System.out.println(mean);
	}
	
	private static void findMedian()
	{
		int median=0;
		Collections.sort(input);
		if(input.size()%2!=0)
		{
			median=input.get((input.size()/2)+1);
		}
		
		else
		{
			median=(input.get((input.size()/2))+ input.get(input.size()/2 +1))/2;
		}
		System.out.println(median);
	}
	
	private static void findMode()
	{
		HashMap<Integer,Integer> inputMap = new HashMap<Integer,Integer>();
		
		int max=1,mode = 0;
		for(int element: input)
		{
			if(inputMap.get(element)!=null)
			{
				int count=inputMap.get(element);
				count++;
				inputMap.put(element, count);
					
				if(count>max)
				{
					max=count;
					mode=element;
				}
			}
			else
			{
				inputMap.put(element, 1);
			}
		}
		System.out.println(mode);
	}
}
