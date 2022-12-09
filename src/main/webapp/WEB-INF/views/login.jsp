<%@ include file="../common/header.jspf" %>
    <div class="container" style="display: flex; justify-content: center; align-items: center;">
        <div class="card" style="width: 42rem;">
            <div class="card-body">
            
            <div class="container" style="display: flex; justify-content: center; align-items: center;">
        <div class="card" style="width: 42rem;">
            <div class="card-body">
                <h1 class="card-title text-center">Login</h1>
                 <h3 class="card-subtitle mb-2 text-muted text-center">Welcome to STS</h3>
                <br/>
                
                <% if(request.getAttribute("errorMessage") != null) { %>
                    <div class="alert alert-danger alert-dismissible fade show" role="alert">
                        <strong>${errorMessage}</strong> ${message}
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                <% } %>
                 <p class="card-text">
                
                    <form action="/login.do" method="post">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon1"><i class='bx bxs-user'></i></span>
                            </div>
                            <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1" id="username" name="username">
                        </div>
                <br/>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="password-addon"><i class='bx bxs-lock-alt'></i></span>
                            </div>
                            <input type="password" class="form-control" placeholder="Password" aria-label="Password" aria-describedby="password-addon" name="password" id="password">
                        </div>
                           <br/>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                </p>
            </div>
        </div>
    </div>

   <%@ include file="../common/footer.jspf" %>