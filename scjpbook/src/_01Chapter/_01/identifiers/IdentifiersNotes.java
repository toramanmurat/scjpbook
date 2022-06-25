package _01Chapter._01.identifiers;

public class IdentifiersNotes {

	public static void main(String[] args) {

//		ilk karekter sayi olamaz! 
//			01Chapter olamaz.(Invalid package name. '01' is not a valid Java identifier)
//		$, underscore(_), harf olabilir 
//			_01chapter, $chapter
//		ikinci karakterler sayi olabilir
//			_01chapter, 
// 		identifier ismi olarak uzunluk acisindan bir sinir yoktur.
//		javada keywordler identifier ismi olarak kullanilamazlar!
//		identifier isimleri case sensitive dir.
//			foo ve Foo farklý identifier

//		Legal identifiers

		int _a;
		int $c;
		int _____2_w;
		int _$;
		int this_is_a_very_detailed_name_for_an_identifier;

//		illegal identifiers

//		int :b;
//		int -d;
//		int e#;
//		int .f;
//		int 7g; Syntax error on token "7", delete this token

	}
}
