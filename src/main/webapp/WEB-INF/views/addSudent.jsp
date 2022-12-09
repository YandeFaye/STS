<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navbar.jspf" %>
        <div class="container">
            <%--New student form --%>
            <form action="/date.do" method="post">
                <div class="row">    
                    <div class="form-group col">
                        <label for="name">Firstname</label>
                        <input type="text" class="form-control" name="firstname" id="firstname" />
                    </div>
                
                    <div class="form-group col">
                        <label for="name">Lastname</label>
                        <input type="text" class="form-control" name="lastname" id="lastname" />
                    </div>
                  
                    <div class="form-group col">
                        <label for="dateOfBirth">Date Birth</label>
                        <input type="date" class="form-control" name="dateOfBirth" id="dateOfBirth" />
                    </div>
                  
                   <div class="form-group col">
                        <label for="trainingDuration">TrainingDuration</label>
                        <input type="text" class="form-control" name="trainingDuration" id="trainingDuration" />
                    </div>
                  
                    <div class="form-group col">
                        <label for="registrationDate">Registration</label>
                        <input type="date" class="form-control" name="registrationDate" id="registrationDate" />
                    </div>
                   
                    <div class="form-group col">
                        <label for="studentImage">StudentImage</label>
                        <input type="studentImage" class="form-control" name="studentImage" id="studentImage" />
                    </div>
                  
                </div>
                 <div class="form-group col">
                        <label for="description">Description</label>
                        <input type="description" class="form-control" name="description" id="description" />
                    </div>
                   
                </div>
                <button class="btn btn-success" >Save</button>
            </form>

<%@ include file="../common/footer.jspf" %>