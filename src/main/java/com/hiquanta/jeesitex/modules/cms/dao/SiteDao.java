/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.hiquanta.jeesitex.modules.cms.dao;


import com.hiquanta.jeesitex.common.persistence.CrudDao;
import com.hiquanta.jeesitex.common.persistence.annotation.MyBatisDao;
import com.hiquanta.jeesitex.modules.cms.entity.Site;

/**
 * 站点DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface SiteDao extends CrudDao<Site> {

}
