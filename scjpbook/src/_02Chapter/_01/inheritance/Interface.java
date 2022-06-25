package _02Chapter._01.inheritance;

import java.io.Serializable;



public class Interface {

}

class AInterface{}
class BInterface{}

// bir sinif bir sinifi extends edebilir. ancak bir sinif birden cok interface'si implements edebilir.

class BallInterface extends AInterface implements Bounceable,Serializable,Runnable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}

interface Moveable{
	void move();
}

interface Spherical{
	void doSphericalThing();
}
//bir interface baska bir interface'si extens edebilir.
interface Bounceable extends Moveable{}

// bir interface, birden fazla interface'si extends(uygulayabilir)
interface Example extends Spherical,Moveable{}





