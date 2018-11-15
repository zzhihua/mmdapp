package com.mmd.mmdapp.domain;


import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {

  private long uid;
  private String username;
  private String headicon;
  private String cellphone;
  private String telephone;
  private long age;
  private String sex;
  private String birthday;
  private String weixin;
  private String qq;
  private String roleId;
  private String depId;
  private String postId;
  private java.sql.Timestamp crtdate;
  private java.sql.Timestamp upddate;
  private String crtuser;

  public User() {
  }

  public User(long uid, String username, String headicon, String cellphone, String telephone, long age, String sex, String birthday, String weixin, String qq, String roleId, String depId, String postId, Timestamp crtdate, Timestamp upddate, String crtuser) {
    this.uid = uid;
    this.username = username;
    this.headicon = headicon;
    this.cellphone = cellphone;
    this.telephone = telephone;
    this.age = age;
    this.sex = sex;
    this.birthday = birthday;
    this.weixin = weixin;
    this.qq = qq;
    this.roleId = roleId;
    this.depId = depId;
    this.postId = postId;
    this.crtdate = crtdate;
    this.upddate = upddate;
    this.crtuser = crtuser;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getHeadicon() {
    return headicon;
  }

  public void setHeadicon(String headicon) {
    this.headicon = headicon;
  }


  public String getCellphone() {
    return cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public String getWeixin() {
    return weixin;
  }

  public void setWeixin(String weixin) {
    this.weixin = weixin;
  }


  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public String getDepId() {
    return depId;
  }

  public void setDepId(String depId) {
    this.depId = depId;
  }


  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }


  public java.sql.Timestamp getCrtdate() {
    return crtdate;
  }

  public void setCrtdate(java.sql.Timestamp crtdate) {
    this.crtdate = crtdate;
  }


  public java.sql.Timestamp getUpddate() {
    return upddate;
  }

  public void setUpddate(java.sql.Timestamp upddate) {
    this.upddate = upddate;
  }


  public String getCrtuser() {
    return crtuser;
  }

  public void setCrtuser(String crtuser) {
    this.crtuser = crtuser;
  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", username='" + username + '\'' +
            ", headicon='" + headicon + '\'' +
            ", cellphone='" + cellphone + '\'' +
            ", telephone='" + telephone + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", birthday='" + birthday + '\'' +
            ", weixin='" + weixin + '\'' +
            ", qq='" + qq + '\'' +
            ", roleId='" + roleId + '\'' +
            ", depId='" + depId + '\'' +
            ", postId='" + postId + '\'' +
            ", crtdate=" + crtdate +
            ", upddate=" + upddate +
            ", crtuser='" + crtuser + '\'' +
            '}';
  }
}
