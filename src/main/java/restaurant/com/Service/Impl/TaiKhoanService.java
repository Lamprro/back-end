package restaurant.com.Service.Impl;

import restaurant.com.entity.BanAn;
import restaurant.com.entity.NhanVien;
import restaurant.com.entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanService {
    public List<TaiKhoan> getAllTaiKhoan();

    public TaiKhoan getTaiKhoanById(String id);

    public TaiKhoan addTaiKhoan(TaiKhoan taiKhoan);

    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan);

    public void deleteTaiKhoanById(String id);
}
