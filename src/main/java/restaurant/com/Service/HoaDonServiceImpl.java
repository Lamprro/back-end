package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.HoaDonDAO;
import restaurant.com.Service.Impl.HoaDonService;
import restaurant.com.entity.HoaDon;

import java.util.List;

@Service
public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonDAO hoaDonDAO;
    @Autowired
    public void HoaDonServiceImpl (HoaDonDAO hoaDonDAO) {
        this.hoaDonDAO = hoaDonDAO;
    }

    @Override
    public List<HoaDon> getAllHoaDon() {
        return hoaDonDAO.findAll();
    }

    @Override
    public HoaDon getHoaDonById(String id) {
        return hoaDonDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public HoaDon addHoaDon(HoaDon hoaDon) {
        return hoaDonDAO.save(hoaDon);
    }

    @Override
    @Transactional
    public HoaDon updateHoaDon(HoaDon hoaDon) {
        return hoaDonDAO.saveAndFlush(hoaDon);
    }

    @Override
    @Transactional
    public void deleteHoaDonById(String id) {
        hoaDonDAO.deleteById(id);
    }
}
