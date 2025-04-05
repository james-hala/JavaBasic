/*
位移運算子
1.boolean-->合-->true
		 -->不合-->false
2.>>(右移),<<(左移)
3.轉二進位制計算,缺項補0
*/
class Ex10
{
	public static void main(String[] args)
	{
		System.out.println("5>>2="+(5>>2));
		/*
			5右移2格
			0000,0101
		 -->0000,0001-->1
		*/
		System.out.println("5<<2="+(5<<2));
		/*
			5左移2格
			0000,0101
		 -->0001,0100-->20
		*/
	}
}