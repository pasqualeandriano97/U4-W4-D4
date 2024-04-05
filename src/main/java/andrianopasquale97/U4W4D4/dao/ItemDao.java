package andrianopasquale97.U4W4D4.dao;

import andrianopasquale97.U4W4D4.entities.Item;

import andrianopasquale97.U4W4D4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<Pizza,Long> {

}
