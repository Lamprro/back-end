package restaurant.com.Controlelr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restaurant.com.Service.BanAnServiceImpl;
import restaurant.com.Service.DonBanAnServiceImpl;
import restaurant.com.Service.NhanVienServiceImpl;

@RestController
@RequestMapping("/api/dau_bep")
@CrossOrigin(origins = "http://localhost:3000")
public class DauBepController {
    @Autowired
    NhanVienServiceImpl  nhanVienService;

    @Autowired
    DonBanAnServiceImpl donBanAnService;

}
