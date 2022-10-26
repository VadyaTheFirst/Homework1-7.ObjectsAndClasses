public class Book {
    int publishYear;
    String bookName;
    Author author;




    public Book(int publishYear, String bookName, Author author) {
        this.publishYear = publishYear;
        this.bookName = bookName;
        this.author=author;



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

    public String getAuthorFirstName() {
        return author.authorFirstName;
    }

    public String getAuthorLastName() {
        return author.authorLastName;
    }



}


