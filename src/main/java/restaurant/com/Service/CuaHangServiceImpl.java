package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.CuaHangDAO;
import restaurant.com.Service.Impl.CuaHangService;
import restaurant.com.entity.CuaHang;

import java.util.List;

@Service
public class CuaHangServiceImpl implements CuaHangService {

    private CuaHangDAO cuaHangDAO;
    @Autowired
    public CuaHangServiceImpl (CuaHangDAO cuaHangDAO) {
        this.cuaHangDAO = cuaHangDAO;
    }

    @Override
    public List<CuaHang> getAllCuaHang() {
        return cuaHangDAO.findAll();
    }

    @Override
    public CuaHang getCuaHangById(String id) {
        return cuaHangDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public CuaHang addCuaHang(CuaHang cuaHang) {
        return cuaHangDAO.save(cuaHang);
    }

    @Override
    @Transactional
    public CuaHang updateCuaHang(CuaHang cuaHang) {
        return cuaHangDAO.saveAndFlush(cuaHang);
    }

    @Override
    @Transactional
    public void deleteCuaHangById(String id) {
        cuaHangDAO.deleteById(id);
    }
}
