package restaurant.com.Service.Impl;

import restaurant.com.entity.BanAn;
import restaurant.com.entity.DonBanAn;

import java.util.List;

public interface DonBanAnService {
    public List<DonBanAn> getAllDonBanAn();

    public DonBanAn getDonBanAnById(String id);

    public DonBanAn addDonBanAn(DonBanAn donBanAn);

    public DonBanAn updateDonBanAn(DonBanAn donBanAn);

    public void deleteDonBanAnById(String id);

    public void addNhanVien_DonBanAn(String maDonBanAn, String maNhanVien);
}
