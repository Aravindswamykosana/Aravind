class Harshad{
	public static void main(String[]args){
		/*int n=29,sum=0,temp=n;
		while(n!=0){
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(temp%sum==0){
		System.out.println("harshad");
		}else{
		System.out.println("not harshad number");}*/


		int n=9,s=n*n,sum=0;
		while(s!=0){
		int r=s%10;
		sum=sum+r;
		s/=10;
		}
		System.out.println(sum);
		if(sum==n){
			System.out.println("neon number");
		}else{
			System.out.println("not neon");
		}	
	}
}