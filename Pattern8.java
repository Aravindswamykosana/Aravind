class Pattern8{
	public static void main(String[]args){
		char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(ch=='e')
					ch++;
				if(i==j || i+j==6){
				System.out.print(ch++);}
				else{
				System.out.print("*");}
			}
		System.out.println();
		}
	}
}