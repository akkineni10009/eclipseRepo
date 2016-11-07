import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DivideAndConquer {
	
	public static ArrayList<Integer> input = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in); 
	 
	public DivideAndConquer() 
	{ 
		
	}

	public static void main(String[] args) throws IOException
	{
		
		/*System.out.println("Enter the number elements");
		int size=sc.nextInt();
		input=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
			
		}*/
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/ASUS-A555L/Desktop/Test.txt"));
			String line;
			while ((line = br.readLine()) != null)
			{
				String getinput[] = line.split(",");
				String unit=getinput[getinput.length-1];
				int value= Integer.parseInt(getinput[getinput.length-2]);
				if(unit.equals("F"))
				{
					value= ((value-32)*5)/9; 
					System.out.println(value);
				}
				input.add(value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		MinMax output = getMinMAx(input,0,input.size()-1);
		System.out.println(output.min+"******"+output.max);
		
	}
	
	private static MinMax getMinMAx(ArrayList<Integer> input,int start,int end)
	{
		MinMax OverallMinMax =new MinMax();
		MinMax LeftMinMax =new MinMax();
		MinMax RightMinMax =new MinMax();
		int mid;
		
		if(start==end)
		{
			OverallMinMax.min=input.get(start);
			OverallMinMax.max=input.get(start);
			//System
			return OverallMinMax;
		}
		
		else if(start==end-1)
		{
			if(input.get(start)<input.get(end))
			{
				OverallMinMax.min=input.get(start);
				OverallMinMax.max=input.get(end);
			}
			
			else
			{
				OverallMinMax.min=input.get(end);
				OverallMinMax.max=input.get(start);
			}
			
			return OverallMinMax;
		}
		
		mid=(start+end)/2;
		/*if((input.length)%2!=0 || input.length%4==0)
		{
			mid=(start+end)/2;
		}*/
		
		if ((input.size())%4==2 && (input.size()>4))
		{
			
			mid=((start+end)/2)-1;
		}
		
		LeftMinMax=getMinMAx(input,start,mid);
		RightMinMax=getMinMAx(input,mid+1,end);
		
		if(LeftMinMax.min<RightMinMax.min)
		{
			OverallMinMax.min=LeftMinMax.min;
		}
		else
		{
		   	OverallMinMax.min=RightMinMax.min;
		}
		
		
		if(LeftMinMax.max>RightMinMax.max)
		{
			OverallMinMax.max=LeftMinMax.max;
		}
		else
		{
			OverallMinMax.max=RightMinMax.max;
		}
		
		return OverallMinMax;
		
	}
	
	public void test()
	{
	  
	}
}
