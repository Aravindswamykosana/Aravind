class PatternStar1{
	public static void main(String[]args){
		/*
8th in pdf like a diamond alphabets?
		

		int space=3,col=1;
		for(int i=1;i<=7;i++){
			char ch='A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
				System.out.print(ch++);
				}else{
				System.out.print(ch--);}
			}
			System.out.println();
			if(i<=3){
			col+=2;space--;}
			else{
			col-=2;space++;}
		}*/

		
//7th in pdf like decrease to increase from numbers?
		int space=1,col=7,n=1;
		for(int i=1;i<=4;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
				System.out.print(n++);
				}else{
				System.out.print(n--);}
			}
			System.out.println();
			col-=2;space++;
		}
	}
}			