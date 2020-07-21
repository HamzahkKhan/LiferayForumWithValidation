<%@ include file="/init.jsp"%>


<portlet:renderURL var="studentInfoURL">
    <portlet:param name="mvcRenderCommandName" value="/student-info" />
</portlet:renderURL>

<portlet:actionURL name="/studentInfo" var="studentInfoURL" />



<table class="aui" style="width: 100%" border="0">

	<thead>
		<tr>
			<aui:row>
				<aui:col width="25">
					<th id="name">Name</th>
				</aui:col>
				<aui:col width="25">
					<th id="course">Course</th>
				</aui:col>
				<aui:col width="25">
					<th id="email">Email</th>
				</aui:col>
				<aui:col width="25">
					<th id="action">Action</th>
				</aui:col>
			</aui:row>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach var="student" items="${studentlist}">
	

		<tr>
			<td>${student.firstname}  ${student.lastname}</td>
			<td>${student.course}</td>
			<td>${student.email}</td>
			<td>
			<aui:input type="hidden" name="selectedstudent" value="${student.studentId}"></aui:input>
			<aui:button type="submit" onclick = "buttonPressed('Details', ${student.studentId})"  value="Details"  />
			<aui:button type="submit" onclick = "buttonPressed('Delete', ${student.studentId})"   value="Delete" />
			
			</td>
		</tr>
		
	</c:forEach>
	</tbody>
	

</table>

<script>
function buttonPressed(action, studentid){

	window.location.href = '<%= studentInfoURL %>&ButtonPressedByUSer=' + action + '&studentIdSelected=' + 
	studentid;
}
</script>




