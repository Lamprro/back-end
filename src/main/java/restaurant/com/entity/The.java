package restaurant.com.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="the")
public class The {
    @Id
    @Column(name="ma_the")
    private String ma_the;

    @Column(name="ngay_mo_the")
    private Date ngayMoThe;

    @Column(name="diem_tich_luy")
    private float diemTichLuy;

    @Column(name="mat_khau")
    private String matKhau;

    @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_khach_hang")
    private KhachHang khachHang;

//    @OneToOne(mappedBy = "the")
//    private HoaDon hoaDon;

    public String getMa_the() {
        return ma_the;
    }

    public void setMa_the(String ma_the) {
        this.ma_the = ma_the;
    }

    public Date getNgayMoThe() {
        return ngayMoThe;
    }

    public void setNgayMoThe(Date ngayMoThe) {
        this.ngayMoThe = ngayMoThe;
    }

    public float getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(float diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public The() {}

    public The(String ma_the, Date ngayMoThe, float diemTichLuy, String matKhau, KhachHang khachHang) {
        this.ma_the = ma_the;
        this.ngayMoThe = ngayMoThe;
        this.diemTichLuy = diemTichLuy;
        this.matKhau = matKhau;
        this.khachHang = khachHang;
    }
}
