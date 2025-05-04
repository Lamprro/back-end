package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.ChiTietDonDAO;
import restaurant.com.Service.Impl.ChiTietDonService;
import restaurant.com.entity.ChiTietDon;

import java.util.List;

@Service
public class ChiTietDonServiceImpl implements ChiTietDonService {

    private ChiTietDonDAO chiTietDonDAO;
    @Autowired
    public ChiTietDonServiceImpl (ChiTietDonDAO chiTietDonDAO) {
        this.chiTietDonDAO = chiTietDonDAO;
    }
    @Override
    public List<ChiTietDon> getAllChiTietDon() {
        return chiTietDonDAO.findAll();
    }

    @Override
    public ChiTietDon getChiTietDonById(String id) {
        return chiTietDonDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ChiTietDon addChiTietDon(ChiTietDon chiTietDon) {
        return chiTietDonDAO.save(chiTietDon);
    }

    @Override
    @Transactional
    public ChiTietDon updateChiTietDon(ChiTietDon chiTietDon) {
        return chiTietDonDAO.saveAndFlush(chiTietDon);
    }

    @Override
    @Transactional
    public void deleteChiTietDonById(String id) {
        chiTietDonDAO.deleteById(id);
    }
}
