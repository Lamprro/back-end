package restaurant.com.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="don_ban_an")
public class DonBanAn {
    @Id
    @Column(name="ma_don_ban_an")
    private String maDonBanAn;

    @Column(name="thoi_gian_tao")
    private LocalTime  thoiGianTao;

    @Column(name="trang_thai")
    private boolean trangThai;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ban_an")
    private BanAn banAn;

    @ManyToMany
    @JoinTable(
        name="don_ban_an_nhan_vien",
                joinColumns = @JoinColumn(name = "ma_don_ban_an"),
        inverseJoinColumns = @JoinColumn(name = "ma_nhan_vien")
    )
    private List<NhanVien> nhanVien;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_khach_hang")
    private KhachHang khachHang;

//    @OneToOne(mappedBy = "donBanAn")
//    private HoaDon hoaDon;
//
//    @OneToMany(mappedBy = "donBanAn")
//    private List<ChiTietDon> chiTietDon;

    public DonBanAn(String maDonBanAn, LocalTime thoiGianTao, BanAn banAn, boolean trangThai, List<NhanVien> nhanVien, KhachHang khachHang) {
        this.maDonBanAn = maDonBanAn;
        this.thoiGianTao = thoiGianTao;
        this.banAn = banAn;
        this.trangThai = trangThai;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
    }

    public DonBanAn() {
    }

    public String getMaDonBanAn() {
        return maDonBanAn;
    }

    public void setMaDonBanAn(String maDonBanAn) {
        this.maDonBanAn = maDonBanAn;
    }

    public LocalTime getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(LocalTime thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public BanAn getBanAn() {
        return banAn;
    }

    public void setBanAn(BanAn banAn) {
        this.banAn = banAn;
    }

    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(List<NhanVien> nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
