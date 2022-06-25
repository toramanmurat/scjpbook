package _02Chapter._01.inheritance;

public class InterfaceExample {

}
//ok
class Foo{} 

// bir class bir class'i implemets edemez!
//class Bar implements Foo{} 

//ok
interface Baz{}

//ok
interface Fi{}

//bir interface bir interface implemetns edemez!
//interface Fee implements Baz { }

//bir interface bir class'i implements edemez!
//interface Zee implements Foo{}

//bir interface bir class'i extends edemez!
//interface Zoo extends Foo{}

//ok. bir interface bir interface'si extends edebilir.
interface Boo extends Fi{}

//bir class birden fazla class'i extends edemez!
//class Toon extends Foo,Button {}

//bir class birden fazla interface'si implement edebilir.
class Zoom implements Fi,Baz{}

//bir interface birden fazla interface'si extends edebilir.
interface Vroom extends Fi, Baz { }

//ok
class Yow extends Foo implements Fi,Baz { }
