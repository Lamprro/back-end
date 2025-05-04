package restaurant.com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="hoa_don")
public class HoaDon {
    @Id
    @Column(name="ma_hoa_don")
    private String maHoaDon;

    @Column(name="trang_thai")
    private boolean trangThai;

    @Column(name="diem_tich_luy")
    private float diemTichLuy;

    @Column(name="tong_tien")
    private float tongTien;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_don_ban_an")
    private DonBanAn donBanAn;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_the")
    private The the;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_nhan_vien")
    private NhanVien nhanVien;

    public HoaDon(String maHoaDon, boolean trangThai, float diemTichLuy, float tongTien, DonBanAn donBanAn, The the, NhanVien nhanVien) {
        this.maHoaDon = maHoaDon;
        this.trangThai = trangThai;
        this.diemTichLuy = diemTichLuy;
        this.tongTien = tongTien;
        this.donBanAn = donBanAn;
        this.the = the;
        this.nhanVien = nhanVien;
    }

    public HoaDon() {
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public float getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(float diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public DonBanAn getDonBanAn() {
        return donBanAn;
    }

    public void setDonBanAn(DonBanAn donBanAn) {
        this.donBanAn = donBanAn;
    }

    public The getThe() {
        return the;
    }

    public void setThe(The the) {
        this.the = the;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
