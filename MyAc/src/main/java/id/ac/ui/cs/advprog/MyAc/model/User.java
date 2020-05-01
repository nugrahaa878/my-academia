package id.ac.ui.cs.advprog.MyAc.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name= "lastName")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_roles")
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection< Role > roles;

    public User() {}

    public User(String firstName, String lastName, String email, String password) {

    }

    public User(String firstName, String lastName, String email, String password, Collection < Role > roles) {

    }

    public Long getUser_id() {
        return null;
    }

    public void setUser_id(Long id) {

    }

    public String getFirstName() {
        return null;
    }

    public void setFirstName(String firstName) {

    }

    public String getLastName() {
        return null;
    }

    public void setLastName(String lastName) {

    }

    public String getEmail() {
        return null;
    }

    public void setEmail(String email) {

    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String password) {

    }

    public Collection<Role> getRoles() {
        return null;
    }

    public void setRoles(Collection<Role> roles) {

    }

    @Override
    public String toString() {
        return null;
    }
}
