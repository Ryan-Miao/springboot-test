package com.test.web.controller;

import com.github.pagehelper.PageHelper;
import com.test.domain.dao.model.City;
import com.test.domain.service.ICityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by miaorf on 2016/6/26.
 */

@RequestMapping("/cities")
@Controller
public class CityController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ICityService cityService;

    @ResponseBody
    @RequestMapping("")
    public List<City> getAll(City city){
        if (city.getPage() != null && city.getRows() != null) {
            PageHelper.startPage(city.getPage(), city.getRows(), "id");
        }
        List<City> all = cityService.getAll(city);
        logger.info("{}",all);

        return all;
    }


}
