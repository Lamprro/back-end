package restaurant.com.Service.Impl;

import restaurant.com.entity.BaoCao;
import restaurant.com.entity.ChiTietDon;

import java.util.List;

public interface ChiTietDonService {
    public List<ChiTietDon> getAllChiTietDon();

    public ChiTietDon getChiTietDonById(String id);

    public ChiTietDon addChiTietDon(ChiTietDon chiTietDon);

    public ChiTietDon updateChiTietDon(ChiTietDon chiTietDon);

    public void deleteChiTietDonById(String id);
}
