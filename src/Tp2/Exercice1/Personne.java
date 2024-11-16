package Tp2.Exercice1;

public class Personne {
    private String firstname;
    private String lastname;
    private int age;
    private String telephone;
    private String email;
    public Personne(String firstname, String lastname, int age, String telephone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
    }
    public void afficher() {
        System.out.println(firstname + " " + lastname + " " + age + " " + telephone + " " + email);
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getEmail() {
        return email;

    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
