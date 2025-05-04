package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.KhachHangDAO;
import restaurant.com.Service.Impl.KhachHangService;
import restaurant.com.entity.KhachHang;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangDAO khachHangDAO;
    @Autowired
    public KhachHangServiceImpl (KhachHangDAO khachHangDAO) {
        this.khachHangDAO = khachHangDAO;
    }

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangDAO.findAll();
    }

    @Override
    public KhachHang getKhachHangById(String id) {
        return khachHangDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public KhachHang addKhachHang(KhachHang khacHang) {
        return khachHangDAO.save(khacHang);
    }

    @Override
    @Transactional
    public KhachHang updateKhachHang(KhachHang khachHang) {
        return khachHangDAO.saveAndFlush(khachHang);
    }

    @Override
    @Transactional
    public void deleteKhachHangById(String id) {
        khachHangDAO.deleteById(id);
    }
}
