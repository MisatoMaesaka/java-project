import java.util.ArrayList;
import java.util.List;

public class Library {

    //    図書館みたいなものを作って、そこにBookをListでもつようなものを保持する
    private List<BookInformation> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    //    リストに書籍情報を追加する
    public void addBookInformation(BookInformation bookInformation) {
        books.add(bookInformation);
    }

    //    タイトル検索、著者検索、番号検索メソッドをLibraryにもたせる
    //    タイトル検索
    public List<BookInformation> searchByTitle(String title) {
        List<BookInformation> result = new ArrayList<>();
        for (BookInformation bookInformation : books) {
            if (bookInformation.getTitle().equals(title)) {
                result.add(bookInformation);
            }
        }
        return result;
    }
    //    著者検索
    public List<BookInformation> searchByAuthor(String author) {
        List<BookInformation> result = new ArrayList<>();
        for (BookInformation bookInformation : books) {
            if (bookInformation.getAuthor().equals(author)) {
                result.add(bookInformation);
            }
        }
        return result;
    }
    //    番号検索
    public BookInformation searchById(int id) {
        for (BookInformation bookInformation : books) {
            if (bookInformation.getId() == id) {
                return bookInformation;
            }
        }
        return null;
    }
}
