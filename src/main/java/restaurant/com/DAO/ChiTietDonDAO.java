package restaurant.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.com.entity.BanAn;
import restaurant.com.entity.ChiTietDon;

@Repository
public interface  ChiTietDonDAO extends JpaRepository<ChiTietDon, String> {
}
