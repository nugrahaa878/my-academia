package id.ac.ui.cs.advprog.MyAc.model;

import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public Role() {}

    public Role(String name) {

    }

    public Long getId() {
        return null;
    }

    public void setId(Long id) {

    }

    public String getName() {
        return null;
    }

    public void setName(String name) {

    }

    @Override
    public String toString() {
        return null;
    }
}
