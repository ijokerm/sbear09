public class HoliB{
	//构造方法
	public HoliB(){
		System.out.println("HoliB! 父类构造方法");
	}
	//非静态代码块
	{
		System.out.println("B class.父类非静态代码块");
	}
	//静态
	{
		System.out.println("static B 父类静态代码块");
	}
}
public class Holi03 extends HoliB{
	//构造方法
	public Holi03(){
		System.out.println("Holi03! 父类构造方法");
	}
	//非静态代码块
	{
		System.out.println("03 class.父类非静态代码块");
	}
	//静态
	{
		System.out.println("static 03 父类静态代码块");
	}
public static void main(String[] args){
	System.out.println("----start----");
	new Holi03();
	new Holi03();
	System.out.println("----end----");		
    }
}