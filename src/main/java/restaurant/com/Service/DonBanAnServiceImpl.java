package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.DonBanAnDAO;
import restaurant.com.DAO.NhanVienDAO;
import restaurant.com.Service.Impl.DonBanAnService;
import restaurant.com.entity.DonBanAn;
import restaurant.com.entity.NhanVien;

import java.util.List;

@Service
public class DonBanAnServiceImpl implements DonBanAnService {

    private DonBanAnDAO donBanAnDAO;
    private NhanVienDAO nhanVienDAO;
    @Autowired
    public DonBanAnServiceImpl (DonBanAnDAO donBanAnDAO, NhanVienDAO nhanVienDAO) {
        this.donBanAnDAO = donBanAnDAO;
        this.nhanVienDAO = nhanVienDAO;
    }

    @Override
    public List<DonBanAn> getAllDonBanAn() {
        return donBanAnDAO.findAll();
    }

    @Override
    public DonBanAn getDonBanAnById(String id) {
        return donBanAnDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DonBanAn addDonBanAn(DonBanAn donBanAn) {
        return donBanAnDAO.save(donBanAn);
    }

    @Override
    @Transactional
    public DonBanAn updateDonBanAn(DonBanAn donBanAn) {
        return donBanAnDAO.saveAndFlush(donBanAn);
    }

    @Override
    @Transactional
    public void deleteDonBanAnById(String id) {
        donBanAnDAO.deleteById(id);
    }

    @Override
    public void addNhanVien_DonBanAn(String maDonBanAn, String maNhanVien) {
        NhanVien a = nhanVienDAO.findById(maNhanVien).orElseThrow(() -> new RuntimeException("Không tìm thấy Đầu bếp"));
        DonBanAn b= donBanAnDAO.findById(maDonBanAn).orElseThrow(() -> new RuntimeException("Không tìm thấy Đơn bàn ăn"));
        b.getNhanVien().add(a);
        donBanAnDAO.saveAndFlush(b);
    }
}
