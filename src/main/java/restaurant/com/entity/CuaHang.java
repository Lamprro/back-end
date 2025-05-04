package restaurant.com.entity;
import jakarta.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
@Table(name="cua_hang")
public class CuaHang {

    @Id
    @Column(name="ma_cua_hang")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="dia_chi")
    private String diaChi;

//    @OneToMany(mappedBy = "cuaHang",cascade = CascadeType.ALL)
//    private List<BanAn> banAn;


    public CuaHang(String id, String diaChi) {
        this.id = id;
        this.diaChi = diaChi;
    }

    public CuaHang() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
