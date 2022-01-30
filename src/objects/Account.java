package objects;

public class Account {
    private String name;
    private String surname;
    private String birthday;
    private String birthTown;
    private String email;
    private String userName;
    private String password;

    public Account(){
        this.name = "";
        this.surname = "";
        this.birthday = "";
        this.birthTown = "";
        this.email = "";
        this.userName = "";
        this.password = "";
    }

    public Account(String name, String surname, String birthday, String birthTown, String email, String userName, String password) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.birthTown = birthTown;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthTown() {
        return birthTown;
    }

    public void setBirthTown(String birthTown) {
        this.birthTown = birthTown;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthTown='" + birthTown + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
