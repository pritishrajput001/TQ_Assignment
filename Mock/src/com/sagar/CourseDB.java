package com.sagar;

class CourseDB {
	private Course[] courses;
	private int numCourses;

	public CourseDB(int maxCourses) {
		courses = new Course[maxCourses];
		numCourses = 0;
	}

	public void addCourse(Course course) {
		courses[numCourses] = course;
		numCourses++;
	}

	public void deleteCourse(int cId) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].getCId() == cId) {
				for (int j = i; j < numCourses - 1; j++) {
					courses[j] = courses[j + 1];
				}
				courses[--numCourses] = null;
				System.out.println("Course with ID " + cId + " deleted successfully.");
				return;
			}
		}
		System.out.println("Course with ID " + cId + " not found.");
	}

	public void updateCourse(int cId, String cName, double cfee) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].getCId() == cId) {
				courses[i].setCName(cName);
				courses[i].setCfee(cfee);
				System.out.println("Course with ID " + cId + " updated successfully.");
				return;
			}
		}
		System.out.println("Course with ID " + cId + " not found.");
	}

	public void viewCourse(int cId) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].getCId() == cId) {
				System.out.println(courses[i]);
				return;
			}
		}
		System.out.println("Course with ID " + cId + " not found.");
	}

	public void displayCourses() {
		if (numCourses == 0) {
			System.out.println("No courses to display.");
			return;
		}
		System.out.println("List of courses:");
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i]);
		}
	}
}
