package restaurant.com.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="nhan_vien")
public class NhanVien {
    @Id
    @Column(name="ma_nhan_vien")
    private String maNhanVien;

    @Column(name="ho_va_ten")
    private String hoVaTen;

    @Column(name="ngay_sinh")
    private Date ngaySinh;

    @Column(name="chuc_vu")
    private String chucVu;

//    @OneToMany(mappedBy = "nhanVien")
//    private List<BaoCao> baoCao;
//
//    @OneToOne(mappedBy = "nhanVien")
//    private TaiKhoan taiKhoan;
//
//    @ManyToMany(mappedBy = "nhanVien")
//    private List<NhanVien> nhanVien;
//
//    @OneToMany(mappedBy = "nhanVien")
//    private List<HoaDon> hoaDon;


    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoVaTen, Date ngaySinh, String chucVu) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
    }
}
