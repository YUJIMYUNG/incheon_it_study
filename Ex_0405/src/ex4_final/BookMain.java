package ex4_final;

public class BookMain {
	public static void main(String[] args) {
		
		Comic comicBook = new Comic("원피스", "오다", true );
		comicBook.info_title();
		comicBook.info_author();
		comicBook.info_color();
	}
}
