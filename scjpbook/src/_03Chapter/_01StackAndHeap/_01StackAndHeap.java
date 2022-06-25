package _03Chapter._01StackAndHeap;

public class _01StackAndHeap {
	String name; // instance veriable
	B b; // instance veriable
	
	public static void main(String[] args) {
		_01StackAndHeap sah; // local veriable
		sah=new _01StackAndHeap(); //local veriable
		sah.go(sah);
	}
	
	void go(_01StackAndHeap stackAndHeap) { //local veriable stackAndHeap
		b=new B();
		stackAndHeap.setName("Test Name");
		
	}
	
	void setName(String stackAndHeapname) { //local veriable stackAndHeapname
		name=stackAndHeapname;
		
	}
}

class B{}


//Instance variables and object HEAP 'te yaþar.
//Local veriables STACK te yaþar.