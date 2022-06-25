package _03Chapter._03assignmentOperators;

public class _18Init {
	_18Init(int x) {
		System.out.println("1-arg const");
	}

	_18Init() {
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		new _18Init();
		new _18Init(7);
//		static block sinif yuklendiginde 1 kez calisir.
//		instance block obje her yuklendiginde calisir.
		
//		static block lar genel olarak 1 tane tanimlanir.Fakat birden fazla da tanimlanabilir.
//		calisma sirasi yukaridan asagiya dogrudur.
		
//		instance blocklar birden fazla tanimlanabilir. Constructor'dan once calisir.
	}
}
