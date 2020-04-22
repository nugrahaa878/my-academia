package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "semesterPlan")
public class SemesterPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "semester")
    private int semester ;

    @Column(name = "matkul")
    private ArrayList<String> matkul;

    public SemesterPlan(){}

    public SemesterPlan(int semester){
        this.semester = semester;
    }
}
