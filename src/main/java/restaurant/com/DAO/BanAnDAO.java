package restaurant.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.com.entity.BanAn;

@Repository
public interface  BanAnDAO extends JpaRepository<BanAn, String> {
}
