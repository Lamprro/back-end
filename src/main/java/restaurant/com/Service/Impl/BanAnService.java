package restaurant.com.Service.Impl;

import restaurant.com.entity.BanAn;

import java.util.List;
import java.util.Optional;

public interface BanAnService {
    public List<BanAn> getAllBanAns();

    public BanAn getBanAnById(String id);

    public BanAn addBanAn(BanAn banAn);

    public BanAn updateBanAn(BanAn banAn);

    public void deleteBanAnById(String id);

}
