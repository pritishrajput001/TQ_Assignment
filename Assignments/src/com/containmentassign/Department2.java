package com.containmentassign;

public class Department2 {
	private int deptId;
	private String deptName;

	public Department2() {

	}

	public Department2(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;

	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String toString() {
		return " Department id- " + deptId + " Department Name- " + deptName;
	}

}
