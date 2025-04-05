/*
變數(要宣告)
語法:datatype 變數=初始值
基礎變數類型
1.整數-->long int short byte
2.浮點數(小數)-->double float
3.字元/字串-->chart string
4.布林-->boolean
*/
class Ex3
{
	public static void main(String[] args) 
	{
		byte x=10;//將int(10) casting(轉型) byte(10)
		System.out.println(x);//byte的數值範圍是-128到127
		short y=130;
		System.out.println(y);//short的數值範圍是-32768到32767

		byte a1=1;
		byte b1=2;
		byte c1=1+2;
		System.out.println("c1="+c1);
		/*byte c2=a1+b1;
		System.out.println("c2="+c2);
		byte和short運算後會自動提升位階到int,所以無法進行運算
		可以這樣寫short c2=(short)(a1+b1),但java不推薦;*/
		int c2=a1+b1;
		System.out.println("c2="+c2);
	}
}