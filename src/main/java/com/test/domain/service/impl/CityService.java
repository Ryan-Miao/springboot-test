package com.test.domain.service.impl;

import com.test.domain.dao.mapper.CityMapper;
import com.test.domain.dao.model.City;
import com.test.domain.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by miaorf on 2016/6/26.
 */
@Service
public class CityService implements ICityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> getAll(City city) {

        return cityMapper.selectAll();

    }
}
