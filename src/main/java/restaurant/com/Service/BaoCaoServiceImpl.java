package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.BaoCaoDAO;
import restaurant.com.Service.Impl.BaoCaoService;
import restaurant.com.entity.BaoCao;

import java.util.List;

@Service
public class BaoCaoServiceImpl implements BaoCaoService {

    private BaoCaoDAO baoCaoDAO;

    @Autowired
    public void setBaoCaoDAO(BaoCaoDAO baoCaoDAO) {
        this.baoCaoDAO = baoCaoDAO;
    }

    @Override
    public List<BaoCao> getAllBaoCao() {
        return baoCaoDAO.findAll();
    }

    @Override
    public BaoCao getBaoCaoById(String id) {
        return baoCaoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public BaoCao addBaoCao(BaoCao banAn) {
        return baoCaoDAO.save(banAn);
    }

    @Override
    @Transactional
    public BaoCao updateBaoCao(BaoCao banAn) {
        return baoCaoDAO.saveAndFlush(banAn);
    }

    @Override
    @Transactional
    public void deleteBaoCaoById(String id) {
        baoCaoDAO.deleteById(id);
    }
}
