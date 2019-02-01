package com.yi.projectmanagement;

import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectManagementVO;
import com.yi.persistence.ProjectDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProjectDAOTest {
	@Autowired
	ProjectDao dao;
	
	@Test
	public void test01Insert() {
		ProjectManagementVO vo = new ProjectManagementVO();
		vo.setName("프로젝트5");
		vo.setContent("내용입니다.5");
		vo.setStart_date(new Date(2019-1900,11,3));
		vo.setEnd_date(new Date(2019-1900,11,5));
		vo.setProgress("진행중");
		dao.insert(vo);
	}
	
	@Test
	public void test02List() {
		dao.list();
	}
	
	@Test
	public void test04Delete() {
		ProjectManagementVO vo = new ProjectManagementVO();
		vo.setNo(5);
		dao.delete(5);
	}
	
	@Test
	public void test03Update() {
		ProjectManagementVO vo = new ProjectManagementVO();
		vo.setNo(5);
		vo.setName("수정");
		vo.setContent("수정합니다.");
		vo.setStart_date(new Date(2019-1900,11,3));
		vo.setEnd_date(new Date(2019-1900,11,5));
		vo.setProgress("종료");
		dao.update(vo);
	}
	
}

