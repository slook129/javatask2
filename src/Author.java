public class Author {
    private String name;
    private String email;
    private String gender;
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public Author(String n, String e, String g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String toString() {
        return name + " (" + gender + ") " + email;
    }
}
