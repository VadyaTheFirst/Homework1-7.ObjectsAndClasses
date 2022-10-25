public class Book {
    int publishYear;
    String bookName;
    String authorName;
    String authorLastName;


    public Book(int publishYear, String bookName,String authorName, String authorLastName) {
        this.publishYear = publishYear;
        this.bookName = bookName;
        this.authorName= authorName;
        this.authorLastName=authorLastName;

        //Если объявить Author loveCraft = new Author("Howard", "Philip") здесь я почему-то не могу пробросить
        //метод getAuthorFirstName в класс main. Как сделать метод доступными из нескольких классов?
        //+не понятно

    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishingYear(int publishYear) {
        this.publishYear = publishYear;
    }
}


