package _01Chapter._04.declereinterface;

public interface Bounceable {
	
	void bounce();
	void setBounceFactor(int bf);
	
//	Compiler 
//	public abstract void bonunce();
//	public abstract void setBounceFactor(int bf);
//	sonu ; virgul ile biter.

}

//bir interface bir veya daha fazla interface extends edebilir
interface A{
	void aMetod();
	
}

interface B{
	void bMetod();
	
}

interface C extends Bounceable{
	
}

interface D extends A,B{
	
}

//bir interface baþka bir interface implement edemez!
