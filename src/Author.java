public class Author {
    String authorFirstName;
    String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        //Java за нас создает объект, поэтому используем переменную this, которую Java создает за нас
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }

   public String getAuthorLastName() {
        return authorLastName;
    }

    public String getAuthorFirstName(){
        return  authorFirstName;
    }


}
