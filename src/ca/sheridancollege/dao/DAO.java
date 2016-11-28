package ca.sheridancollege.dao;

import java.util.ArrayList;
import java.util.Iterator;

import ca.sheridancollege.beans.Student;

public class DAO {
	private ArrayList<Student> studentList = new ArrayList<Student>();

	public ArrayList<Student> studentList() {
		// TODO Auto-generated method stub
		return studentList;
	}

	public synchronized void putStudent(int id, String name) {
		// TODO Auto-generated method stub
		studentList.add(new Student(id, name));
	}
	public synchronized void postStudent(int id, String name) {
		// TODO Auto-generated method stub
		studentList.add(new Student(id, name));
	}

	public synchronized void deleteStudent(int id) {

		for(Student s : studentList){
			if(s.getId()==id){
				
				studentList.remove(s);
			
			}
		}
		/*Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {
		    Student element = itr.next();
		   if(element.getId()==id){
			     studentList.remove(itr);
		   }*/
		}
		
		
	}


