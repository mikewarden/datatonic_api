package com.mw.datatonic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataEntry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	private Integer issuesResolved;
	private Integer coverageDBs;
	private Integer coverageTables;
	private Integer coverageFiles;
	private Integer dataSources;
	private Integer sensDatabases;
	private Integer sensTables;
	private Integer sensFiles;
	private Integer swiftCode;
	private Integer email;
	private Integer bank;
	private Integer phone;
	private Integer ssn;
	private Integer passport;
	private Integer routing;
	private Integer dob;
	private Integer creditCard;
	private Integer hippaa;
	private Integer ferpa;
	private Integer class3;
	private Integer class4;
	private Integer class5;
	private Integer class6;
	private Integer class7;
	private Integer class8;
	private Integer p11; 
	private Integer icDS1;
	private Integer icDS2;
	private Integer icDS3;
	private Integer icDS4;
	private Double sdDS1;
	private Double sdDS2;
	private Double sdDS3;
	private Double sdDS4;
	
	public DataEntry() {};

	public DataEntry(Integer issuesResolved, Integer coverageDBs, Integer coverageTables, Integer coverageFiles,
			Integer dataSources, Integer sensDatabases, Integer sensTables, Integer sensFiles, Integer swiftCode,
			Integer email, Integer bank, Integer phone, Integer ssn, Integer passport, Integer routing, Integer dob,
			Integer creditCard, Integer hippaa, Integer ferpa, Integer class3, Integer class4, Integer class5,
			Integer class6, Integer class7, Integer class8, Integer p11, Integer icDS1, Integer icDS2, Integer icDS3,
			Integer icDS4, Double sdDS1, Double sdDS2, Double sdDS3, Double sdDS4) {
		super();
		this.issuesResolved = issuesResolved;
		this.coverageDBs = coverageDBs;
		this.coverageTables = coverageTables;
		this.coverageFiles = coverageFiles;
		this.dataSources = dataSources;
		this.sensDatabases = sensDatabases;
		this.sensTables = sensTables;
		this.sensFiles = sensFiles;
		this.swiftCode = swiftCode;
		this.email = email;
		this.bank = bank;
		this.phone = phone;
		this.ssn = ssn;
		this.passport = passport;
		this.routing = routing;
		this.dob = dob;
		this.creditCard = creditCard;
		this.hippaa = hippaa;
		this.ferpa = ferpa;
		this.class3 = class3;
		this.class4 = class4;
		this.class5 = class5;
		this.class6 = class6;
		this.class7 = class7;
		this.class8 = class8;
		this.p11 = p11;
		this.icDS1 = icDS1;
		this.icDS2 = icDS2;
		this.icDS3 = icDS3;
		this.icDS4 = icDS4;
		this.sdDS1 = sdDS1;
		this.sdDS2 = sdDS2;
		this.sdDS3 = sdDS3;
		this.sdDS4 = sdDS4;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIssuesResolved() {
		return issuesResolved;
	}

	public void setIssuesResolved(Integer issuesResolved) {
		this.issuesResolved = issuesResolved;
	}

	public Integer getCoverageDBs() {
		return coverageDBs;
	}

	public void setCoverageDBs(Integer coverageDBs) {
		this.coverageDBs = coverageDBs;
	}

	public Integer getCoverageTables() {
		return coverageTables;
	}

	public void setCoverageTables(Integer coverageTables) {
		this.coverageTables = coverageTables;
	}

	public Integer getCoverageFiles() {
		return coverageFiles;
	}

	public void setCoverageFiles(Integer coverageFiles) {
		this.coverageFiles = coverageFiles;
	}

	public Integer getDataSources() {
		return dataSources;
	}

	public void setDataSources(Integer dataSources) {
		this.dataSources = dataSources;
	}

	public Integer getSensDatabases() {
		return sensDatabases;
	}

	public void setSensDatabases(Integer sensDatabases) {
		this.sensDatabases = sensDatabases;
	}

	public Integer getSensTables() {
		return sensTables;
	}

	public void setSensTables(Integer sensTables) {
		this.sensTables = sensTables;
	}

	public Integer getSensFiles() {
		return sensFiles;
	}

	public void setSensFiles(Integer sensFiles) {
		this.sensFiles = sensFiles;
	}

	public Integer getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(Integer swiftCode) {
		this.swiftCode = swiftCode;
	}

	public Integer getEmail() {
		return email;
	}

	public void setEmail(Integer email) {
		this.email = email;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public Integer getPassport() {
		return passport;
	}

	public void setPassport(Integer passport) {
		this.passport = passport;
	}

	public Integer getRouting() {
		return routing;
	}

	public void setRouting(Integer routing) {
		this.routing = routing;
	}

	public Integer getDob() {
		return dob;
	}

	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public Integer getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(Integer creditCard) {
		this.creditCard = creditCard;
	}

	public Integer getHippaa() {
		return hippaa;
	}

	public void setHippaa(Integer hippaa) {
		this.hippaa = hippaa;
	}

	public Integer getFerpa() {
		return ferpa;
	}

	public void setFerpa(Integer ferpa) {
		this.ferpa = ferpa;
	}

	public Integer getClass3() {
		return class3;
	}

	public void setClass3(Integer class3) {
		this.class3 = class3;
	}

	public Integer getClass4() {
		return class4;
	}

	public void setClass4(Integer class4) {
		this.class4 = class4;
	}

	public Integer getClass5() {
		return class5;
	}

	public void setClass5(Integer class5) {
		this.class5 = class5;
	}

	public Integer getClass6() {
		return class6;
	}

	public void setClass6(Integer class6) {
		this.class6 = class6;
	}

	public Integer getClass7() {
		return class7;
	}

	public void setClass7(Integer class7) {
		this.class7 = class7;
	}

	public Integer getClass8() {
		return class8;
	}

	public void setClass8(Integer class8) {
		this.class8 = class8;
	}

	public Integer getP11() {
		return p11;
	}

	public void setP11(Integer p11) {
		this.p11 = p11;
	}

	public Integer getIcDS1() {
		return icDS1;
	}

	public void setIcDS1(Integer icDS1) {
		this.icDS1 = icDS1;
	}

	public Integer getIcDS2() {
		return icDS2;
	}

	public void setIcDS2(Integer icDS2) {
		this.icDS2 = icDS2;
	}

	public Integer getIcDS3() {
		return icDS3;
	}

	public void setIcDS3(Integer icDS3) {
		this.icDS3 = icDS3;
	}

	public Integer getIcDS4() {
		return icDS4;
	}

	public void setIcDS4(Integer icDS4) {
		this.icDS4 = icDS4;
	}

	public Double getSdDS1() {
		return sdDS1;
	}

	public void setSdDS1(Double sdDS1) {
		this.sdDS1 = sdDS1;
	}

	public Double getSdDS2() {
		return sdDS2;
	}

	public void setSdDS2(Double sdDS2) {
		this.sdDS2 = sdDS2;
	}

	public Double getSdDS3() {
		return sdDS3;
	}

	public void setSdDS3(Double sdDS3) {
		this.sdDS3 = sdDS3;
	}

	public Double getSdDS4() {
		return sdDS4;
	}

	public void setSdDS4(Double sdDS4) {
		this.sdDS4 = sdDS4;
	}

	@Override
	public String toString() {
		return "DataEntry [id=" + id + ", issuesResolved=" + issuesResolved + ", coverageDBs=" + coverageDBs
				+ ", coverageTables=" + coverageTables + ", coverageFiles=" + coverageFiles + ", dataSources="
				+ dataSources + ", sensDatabases=" + sensDatabases + ", sensTables=" + sensTables + ", sensFiles="
				+ sensFiles + ", swiftCode=" + swiftCode + ", email=" + email + ", bank=" + bank + ", phone=" + phone
				+ ", ssn=" + ssn + ", passport=" + passport + ", routing=" + routing + ", dob=" + dob + ", creditCard="
				+ creditCard + ", hippaa=" + hippaa + ", ferpa=" + ferpa + ", class3=" + class3 + ", class4=" + class4
				+ ", class5=" + class5 + ", class6=" + class6 + ", class7=" + class7 + ", class8=" + class8 + ", p11="
				+ p11 + ", icDS1=" + icDS1 + ", icDS2=" + icDS2 + ", icDS3=" + icDS3 + ", icDS4=" + icDS4 + ", sdDS1="
				+ sdDS1 + ", sdDS2=" + sdDS2 + ", sdDS3=" + sdDS3 + ", sdDS4=" + sdDS4 + "]";
	}
	
	
	
	

}
