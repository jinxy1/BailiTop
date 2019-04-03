package com.asiainfo.abdinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.IVersionDao;
import com.asiainfo.abdinfo.service.IVersionService;
@Service("VersionServiceImpl")
public class VersionServiceImpl implements IVersionService{

	@Resource
	private IVersionDao versionDao;
	@Override
	public int findVersion() {
		return versionDao.findVersion();
	}

}
