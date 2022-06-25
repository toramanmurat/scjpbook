package _01Chapter._02.javabeansstandards;

public class JavaBeansStandardsNotes {

	private int size;
	private String str;
	private boolean status;
//	getter/setter metodlarý IDE birakiyoruz.
//	Eclipse'te ALT+Shift+S kisayol
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
//	boolean icin isStatus
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setMyValue(int v) {
	}

	public int getMyValue() {
		return 10;
	}

	public boolean isMyStatus() {
		return false;
	}

}
