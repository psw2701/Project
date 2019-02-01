package com.yi.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjectManagementVO;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "mappers.projectmanagement";

	@Override
	public int insert(ProjectManagementVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.insert(namespace + ".insert", vo);
	}

	@Override
	public int selectLastNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProjectManagementVO> list() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".list");
	}

	@Override
	public ProjectManagementVO selectByNo(int no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectByNo", no);
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace + ".delete", no);
	}

	@Override
	public int update(ProjectManagementVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.update(namespace + ".update", vo);
	}

}
