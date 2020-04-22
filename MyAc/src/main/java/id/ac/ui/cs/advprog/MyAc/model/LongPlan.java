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

    @Column(name = "nama")
    private String nama;

    @Column(name = "semesterPlan")
    private ArrayList<Long> semesterPlan;

    public LongPlan(){}

    public LongPlan(int kodeUser, String nama){
        this.kodeUser = kodeUser;
        this.nama = nama;
    }

}
