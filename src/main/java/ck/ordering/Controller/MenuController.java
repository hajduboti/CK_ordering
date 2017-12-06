package ck.ordering.Controller;


import ck.ordering.Entities.Item;
import ck.ordering.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RestController
public class MenuController {

    @Autowired
    MenuRepository mr;

    @GetMapping("/")
    public ModelAndView homeview(){
        ModelAndView mv = new ModelAndView("mainpage");
        return mv;
    }


    @RequestMapping("/menu")
    public Collection<Item> getMenu(){

        return Arrays.asList(
                new Item(1,"bawl",90.00),
                new Item(2,"bawl",90.00),
                new Item(3,"bawl",90.00)
        );
    }

    @RequestMapping("/checkout/{one}/{two}/{three}/{four}/{five}")
    public  Collection<Item>  getSelectedMenu(
            @PathVariable int one,
            @PathVariable int two,
            @PathVariable int three,
            @PathVariable int four,
            @PathVariable int five)
    {
        ArrayList<Item> basket = new ArrayList();

        if(one > 0){
            for(int i = 0; i < one;i++) {
                basket.add(mr.findOne(1));
            }
        }
        if(two > 0){
            for(int i = 0; i < two;i++) {
                basket.add(mr.findOne(2));
            }
        }
        if(three > 0){
            for(int i = 0; i < three;i++) {
                basket.add(mr.findOne(3));
            }
        }
        if(four > 0){
            for(int i = 0; i < four;i++) {
                basket.add(mr.findOne(4));
            }
        }
        if(five > 0){
            for(int i = 0; i < five;i++) {
                basket.add(mr.findOne(5));
            }
        }


        return basket;
    }

}
