/*
條件運算子conditional operator
1.boolean-->合-->true
		 -->不合-->false
2.&&(and和),||(or或),^(xor或),!(not非)
*/
class Ex8
{
	public static void main(String[] args) 
	{
		int chinese=80;
		int english=60;
		System.out.println("chinese="+chinese);
		System.out.println("english="+english);
		System.out.println("chinese=80且english=60-->"+(chinese==80 && english==60));
		System.out.println("chinese=70且english=60-->"+(chinese==70 && english==60));
		System.out.println("chinese=80且english=70-->"+(chinese==80 && english==70));
		System.out.println("chinese=70且english=70-->"+(chinese==70 && english==70));
		System.out.println();
		System.out.println("chinese=80或english=60-->"+(chinese==80 || english==60));
		System.out.println("chinese=70或english=60-->"+(chinese==70 || english==60));
		System.out.println("chinese=80或english=70-->"+(chinese==80 || english==70));
		System.out.println("chinese=70或english=70-->"+(chinese==70 || english==70));
		//a對b錯,a錯b對,a對b對-->true
		//a錯b錯-->false
		System.out.println();
		System.out.println("chinese=80或english=60-->"+(chinese==80 ^ english==60));
		System.out.println("chinese=70或english=60-->"+(chinese==70 ^ english==60));
		System.out.println("chinese=80或english=70-->"+(chinese==80 ^ english==70));
		System.out.println("chinese=70或english=70-->"+(chinese==70 ^ english==70));
		//a對b錯,a錯b對-->true
		//a錯b錯,a對b對-->false
		System.out.println();
		System.out.println("非(chinese=80且english=60)-->"+!(chinese==80 && english==60));
		System.out.println("非(chinese=80且english=70)-->"+!(chinese==80 && english==70));
	}
}