package assignment;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AvegareRate;

    int[] RateList = new int[3];

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAvegareRate() {
        return AvegareRate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println("Title: " +Title);
        System.out.println("PublishDate: " +PublishDate);
        System.out.println("Author: " +Author);
        System.out.println("Content: " +Content);
        System.out.println("AvegareRate: " +AvegareRate);
    }

    void Calculate(){
        for (int i: RateList){
            AvegareRate += i;
        }
        AvegareRate /= RateList.length;
    }
}
