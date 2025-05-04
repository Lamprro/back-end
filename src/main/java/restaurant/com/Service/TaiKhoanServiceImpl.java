package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.TaiKhoanDAO;
import restaurant.com.Service.Impl.TaiKhoanService;
import restaurant.com.entity.TaiKhoan;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

    private TaiKhoanDAO taiKhoanDAO;

    @Autowired
    public TaiKhoanServiceImpl(TaiKhoanDAO taiKhoanDAO) {
        this.taiKhoanDAO = taiKhoanDAO;
    }

    @Override
    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanDAO.findAll();
    }

    @Override
    public TaiKhoan getTaiKhoanById(String id) {
        return taiKhoanDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TaiKhoan addTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanDAO.save(taiKhoan);
    }

    @Override
    @Transactional
    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanDAO.saveAndFlush(taiKhoan);
    }

    @Override
    @Transactional
    public void deleteTaiKhoanById(String id) {
        taiKhoanDAO.deleteById(id);
    }
}
