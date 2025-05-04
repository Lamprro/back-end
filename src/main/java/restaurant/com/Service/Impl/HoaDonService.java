package restaurant.com.Service.Impl;

import restaurant.com.entity.BanAn;
import restaurant.com.entity.HoaDon;

import java.util.List;

public interface HoaDonService {
    public List<HoaDon> getAllHoaDon();

    public HoaDon getHoaDonById(String id);

    public HoaDon addHoaDon(HoaDon hoaDon);

    public HoaDon updateHoaDon(HoaDon hoaDon);

    public void deleteHoaDonById(String id);
}
