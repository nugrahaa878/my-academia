package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matkulPlan")
public class MatkulPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "idSemester")
    private Long idSemester;

    @Column(name = "kodeMatkul")
    private String kodeMatkul;

    public MatkulPlan() {
    }

    public MatkulPlan(Long id, Long idSemester, String kodeMatkul) {
        this.id = id;
        this.idSemester = idSemester;
        this.kodeMatkul = kodeMatkul;
    }

    public Long getId(){
        return this.id;
    }

    public Long getIdSemester(){
        return this.idSemester;
    }

    public String getKodeMatkul(){
        return this.kodeMatkul;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdSemester(Long idSemester) {
        this.idSemester = idSemester;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }
}