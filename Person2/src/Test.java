
public class Test {

	public static void main(String[] args) {
		
		Person taro = new Person();
		taro.name ="taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
	}

}
