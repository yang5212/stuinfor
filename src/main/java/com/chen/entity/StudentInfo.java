package com.chen.entity;

import java.io.Serializable;
/**
 * 学生信息表
 * @author gjx
 *
 */
public class StudentInfo implements Serializable {

  private static final long serialVersionUID = 2925694206052864326L;
  private long studentId;               //[PK] 学生编号
  private long staffId;                 //[FK] 员工编号
  private long classId;                 //[FK] 班级编号
  private String studentNo;             //[--] 学号
  private String studentName;           //[--] 姓名
  private String studentSex;            //[--] 性别
  private String studentName1;          //[--] 曾用名
  private String studentNational;       //[--] 民族
  private String studentBirthday;       //[--] 出生年月
  private String studentHealth;         //[--] 健康状况
  private String studentNative;         //[--] 籍贯
  private String studentIndate;         //[--] 入学时间
  private String studentMarital;        //[--] 婚否
  private String studentAddress;        //[--] 家庭地址
  private String studentPost;           //[--] 邮编
  private String familyTellphone;       //[--] 家庭电话
  private String studentTellphone;      //[--] 本人电话
  private String studentQq;             //[--] QQ号
  private String studentIsleague;       //[--] 是否党成员
  private String studentJoinTime;       //[--] 入党时间
  private String studentIdcard;         //[--] 身份证号
  private String studentBeforeSchool;   //[--] 入学前学校
  private String studentHobby;          //[--] 特长爱好
  private String studentSchool;         //[--] 所在分院
  private String studentPro;            //[--] 专业
  private String studentEduSys;         //[--] 学制
  private String studentProCity;        //[--] 城市
  private String studentType;           //[--] 学历类型
  private String studentIspay;          //[--] 是否缴费
  private String studentDesc;           //[--] 学生描述
  private String studentNumber;         //[--] 账号
  private String studentPassword;       //[--] 密码
  private long studentMark;             //[--] 是否报到
  private String studentState;          //[--] 学籍状态
  private String studentHard;           //[--] 是否困难生
  private String studentLoan;           //[--] 是否助学贷款
  private String studentMuster;         //[--] 是否退伍考学
  private double studentProject;        //[--] 十一工程分


  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public String getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(String studentNo) {
    this.studentNo = studentNo;
  }


  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }


  public String getStudentSex() {
    return studentSex;
  }

  public void setStudentSex(String studentSex) {
    this.studentSex = studentSex;
  }


  public String getStudentName1() {
    return studentName1;
  }

  public void setStudentName1(String studentName1) {
    this.studentName1 = studentName1;
  }


  public String getStudentNational() {
    return studentNational;
  }

  public void setStudentNational(String studentNational) {
    this.studentNational = studentNational;
  }


  public String getStudentBirthday() {
    return studentBirthday;
  }

  public void setStudentBirthday(String studentBirthday) {
    this.studentBirthday = studentBirthday;
  }


  public String getStudentHealth() {
    return studentHealth;
  }

  public void setStudentHealth(String studentHealth) {
    this.studentHealth = studentHealth;
  }


  public String getStudentNative() {
    return studentNative;
  }

  public void setStudentNative(String studentNative) {
    this.studentNative = studentNative;
  }


  public String getStudentIndate() {
    return studentIndate;
  }

  public void setStudentIndate(String studentIndate) {
    this.studentIndate = studentIndate;
  }


  public String getStudentMarital() {
    return studentMarital;
  }

  public void setStudentMarital(String studentMarital) {
    this.studentMarital = studentMarital;
  }


  public String getStudentAddress() {
    return studentAddress;
  }

  public void setStudentAddress(String studentAddress) {
    this.studentAddress = studentAddress;
  }


  public String getStudentPost() {
    return studentPost;
  }

  public void setStudentPost(String studentPost) {
    this.studentPost = studentPost;
  }


  public String getFamilyTellphone() {
    return familyTellphone;
  }

  public void setFamilyTellphone(String familyTellphone) {
    this.familyTellphone = familyTellphone;
  }


  public String getStudentTellphone() {
    return studentTellphone;
  }

  public void setStudentTellphone(String studentTellphone) {
    this.studentTellphone = studentTellphone;
  }


  public String getStudentQq() {
    return studentQq;
  }

  public void setStudentQq(String studentQq) {
    this.studentQq = studentQq;
  }


  public String getStudentIsleague() {
    return studentIsleague;
  }

  public void setStudentIsleague(String studentIsleague) {
    this.studentIsleague = studentIsleague;
  }


  public String getStudentJoinTime() {
    return studentJoinTime;
  }

  public void setStudentJoinTime(String studentJoinTime) {
    this.studentJoinTime = studentJoinTime;
  }


  public String getStudentIdcard() {
    return studentIdcard;
  }

  public void setStudentIdcard(String studentIdcard) {
    this.studentIdcard = studentIdcard;
  }


  public String getStudentBeforeSchool() {
    return studentBeforeSchool;
  }

  public void setStudentBeforeSchool(String studentBeforeSchool) {
    this.studentBeforeSchool = studentBeforeSchool;
  }


  public String getStudentHobby() {
    return studentHobby;
  }

  public void setStudentHobby(String studentHobby) {
    this.studentHobby = studentHobby;
  }


  public String getStudentSchool() {
    return studentSchool;
  }

  public void setStudentSchool(String studentSchool) {
    this.studentSchool = studentSchool;
  }


  public String getStudentPro() {
    return studentPro;
  }

  public void setStudentPro(String studentPro) {
    this.studentPro = studentPro;
  }


  public String getStudentEduSys() {
    return studentEduSys;
  }

  public void setStudentEduSys(String studentEduSys) {
    this.studentEduSys = studentEduSys;
  }


  public String getStudentProCity() {
    return studentProCity;
  }

  public void setStudentProCity(String studentProCity) {
    this.studentProCity = studentProCity;
  }


  public String getStudentType() {
    return studentType;
  }

  public void setStudentType(String studentType) {
    this.studentType = studentType;
  }


  public String getStudentIspay() {
    return studentIspay;
  }

  public void setStudentIspay(String studentIspay) {
    this.studentIspay = studentIspay;
  }


  public String getStudentDesc() {
    return studentDesc;
  }

  public void setStudentDesc(String studentDesc) {
    this.studentDesc = studentDesc;
  }


  public String getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
  }


  public String getStudentPassword() {
    return studentPassword;
  }

  public void setStudentPassword(String studentPassword) {
    this.studentPassword = studentPassword;
  }


  public long getStudentMark() {
    return studentMark;
  }

  public void setStudentMark(long studentMark) {
    this.studentMark = studentMark;
  }


  public String getStudentState() {
    return studentState;
  }

  public void setStudentState(String studentState) {
    this.studentState = studentState;
  }


  public String getStudentHard() {
    return studentHard;
  }

  public void setStudentHard(String studentHard) {
    this.studentHard = studentHard;
  }


  public String getStudentLoan() {
    return studentLoan;
  }

  public void setStudentLoan(String studentLoan) {
    this.studentLoan = studentLoan;
  }


  public String getStudentMuster() {
    return studentMuster;
  }

  public void setStudentMuster(String studentMuster) {
    this.studentMuster = studentMuster;
  }


  public double getStudentProject() {
    return studentProject;
  }

  public void setStudentProject(double studentProject) {
    this.studentProject = studentProject;
  }

}
