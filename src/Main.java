import java.util.*;

// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("orrange");
        list.add("melon");

//        要素数は3になる
        System.out.println("要素数 = " + list.size());

//        ループ処理
        for(String fruits : list){
            System.out.println(fruits);
        }

//        生徒数の文字列リスト
        List<String> studentsList = List.of("田中","鈴木","牧野","たけのうち","いのうえ");
        System.out.println(studentsList);

//        リストに入っている文字数が3文字以上のものを表示する
        for(String name : studentsList){
            if(name.length() >= 3){
                System.out.println("文字数が3文字以上のものを表示 : " + name);
            }
        }

//        番号と生徒名の組み合わせのMapを作成
//        Mapの要素は10個以上
//        Mapの中の番号が偶数のものをMapから削除する
//        上記処理を繰り返し行う処理を実装
//        削除した状態のMapを出力して表示させる

        Map<Integer , String> studentMap = new HashMap<>();
        studentMap.put(1 ,"田中");
        studentMap.put(2, "山田");
        studentMap.put(3, "佐藤");
        studentMap.put(4, "伊藤");
        studentMap.put(5, "渡辺");

        System.out.println("元のMap: " + studentMap);

        Map<Integer , String> newStudentMap = new HashMap<>();
        for(Map.Entry<Integer , String> entry : studentMap.entrySet()){
            //        Mapの中の番号が偶数のものをMapから削除する
            if(entry.getKey() %2 != 0){
                newStudentMap.put(entry.getKey(), entry.getValue());
            }
        }

        studentMap = newStudentMap;
        System.out.println("削除した状態のMap: " + studentMap);

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
