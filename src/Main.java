public class Main {
    public static void main(String[] args) {
        Author author1= new Author("Howard", "Philip");
        Book book1 = new Book(1996,"Call Of Ctulhu");
        System.out.println(book1.getBookName());
        System.out.println(book1.getPublishYear());
        System.out.println(author1.getAuthorLastName());
        System.out.println(author1.getAuthorFirstName());
        book1.setPublishingYear(1966);
        System.out.println(book1.getPublishYear());


    }
}