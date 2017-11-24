package ck.ordering.Repository;

import ck.ordering.Entities.Menu;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gabriele on 24/11/2017.
 */
public interface MenuRepository extends CrudRepository<Menu, Integer> {
}
