package andrianopasquale97.U4W4D4.dao;

import andrianopasquale97.U4W4D4.entities.Item;
import andrianopasquale97.U4W4D4.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ItemService {
    @Autowired
    private ItemDao itemDao;


    public void saveItem(Pizza item) {
        log.info("Saving item: {}", item);
        itemDao.save(item);
    }

}
