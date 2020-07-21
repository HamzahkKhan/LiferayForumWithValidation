package org.student.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.HttpServletRequest;

import org.company.service.model.StudentInfo;
import org.company.service.service.StudentInfoLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.student.constants.StudentRegistrationPortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + StudentRegistrationPortletKeys.STUDENTREGISTRATION,
"mvc.command.name=/studentInfo" }, service = MVCActionCommand.class)

public class StudentInfoAction implements MVCActionCommand {
	
	Log log = LogFactoryUtil.getLog(StudentRegistrationAction.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		log.info("Student Info Render Action");
		
	HttpServletRequest requestInsideThePortlet = PortalUtil.getHttpServletRequest(actionRequest);
		
		String action =
		 PortalUtil.getOriginalServletRequest(requestInsideThePortlet).getParameter("ButtonPressedByUSer");
		String studentid =  
		 PortalUtil.getOriginalServletRequest(requestInsideThePortlet).getParameter("studentIdSelected");
		
		long sid = Long.parseLong(studentid);
		
		log.info("ACTION =  " + action);
		log.info("SELECTED STUDENT ID =  " + studentid);
		
		if (action.equalsIgnoreCase("details")) {
			String location = "/student-info";
			actionRequest.setAttribute("studentid", studentid);
			actionResponse.setRenderParameter("mvcRenderCommandName", location);
		} 
		else if (action.equalsIgnoreCase("delete")) {
			
			String location = "/student-list";
			//actionRequest.setAttribute("studentid", studentid);
			log.info("DELETED =  " + studentid);
			try {
				StudentInfoLocalServiceUtil.deleteStudentInfo(sid);
				actionResponse.setRenderParameter("mvcRenderCommandName", location);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	/*	
		String location = "/student-info";
		actionResponse.setRenderParameter("mvcRenderCommandName", location);
		*/
		
		
		return false;
	}

}
