package _03Chapter._03assignmentOperators;

public class _06ScopeErrors {
	public static void main(String[] args) {
		_06ScopeErrors s = new _06ScopeErrors();
		s.go();
	}

	void go() {
		int y = 5;
		go2();
		y++;
	}

	void go2() {
//		y++; y local veriable. Error!
	}

	void go3() {
		for (int z = 0; z < 5; z++) {
			boolean test = false;
			if (z == 3) {
				test = true;
				break;
			}
		}
//		System.out.print(test); test local veriable
	}
}
