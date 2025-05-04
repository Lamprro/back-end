package restaurant.com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="chi_tiet_don")
public class ChiTietDon {
    @Id
    @Column(name="ma_chi_tiet_don")
    private String maChiTietDon;

    @Column(name="so_luong")
    private float soLuong;

    @Column(name="trang_thai")
    private boolean trangThai;

    @Column(name="thanh_tien")
    private float thanhTien;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_mon_an")
    private ThucDonHangNgay thucDonHangNgay;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_don_ban_an")
    private DonBanAn donBanAn;

    public String getMaChiTietDon() {
        return maChiTietDon;
    }

    public void setMaChiTietDon(String maChiTietDon) {
        this.maChiTietDon = maChiTietDon;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public ThucDonHangNgay getThucDonHangNgay() {
        return thucDonHangNgay;
    }

    public void setThucDonHangNgay(ThucDonHangNgay thucDonHangNgay) {
        this.thucDonHangNgay = thucDonHangNgay;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public DonBanAn getDonBanAn() {
        return donBanAn;
    }

    public void setDonBanAn(DonBanAn donBanAn) {
        this.donBanAn = donBanAn;
    }

    public ChiTietDon(String maChiTietDon, float soLuong, boolean trangThai, ThucDonHangNgay thucDonHangNgay, float thanhTien, DonBanAn donBanAn) {
        this.maChiTietDon = maChiTietDon;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.thucDonHangNgay = thucDonHangNgay;
        this.thanhTien = thanhTien;
        this.donBanAn = donBanAn;
    }

    public ChiTietDon() {
    }
}
