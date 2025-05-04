package restaurant.com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tai_khoan")
public class TaiKhoan {
    @Id
    @Column(name="ma_tai_khoan")
    private String maTaiKhoan;

    @OneToOne
    @JoinColumn(name="ma_nhan_vien")
    private NhanVien nhanVien;

    @Column(name="mat_khau")
    private String matKhau;

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public TaiKhoan() {}

    public TaiKhoan(String maTaiKhoan, NhanVien nhanVien, String matKhau) {
        this.maTaiKhoan = maTaiKhoan;
        this.nhanVien = nhanVien;
        this.matKhau = matKhau;
    }
}
