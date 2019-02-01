package com.yi.projectmanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectManagementVO;
import com.yi.persistence.ProjectDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectDAOTest {
	@Autowired
	ProjectDao dao;
	
	//@Test
	public void testInsert() {
		ProjectManagementVO vo = new ProjectManagementVO();
		vo.setNo(3);
		vo.setName("프로젝트3");
		vo.setContent("내용입니다.");
		vo.setStart_date(new Date(2019-1900,11,3));
		vo.setEnd_date(new Date(2019-1900,11,5));
		vo.setProgress("진행중");
		dao.insert(vo);
	}
	
	@Test
	public void testList() {
		dao.list();
	}
	
	//@Test
	public void testDelete() {
		ProjectManagementVO vo = new ProjectManagementVO();
		vo.setNo(2);
		dao.delete(2);
	}
	
	@Test
	public void testUpdate() {
		ProjectManagementVO vo = new ProjectManagementVO();
		vo.setNo(1);
		vo.setName("수정");
		vo.setContent("수정합니다.");
		vo.setStart_date(new Date(2019-1900,11,3));
		vo.setEnd_date(new Date(2019-1900,11,5));
		vo.setProgress("종료");
		dao.update(vo);
	}
	
}
