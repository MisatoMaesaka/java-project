public class BookInformation {

    //        書籍を管理する情報（タイトル、著者、番号）を持つオブジェクト（クラス）を作って、そこに情報を格納
    String title;  // タイトル
    String author; // 著者
    int id;    // 番号

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookInformation(String title,String author,int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    @Override
    public String toString(){
        return "タイトル: " + title + ", 著者: " + author + ", 番号: " + id;
    }
}
