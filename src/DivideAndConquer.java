public class DivideAndConquer {
	
	public static int[] input= {25,34,67,87,36,54,101,45,30,32};
	
	public DivideAndConquer()
	{
		
	}

	public static void main(String[] args)
	{
		MinMax output = getMinMAx(input,0,input.length-1);
		System.out.println(output.min+"******"+output.max);
		
	}
	
	private static MinMax getMinMAx(int[] input,int start,int end)
	{
		MinMax OverallMinMax =new MinMax();
		MinMax LeftMinMax =new MinMax();
		MinMax RightMinMax =new MinMax();
		int mid;
		
		if(start==end)
		{
			OverallMinMax.min=input[start];
			OverallMinMax.max=input[start];
			return OverallMinMax;
		}
		
		else if(start==end-1)
		{
			if(input[start]<input[end])
			{
				OverallMinMax.min=input[start];
				OverallMinMax.max=input[end];
			}
			
			else
			{
				System.out.println(); 
				OverallMinMax.min=input[end];
				OverallMinMax.max=input[start];
			}
			
			return OverallMinMax;
		}
		
		mid=(start+end)/2;
		/*if((input.length)%2!=0 || input.length%4==0)
		{
			mid=(start+end)/2;
		}*/
		
		if ((input.length)%4==2 && (input.length>4))
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
}
