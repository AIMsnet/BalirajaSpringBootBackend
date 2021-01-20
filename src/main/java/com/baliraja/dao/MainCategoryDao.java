package com.baliraja.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baliraja.entity.MainCategory;

@Repository
public interface MainCategoryDao extends CrudRepository<MainCategory, Integer>{

}
