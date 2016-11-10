/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.hiquanta.jeesitex.modules.cms.service;


import com.hiquanta.jeesitex.common.service.CrudService;
import com.hiquanta.jeesitex.modules.cms.dao.ArticleDataDao;
import com.hiquanta.jeesitex.modules.cms.entity.ArticleData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 站点Service
 * @author ThinkGem
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
