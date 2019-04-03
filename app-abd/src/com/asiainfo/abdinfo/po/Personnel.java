package com.asiainfo.abdinfo.po;

import java.util.List;

import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;

public class Personnel {
			  //人员编码
			  private String usercode;
			  //姓名
	          private String username;
	          //部门
		      private String department;
		      //ID
		      private Integer ID;
		      //事业部
		      private String division;
		      //事业部id
		      private Integer dvsid;
		      //职称
		      private String jobname;
		      //岗位
		      private String jobs;
		      //职位
		      private String position;
		      //密码
		      private String password;
		      //数据级别
		      private Integer datalevel;
		      //开始日期
		      private java.time.LocalDate startdate;
		      //特殊状态
		      private String state;
		      //权限
		      private String permissions;
		      //备注
		      private String comment;
		      //日总结
		      private List<WorkPlan> wplist;
		      //精进
		      private List<OwesContent> octList;
		      //感恩
		      private List<Reflection> rclist;
		      //自主内容
		      private List<Menus> customContent;
		      //微信信息
		      private NewLogin newLogin;
		      
		      public NewLogin getNewLogin() {
				return newLogin;
			}
			public void setNewLogin(NewLogin newLogin) {
				this.newLogin = newLogin;
			}
		      
			
			public List<Menus> getCustomContent() {
				return customContent;
			}
			public void setCustomContent(List<Menus> customContent) {
				this.customContent = customContent;
			}
			public List<WorkPlan> getWplist() {
				return wplist;
			}
			public void setWplist(List<WorkPlan> wplist) {
				this.wplist = wplist;
			}
			public String getUsercode() {
				return usercode;
			}
			public void setUsercode(String usercode) {
				this.usercode = usercode;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getDepartment() {
				return department;
			}
			public void setDepartment(String department) {
				this.department = department;
			}
			public Integer getID() {
				return ID;
			}
			public void setID(Integer iD) {
				ID = iD;
			}
			public String getDivision() {
				return division;
			}
			public void setDivision(String division) {
				this.division = division;
			}
			public Integer getDvsid() {
				return dvsid;
			}
			public void setDvsid(Integer dvsid) {
				this.dvsid = dvsid;
			}
			public String getJobname() {
				return jobname;
			}
			public void setJobname(String jobname) {
				this.jobname = jobname;
			}
			public String getJobs() {
				return jobs;
			}
			public void setJobs(String jobs) {
				this.jobs = jobs;
			}
			public String getPosition() {
				return position;
			}
			public void setPosition(String position) {
				this.position = position;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public Integer getDatalevel() {
				return datalevel;
			}
			public void setDatalevel(Integer datalevel) {
				this.datalevel = datalevel;
			}
			public java.time.LocalDate getStartdate() {
				return startdate;
			}
			public void setStartdate(java.time.LocalDate startdate) {
				this.startdate = startdate;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getPermissions() {
				return permissions;
			}
			public void setPermissions(String permissions) {
				this.permissions = permissions;
			}
			public String getComment() {
				return comment;
			}
			public void setComment(String comment) {
				this.comment = comment;
			}
			
			public List<OwesContent> getOctList() {
				return octList;
			}
			public void setOctList(List<OwesContent> octList) {
				this.octList = octList;
			}
			public List<Reflection> getRclist() {
				return rclist;
			}
			public void setRclist(List<Reflection> rclist) {
				this.rclist = rclist;
			}
			@Override
			public String toString() {
				return "Personnel [usercode=" + usercode + ", username=" + username + ", department=" + department
						+ ", ID=" + ID + ", division=" + division + ", dvsid=" + dvsid + ", jobname=" + jobname
						+ ", jobs=" + jobs + ", position=" + position + ", password=" + password + ", datalevel="
						+ datalevel + ", startdate=" + startdate + ", state=" + state + ", permissions=" + permissions
						+ ", comment=" + comment + ", wplist=" + wplist + ", octList=" + octList + ", rclist=" + rclist
						+ ", customContent=" + customContent + ", newLogin=" + newLogin + "]";
			}
			
			
}
