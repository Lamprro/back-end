package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.ThucDonHangNgayDAO;
import restaurant.com.Service.Impl.ThucDonHangNgayService;
import restaurant.com.entity.ThucDonHangNgay;

import java.util.List;

@Service
public class ThucDonHangNgayServiceImpl implements ThucDonHangNgayService {

    private final ThucDonHangNgayDAO thucDonHangNgayDAO;

    @Autowired
    public ThucDonHangNgayServiceImpl(ThucDonHangNgayDAO thucDonHangNgayDAO) {
        this.thucDonHangNgayDAO = thucDonHangNgayDAO;
    }

    @Override
    public List<ThucDonHangNgay> getAllThucDonHangNgay() {
        return thucDonHangNgayDAO.findAll();
    }

    @Override
    public ThucDonHangNgay getThucDonHangNgayById(String id) {
        return thucDonHangNgayDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ThucDonHangNgay addThucDonHangNgay(ThucDonHangNgay thucDonHangNgay) {
        return thucDonHangNgayDAO.save(thucDonHangNgay);
    }

    @Override
    @Transactional
    public ThucDonHangNgay updateThucDonHangNgay(ThucDonHangNgay thucDonHangNgay) {
        return thucDonHangNgayDAO.saveAndFlush(thucDonHangNgay);
    }

    @Override
    @Transactional
    public void deleteThucDonHangNgayById(String id) {
        thucDonHangNgayDAO.deleteById(id);
    }
}
