import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

//        図書管理システムの作成
//        Listでもっている書籍情報を検索
//        mainメソッドから実行して、実行結果をコンソールに表示出力

        // 書籍のリストを作成
        BookInformation book1 = new BookInformation("ロクの生活","著者A",99);
        BookInformation book2 = new BookInformation("トムのごはん","著者B",410);
        BookInformation book3 = new BookInformation("本","著者C",3);

        // Libraryのインスタンスを作成し、書籍を追加
        Library library = new Library();
        library.addBookInformation(book1);
        library.addBookInformation(book2);
        library.addBookInformation(book3);

        // 書籍の検索例
        List<BookInformation> booksByTitle = library.searchByTitle("本");
        List<BookInformation> booksByAuthor = library.searchByAuthor("著者B");
//        BookInformation bookById = library.searchById(99);
        int idToSearch = 9;
        BookInformation bookById = library.searchById(idToSearch);

        // 検索結果を表示

        boolean bookTitleFound = false; // 書籍が見つかったかどうかを示すフラグ

        for (BookInformation book : booksByTitle) {
//            if (book.getTitle().equals("本") || book.getTitle().equals("ロクの生活") || book.getTitle().equals("トムのごはん")) {
            if ( book.getTitle() == "本" || book.getTitle().equals("ロクの生活") || book.getTitle().equals("トムのごはん")) {

                    System.out.println("タイトルで検索結果: " + book);
                bookTitleFound = true; // 書籍が見つかったことをフラグで記録
            }
        }
        // 書籍が見つからなかった場合のメッセージ
        if (!bookTitleFound) {
            System.out.println("タイトルでの検索結果: 該当する書籍が見つかりませんでした。");
        }

        for (BookInformation book : booksByAuthor) {
            System.out.println("著者での検索結果: " + book);
        }
        if (bookById != null){
            System.out.println("IDでの検索結果: " + bookById);
        } else {
            System.out.println("IDでの検索結果: 該当する書籍が見つかりませんでした。");
        }

    }
}
