package _03Chapter._03assignmentOperators;
import java.awt.Dimension;



public class _12PassingObjectReferenceVariable {

	public static void main(String[] args) {
		Dimension d=new Dimension(5, 10);
		_12PassingObjectReferenceVariable rt=new _12PassingObjectReferenceVariable();
		System.out.println("Before modify() d.height = "
				+ d.height);
		
		rt.modify(d);
		System.out.println("After modify() d.height = "
				+ d.height);
	}
	
	void modify(Dimension dim) {
		dim.height = dim.height + 1;
		System.out.println("dim = " + dim.height);
	}
}
