package _01Chapter._03.declareclasses;

public class ClassDeclarationsAndModifiersNotes {

	// modifier/belirtec

	// access modifier (public , private , protected)
	// non-access modifier (final , abstract , static,strictfp ...)
	
	// class ve interface'ler icin access modifier olarak sadece public kullanilabilir.
	// eger public keywordu yoksa , default tur. (access level)

	// public se herkes erisebilir , default/friendly/package level-> sadece ayni paket!
	// Beverage2 orneginde oldugu gibi
	
	// final
	// bu keyword , class , method , variable icin kullanilabilir!
	// bir class eger final ise extends edilemez. 
		// public final class Integer 
		// public final class String
	
	// abstract
	// final ile abstract zittir. bunlar bir araya GELEMEZ!
	
	// final class lar extends edilemez!
	// abstract class lar ise extends edilmek icin vardir !
	// bir sinif hem final hem abstract olamaz!
}
