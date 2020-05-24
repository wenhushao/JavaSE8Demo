import java.util.ArrayList;

public class NewsControl {
    public static void main(String[] args) {
        ArrayList<News> arr = new ArrayList<News>();
        News news1 = new News("一女子励志要把富人踩在脚下", "最终当上了按摩店踩背小姐");
        News news2 = new News("听说中国平均工资6000了", "姚明和潘长江平均身高196，有球用？");
        arr.add(news1);
        arr.add(news2);
        for (News news : arr) {
            System.out.println(news.getTitle() + "\t" + news.getCont());
        }
    }
}