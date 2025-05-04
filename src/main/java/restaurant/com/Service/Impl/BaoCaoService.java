package restaurant.com.Service.Impl;

import restaurant.com.entity.BanAn;
import restaurant.com.entity.BaoCao;

import java.util.List;

public interface BaoCaoService {
    public List<BaoCao> getAllBaoCao();

    public BaoCao getBaoCaoById(String id);

    public BaoCao addBaoCao(BaoCao banAn);

    public BaoCao updateBaoCao(BaoCao banAn);

    public void deleteBaoCaoById(String id);

}
