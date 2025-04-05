class Ex4
{
	public static void main(String[] args) 
	{
		/*float x1=10.12;//未加f視為double
		System.out.println(x1);*/
		float x1=10.12f;//加f視為float
		System.out.println("x1="+x1);
		float x2=10.12F;//java.lang.Float
		System.out.println("x2="+x2);

		char x3='d';//''-->字元(char),""-->字串(string)
		System.out.println("x3="+x3);
		char x4=65;//查ASKII code
		System.out.println("x4="+x4);

		String x5="abcd\tefgh\tijkl\tmnop\nqrstu\tvwxyz";
		System.out.println(x5);
		/*
		\t-->空一格(tab)
		\n-->換行
		兩者都必須在""內才行
		*/

		int abc=10;
		System.out.println(abc);
		int ABC=20;
		System.out.println(ABC);
		int 你好=30;
		System.out.println(你好);
		int _hello_=40;
		System.out.println(_hello_);
		int $hello$=50;
		System.out.println($hello$);

		/*int static=10;//功能字
		int lesson one=20;//空格
		int 1a=30;//數字在字母前*/
	}
}