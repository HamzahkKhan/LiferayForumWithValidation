<%@ include file="/init.jsp" %>


<portlet:renderURL var="studentregURL">
    <portlet:param name="mvcRenderCommandName" value="/student-registration" />
</portlet:renderURL>


<portlet:renderURL var="studentlistURL">
    <portlet:param name="mvcRenderCommandName" value="/student-list" />
</portlet:renderURL>

<h2>Student Registered !!</h2> <br><br>

<aui:button type="button" value="register" onclick="studentregistration()" />
<aui:button type="button" value="studentlist" onclick="studentlist()" />




<script>
function studentregistration(){
	console.log("student registration");
	window.location.href = '<%= studentregURL %>';
}

function studentlist(){
	console.log("student list");
	window.location.href = '<%= studentlistURL %>';
}
</script>