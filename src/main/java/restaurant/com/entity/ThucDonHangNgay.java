package restaurant.com.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="thuc_don_hang_ngay")
public class ThucDonHangNgay {
    @Id
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name="ma_mon_an")
    private ThucDon thucDon;

    @Column(name="gia")
    private float gia;

    @Column(name="ngay")
    private Date ngay;

    @Column(name="trang_thai")
    private boolean trangThai;

//    @OneToMany(mappedBy = "thucDonHangNgay",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private List<ChiTietDon> chiTietDon;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ThucDon getThucDon() {
        return thucDon;
    }

    public void setThucDon(ThucDon thucDon) {
        this.thucDon = thucDon;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public ThucDonHangNgay() {
    }

    public ThucDonHangNgay(String id, ThucDon thucDon, float gia, Date ngay, boolean trangThai) {
        this.id = id;
        this.thucDon = thucDon;
        this.gia = gia;
        this.ngay = ngay;
        this.trangThai = trangThai;
    }
}
