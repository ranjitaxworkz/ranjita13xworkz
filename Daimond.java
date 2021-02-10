class Daimond {

	public static void main(String[] args) {
		int n=5;
		int mid=n/2;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				if(i+j==mid || i-j==mid || j-i==mid || i+j==mid*3) {
					
					System.out.print("* ");
				}
				else 
					System.out.print("  ");	
				}
			System.out.println();
			}
		}
		
}
	
	
	
