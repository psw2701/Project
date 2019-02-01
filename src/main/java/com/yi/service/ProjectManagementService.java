package com.yi.service;

import java.util.List;

import com.yi.domain.ProjectManagementVO;

public interface ProjectManagementService {
	public int insert(ProjectManagementVO vo);

	public int selectLastNo();

	public List<ProjectManagementVO> list();

	public ProjectManagementVO selectByNo(int no);

	public int delete(int no);

	public int update(ProjectManagementVO vo);
}
