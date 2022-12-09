<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navbar.jspf" %>

<div class="container">
<div class="row">
<div class="col">

<th>Image</th>
<th>FirstName</th>
<th>LastName</th>
<th>Date of Birth</th>
<th>TrainingDuration</th>
<th>RegistrationDate</th>
</tr>
</thead>
<tbody>
<tr>
<td><a href="/detail.do?id=${student}"><img src="${details.studentImage}" alt="" width="200" height="200"></a></td>
<h3>${details.firstname} ${details.lastname}</h3>
<td>${details.dateOfBirth}</td>
<td>${details.trainingDuration}</td>
<td>${details.registrationDate}</td>
</tr>
</tbody>
<tr>
<tfood>
<td>Description></td>
<td colspan="6">${details.description }</td>
</tr>
<tfood>
</div>
</div>
<button type="button" class="btn-btn-info btn-lg">
<a href="logout.do">Logou</a>
</button>
</div>
<%@ include file="../common/footer.jspf" %>