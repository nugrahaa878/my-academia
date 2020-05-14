package id.ac.ui.cs.advprog.MyAc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "matkul")
public class Matkul {
    @Id
    @Column(name = "kode")
    private String kode ;

    @Column(name = "nama")
    private String nama;

    @Column(name = "semester")
    private int semester;

    @Column(name = "sks")
    private int sks;

    @Column(name = "penjelasan", length = 1000)
    @Size(max = 1000)
    private String penjelasan;

    public Matkul() {

    }

    public Matkul(String kode,String nama, int semester, int sks, String penjelasan){
        this.nama = nama;
        this.kode = kode;
        this.semester = semester;
        this.sks = sks;
        this.penjelasan = penjelasan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    @Override
    public String toString() {
        return String.format("Kode: %s, Nama: %s, Semester: %d, Sks: %d", this.kode, this.nama, this.semester, this.sks);
    }
}

