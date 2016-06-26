package com.test.domain.service;

import com.test.domain.dao.model.City;

import java.util.List;

/**
 * Created by miaorf on 2016/6/26.
 */
public interface ICityService {

    List<City> getAll(City city);
}
