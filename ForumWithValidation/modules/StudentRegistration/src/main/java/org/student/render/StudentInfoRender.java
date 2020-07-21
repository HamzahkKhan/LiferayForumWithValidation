package org.student.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.company.service.model.StudentInfo;
import org.company.service.service.StudentInfoLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.student.action.StudentRegistrationAction;
import org.student.constants.StudentRegistrationPortletKeys;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + StudentRegistrationPortletKeys.STUDENTREGISTRATION,
	       "mvc.command.name=/student-info"
	    },
	    service = MVCRenderCommand.class
	)

public class StudentInfoRender implements MVCRenderCommand {
	
	Log log = LogFactoryUtil.getLog(StudentRegistrationAction.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		log.info("Student Info Render");

		String studentid =  (String) renderRequest.getAttribute("studentid");
		
		log.info("SELECTED STUDENT ID =  " + studentid);
		
		long sId= Long.parseLong(studentid);
		
	
			try {
				StudentInfo studentInfo = StudentInfoLocalServiceUtil.getStudentInfo(sId);
				renderRequest.setAttribute("Firstname", studentInfo.getFirstname());
				renderRequest.setAttribute("Lastname", studentInfo.getLastname());
				renderRequest.setAttribute("Gender", studentInfo.getGender());
				renderRequest.setAttribute("Dob", studentInfo.getDateofbirth());
				renderRequest.setAttribute("Course", studentInfo.getCourse());
				renderRequest.setAttribute("Intake", studentInfo.getIntake());
				renderRequest.setAttribute("Address", studentInfo.getAddress());
				renderRequest.setAttribute("City", studentInfo.getCity());
				renderRequest.setAttribute("Postcode", studentInfo.getPostcode());
				renderRequest.setAttribute("Country", studentInfo.getCountry());
				renderRequest.setAttribute("Email", studentInfo.getEmail());
				renderRequest.setAttribute("Phone", studentInfo.getMobile());
				
				
			} catch (PortalException e) {
				log.info("Student not found");
				e.printStackTrace();
			}
			
		
		
		
		
		
		
		
		
		
		
		return "/jsps/studentinfo.jsp";
	}

}
