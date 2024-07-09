class PatternStar{
	public static void main(String[]args){
		/*
14th star in pdf?
		int star=1,space=5;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if(!(i==4 && j==4)){
				System.out.print("*");}
			}
		System.out.println();star++;space-=2;
		}*/

		/*
15th star in pdf?
		int star=1,space=2;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if(!(i==4 && j==4)){
				System.out.print("*");}
			}
		System.out.println();star++;space--;
		}*/
		
		/*
4th alphabet in pdf from diamond shape?

		int space=2,star=1;
		for(int i=1;i<=5;i++){
			char ch='A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(ch++);
			}
		System.out.println();
		if(i<=2){
		space--;star+=2;
		}
		else{
		space++;star-=2;}
		}*/
		

//5th in pdf?
		int space=3,star=1,n=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(i);
			}
		System.out.println();
		if(i<=3){
			if(n%2==0)
		space--;star+=2;
		}
		else{
		space++;star-=2;}
		}
	}
}