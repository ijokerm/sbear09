  class Person1{
	private static String country;
	private String name;
	private int age;
	
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void setCountry(String c){
		country=c;
	}
	public void getPersonInfo(){
		System.out.println("姓名:"+this.name+",年龄:"+this.age+",国家:"+this.country);
	}
}
/*class Person2 {
	String Country="中国";
	String name; 
	int age;
	
	public void getPersonInfo2(){
		System.out.println("姓名:"+this.name+",年龄:"+this.age+",国家:"+this.Country);
	}
}*/
public class Holi02{
	public static void main(String[] args){
		/*Person1.setCountry("中国");
		Person1 person=new Person1("李狗",20);
		Person1. getPersonInfo();
		*/
		//
		Person2 p1=new Person2();
        p1.name=" 张三";
        p1.age=20;
		Person2 p2=new Person2();
        p2.name=" 张2";
        p2.age=10;
		p1.getPersonInfo2();
        p2.getPersonInfo2();		
		
	}
}


 