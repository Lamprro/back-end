package restaurant.com.Service.Impl;

import restaurant.com.entity.TaiKhoan;
import restaurant.com.entity.The;

import java.util.List;

public interface TheService {
    public List<The> getAllThe();

    public The getTheById(String id);

    public The addThe(The the);

    public The updateThe(The the);

    public void deleteTheById(String id);

}
