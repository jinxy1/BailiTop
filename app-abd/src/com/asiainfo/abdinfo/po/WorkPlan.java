package com.asiainfo.abdinfo.po;

public class WorkPlan {
			    private Integer  id;
			    //部门
		        private String  department;
		        //人员编码
		        private String  staffCode;
		        //姓名
		        private String  staffName;
		        //日期
		        private String  date;
		        /*//类型
		        private String  type;
		        //项目名称
		        private String  projectname;
		        //计划时长
		        private String  plantime;
		        //实际时长
		        private String  actualtime;
		        //计划完成内容
		        private String  conbecom;
		        //对接人
		        private String  dockingpeople;
		        //完成率
		        private String  completion;
		        //未完成原因
		        private String  outcause;*/
		        //实际完成内容
		        private String  actconcom;
		        
		        private String createDate;
		        
				public Integer getId() {
					return id;
				}
				public void setId(Integer id) {
					this.id = id;
				}
				public String getDepartment() {
					return department;
				}
				public void setDepartment(String department) {
					this.department = department;
				}
				
				public String getDate() {
					return date;
				}
				public void setDate(String date) {
					this.date = date;
				}
				/*public String getType() {
					return type;
				}
				public void setType(String type) {
					this.type = type;
				}
				public String getProjectname() {
					return projectname;
				}
				public void setProjectname(String projectname) {
					this.projectname = projectname;
				}
				public String getPlantime() {
					return plantime;
				}
				public void setPlantime(String plantime) {
					this.plantime = plantime;
				}
				public String getActualtime() {
					return actualtime;
				}
				public void setActualtime(String actualtime) {
					this.actualtime = actualtime;
				}
				public String getConbecom() {
					return conbecom;
				}
				public void setConbecom(String conbecom) {
					this.conbecom = conbecom;
				}
				public String getDockingpeople() {
					return dockingpeople;
				}
				public void setDockingpeople(String dockingpeople) {
					this.dockingpeople = dockingpeople;
				}
				public String getCompletion() {
					return completion;
				}
				public void setCompletion(String completion) {
					this.completion = completion;
				}
				public String getOutcause() {
					return outcause;
				}
				public void setOutcause(String outcause) {
					this.outcause = outcause;
				}*/
				public String getActconcom() {
					return actconcom;
				}
				public void setActconcom(String actconcom) {
					this.actconcom = actconcom;
				}
				public String getStaffCode() {
					return staffCode;
				}
				public void setStaffCode(String staffCode) {
					this.staffCode = staffCode;
				}
				public String getStaffName() {
					return staffName;
				}
				public void setStaffName(String staffName) {
					this.staffName = staffName;
				}
				
				public String getCreateDate() {
					return createDate;
				}
				public void setCreateDate(String createDate) {
					this.createDate = createDate;
				}
				@Override
				public String toString() {
					return "WorkPlan [id=" + id + ", department=" + department + ", staffCode=" + staffCode
							+ ", staffName=" + staffName + ", date=" + date + ", actconcom=" + actconcom
							+ ", createDate=" + createDate + "]";
				}
				
				
				
				
}
