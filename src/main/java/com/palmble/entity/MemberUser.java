package com.palmble.entity;

import java.util.Date;

public class MemberUser{

    
    private Integer id;

    
    private String name;

    
    private String phone;

    
    private Integer role;

    
    private Integer grade;

    
    private String eMail;

    
    private String address;

    
    private Integer state;

    
    private String idNumber;

    
    private String createTime;

    
    private String updateTime;

    
    private String qq;

    
    private Long capital;

    
    private Integer delState;

    public Integer getId() {
       return id;
    }
    public void setId(Integer id) {
       this.id = id;
    }

    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name = name;
    }

    public String getPhone() {
       return phone;
    }
    public void setPhone(String phone) {
       this.phone = phone;
    }

    public Integer getRole() {
       return role;
    }
    public void setRole(Integer role) {
       this.role = role;
    }

    public Integer getGrade() {
       return grade;
    }
    public void setGrade(Integer grade) {
       this.grade = grade;
    }

    public String getEMail() {
       return eMail;
    }
    public void setEMail(String eMail) {
       this.eMail = eMail;
    }

    public String getAddress() {
       return address;
    }
    public void setAddress(String address) {
       this.address = address;
    }

    public Integer getState() {
       return state;
    }
    public void setState(Integer state) {
       this.state = state;
    }

    public String getIdNumber() {
       return idNumber;
    }
    public void setIdNumber(String idNumber) {
       this.idNumber = idNumber;
    }

    public String getCreateTime() {
       return createTime;
    }
    public void setCreateTime(String createTime) {
       this.createTime = createTime;
    }

    public String getUpdateTime() {
       return updateTime;
    }
    public void setUpdateTime(String updateTime) {
       this.updateTime = updateTime;
    }

    public String getQq() {
       return qq;
    }
    public void setQq(String qq) {
       this.qq = qq;
    }

    public Long getCapital() {
       return capital;
    }
    public void setCapital(Long capital) {
       this.capital = capital;
    }

    public Integer getDelState() {
       return delState;
    }
    public void setDelState(Integer delState) {
       this.delState = delState;
    }
	@Override
	public String toString() {
		return "MemberUser [id=" + id + ", name=" + name + ", phone=" + phone + ", role=" + role + ", grade=" + grade
				+ ", eMail=" + eMail + ", address=" + address + ", state=" + state + ", idNumber=" + idNumber
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", qq=" + qq + ", capital=" + capital
				+ ", delState=" + delState + "]";
	}


}