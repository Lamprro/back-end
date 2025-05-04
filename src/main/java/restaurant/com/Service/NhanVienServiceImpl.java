package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.DonBanAnDAO;
import restaurant.com.DAO.NhanVienDAO;
import restaurant.com.Service.Impl.NhanVienService;
import restaurant.com.entity.DonBanAn;
import restaurant.com.entity.NhanVien;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienDAO nhanVienDAO;

    @Autowired
    public NhanVienServiceImpl(NhanVienDAO nhanVienDAO) {
        this.nhanVienDAO = nhanVienDAO;
    }

    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienDAO.findAll();
    }

    @Override
    public NhanVien getNhanVienById(String id) {
        return nhanVienDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public NhanVien addNhanVien(NhanVien nhanVien) {
        return nhanVienDAO.save(nhanVien);
    }

    @Override
    @Transactional
    public NhanVien updateNhanVien(NhanVien nhanVien) {
        return nhanVienDAO.saveAndFlush(nhanVien);
    }

    @Override
    @Transactional
    public void deleteNhanVienById(String id) {
        nhanVienDAO.deleteById(id);
    }


}
