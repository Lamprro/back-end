package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.BanAnDAO;
import restaurant.com.Service.Impl.BanAnService;
import restaurant.com.entity.BanAn;

import java.util.List;
import java.util.Optional;

@Service
public class BanAnServiceImpl implements BanAnService {
    BanAnDAO banAnDAO;

    @Autowired
    public BanAnServiceImpl (BanAnDAO banAnDAO) {
        this.banAnDAO = banAnDAO;
    }

    @Override
    public List<BanAn> getAllBanAns() {
        return banAnDAO.findAll();
    }

    @Override
    public BanAn getBanAnById(String id) {
            return banAnDAO.findById(id).orElse(null);
    }

    @Override
    public BanAn addBanAn(BanAn banAn) {
        return banAnDAO.save(banAn);
    }


    @Override
    @Transactional
    public BanAn updateBanAn(BanAn banAn) {
        return banAnDAO.saveAndFlush(banAn);
    }

    @Override
    @Transactional
    public void deleteBanAnById(String id) {
        banAnDAO.deleteById(id);
    }
}
