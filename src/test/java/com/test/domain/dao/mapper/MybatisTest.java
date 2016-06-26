package com.test.domain.dao.mapper;

import com.test.common.config.ApplicationContextConfig;
import com.test.domain.dao.model.City2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaorf on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@SpringApplicationConfiguration(ApplicationContextConfig.class)
public class MybatisTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MyBatis331Mapper mapper;


    @Rollback
    @Test
    public void testInsertList() {
        List<City2> city2List = new ArrayList<City2>();
        city2List.add(new City2("石家庄", "河北"));
        city2List.add(new City2("邯郸", "河北"));
        city2List.add(new City2("秦皇岛", "河北"));
        Assert.assertEquals(3, mapper.insertCities(city2List));
        for (City2 c2 : city2List) {
            logger.info(c2.toString());
            Assert.assertNotNull(c2.getId());
        }
    }

    @Test
    public void testSelectById(){
        City2 city2 = mapper.selectByCityId(1);
        logger.info(city2.toString());
        Assert.assertNotNull(city2);
        Assert.assertNotNull(city2.getCityName());
        Assert.assertNotNull(city2.getCityState());
    }

    @Test
    public void testSelectAll(){
        List<City2> city2List = mapper.selectAll();
        for(City2 c2 : city2List){
            logger.info(c2.toString());
            Assert.assertNotNull(c2);
            Assert.assertNotNull(c2.getCityName());
            Assert.assertNotNull(c2.getCityState());
        }
    }
}