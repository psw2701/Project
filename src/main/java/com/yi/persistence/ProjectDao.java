package com.yi.persistence;

import java.util.List;

import com.yi.domain.ProjectManagementVO;

public interface ProjectDao {
	public int insert(ProjectManagementVO vo);

	public int selectLastNo();

	public List<ProjectManagementVO> list();

	public ProjectManagementVO selectByNo(int no);

	public int delete(int no);

	public int update(ProjectManagementVO vo);
}
