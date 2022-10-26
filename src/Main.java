public class Main {

    public static void main(String[] args) {
        Author author1=new Author("Howard", "Lovecraft");
        Book book1 = new Book(1996, "Call of Ctulhu",author1);
        System.out.println(book1.getBookName());
        System.out.println(book1.getPublishYear());
        System.out.println(author1.getAuthorFirstName());
        System.out.println(author1.getAuthorLastName());
        System.out.println(book1);
        book1.setPublishingYear(1966);
        System.out.println(book1.getPublishYear());

        Author author2=new Author("Edgar Allan", "Poe");
        Book book2 = new Book(1989, "The murder on the Morgue Street",author2);
        System.out.println(book2.getBookName());
        System.out.println(book2.getPublishYear());
        System.out.println(author2.getAuthorFirstName());
        System.out.println(author2.getAuthorLastName());
        System.out.println(book2);
        book1.setPublishingYear(1966);
        System.out.println(book2.getPublishYear());


    }
}