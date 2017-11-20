package ck.ordering.Controller;


import ck.ordering.Entities.Menu;
import ck.ordering.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Null;
import java.util.Collection;

@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuRepository mr;

//    @RequestMapping(method = RequestMethod.GET)
//    public Collection<Menu> getMenu(){
//
//    }

    @PostMapping("/menu/add")
    public ModelAndView addMenuandDisplay(
        @RequestParam(name = "name", defaultValue ="NO_NAME")
                String name,
        @RequestParam(name = "price", defaultValue = "NO_PRICE")
                int price){

        Menu m = new Menu();

        mr.save(m);
        ModelAndView mv = new ModelAndView("index");
        return mv;

        }
    }
