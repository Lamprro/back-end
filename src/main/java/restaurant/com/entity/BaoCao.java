package restaurant.com.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="bao_cao")
public class BaoCao {
    @Id
    @Column(name="ma_bao_cao")
    private String maBaoCao;

    @Column(name="thoi_gian_tao")
    private Date thoiGianTao;

    @Column(name="noi_dung_bao_cao")
    private String noiDungBaoCao;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="ma_nhan_vien")
    private NhanVien nhanVien;

    public String getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public String getNoiDungBaoCao() {
        return noiDungBaoCao;
    }

    public void setNoiDungBaoCao(String noiDungBaoCao) {
        this.noiDungBaoCao = noiDungBaoCao;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public BaoCao() {
    }

    public BaoCao(String maBaoCao, Date thoiGianTao, String noiDungBaoCao, NhanVien nhanVien) {
        this.maBaoCao = maBaoCao;
        this.thoiGianTao = thoiGianTao;
        this.noiDungBaoCao = noiDungBaoCao;
        this.nhanVien = nhanVien;
    }
}
