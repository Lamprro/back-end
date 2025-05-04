package restaurant.com.Service.Impl;

import restaurant.com.entity.BaoCao;
import restaurant.com.entity.CuaHang;

import java.util.List;

public interface CuaHangService {
    public List<CuaHang> getAllCuaHang();

    public CuaHang getCuaHangById(String id);

    public CuaHang addCuaHang(CuaHang cuaHang);

    public CuaHang updateCuaHang(CuaHang cuaHang);

    public void deleteCuaHangById(String id);
}
