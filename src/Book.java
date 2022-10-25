public class Book {
    int publishYear;
    String bookName;




    public Book(int publishYear, String bookName){
        this.publishYear=publishYear;
        this.bookName=bookName;


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
