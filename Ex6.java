/*
指定運算子-->遞增,遞減
1."="-->指定運算,推疊
2.+=,-=,*=,/=,%=
3.++(+1),--(-1)
*/class Ex6
{
	public static void main(String[] args) 
	{
		int x=10;
		x=x+20;//先運算右邊的式子(左右變數相同時,左邊的是最新的)
		//先運算x+20-->10+20=30,所以x=30
		System.out.println("x="+x);

		int a=52;
		a+=20;//a=a+20;
		System.out.println("a1="+a);//52+20=72
		a-=20;//a=a-20;
		System.out.println("a2="+a);//72-20=52
		a*=20;//a=a*20;
		System.out.println("a3="+a);//50*20=1040
		a/=20;//a=a/20;
		System.out.println("a4="+a);//1040/20=52
		a%=20;//a=a%20;
		System.out.println("a5="+a);//52%20餘12

		int b=10;
		++b;//b=b+1;b+=1;b++;一樣的意思
		System.out.println("b1="+b);
		b++;
		System.out.println("b1="+b);
		int c=20;
		--c;//c=c-1;c-=1;c--;一樣的意思
		System.out.println("c1="+c);
		c--;
		System.out.println("c2="+c);

		int d=10;
		int e;
		e=d++;//e=d,d=d+1
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		int f=10;
		int g;
		g=++f;//f'=f+1,g=f'
		System.out.println("f="+f);
		System.out.println("g="+g);
	}
}