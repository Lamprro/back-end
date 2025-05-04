package restaurant.com.Service.Impl;

import restaurant.com.entity.The;
import restaurant.com.entity.ThucDon;

import java.util.List;

public interface ThucDonService {
    public List<ThucDon> getAllThucDon();

    public ThucDon getThucDonById(String id);

    public ThucDon addThucDon(ThucDon thucDon);

    public ThucDon updateThucDon(ThucDon thucDon);

    public void deleteThucDonById(String id);
}
