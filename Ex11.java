class Ex11
{
	public static void main(String[] args) 
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("輸入列數");
		int m=scanner.nextInt();
		System.out.println("輸入行數");
		int n=scanner.nextInt();

		//for(宣告變數,初始值設定;如何停止的條件;增量設定的計算式)
		for(int x=1;x<=m;x++)
		{
			for (int y=1;y<=n;y++)
			{
				System.out.print(x+"*"+y+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}
}