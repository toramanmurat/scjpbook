package _08Chapter;

public class _01InnerClass {

	public static void main(String[] args) {
		_01InnerClass innerClass = new _01InnerClass();

		InnerClass innerRef = innerClass.new InnerClass();
		_01InnerClass.InnerClass innerRef2 = innerClass.new InnerClass();

		System.out.println(innerRef); // _08Chapter._01InnerClass$InnerClass@30f39991
		System.out.println(innerRef2); // _08Chapter._01InnerClass$InnerClass@452b3a41

	}

	void createInnetClassInstance() {
		InnerClass innerClass = new InnerClass();
	}

	class InnerClass {
	}
}
