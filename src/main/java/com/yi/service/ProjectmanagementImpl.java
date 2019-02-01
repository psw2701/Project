package com.yi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectManagementVO;
import com.yi.persistence.ProjectDao;

@Service
public class ProjectmanagementImpl implements ProjectManagementService {
	@Autowired
	ProjectDao dao;

	@Override
	public int insert(ProjectManagementVO vo) {
		// TODO Auto-generated method stub
		return dao.insert(vo);
	}

	@Override
	public int selectLastNo() {
		// TODO Auto-generated method stub
		return dao.selectLastNo();
	}

	@Override
	public List<ProjectManagementVO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public ProjectManagementVO selectByNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByNo(no);
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return dao.delete(no);
	}

	@Override
	public int update(ProjectManagementVO vo) {
		// TODO Auto-generated method stub
		return dao.update(vo);
	}

}
