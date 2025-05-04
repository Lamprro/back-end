package restaurant.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restaurant.com.DAO.TheDAO;
import restaurant.com.Service.Impl.TheService;
import restaurant.com.entity.The;

import java.util.List;

@Service
public class TheServiceImpl implements TheService {

    private final TheDAO theDAO;

    @Autowired
    public TheServiceImpl(TheDAO theDAO) {
        this.theDAO = theDAO;
    }

    @Override
    public List<The> getAllThe() {
        return theDAO.findAll();
    }

    @Override
    public The getTheById(String id) {
        return theDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public The addThe(The the) {
        return theDAO.save(the);
    }

    @Override
    @Transactional
    public The updateThe(The the) {
        return theDAO.saveAndFlush(the);
    }

    @Override
    @Transactional
    public void deleteTheById(String id) {
        theDAO.deleteById(id);
    }
}
