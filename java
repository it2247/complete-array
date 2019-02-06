public class Main {

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {2, 3, 2, 4, 11, 6, 10, 9, 8}));
		System.out.println(isComplete(new int[] {2, 3, 3, 6}));
	}
	
	public static int  isComplete(int[] a) {
		int max=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]<=0)
				return 0;
			if(a[i]%2==0 && a[i]>max)
				max=a[i];
		}
		if(max==0)
			return 1;
		max-=2;
		boolean found=true;
		while(max>0&& found) {
			found=false;
			for(int j=0;j<a.length;j++) {
				if (a[j]==max)
					found=true;
			}
			max-=2;
		}
		if(found==false)
			return 0;
		
		return 1;
		
			
	}

}
