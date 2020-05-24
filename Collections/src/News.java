public class News {
    //新闻标题
    private String title;
    //新闻内容
    private String cont;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public News() {
        super();
    }

    public News(String title, String cont) {
        this.title = title;
        this.cont = cont;
    }

}
