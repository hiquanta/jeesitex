/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.hiquanta.jeesitex.modules.sys.dao;


import com.hiquanta.jeesitex.common.persistence.CrudDao;
import com.hiquanta.jeesitex.common.persistence.annotation.MyBatisDao;
import com.hiquanta.jeesitex.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
