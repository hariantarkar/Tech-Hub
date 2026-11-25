package practice.code;

class CheckStrOnlyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="1234";
		boolean flag=true;
		for(char c:str.toCharArray()) {
			
			if(!Character.isDigit(c)) {
			flag=false;
			break;
			}
	}	

	System.out.print(flag);	
	
}
}
