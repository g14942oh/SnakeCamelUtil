package snakecamel;

public class Main {
	
	public static void main(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String a="hellow_world";	
		String a2=scu.snakeToCamelcase(a);
		String b ="OtaHitoha";
		String b2 =scu.camelToSnakecase(b);
		System.out.println("snakeからcamel："+a+"から"+a2);
		System.out.println("canelからsnake："+b+"から"+b2);
	}
}
