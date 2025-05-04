package restaurant.com.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="khach_hang")
public class KhachHang {
    @Id@Column(name="ma_khach_hang")
    private int maKhachHang;

    @Column(name="ho_va_ten")
    private String hoVaTen;

    @Column(name="dia_chi")
    private String diaChi;

    @Column(name="ngay_sinh")
    private Date ngaySinh;

//    @OneToOne(mappedBy = "khachHang",cascade = CascadeType.ALL)
//    private DonBanAnService donBanAn;
//
//    @OneToOne(mappedBy = "khachHang",cascade = CascadeType.ALL)
//    private  TheService the;


    public KhachHang(int maKhachHang, String hoVaTen, String diaChi, Date ngaySinh) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public KhachHang() {
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
