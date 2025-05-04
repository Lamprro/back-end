package restaurant.com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="thuc_don")
public class ThucDon {
    @Id
    @Column(name="ma_mon_an")
    private String maMonAn;

    @Column(name="ten_mon_an")
    private String tenMonAn;

    @Column(name="mo_ta")
    private String moTa;

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ThucDon() {
    }

    public ThucDon(String maMonAn, String tenMonAn, String moTa) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.moTa = moTa;
    }
}
