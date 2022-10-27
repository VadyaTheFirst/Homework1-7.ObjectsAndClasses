public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        //Java за нас создает объект, поэтому используем переменную this, которую Java создает за нас
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return this.authorLastName + " " + this.authorFirstName;
    }
}

