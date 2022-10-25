public class Main {

    public static void main(String[] args) {
        Author author1=new Author("Howard", "Lovecraft");
        Book book1 = new Book(1996, "Call of Ctulhu",author1.authorFirstName,author1.authorLastName);
        System.out.println(book1.getBookName());
        System.out.println(book1.getPublishYear());
        System.out.println(author1.getAuthorFirstName());
        System.out.println(author1.getAuthorLastName());
        book1.setPublishingYear(1966);
        System.out.println(book1.getPublishYear());

    }
}