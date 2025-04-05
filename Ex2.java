/*
datatype(資料類型,型態,類別)-->正確執行運算方式
"文字"和值
*/
class Ex2
{
	public static void main(String[] args) 
	{
		System.out.println(1+2);//沒有""視為值
		System.out.println("1+2");//有""視為文字
		System.out.println("1"+"2");//視為兩串文字連接在一起
		System.out.println("1"+2);//即使一邊文字一邊值,也會視為兩串文字連接
		System.out.println(1+"2");
		System.out.println("1+2="+3);//用+連接(隔開)文字和值
		System.out.println("3+6="+3+6);//由左而右編譯,會把數字改為文字
		System.out.println("3+6="+(3+6));//想先計算後面的值,就加個()
	}
}