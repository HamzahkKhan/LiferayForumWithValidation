package org.student.render;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.util.Arrays;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.company.service.model.StudentInfo;
import org.company.service.service.StudentInfoLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.student.constants.StudentRegistrationPortletKeys;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + StudentRegistrationPortletKeys.STUDENTREGISTRATION,
	       "mvc.command.name=/student-list"
	    },
	    service = MVCRenderCommand.class
	)

public class StudentListRender implements MVCRenderCommand {
	
	Log log = LogFactoryUtil.getLog(StudentRegistrationRender.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		log.info("Student List Render");
		
		
		List<StudentInfo> studentInfos = StudentInfoLocalServiceUtil.getStudentInfos(-1, -1);
		
		renderRequest.setAttribute("studentlist", studentInfos);
		
		
		return "/jsps/studentlist.jsp";
	}

}
