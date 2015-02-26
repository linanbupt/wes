package hello.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cstor_user {

	@Id
	private int id;
	private String usercode;
	
	private String user_login;
	
	private String user_name;
	
	private String user_pwd;
	
	private String headurl;
	
	private String user_sex;
	
	private String role_id;
	
	private String group_id;
	
	private String ftp_state;
	
	private String user_quota_state;
	
	private String email_state;
	
	private String oa_state;
	
	private String crm_state;
	
	private String birthday;
	
	private String nation;
	
	private String position;
	
	private String native_place;
	
	
	private String politics_status_id;
	
	private String id_card;
	
	private String marital_status_id;
	
	private String userstate_id;
	
	private String graduate_school;
	
	private String graduate_date;
	
	private String education_id;
	
	private String address;
	
	private String phone;
	
	private String phone2;
	
	private String mobile;
	
	private String email;
	
	private String email2;
	
	private String zipcode;
	
	private String qq;
	
	private String msn;
	
	private String shortnumber;
	
	private String telephoneextensions;
	
	private String mark;
	
	private String create_id;
	
	private String create_date;
	
	private String update_id;
	
	private String update_date;
	
	private String needdaily;
	
	private String needweekly;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUser_login() {
		return user_login;
	}

	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}



	public String getHeadurl() {
		return headurl;
	}

	public void setHeadurl(String headurl) {
		this.headurl = headurl;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getFtp_state() {
		return ftp_state;
	}

	public void setFtp_state(String ftp_state) {
		this.ftp_state = ftp_state;
	}

	public String getUser_quota_state() {
		return user_quota_state;
	}

	public void setUser_quota_state(String user_quota_state) {
		this.user_quota_state = user_quota_state;
	}

	public String getEmail_state() {
		return email_state;
	}

	public void setEmail_state(String email_state) {
		this.email_state = email_state;
	}

	public String getOa_state() {
		return oa_state;
	}

	public void setOa_state(String oa_state) {
		this.oa_state = oa_state;
	}

	public String getCrm_state() {
		return crm_state;
	}

	public void setCrm_state(String crm_state) {
		this.crm_state = crm_state;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNative_place() {
		return native_place;
	}

	public void setNative_place(String native_place) {
		this.native_place = native_place;
	}

	public String getPolitics_status_id() {
		return politics_status_id;
	}

	public void setPolitics_status_id(String politics_status_id) {
		this.politics_status_id = politics_status_id;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getMarital_status_id() {
		return marital_status_id;
	}

	public void setMarital_status_id(String marital_status_id) {
		this.marital_status_id = marital_status_id;
	}

	public String getUserstate_id() {
		return userstate_id;
	}

	public void setUserstate_id(String userstate_id) {
		this.userstate_id = userstate_id;
	}

	public String getGraduate_school() {
		return graduate_school;
	}

	public void setGraduate_school(String graduate_school) {
		this.graduate_school = graduate_school;
	}

	public String getGraduate_date() {
		return graduate_date;
	}

	public void setGraduate_date(String graduate_date) {
		this.graduate_date = graduate_date;
	}

	public String getEducation_id() {
		return education_id;
	}

	public void setEducation_id(String education_id) {
		this.education_id = education_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getShortnumber() {
		return shortnumber;
	}

	public void setShortnumber(String shortnumber) {
		this.shortnumber = shortnumber;
	}

	public String getTelephoneextensions() {
		return telephoneextensions;
	}

	public void setTelephoneextensions(String telephoneextensions) {
		this.telephoneextensions = telephoneextensions;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getCreate_id() {
		return create_id;
	}

	public void setCreate_id(String create_id) {
		this.create_id = create_id;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(String update_id) {
		this.update_id = update_id;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getNeeddaily() {
		return needdaily;
	}

	public void setNeeddaily(String needdaily) {
		this.needdaily = needdaily;
	}

	public String getNeedweekly() {
		return needweekly;
	}

	public void setNeedweekly(String needweekly) {
		this.needweekly = needweekly;
	}
	
	
	
	
	
	
	
	
	
	
}
