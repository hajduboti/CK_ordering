package ck.ordering.Repository;

import ck.ordering.Entities.Menu;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Chris on 20-11-17.
 */
public interface MenuRepository extends CrudRepository<Menu, Long> {
    Menu findByMenuName(String menuName);


}
