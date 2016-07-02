package com.church.visit.dao;

import com.church.visit.model.Visitor;

/**
 * Created by Philip on 2016/7/2.
 */
public interface VisitorDao {

  public Long insert(Visitor visitor);

  public Long updateById(Visitor visitor);

  public Visitor getById(Long id);
}
