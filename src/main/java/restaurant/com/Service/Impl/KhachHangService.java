package restaurant.com.Service.Impl;

import restaurant.com.entity.HoaDon;
import restaurant.com.entity.KhachHang;

import java.util.List;

public interface KhachHangService {
    public List<KhachHang> getAllKhachHang();

    public KhachHang getKhachHangById(String id);

    public KhachHang addKhachHang(KhachHang khacHang);

    public KhachHang updateKhachHang(KhachHang khachHang);

    public void deleteKhachHangById(String id);
}
