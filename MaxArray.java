import java.util.*;
class MaxArray
{
	public static void main(String[] args)
	{
		int a[] = {2,3,4,5,7,8};
		int b[] = {5,5,3,2,6,9,0};
		try{
			
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b[i])
			{
				
				System.out.println(a[i]);
			//System.out.print(b[i]);
			}
			else
			{
				System.out.println(b[i]);
			}
		}}
		catch(Exception e){
			System.out.println("Array Out of index");
		}
	}
}