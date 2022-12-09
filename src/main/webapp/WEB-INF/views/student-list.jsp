<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navbar.jspf" %>

<!--<h1>Welcome to STS ${username}</h1>-->
<table class="table caption-top">
<thead class="table-light">
<tr>
<!--  <th>Id</th>-->
<th>Image</th>
<th>FirstName</th>
<th>LastName</th>
<th>Date of Birth</th>
<th>TrainingDuration</th>
<th>RegistrationDate</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${students}" var="student">
<tr>
<td><a href="/detail.do?id=${student}"><img src="${student.studentImage}" alt="" width="200" height="200"></a></td>
<td>${student.firstname}</td>
<td>${student.lastname}</td>
<td>${student.dateOfBirth}</td>
<td>${student.trainingDuration}</td>
<td>${student.registrationDate}</td>
<td><button  type="button" class="btn btn-danger btn-lg"><a href="/delete-student.do?id=${student.id}">Delete</a></button></td>
</tr>
</c:forEach>
</tbody>
</table>
 <br>
<button  type="button" class="btn btn-danger btn-lg" ><a href="date.do">Add Student</a></button>
<%@ include file="../common/footer.jspf" %>