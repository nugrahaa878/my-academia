package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "longPlan")
public class LongPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "kodeUser")
    private int kodeUser;

    @Column(name = "namaLongPlan")
    private String namaLongPlan;

    public LongPlan(){}

    public LongPlan(int kodeUser, String namaLongPlan){
        this.kodeUser = kodeUser;
        this.namaLongPlan = namaLongPlan;
    }

    public Long getId(){
        return this.id;
    }

    public int getKodeUser(){
        return this.kodeUser;
    }

    public String getNamaLongPlan(){
        return this.namaLongPlan;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setKodeUser(int kodeUser) {
        this.kodeUser = kodeUser;
    }

    public void setNamaLongPlan(String namaLongPlan) {
        this.namaLongPlan = namaLongPlan;
    }
}
