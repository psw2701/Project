package com.yi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yi.domain.ProjectManagementVO;
import com.yi.service.ProjectManagementService;

@Controller
@RequestMapping("/project/*")
public class ProjectController {
	@Autowired
	private ProjectManagementService service;

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(Model model) {
		logger.info("list ----- GET");
		List<ProjectManagementVO> list = service.list();
		model.addAttribute("list", list);
	}

	@RequestMapping(value = "read", method = RequestMethod.GET)
	public void read(@RequestParam("no") int no, Model model) {
		ProjectManagementVO vo = service.selectByNo(no);
		model.addAttribute("ProjectManagementVO", vo);
	}
	

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public void registGet() {
		logger.info("register ----- get");
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerPost(ProjectManagementVO vo, Model model) {
		logger.info("register ----- Post");

		service.insert(vo);
		model.addAttribute("result", "success");
		return "redirect:/project/list";
	}

	@RequestMapping(value = "remove", method = RequestMethod.POST)
	public String remove(@RequestParam("no") int no, Model model) {
		service.delete(no);
		return "redirect:/project/list";
	}

	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public void modifyGet(@RequestParam("no") int no, Model model) {
		logger.info("modify ----- Get");
		ProjectManagementVO vo = service.selectByNo(no);
		model.addAttribute("ProjectManagementVO", vo);
	}

	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modifyPost(ProjectManagementVO vo) {
		logger.info("modify ----- Post");
		service.update(vo);
		return "redirect:/project/read?no=" + vo.getNo();
	}
}
