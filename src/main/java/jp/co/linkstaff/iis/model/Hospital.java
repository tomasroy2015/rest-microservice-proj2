package jp.co.linkstaff.iis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {

	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 @Column(columnDefinition= "serial")
	 private Long id ;
	 private String hospitalCode;
	 private String dispFlag ;
	 private String commonHpId ;
	 private String tantou ;
	 private String tel ;
	 private String fax ;
	 private String emailTantou ;
	 private String feature ;
	 private String emargencyClass ;
	 private String departments ;
	 private String outpatient ;
	 private String erOutpatient ;
	 private String ambulanceOutpatient ;
	 private String births ;
	 private String inpatient ;
	 private String   days ;
	 private String specialistPrograms ;
	 private String latestFacility ;
	 private String relatedOrganization ;
	 private String advisingDoctors ;
	 private String advisingDoctorsInfo ;
	 private String residents ;
	 private String residentsUniv ;
	 private String afterGraduating ;
	 private String environment ;
	 private String rankingKyuyo1 ;
	 private String rankingKyuyo2 ;
	 private String rankingBunben ;
	 private String rankingHansou ;
	 private String rankingKyukyu ;
	 private String rankingTmp ;
	 private String historyText ;
	 private String flagPrEr ;
	 private String flagPrHeri ;
	 private String flagPrManto ;
	 private String flagPrGroup ;
	 private String flagPrUni ;
	 private String flagPrByouri ;
	 private String flagPrSogo ;
	 private String flagPr01 ;
	 private String flagPr02 ;
	 private String flagPr03 ;
	 private String flagPr04 ;
	 private String flagPr05 ;
	 private String prEr ;
	 private String prHeri ;
	 private String prGroup ;
	 private String prManto ;
	 private String prUni ;
	 private String prByouri ;
	 private String prSogo ;
	 private String pr01 ;
	 private String pr02 ;
	 private String pr03 ;
	 private String pr04 ;
	 private String pr05 ;
	 private String freepageFlg ;
	 private String freepageUrl ;
	 private String eresifairFlg ;
	 private String keyNaika ;
	 private String keySougou ;
	 private String keyShyouni ;
	 private String keyHifu ;
	 private String keySeishin ;
	 private String keyGeka ;
	 private String keySeikei ;
	 private String keySanfujin ;
	 private String keyGan ;
	 private String keyJibiinkou ;
	 private String keyHinyouki ;
	 private String keyNoushinkei ;
	 private String keyHousyasen ;
	 private String keyMasui ;
	 private String keyByourisindan ;
	 private String keyRinsyoukensa ;
	 private String keyKyukyu ;
	 private String keyKeisei ;
	 private String keyRehabili ;
	 private String email ;
	 private String scoutJ ;
	 private String scoutH ;
	 private String hospitalNameKana ;
	 private String hospitalName ;
	 private String hospitalSystem ;
	 private String hospitalSystemOther ;
	 private String presidentNameKana ;
	 private String presidentName ;
	 private String presidentUniv ;
	 private String directorNameKana ;
	 private String directorName ;
	 private String managementSystem ;
	 private Date establishmentDate ;
	 private String bedGeneral ;
	 private String bedConvReha ;
	 private String bedMedicalTreat ;
	 private String bedPsych ;
	 private String bedOther ;
	 private String bedTotal ;
	 private String bedDetail ;
	 private String medicalSubject ;
	 private String medicalSubjectOther ;
	 private String nursingStandard ;
	 private String authorizedFacility ;
	 private String medicalFacility ;
	 private String emergency ;
	 private String emergencyComment ;
	 private String fulltimeDoctor ;
	 private String parttimeDoctor ;
	 private String fulltimeDocComment ;
	 private String parttimeDocComment ;
	 private String staffTotal ;
	 private String staffNurse ;
	 private String staffTherapist ;
	 private String staffRadiologist ;
	 private String staffLaboTech ;
	 private String staffPharmacist ;
	 private String staffNutritionist ;
	 private String staffClerk ;
	 private String staffOther ;
	 private String staffComment ;
	 private String outpatientDetail ;
	 private String operation ;
	 private String operationDetail ;
	 private String caseDetail ;
	 private String relatedFacility ;
	 private String relatedUniv ;
	 private String supportHospital ;
	 private String prescription ;
	 private String prescriptionComment ;
	 private String free1Title ;
	 private String free1Text ;
	 private String free2Title ;
	 private String free2Text ;
	 private String url ;
	 private boolean deleteStatus;
	 private boolean deactiveStatus;
	 
	public Hospital() {
		
	}


	public boolean isDeleteStatus() {
		return deleteStatus;
	}


	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}


	public boolean isDeactiveStatus() {
		return deactiveStatus;
	}


	public void setDeactiveStatus(boolean deactiveStatus) {
		this.deactiveStatus = deactiveStatus;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDispFlag() {
		return dispFlag;
	}


	public void setDispFlag(String dispFlag) {
		this.dispFlag = dispFlag;
	}


	public String getCommonHpId() {
		return commonHpId;
	}


	public void setCommonHpId(String commonHpId) {
		this.commonHpId = commonHpId;
	}


	public String getTantou() {
		return tantou;
	}


	public void setTantou(String tantou) {
		this.tantou = tantou;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getEmailTantou() {
		return emailTantou;
	}


	public void setEmailTantou(String emailTantou) {
		this.emailTantou = emailTantou;
	}


	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}


	public String getEmargencyClass() {
		return emargencyClass;
	}


	public void setEmargencyClass(String emargencyClass) {
		this.emargencyClass = emargencyClass;
	}


	public String getDepartments() {
		return departments;
	}


	public void setDepartments(String departments) {
		this.departments = departments;
	}


	public String getOutpatient() {
		return outpatient;
	}


	public void setOutpatient(String outpatient) {
		this.outpatient = outpatient;
	}


	public String getErOutpatient() {
		return erOutpatient;
	}


	public void setErOutpatient(String erOutpatient) {
		this.erOutpatient = erOutpatient;
	}


	public String getAmbulanceOutpatient() {
		return ambulanceOutpatient;
	}


	public void setAmbulanceOutpatient(String ambulanceOutpatient) {
		this.ambulanceOutpatient = ambulanceOutpatient;
	}


	public String getBirths() {
		return births;
	}


	public void setBirths(String births) {
		this.births = births;
	}


	public String getInpatient() {
		return inpatient;
	}


	public void setInpatient(String inpatient) {
		this.inpatient = inpatient;
	}


	public String getDays() {
		return days;
	}


	public void setDays(String days) {
		this.days = days;
	}


	public String getSpecialistPrograms() {
		return specialistPrograms;
	}


	public void setSpecialistPrograms(String specialistPrograms) {
		this.specialistPrograms = specialistPrograms;
	}


	public String getLatestFacility() {
		return latestFacility;
	}


	public void setLatestFacility(String latestFacility) {
		this.latestFacility = latestFacility;
	}


	public String getRelatedOrganization() {
		return relatedOrganization;
	}


	public void setRelatedOrganization(String relatedOrganization) {
		this.relatedOrganization = relatedOrganization;
	}


	public String getAdvisingDoctors() {
		return advisingDoctors;
	}


	public void setAdvisingDoctors(String advisingDoctors) {
		this.advisingDoctors = advisingDoctors;
	}


	public String getAdvisingDoctorsInfo() {
		return advisingDoctorsInfo;
	}


	public void setAdvisingDoctorsInfo(String advisingDoctorsInfo) {
		this.advisingDoctorsInfo = advisingDoctorsInfo;
	}


	public String getResidents() {
		return residents;
	}


	public void setResidents(String residents) {
		this.residents = residents;
	}


	public String getResidentsUniv() {
		return residentsUniv;
	}


	public void setResidentsUniv(String residentsUniv) {
		this.residentsUniv = residentsUniv;
	}


	public String getAfterGraduating() {
		return afterGraduating;
	}


	public void setAfterGraduating(String afterGraduating) {
		this.afterGraduating = afterGraduating;
	}


	public String getEnvironment() {
		return environment;
	}


	public void setEnvironment(String environment) {
		this.environment = environment;
	}


	public String getRankingKyuyo1() {
		return rankingKyuyo1;
	}


	public void setRankingKyuyo1(String rankingKyuyo1) {
		this.rankingKyuyo1 = rankingKyuyo1;
	}


	public String getRankingKyuyo2() {
		return rankingKyuyo2;
	}


	public void setRankingKyuyo2(String rankingKyuyo2) {
		this.rankingKyuyo2 = rankingKyuyo2;
	}


	public String getRankingBunben() {
		return rankingBunben;
	}


	public void setRankingBunben(String rankingBunben) {
		this.rankingBunben = rankingBunben;
	}


	public String getRankingHansou() {
		return rankingHansou;
	}


	public void setRankingHansou(String rankingHansou) {
		this.rankingHansou = rankingHansou;
	}


	public String getRankingKyukyu() {
		return rankingKyukyu;
	}


	public void setRankingKyukyu(String rankingKyukyu) {
		this.rankingKyukyu = rankingKyukyu;
	}


	public String getRankingTmp() {
		return rankingTmp;
	}


	public void setRankingTmp(String rankingTmp) {
		this.rankingTmp = rankingTmp;
	}


	public String getHistoryText() {
		return historyText;
	}


	public void setHistoryText(String historyText) {
		this.historyText = historyText;
	}


	public String getFlagPrEr() {
		return flagPrEr;
	}


	public void setFlagPrEr(String flagPrEr) {
		this.flagPrEr = flagPrEr;
	}


	public String getFlagPrHeri() {
		return flagPrHeri;
	}


	public void setFlagPrHeri(String flagPrHeri) {
		this.flagPrHeri = flagPrHeri;
	}


	public String getFlagPrManto() {
		return flagPrManto;
	}


	public void setFlagPrManto(String flagPrManto) {
		this.flagPrManto = flagPrManto;
	}


	public String getFlagPrGroup() {
		return flagPrGroup;
	}


	public void setFlagPrGroup(String flagPrGroup) {
		this.flagPrGroup = flagPrGroup;
	}


	public String getFlagPrUni() {
		return flagPrUni;
	}


	public void setFlagPrUni(String flagPrUni) {
		this.flagPrUni = flagPrUni;
	}


	public String getFlagPrByouri() {
		return flagPrByouri;
	}


	public void setFlagPrByouri(String flagPrByouri) {
		this.flagPrByouri = flagPrByouri;
	}


	public String getFlagPrSogo() {
		return flagPrSogo;
	}


	public void setFlagPrSogo(String flagPrSogo) {
		this.flagPrSogo = flagPrSogo;
	}


	public String getFlagPr01() {
		return flagPr01;
	}


	public void setFlagPr01(String flagPr01) {
		this.flagPr01 = flagPr01;
	}


	public String getFlagPr02() {
		return flagPr02;
	}


	public void setFlagPr02(String flagPr02) {
		this.flagPr02 = flagPr02;
	}


	public String getFlagPr03() {
		return flagPr03;
	}


	public void setFlagPr03(String flagPr03) {
		this.flagPr03 = flagPr03;
	}


	public String getFlagPr04() {
		return flagPr04;
	}


	public void setFlagPr04(String flagPr04) {
		this.flagPr04 = flagPr04;
	}


	public String getFlagPr05() {
		return flagPr05;
	}


	public void setFlagPr05(String flagPr05) {
		this.flagPr05 = flagPr05;
	}


	public String getPrEr() {
		return prEr;
	}


	public void setPrEr(String prEr) {
		this.prEr = prEr;
	}


	public String getPrHeri() {
		return prHeri;
	}


	public void setPrHeri(String prHeri) {
		this.prHeri = prHeri;
	}


	public String getPrGroup() {
		return prGroup;
	}


	public void setPrGroup(String prGroup) {
		this.prGroup = prGroup;
	}


	public String getPrManto() {
		return prManto;
	}


	public void setPrManto(String prManto) {
		this.prManto = prManto;
	}


	public String getPrUni() {
		return prUni;
	}


	public void setPrUni(String prUni) {
		this.prUni = prUni;
	}


	public String getPrByouri() {
		return prByouri;
	}


	public void setPrByouri(String prByouri) {
		this.prByouri = prByouri;
	}


	public String getPrSogo() {
		return prSogo;
	}


	public void setPrSogo(String prSogo) {
		this.prSogo = prSogo;
	}


	public String getPr01() {
		return pr01;
	}


	public void setPr01(String pr01) {
		this.pr01 = pr01;
	}


	public String getPr02() {
		return pr02;
	}


	public void setPr02(String pr02) {
		this.pr02 = pr02;
	}


	public String getPr03() {
		return pr03;
	}


	public void setPr03(String pr03) {
		this.pr03 = pr03;
	}


	public String getPr04() {
		return pr04;
	}


	public void setPr04(String pr04) {
		this.pr04 = pr04;
	}


	public String getPr05() {
		return pr05;
	}


	public void setPr05(String pr05) {
		this.pr05 = pr05;
	}


	public String getFreepageFlg() {
		return freepageFlg;
	}


	public void setFreepageFlg(String freepageFlg) {
		this.freepageFlg = freepageFlg;
	}


	public String getFreepageUrl() {
		return freepageUrl;
	}


	public void setFreepageUrl(String freepageUrl) {
		this.freepageUrl = freepageUrl;
	}


	public String getEresifairFlg() {
		return eresifairFlg;
	}


	public void setEresifairFlg(String eresifairFlg) {
		this.eresifairFlg = eresifairFlg;
	}


	public String getKeyNaika() {
		return keyNaika;
	}


	public void setKeyNaika(String keyNaika) {
		this.keyNaika = keyNaika;
	}


	public String getKeySougou() {
		return keySougou;
	}


	public void setKeySougou(String keySougou) {
		this.keySougou = keySougou;
	}


	public String getKeyShyouni() {
		return keyShyouni;
	}


	public void setKeyShyouni(String keyShyouni) {
		this.keyShyouni = keyShyouni;
	}


	public String getKeyHifu() {
		return keyHifu;
	}


	public void setKeyHifu(String keyHifu) {
		this.keyHifu = keyHifu;
	}


	public String getKeySeishin() {
		return keySeishin;
	}


	public void setKeySeishin(String keySeishin) {
		this.keySeishin = keySeishin;
	}


	public String getKeyGeka() {
		return keyGeka;
	}


	public void setKeyGeka(String keyGeka) {
		this.keyGeka = keyGeka;
	}


	public String getKeySeikei() {
		return keySeikei;
	}


	public void setKeySeikei(String keySeikei) {
		this.keySeikei = keySeikei;
	}


	public String getKeySanfujin() {
		return keySanfujin;
	}


	public void setKeySanfujin(String keySanfujin) {
		this.keySanfujin = keySanfujin;
	}


	public String getKeyGan() {
		return keyGan;
	}


	public void setKeyGan(String keyGan) {
		this.keyGan = keyGan;
	}


	public String getKeyJibiinkou() {
		return keyJibiinkou;
	}


	public void setKeyJibiinkou(String keyJibiinkou) {
		this.keyJibiinkou = keyJibiinkou;
	}


	public String getKeyHinyouki() {
		return keyHinyouki;
	}


	public void setKeyHinyouki(String keyHinyouki) {
		this.keyHinyouki = keyHinyouki;
	}


	public String getKeyNoushinkei() {
		return keyNoushinkei;
	}


	public void setKeyNoushinkei(String keyNoushinkei) {
		this.keyNoushinkei = keyNoushinkei;
	}


	public String getKeyHousyasen() {
		return keyHousyasen;
	}


	public void setKeyHousyasen(String keyHousyasen) {
		this.keyHousyasen = keyHousyasen;
	}


	public String getKeyMasui() {
		return keyMasui;
	}


	public void setKeyMasui(String keyMasui) {
		this.keyMasui = keyMasui;
	}


	public String getKeyByourisindan() {
		return keyByourisindan;
	}


	public void setKeyByourisindan(String keyByourisindan) {
		this.keyByourisindan = keyByourisindan;
	}


	public String getKeyRinsyoukensa() {
		return keyRinsyoukensa;
	}


	public void setKeyRinsyoukensa(String keyRinsyoukensa) {
		this.keyRinsyoukensa = keyRinsyoukensa;
	}


	public String getKeyKyukyu() {
		return keyKyukyu;
	}


	public void setKeyKyukyu(String keyKyukyu) {
		this.keyKyukyu = keyKyukyu;
	}


	public String getKeyKeisei() {
		return keyKeisei;
	}


	public void setKeyKeisei(String keyKeisei) {
		this.keyKeisei = keyKeisei;
	}


	public String getKeyRehabili() {
		return keyRehabili;
	}


	public void setKeyRehabili(String keyRehabili) {
		this.keyRehabili = keyRehabili;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getScoutJ() {
		return scoutJ;
	}


	public void setScoutJ(String scoutJ) {
		this.scoutJ = scoutJ;
	}


	public String getScoutH() {
		return scoutH;
	}


	public void setScoutH(String scoutH) {
		this.scoutH = scoutH;
	}


	public String getHospitalNameKana() {
		return hospitalNameKana;
	}


	public void setHospitalNameKana(String hospitalNameKana) {
		this.hospitalNameKana = hospitalNameKana;
	}


	public String getHospitalName() {
		return hospitalName;
	}


	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}


	public String getHospitalSystem() {
		return hospitalSystem;
	}


	public void setHospitalSystem(String hospitalSystem) {
		this.hospitalSystem = hospitalSystem;
	}


	public String getHospitalSystemOther() {
		return hospitalSystemOther;
	}


	public void setHospitalSystemOther(String hospitalSystemOther) {
		this.hospitalSystemOther = hospitalSystemOther;
	}


	public String getPresidentNameKana() {
		return presidentNameKana;
	}


	public void setPresidentNameKana(String presidentNameKana) {
		this.presidentNameKana = presidentNameKana;
	}


	public String getPresidentName() {
		return presidentName;
	}


	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}


	public String getPresidentUniv() {
		return presidentUniv;
	}


	public void setPresidentUniv(String presidentUniv) {
		this.presidentUniv = presidentUniv;
	}


	public String getDirectorNameKana() {
		return directorNameKana;
	}


	public void setDirectorNameKana(String directorNameKana) {
		this.directorNameKana = directorNameKana;
	}


	public String getDirectorName() {
		return directorName;
	}


	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}


	public String getManagementSystem() {
		return managementSystem;
	}


	public void setManagementSystem(String managementSystem) {
		this.managementSystem = managementSystem;
	}


	public Date getEstablishmentDate() {
		return establishmentDate;
	}


	public void setEstablishmentDate(Date establishmentDate) {
		this.establishmentDate = establishmentDate;
	}


	public String getBedGeneral() {
		return bedGeneral;
	}


	public void setBedGeneral(String bedGeneral) {
		this.bedGeneral = bedGeneral;
	}


	public String getBedConvReha() {
		return bedConvReha;
	}


	public void setBedConvReha(String bedConvReha) {
		this.bedConvReha = bedConvReha;
	}


	public String getBedMedicalTreat() {
		return bedMedicalTreat;
	}


	public void setBedMedicalTreat(String bedMedicalTreat) {
		this.bedMedicalTreat = bedMedicalTreat;
	}


	public String getBedPsych() {
		return bedPsych;
	}


	public void setBedPsych(String bedPsych) {
		this.bedPsych = bedPsych;
	}


	public String getBedOther() {
		return bedOther;
	}


	public void setBedOther(String bedOther) {
		this.bedOther = bedOther;
	}


	public String getBedTotal() {
		return bedTotal;
	}


	public void setBedTotal(String bedTotal) {
		this.bedTotal = bedTotal;
	}


	public String getBedDetail() {
		return bedDetail;
	}


	public void setBedDetail(String bedDetail) {
		this.bedDetail = bedDetail;
	}


	public String getMedicalSubject() {
		return medicalSubject;
	}


	public void setMedicalSubject(String medicalSubject) {
		this.medicalSubject = medicalSubject;
	}


	public String getMedicalSubjectOther() {
		return medicalSubjectOther;
	}


	public void setMedicalSubjectOther(String medicalSubjectOther) {
		this.medicalSubjectOther = medicalSubjectOther;
	}


	public String getNursingStandard() {
		return nursingStandard;
	}


	public void setNursingStandard(String nursingStandard) {
		this.nursingStandard = nursingStandard;
	}


	public String getAuthorizedFacility() {
		return authorizedFacility;
	}


	public void setAuthorizedFacility(String authorizedFacility) {
		this.authorizedFacility = authorizedFacility;
	}


	public String getMedicalFacility() {
		return medicalFacility;
	}


	public void setMedicalFacility(String medicalFacility) {
		this.medicalFacility = medicalFacility;
	}


	public String getEmergency() {
		return emergency;
	}


	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}


	public String getEmergencyComment() {
		return emergencyComment;
	}


	public void setEmergencyComment(String emergencyComment) {
		this.emergencyComment = emergencyComment;
	}


	public String getFulltimeDoctor() {
		return fulltimeDoctor;
	}


	public void setFulltimeDoctor(String fulltimeDoctor) {
		this.fulltimeDoctor = fulltimeDoctor;
	}


	public String getParttimeDoctor() {
		return parttimeDoctor;
	}


	public void setParttimeDoctor(String parttimeDoctor) {
		this.parttimeDoctor = parttimeDoctor;
	}


	public String getFulltimeDocComment() {
		return fulltimeDocComment;
	}


	public void setFulltimeDocComment(String fulltimeDocComment) {
		this.fulltimeDocComment = fulltimeDocComment;
	}


	public String getParttimeDocComment() {
		return parttimeDocComment;
	}


	public void setParttimeDocComment(String parttimeDocComment) {	
		this.parttimeDocComment = parttimeDocComment;
	}


	public String getStaffTotal() {
		return staffTotal;
	}


	public void setStaffTotal(String staffTotal) {
		this.staffTotal = staffTotal;
	}


	public String getStaffNurse() {
		return staffNurse;
	}


	public void setStaffNurse(String staffNurse) {
		this.staffNurse = staffNurse;
	}


	public String getStaffTherapist() {
		return staffTherapist;
	}


	public void setStaffTherapist(String staffTherapist) {
		this.staffTherapist = staffTherapist;
	}


	public String getStaffRadiologist() {
		return staffRadiologist;
	}


	public void setStaffRadiologist(String staffRadiologist) {
		this.staffRadiologist = staffRadiologist;
	}


	public String getStaffLaboTech() {
		return staffLaboTech;
	}


	public void setStaffLaboTech(String staffLaboTech) {
		this.staffLaboTech = staffLaboTech;
	}


	public String getStaffPharmacist() {
		return staffPharmacist;
	}


	public void setStaffPharmacist(String staffPharmacist) {
		this.staffPharmacist = staffPharmacist;
	}


	public String getStaffNutritionist() {
		return staffNutritionist;
	}
	public void setStaffNutritionist(String staffNutritionist) {
		this.staffNutritionist = staffNutritionist;
	}


	public String getStaffClerk() {
		return staffClerk;
	}


	public void setStaffClerk(String staffClerk) {
		this.staffClerk = staffClerk;
	}


	public String getStaffOther() {
		return staffOther;
	}


	public void setStaffOther(String staffOther) {
		this.staffOther = staffOther;
	}


	public String getStaffComment() {
		return staffComment;
	}


	public void setStaffComment(String staffComment) {
		this.staffComment = staffComment;
	}


	public String getOutpatientDetail() {
		return outpatientDetail;
	}


	public void setOutpatientDetail(String outpatientDetail) {
		this.outpatientDetail = outpatientDetail;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public String getOperationDetail() {
		return operationDetail;
	}


	public void setOperationDetail(String operationDetail) {
		this.operationDetail = operationDetail;
	}


	public String getCaseDetail() {
		return caseDetail;
	}


	public void setCaseDetail(String caseDetail) {
		this.caseDetail = caseDetail;
	}


	public String getRelatedFacility() {
		return relatedFacility;
	}


	public void setRelatedFacility(String relatedFacility) {
		this.relatedFacility = relatedFacility;
	}


	public String getRelatedUniv() {
		return relatedUniv;
	}


	public void setRelatedUniv(String relatedUniv) {
		this.relatedUniv = relatedUniv;
	}


	public String getSupportHospital() {
		return supportHospital;
	}


	public void setSupportHospital(String supportHospital) {
		this.supportHospital = supportHospital;
	}


	public String getPrescription() {
		return prescription;
	}


	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}


	public String getPrescriptionComment() {
		return prescriptionComment;
	}


	public void setPrescriptionComment(String prescriptionComment) {
		this.prescriptionComment = prescriptionComment;
	}


	public String getFree1Title() {
		return free1Title;
	}


	public void setFree1Title(String free1Title) {
		this.free1Title = free1Title;
	}


	public String getFree1Text() {
		return free1Text;
	}


	public void setFree1Text(String free1Text) {
		this.free1Text = free1Text;
	}


	public String getFree2Title() {
		return free2Title;
	}


	public void setFree2Title(String free2Title) {
		this.free2Title = free2Title;
	}


	public String getFree2Text() {
		return free2Text;
	}


	public void setFree2Text(String free2Text) {
		this.free2Text = free2Text;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the hospitalCode
	 */
	public String getHospitalCode() {
		return hospitalCode;
	}


	/**
	 * @param hospitalCode the hospitalCode to set
	 */
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}	
}

