/*
算術運算子(元,符號)
-->+(和或連結符號),-(差),*(積),/(商),%(餘數)
*/
class Ex5
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=4;
		System.out.println("x+y="+x+y);//後面的x+y會被視為文字
		//若想要先算出後面的值,就加個括號()
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));//商會自動取整數
		System.out.println("x%y="+(x%y));//求餘數
	}
}