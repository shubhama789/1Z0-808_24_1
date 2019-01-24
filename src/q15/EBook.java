package q15;

 class EBook extends Book{
	public void readBook() {
		System.out.println("Read E-Book");
	}
	
	public static void main(String[] args) {
		Book book1 = new EBook();
		book1.readBook();
	}

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}
	
}
