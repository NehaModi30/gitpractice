package javapractise;

import java.util.ArrayList;

public class duplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5,4,6,75,4,3,2};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{int k=1;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+" present"+k+" times");
			}
			
		}
		System.out.println(ab);

	}

}
