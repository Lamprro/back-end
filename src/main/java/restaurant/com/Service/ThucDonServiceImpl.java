package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.ThucDonDAO;
import restaurant.com.Service.Impl.ThucDonService;
import restaurant.com.entity.ThucDon;

import java.util.List;

@Service
public class ThucDonServiceImpl implements ThucDonService {

    private final ThucDonDAO thucDonDAO;

    @Autowired
    public ThucDonServiceImpl(ThucDonDAO thucDonDAO) {
        this.thucDonDAO = thucDonDAO;
    }

    @Override
    public List<ThucDon> getAllThucDon() {
        return thucDonDAO.findAll();
    }

    @Override
    public ThucDon getThucDonById(String id) {
        return thucDonDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ThucDon addThucDon(ThucDon thucDon) {
        return thucDonDAO.save(thucDon);
    }

    @Override
    @Transactional
    public ThucDon updateThucDon(ThucDon thucDon) {
        return thucDonDAO.saveAndFlush(thucDon);
    }

    @Override
    @Transactional
    public void deleteThucDonById(String id) {
        thucDonDAO.deleteById(id);
    }
}
