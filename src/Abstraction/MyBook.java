package Abstraction;

class MyBook extends Book{

	@Override
	public void setTitle(String title) {	
	 super.setTitle(title);
	}
     

	@Override
	public String getTitle() {
		return super.getTitle();
	}
}
