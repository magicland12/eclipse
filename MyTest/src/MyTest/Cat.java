package MyTest;
class Cat {
	
	private int weight; //вес кота
	private String name; //им€ кота
	private  String color; //цвет кота
	
	
	
	//кот ест
	
	public void eat(){
		System.out.println("Eating...\n");
	}
	
	//кот спит
	
	public void sleep(){
		System.out.println("Sleeping zz-z-z-z...\n");
	}
	
	//кот говорит
	
	public String speak(String words){
			String phase = words + "...mauu...\n";
			return phase;
	}
}