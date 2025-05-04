package restaurant.com.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="ban_an")
public class BanAn {
    @Id
    @Column(name="ma_ban_an")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maBanAn;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_cua_hang")
    private CuaHang cuaHang;

    @Column(name="trang_thai")
    private boolean trangThai;



//    @OneToMany(mappedBy = "banAn",cascade = CascadeType.ALL)
//    private List<ChiTietDon> chiTietDon;


    public String getMaBanAn() {
        return maBanAn;
    }

    public void setMaBanAn(String maBanAn) {
        this.maBanAn = maBanAn;
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public BanAn() {
    }

    public BanAn(String maBanAn, CuaHang cuaHang, boolean trangThai) {
        this.maBanAn = maBanAn;
        this.cuaHang = cuaHang;
        this.trangThai = trangThai;
    }
}
