package _02Chapter._01.inheritance;

public class Polymorphism {
	
	public static void main(String[] args) {
		PlayerPieceX player=new PlayerPieceX();
		Object o=player;
		GameShapeX shape=player;
		Animatable mover=player;
	}

}

class A {
}

class B {
}
//class C extends A,B{}
// Java tek bir kalitima izin verir.

interface Animatable {
	public void animate();
}

class GameShapeX {
	public void displayShape() {
		System.out.println("displaying shape");
	}
}

class PlayerPieceX extends GameShapeX implements Animatable {
	public void movePiece() {
		System.out.println("moving game piece");
	}

	public void animate() {
		System.out.println("animating...");
	}
}