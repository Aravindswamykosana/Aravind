class Pattern11{
	public static void main(String[]args){
		/*

18th program in pdf?
		for(int i=1;i<=6;i++){
			int n=1;
			char ch='a';
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch++);
				}else{
					System.out.print(n++);}
			}
			System.out.println();
		}*/

//19th program in pdf

		for(int i=1;i<=6;i++){
			int n=1;
			char ch='A';
			for(int j=1;j<=4;j++){
				if(i%2==1){
					System.out.print(ch++);
				}else{
					System.out.print(n++);}
			}
			System.out.println();
		}
	}
}