package restaurant.com.Service.Impl;

import restaurant.com.entity.ThucDon;
import restaurant.com.entity.ThucDonHangNgay;

import java.util.List;

public interface ThucDonHangNgayService {
    public List<ThucDonHangNgay> getAllThucDonHangNgay();

    public ThucDonHangNgay getThucDonHangNgayById(String id);

    public ThucDonHangNgay addThucDonHangNgay(ThucDonHangNgay thucDonHangNgay);

    public ThucDonHangNgay updateThucDonHangNgay(ThucDonHangNgay thucDonHangNgay);

    public void deleteThucDonHangNgayById(String id);
}
