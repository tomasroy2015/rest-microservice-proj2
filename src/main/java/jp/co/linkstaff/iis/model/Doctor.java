package jp.co.linkstaff.iis.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition="serial")
	private Long id;
	private	String	doctorId;
	private String 	professionalType;
	private	String	firstname;
	private	String	firstnameKana;
	private	String	lastname;
	private	String	lastnameKana;
	private	Date	birthdate;
	private	String	sex;
	private	String	zip;
	private	String	address1;
	private	String	address2;
	private	String	tel;
	private	String	collegeType;
	private	String	collegeName;
	private	String	collegePlace;
	private	Date	graduationYear;
	private	Date	medicalLicense;
	private	String	collegeNameCurrent;
	private	String	grade;
	private	String	handlename;
	private	String	comment;
	private	String	trainingHospital;
	private	String	kiboukamoku;
	private	String	residentStatus;
	private	String	qualification;
	private	String	workExperienceSubject1;
	private	Date	workExperienceYears1;
	private	Date	workExperienceMonths1;
	private	String	workExperienceSubject2;
	private	Date	workExperienceYears2;
	private	Date	workExperienceMonths2;
	private	String	workExperienceSubject3;
	private	Date	workExperienceYears3;
	private	Date	workExperienceMonths3;
	private	String	workedHospitalName;
	private	String	desiredWorkingJ;
	private	String	desiredWorkingH;
	private	String	desiredWorkingS;
	private	String	desiredWorkingK;
	private	String	jOpportunity;
	private	String	jPeriod;
	private	String	jLocation1;
	private	String	jLocation2;
	private	String	jLocation3;
	private	String	jIncome;
	private	String	jSubject;
	private	String	jSubjectOthers;
	private	String	jDesire;
	private	String	jCorrespondence;
	private	String	jSearchKeyword;
	private	String	hPeriod;
	private	String	hDays;
	private	String	hLocation1;
	private	String	hLocation2;
	private	String	hLocation3;
	private	String	hSubject;
	private	String	hSubjectOthers;
	private	String	hDesire;
	private	String	hCorrespondence;
	private	String	hSearchKeyword;
	private	String	sPeriod;
	private	String	sDays;
	private	String	sLocation1;
	private	String	sLocation2;
	private	String	sLocation3;
	private	String	sSubject;
	private	String	sSubjectOthers;
	private	String	sDesire;
	private	String	sCorrespondence;
	private	String	kPeriod;
	private	String	kDays;
	private	String	kLocation1;
	private	String	kLocation2;
	private	String	kLocation3;
	private	String	kDesire;
	private	String	kCorrespondence;
	private	String	scoutFlag;
	private	String	demand;
	private	String	mailmagazineFlag;
	private	String	details;
	private String schoolYear;
	private boolean deleteStatus;
	private boolean deactiveStatus;
	


	public Doctor() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}


	public Date getMedicalLicensedate() {
		return medicalLicense;
	}

	public void setMedicalLicensedate(Date medicalLicensedate) {
		this.medicalLicense = medicalLicensedate;
	}

	public String getProfessionalType() {
		return professionalType;
	}
	public void setProfessionalType(String professionalType) {
		this.professionalType = professionalType;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFirstnameKana() {
		return firstnameKana;
	}
	public void setFirstnameKana(String firstnameKana) {
		this.firstnameKana = firstnameKana;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastnameKana() {
		return lastnameKana;
	}
	public void setLastnameKana(String lastnameKana) {
		this.lastnameKana = lastnameKana;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCollegeType() {
		return collegeType;
	}
	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegePlace() {
		return collegePlace;
	}

	public void setCollegePlace(String collegePlace) {
		this.collegePlace = collegePlace;
	}

	public Date getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(Date graduationYear) {
		this.graduationYear = graduationYear;
	}
	public Date getMedicalLicenseYear() {
		return medicalLicense;
	}
	public void setMedicalLicenseYear(Date medicalLicenseYear) {
		this.medicalLicense = medicalLicenseYear;
	}
	
	public String getCollegeNameCurrent() {
		return collegeNameCurrent;
	}
	public void setCollegeNameCurrent(String collegeNameCurrent) {
		this.collegeNameCurrent = collegeNameCurrent;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getHandlename() {
		return handlename;
	}
	public void setHandlename(String handlename) {
		this.handlename = handlename;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getTrainingHospital() {
		return trainingHospital;
	}
	public void setTrainingHospital(String trainingHospital) {
		this.trainingHospital = trainingHospital;
	}
	public String getKiboukamoku() {
		return kiboukamoku;
	}
	public void setKiboukamoku(String kiboukamoku) {
		this.kiboukamoku = kiboukamoku;
	}
	public String getResidentStatus() {
		return residentStatus;
	}
	public void setResidentStatus(String residentStatus) {
		this.residentStatus = residentStatus;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getWorkExperienceSubject1() {
		return workExperienceSubject1;
	}
	public void setWorkExperienceSubject1(String workExperienceSubject1) {
		this.workExperienceSubject1 = workExperienceSubject1;
	}
	public Date getWorkExperienceYears1() {
		return workExperienceYears1;
	}
	public void setWorkExperienceYears1(Date workExperienceYears1) {
		this.workExperienceYears1 = workExperienceYears1;
	}
	public Date getWorkExperienceMonths1() {
		return workExperienceMonths1;
	}
	public void setWorkExperienceMonths1(Date workExperienceMonths1) {
		this.workExperienceMonths1 = workExperienceMonths1;
	}
	public String getWorkExperienceSubject2() {
		return workExperienceSubject2;
	}
	public void setWorkExperienceSubject2(String workExperienceSubject2) {
		this.workExperienceSubject2 = workExperienceSubject2;
	}
	public Date getWorkExperienceYears2() {
		return workExperienceYears2;
	}
	public void setWorkExperienceYears2(Date workExperienceYears2) {
		this.workExperienceYears2 = workExperienceYears2;
	}
	public Date getWorkExperienceMonths2() {
		return workExperienceMonths2;
	}
	public void setWorkExperienceMonths2(Date workExperienceMonths2) {
		this.workExperienceMonths2 = workExperienceMonths2;
	}
	public String getWorkExperienceSubject3() {
		return workExperienceSubject3;
	}
	public void setWorkExperienceSubject3(String workExperienceSubject3) {
		this.workExperienceSubject3 = workExperienceSubject3;
	}
	public Date getWorkExperienceYears3() {
		return workExperienceYears3;
	}
	public void setWorkExperienceYears3(Date workExperienceYears3) {
		this.workExperienceYears3 = workExperienceYears3;
	}
	public Date getWorkExperienceMonths3() {
		return workExperienceMonths3;
	}
	public void setWorkExperienceMonths3(Date workExperienceMonths3) {
		this.workExperienceMonths3 = workExperienceMonths3;
	}
	public String getWorkedHospitalName() {
		return workedHospitalName;
	}
	public void setWorkedHospitalName(String workedHospitalName) {
		this.workedHospitalName = workedHospitalName;
	}
	public String getDesiredWorkingJ() {
		return desiredWorkingJ;
	}
	public void setDesiredWorkingJ(String desiredWorkingJ) {
		this.desiredWorkingJ = desiredWorkingJ;
	}
	public String getDesiredWorkingH() {
		return desiredWorkingH;
	}
	public void setDesiredWorkingH(String desiredWorkingH) {
		this.desiredWorkingH = desiredWorkingH;
	}
	public String getDesiredWorkingS() {
		return desiredWorkingS;
	}
	public void setDesiredWorkingS(String desiredWorkingS) {
		this.desiredWorkingS = desiredWorkingS;
	}
	public String getDesiredWorkingK() {
		return desiredWorkingK;
	}
	public void setDesiredWorkingK(String desiredWorkingK) {
		this.desiredWorkingK = desiredWorkingK;
	}
	public String getjOpportunity() {
		return jOpportunity;
	}
	public void setjOpportunity(String jOpportunity) {
		this.jOpportunity = jOpportunity;
	}
	public String getjPeriod() {
		return jPeriod;
	}
	public void setjPeriod(String jPeriod) {
		this.jPeriod = jPeriod;
	}
	public String getjLocation1() {
		return jLocation1;
	}
	public void setjLocation1(String jLocation1) {
		this.jLocation1 = jLocation1;
	}
	public String getjLocation2() {
		return jLocation2;
	}
	public void setjLocation2(String jLocation2) {
		this.jLocation2 = jLocation2;
	}
	public String getjLocation3() {
		return jLocation3;
	}
	public void setjLocation3(String jLocation3) {
		this.jLocation3 = jLocation3;
	}
	public String getjIncome() {
		return jIncome;
	}
	public void setjIncome(String jIncome) {
		this.jIncome = jIncome;
	}
	public String getjSubject() {
		return jSubject;
	}
	public void setjSubject(String jSubject) {
		this.jSubject = jSubject;
	}
	public String getjSubjectOthers() {
		return jSubjectOthers;
	}
	public void setjSubjectOthers(String jSubjectOthers) {
		this.jSubjectOthers = jSubjectOthers;
	}
	public String getjDesire() {
		return jDesire;
	}
	public void setjDesire(String jDesire) {
		this.jDesire = jDesire;
	}
	public String getjCorrespondence() {
		return jCorrespondence;
	}
	public void setjCorrespondence(String jCorrespondence) {
		this.jCorrespondence = jCorrespondence;
	}
	public String getjSearchKeyword() {
		return jSearchKeyword;
	}
	public void setjSearchKeyword(String jSearchKeyword) {
		this.jSearchKeyword = jSearchKeyword;
	}
	public String gethPeriod() {
		return hPeriod;
	}
	public void sethPeriod(String hPeriod) {
		this.hPeriod = hPeriod;
	}
	public String gethDays() {
		return hDays;
	}
	public void sethDays(String hDays) {
		this.hDays = hDays;
	}
	public String gethLocation1() {
		return hLocation1;
	}
	public void sethLocation1(String hLocation1) {
		this.hLocation1 = hLocation1;
	}
	public String gethLocation2() {
		return hLocation2;
	}
	public void sethLocation2(String hLocation2) {
		this.hLocation2 = hLocation2;
	}
	public String gethLocation3() {
		return hLocation3;
	}
	public void sethLocation3(String hLocation3) {
		this.hLocation3 = hLocation3;
	}
	public String gethSubject() {
		return hSubject;
	}
	public void sethSubject(String hSubject) {
		this.hSubject = hSubject;
	}
	public String gethSubjectOthers() {
		return hSubjectOthers;
	}
	public void sethSubjectOthers(String hSubjectOthers) {
		this.hSubjectOthers = hSubjectOthers;
	}
	public String gethDesire() {
		return hDesire;
	}
	public void sethDesire(String hDesire) {
		this.hDesire = hDesire;
	}
	public String gethCorrespondence() {
		return hCorrespondence;
	}
	public void sethCorrespondence(String hCorrespondence) {
		this.hCorrespondence = hCorrespondence;
	}
	public String gethSearchKeyword() {
		return hSearchKeyword;
	}
	public void sethSearchKeyword(String hSearchKeyword) {
		this.hSearchKeyword = hSearchKeyword;
	}
	public String getsPeriod() {
		return sPeriod;
	}
	public void setsPeriod(String sPeriod) {
		this.sPeriod = sPeriod;
	}
	public String getsDays() {
		return sDays;
	}
	public void setsDays(String sDays) {
		this.sDays = sDays;
	}
	public String getsLocation1() {
		return sLocation1;
	}
	public void setsLocation1(String sLocation1) {
		this.sLocation1 = sLocation1;
	}
	public String getsLocation2() {
		return sLocation2;
	}
	public void setsLocation2(String sLocation2) {
		this.sLocation2 = sLocation2;
	}
	public String getsLocation3() {
		return sLocation3;
	}
	public void setsLocation3(String sLocation3) {
		this.sLocation3 = sLocation3;
	}
	public String getsSubject() {
		return sSubject;
	}
	public void setsSubject(String sSubject) {
		this.sSubject = sSubject;
	}
	public String getsSubjectOthers() {
		return sSubjectOthers;
	}
	public void setsSubjectOthers(String sSubjectOthers) {
		this.sSubjectOthers = sSubjectOthers;
	}
	public String getsDesire() {
		return sDesire;
	}
	public void setsDesire(String sDesire) {
		this.sDesire = sDesire;
	}
	public String getsCorrespondence() {
		return sCorrespondence;
	}
	public void setsCorrespondence(String sCorrespondence) {
		this.sCorrespondence = sCorrespondence;
	}
	public String getkPeriod() {
		return kPeriod;
	}
	public void setkPeriod(String kPeriod) {
		this.kPeriod = kPeriod;
	}
	public String getkDays() {
		return kDays;
	}
	public void setkDays(String kDays) {
		this.kDays = kDays;
	}
	public String getkLocation1() {
		return kLocation1;
	}
	public void setkLocation1(String kLocation1) {
		this.kLocation1 = kLocation1;
	}
	public String getkLocation2() {
		return kLocation2;
	}
	public void setkLocation2(String kLocation2) {
		this.kLocation2 = kLocation2;
	}
	public String getkLocation3() {
		return kLocation3;
	}
	public void setkLocation3(String kLocation3) {
		this.kLocation3 = kLocation3;
	}
	public String getkDesire() {
		return kDesire;
	}
	public void setkDesire(String kDesire) {
		this.kDesire = kDesire;
	}
	public String getkCorrespondence() {
		return kCorrespondence;
	}
	public void setkCorrespondence(String kCorrespondence) {
		this.kCorrespondence = kCorrespondence;
	}
	public String getScoutFlag() {
		return scoutFlag;
	}
	public void setScoutFlag(String scoutFlag) {
		this.scoutFlag = scoutFlag;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}
	public String getMailmagazineFlag() {
		return mailmagazineFlag;
	}
	public void setMailmagazineFlag(String mailmagazineFlag) {
		this.mailmagazineFlag = mailmagazineFlag;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	public String getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}

	public boolean isDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Date getMedicalLicense() {
		return medicalLicense;
	}

	public void setMedicalLicense(Date medicalLicense) {
		this.medicalLicense = medicalLicense;
	}

	public boolean isDeactiveStatus() {
		return deactiveStatus;
	}

	public void setDeactiveStatus(boolean deactiveStatus) {
		this.deactiveStatus = deactiveStatus;
	}

	
	
	
	
	
}

