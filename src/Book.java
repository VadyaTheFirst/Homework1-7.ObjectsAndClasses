public class Book {
    int publishYear;
    String bookName;
    String authorName;
    String authorLastName;


    public Book(int publishYear, String bookName, String authorName, String authorLastName) {
        this.publishYear = publishYear;
        this.bookName = bookName;
        this.authorName= authorName;
        this.authorLastName=authorLastName;



        //Как сделать метод доступными из нескольких классов?
        //+не понятно почему я из класса book не могу вызвать поле author1.authorLastName? там же public стоит

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


