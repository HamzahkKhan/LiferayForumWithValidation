package org.student.action;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PortalPreferences;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletResponse;

import org.company.service.model.StudentInfo;
import org.company.service.service.StudentInfoLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.student.constants.StudentRegistrationPortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + StudentRegistrationPortletKeys.STUDENTREGISTRATION,
		"mvc.command.name=/registerStudent" }, service = MVCActionCommand.class)

public class StudentRegistrationAction implements MVCActionCommand {

	Log log = LogFactoryUtil.getLog(StudentRegistrationAction.class);
	HashMap<String, String> errorsFoundTest;

	@SuppressWarnings("deprecation")
	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		log.info("Student Registration Action Started");
		
		errorsFoundTest = new HashMap<String, String>();

		String firstname = ParamUtil.getString(actionRequest, "ffname");
		String lastname = ParamUtil.getString(actionRequest, "flname");
		String gender = ParamUtil.getString(actionRequest, "fgender");

		String year = ParamUtil.getString(actionRequest, "fyear");
		String month = ParamUtil.getString(actionRequest, "fmonth");
		String day = ParamUtil.getString(actionRequest, "fday");
		String dob = month + " " + day + " " + year;

		String course = ParamUtil.getString(actionRequest, "fcourse");
		String intake = ParamUtil.getString(actionRequest, "fintakeyear");

		String address = ParamUtil.getString(actionRequest, "faddress");
		String city = ParamUtil.getString(actionRequest, "fcity");
		String postcode = ParamUtil.getString(actionRequest, "fpostcode");

		String country = ParamUtil.getString(actionRequest, "fcountry");
		String email = ParamUtil.getString(actionRequest, "femail");

		String number = ParamUtil.getString(actionRequest, "fphone");
		String mobile = "+" + number;
		
		
		
		checkFirstName(firstname);
		checkLastName(lastname);
		checkCity(city);
		checkCourse(course);
		checkEmail(email);
		checkNumber(number);
		checkPostCode(postcode);
	
		
		log.info("Errosfounf =   " + this.errorsFoundTest);

		if (checkCity(city) || checkCourse(course) || checkEmail(email) || checkFirstName(firstname) || checkNumber(number) || 
				checkLastName(lastname) || checkPostCode(postcode) ) {

			log.info("Error");
			
			
			actionRequest.setAttribute("ErrorHashmap", errorsFoundTest);

			log.info(errorsFoundTest);
			String location = "/student-registration";
			actionResponse.setRenderParameter("mvcRenderCommandName", location);

		} else {

			
			
			StudentInfo studentInfo = StudentInfoLocalServiceUtil.
					createStudentInfo(CounterLocalServiceUtil.increment(StudentInfo.class.getName()));
			
			studentInfo.setFirstname(firstname);
			studentInfo.setLastname(lastname);
			studentInfo.setGender(gender);
			studentInfo.setDateofbirth(dob);
			studentInfo.setCourse(course);
			studentInfo.setIntake(intake);
			studentInfo.setAddress(address);
			studentInfo.setCity(city);
			studentInfo.setPostcode(postcode);
			studentInfo.setCountry(country);
			studentInfo.setEmail(email);
			studentInfo.setMobile(mobile);
			
			studentInfo = StudentInfoLocalServiceUtil.updateStudentInfo(studentInfo);
			
			if (studentInfo != null) {
				
				log.info("Student Added!!, STUDENT INFO :   ");
				log.info("fname = " + firstname);
				log.info("lname = " + lastname);
				log.info("gender = " + gender);
				log.info("dob = " + dob);
				log.info("Course = " + course);
				log.info("Intake = " + intake);
				log.info("Address = " + address);
				log.info("City = " + city);
				log.info("postcode = " + postcode);
				log.info("country = " + country);
				log.info("email = " + email);
				log.info("mobile = " + mobile);
				
				String successlocation = "/jsps/success.jsp";
				actionResponse.setRenderParameter("jspPage", successlocation);
				
			}else {
				log.info("Something Went Wrong..");
			}

		}

		return false;
	}
	
	public boolean checkFirstName(String firstname) {
		
		if(checkForSpeacialCharAndNumbers(firstname)) {
			this.errorsFoundTest.put("Firstname", "* First Name cannot have letters or special Chars");
			return true;
			
		}else {
			return false;
		}
	}
	
    public boolean checkLastName(String lastname) {
		
		if(checkForSpeacialCharAndNumbers(lastname)) {
			this.errorsFoundTest.put("Lastname", "* Last Name cannot have letters or special Chars");
			return true;
		}else {
			return false;
		}
	}
    
    public boolean checkCourse(String course) {
		
		if(checkForSpeacialCharAndNumbers(course)) {
			this.errorsFoundTest.put("Course", "* Course cannot have letters or special Chars");
			return true;
		}else {
			return false;
		}
	}
    
    public boolean checkCity(String city) {
		
		if(checkForSpeacialCharAndNumbers(city)) {
			this.errorsFoundTest.put("City", "* City cannot have letters or special Chars");
			return true;
		}else {
			return false;
		}
	}
    
    public boolean checkEmail(String email) {
		
    	if (!email.contains("@") || !email.contains(".") || !email.contains("com")) {
    		this.errorsFoundTest.put("Email", "* Wrong Email");
    		return true;
		} else {
			return false;
		}
	}
    
    public boolean checkPostCode(String postcode) {
		
		if(checkForOnlyNumbers(postcode)) {
			this.errorsFoundTest.put("Postcode", "* Enter Correct Postcode");
			return true;
		}else {
			return false;
		}
	}
    
    public boolean checkNumber(String number) {
		
  		if(checkForOnlyNumbers(number)) {
  			this.errorsFoundTest.put("Number", "* Enter Correct Mobile Number");
  			return true;
  		}else {
  			return false;
		}
  	}
    
    
      
/*
	public HashMap<String, String> validateUserInput(String firstname, String lastname, String course, String city,
			String email, String postcode, String number) {

		HashMap<String, String> Errors = new HashMap<String, String>();

		if (checkForSpeacialCharAndNumbers(firstname)) {

			Errors.put("Firstname", "* First Name cannot have letters or special Chars");
			return Errors;

		} else if (checkForSpeacialCharAndNumbers(lastname)) {

			Errors.put("Lastname", "* Last Name cannot have letters or special Chars");
			return Errors;

		} else if (checkForSpeacialCharAndNumbers(course)) {

			Errors.put("Course", "* Course cannot have letters or special Chars");
			return Errors;

		} else if (checkForSpeacialCharAndNumbers(city)) {

			Errors.put("City", "* City cannot have letters or special Chars");
			return Errors;

		} else if (!email.contains("@") || !email.contains(".") || !email.contains("com")) {

			Errors.put("Email", "* Wrong Email");
			return Errors;

		} else if (checkForOnlyNumbers(postcode)) {

			Errors.put("Postcode", "* Enter Correct Postcode");
			return Errors;
		} else if (checkForOnlyNumbers(number)) {

			Errors.put("Number", "* Enter Correct Mobile Number");
			return Errors;
		}
		
		else {

			Errors.put("NoError", "noerror");
			return Errors;

		}

	}
*/
	
//****************************************************************************************************************************
	public boolean checkForSpeacialCharAndNumbers(String word) {

		Pattern pattern = Pattern.compile("[^A-Za-z0-9], ' '");
		Matcher matcher = pattern.matcher(word);
		boolean check = matcher.find();

		if (check || word.matches(".*\\d.*")) {
			log.info("Error found in aplha input");
			return true;
		} else {
			log.info("No error found in apha input");
			return false;
		}

	}

	public boolean checkForOnlyNumbers(String number) {

		if (number.matches("[0-9]+")) {
			log.info("No Error found in num input");
			return false;
		} else {
			log.info("Error found in num input");
			return true;
		}

	}

}
