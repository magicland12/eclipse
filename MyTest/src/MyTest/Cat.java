package MyTest;
class Cat {
	
	private int weight; //��� ����
	private String name; //��� ����
	private  String color; //���� ����
	
	
	
	//��� ���
	
	public void eat(){
		System.out.println("Eating...\n");
	}
	
	//��� ����
	
	public void sleep(){
		System.out.println("Sleeping zz-z-z-z...\n");
	}
	
	//��� �������
	
	public String speak(String words){
			String phase = words + "...mauu...\n";
			return phase;
	}
}