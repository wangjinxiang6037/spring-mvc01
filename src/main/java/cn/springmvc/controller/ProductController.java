package cn.springmvc.controller;


import cn.juechuang.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/product")

public class ProductController {
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    @ResponseBody
    public List<Product> list (){
        //模拟数据
        ArrayList<Product> list = new ArrayList<>();
        Product pro1 = new Product(1, "手机", 6000, "中国", new Date());
        Product pro2 = new Product(1, "手机", 6000, "中国", new Date());
        Product pro3 = new Product(1, "手机", 6000, "中国", new Date());
        list.add(pro1);
        list.add(pro2);
        list.add(pro3);
        return list;


    }
    /**
     *
     */
    @RequestMapping(value = "/get/{productId}" ,method =RequestMethod.GET )
    public Product get(@PathVariable Integer productId)
    {

    }}
