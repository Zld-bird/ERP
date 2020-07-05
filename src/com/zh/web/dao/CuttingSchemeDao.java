package com.zh.web.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.zh.core.base.dao.BaseDao;
import com.zh.web.model.bean.CuttingScheme;

@Component("cuttingSchemeDao")
public class CuttingSchemeDao extends BaseDao<CuttingScheme> {

	@Override
	@PostConstruct
	public void init() {
		this.setNamespace("M_Cutting_Scheme");
	}
}
