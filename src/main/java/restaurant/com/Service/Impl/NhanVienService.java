package restaurant.com.Service.Impl;

import restaurant.com.entity.KhachHang;
import restaurant.com.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    public List<NhanVien> getAllNhanVien();

    public NhanVien getNhanVienById(String id);

    public NhanVien addNhanVien(NhanVien nhanVien);

    public NhanVien updateNhanVien(NhanVien nhanVien);

    public void deleteNhanVienById(String id);

}
