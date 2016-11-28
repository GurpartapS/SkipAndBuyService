package ca.sheridancollege.controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.beans.Student;
import ca.sheridancollege.dao.DAO;

@RestController
public class HomeController {
	private DAO dao = new DAO();

	@RequestMapping("/")
	public String Home(Model model) {
		return "home";
	}

	@RequestMapping(value = "/studentList", method = RequestMethod.GET)
	public ArrayList<Student> getStudentList() {
		return dao.studentList();
	}

	@RequestMapping(value = "/studentList/{id}/{name}", method = RequestMethod.PUT)
	public void putStudentListItem(@PathVariable int id, @PathVariable String name) {
		dao.putStudent(id, name);
	}

	@RequestMapping(value = "/studentList/{id}/{name}", method = RequestMethod.POST)
	public void postStudentListItem(@PathVariable int id, @PathVariable String name) {
		dao.postStudent(id, name);
	}

	@RequestMapping(value = "/studentList/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable int id) {
		dao.deleteStudent(id);
	}
}
