<%@ include file="/init.jsp"%>



<h2>Student Registration</h2>

<portlet:actionURL name="/registerStudent" var="registerStudentURL" />

<aui:form name="register" action="<%=registerStudentURL.toString()%>"
	method="post">

	<aui:row>
		<aui:col width="50">
			<aui:input type="text" label="firstname" name="ffname" value="" placeholder="John">
				<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Firstnameerror}</p>
		</aui:col>
		
		<aui:col width="50">
			<aui:input type="text" label="lastname" name="flname" value="" placeholder="Doe">
				<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Lastnameerror}</p>
		</aui:col>
	</aui:row>

	<!-- ***************************************************************************************************** -->


	<aui:select label="gender" name="fgender">
		<aui:option value="male">Male</aui:option>
		<aui:option value="female">Female</aui:option>
	</aui:select>

   <!-- ***************************************************************************************************** -->

	<label>Date of birth:</label>

	<aui:row>
		<aui:col width="33">
			<aui:select name="fyear" label="year">
				<c:forEach var="year" items="${Years}">
					<aui:option value="${year}">${year}</aui:option>
				</c:forEach>
			</aui:select>
		</aui:col>
		<aui:col width="33">
			<aui:select name="fmonth" label="month">
				<c:forEach var="month" items="${Months}">
					<aui:option value = "${month}">${month}</aui:option>
				</c:forEach>
			</aui:select>
		</aui:col>
		<aui:col width="33">
			<aui:select name="fday" label="day">
				<c:forEach var="days" items="${Days}">
					<aui:option value="${days}">${days}</aui:option>
				</c:forEach>
			</aui:select>
		</aui:col>
	</aui:row>
	
	<!-- ***************************************************************************************************** -->

	<aui:row>
		<aui:col width="50">
			<aui:input type="text" label="course" name="fcourse" value="" placeholder="Software Engineering">
			<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Courseerror}</p>
		</aui:col>
		<aui:col width="50">
			<aui:select name="fintakeyear" label="intakeyear">
				<c:forEach var="year" items="${Years}">
					<aui:option value="${year}">${year}</aui:option>
				</c:forEach>
			</aui:select>
		</aui:col>
	</aui:row>

    <!-- ***************************************************************************************************** -->

	<aui:input type="text" label="address" name="faddress" value="" placeholder="Full address">
	<aui:validator name="required" />
	</aui:input>

	<aui:row>
		<aui:col width="33">
			<aui:input type="text" label="city" name="fcity" value="" placeholder="City">
			<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Cityerror}</p>
		</aui:col>
		<aui:col width="33">
			<aui:input type="text" label="postcode" name="fpostcode" value="" placeholder="00000" maxlength = "5">
			<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Postcode}</p>
		</aui:col>
		<aui:col width="33">
			<aui:select label="country" name="fcountry"
				style="text-transform: capitalize">
				
				<c:forEach var="country" items="${Countries}">
					<aui:option value="${country.name}">${country.name}</aui:option>
				</c:forEach>
			</aui:select>
		</aui:col>
	</aui:row>

    <!-- ***************************************************************************************************** -->
    
	<aui:row>
		<aui:col width="50">
			<aui:input type="text" label="email" name="femail" value="" placeholder="johndoe75@domain.com">
			<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Emailerror}</p>
		</aui:col>
		
		<aui:col width="50">
			<aui:input type="text" label="phone" name="fphone" value="" placeholder="60 00 0000 0000" maxlength="12">
			<aui:validator name="required" />
			</aui:input>
			<p style="font-size: 15px; color: RED;">${Numbererror}</p>
		</aui:col>
	</aui:row>


	<aui:button type="submit" value="Register Student" />

</aui:form>