package org.student.render;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ContactLocalServiceUtil;
import com.liferay.portal.kernel.service.CountryServiceUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.student.constants.StudentRegistrationPortletKeys;

@Component(immediate = true, property = { 
		"javax.portlet.name=" + StudentRegistrationPortletKeys.STUDENTREGISTRATION,
		"mvc.command.name=/student-registration" 
		}, 

service = MVCRenderCommand.class)

public class StudentRegistrationRender implements MVCRenderCommand {

	Log log = LogFactoryUtil.getLog(StudentRegistrationRender.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		log.info("Student Registration Render Started");

		List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December");
		List<Integer> days = Days();
		List<Integer> years = Years();
		List<Country> country = CountryServiceUtil.getCountries();

		HashMap<String, String> errors = (HashMap<String, String>) renderRequest.getAttribute("ErrorHashmap");

		log.info(errors);

		if (errors != null) {
			renderRequest.setAttribute("Firstnameerror", errors.get("Firstname"));
			renderRequest.setAttribute("Lastnameerror", errors.get("Lastname"));
			renderRequest.setAttribute("Courseerror", errors.get("Course"));
			renderRequest.setAttribute("Cityerror", errors.get("City"));
			renderRequest.setAttribute("Postcode", errors.get("Postcode"));
			renderRequest.setAttribute("Emailerror", errors.get("Email"));
			renderRequest.setAttribute("Numbererror", errors.get("Number"));
		}

		renderRequest.setAttribute("Months", months);
		renderRequest.setAttribute("Days", days);
		renderRequest.setAttribute("Years", years);

		renderRequest.setAttribute("Countries", country);

		return "/jsps/studentregistration.jsp";
	}

	public List<Integer> Days() {
		int i = 1;
		List<Integer> days = new ArrayList<Integer>();
		while (i < 32) {
			days.add(i);
			i++;
		}
		return days;

	}

	public List<Integer> Years() {
		int i = 1920;
		List<Integer> years = new ArrayList<Integer>();
		while (i < 2020) {
			years.add(i);
			i++;
		}
		return years;
	}

}
