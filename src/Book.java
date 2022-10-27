public class Book {
   private   int publishYear;
   private final   String bookName;
   private final Author author;




    public Book(int publishYear, String bookName, Author author) {
        this.publishYear = publishYear;
        this.bookName = bookName;
        this.author=author;
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


    @Override
    public String toString(){
        return this.bookName+" "+this.publishYear+" "+this.author.toString();
    }





}


