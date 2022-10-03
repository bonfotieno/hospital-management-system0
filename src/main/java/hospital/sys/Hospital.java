package hospital.sys;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

class Register implements  Servlet{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse Res) throws ServletException, IOException {
        PrintWriter wr = Res.getWriter();
        wr.print(Hospital.header()+this.registerBody()+Hospital.footer());
    }

    public String registerBody(){
        return "<div class=\"row \">"
				+"<div class=\"col-md-12\">"
					+"<div class=\"panel panel-default login\">"
						+"<div class=\"panel-heading logintitle\">Register As Patient</div>"
						+"<div class=\"panel-body\">"
							+"<form class=\"form-horizontal center-block\" role=\"form\" action=\"register_patient_validation.html\" method=\"post\">"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Patient Id:</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"number\" class=\"form-control\" name=\"patientid\" placeholder=\"unique_id auto generated\" readonly>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Name</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"patientname\" placeholder=\"Name\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Email</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Password</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"password\" class=\"form-control\" name=\"pwd\" placeholder=\"Password\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Address</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"add\" placeholder=\"Address\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Phone</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"Phone No.\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Reason Of Visit</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"rov\" placeholder=\"Reason Of Visit\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Room No</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" value=\"\" name=\"roomNo\" placeholder=\"Left for Admin\" readonly>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Bed No</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"bedNo\" placeholder=\"Left for Admin\" readonly>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">To Be reffered To</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"doct\" placeholder=\"Left for Admin\" readonly>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Sex</label>"
									+"<div class=\"col-sm-2\">"
										+"<select class=\"form-control\" name=\"gender\">"
											+"<option>Male</option>"
											+"<option>Female</option>"
										+"</select>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Admission Date</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"joindate\" placeholder=\"Left For Admin\" readonly>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Age</label>"
									+"<div class=\"col-sm-10\">"
										+"<input type=\"text\" class=\"form-control\" name=\"age\" placeholder=\"Age\" required>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<label class=\"col-sm-2 control-label\">Blood Group</label>"
									+"<div class=\"col-sm-2\">"
										+"<select class=\"form-control\" name=\"bgroup\">"
											+"<option>A<sup>+</sup></option>"
											+"<option>A<sup>-</sup></option>"
											+"<option>B<sup>+</sup></option>"
											+"<option>B<sup>-</sup></option>"
											+"<option>AB<sup>+</sup></option>"
											+"<option>AB<sup>-</sup></option>"
											+"<option>O<sup>+</sup></option>"
											+"<option>O<sup>-</sup></option>"
										+"</select>"
									+"</div>"
								+"</div>"
								+"<div class=\"form-group\">"
									+"<div class=\"col-sm-7 col-sm-offset-2\" style=\"margin:0 0 0 40%\">"
										+"<button type=\"submit\" class=\"btn btn-primary\">Register As Patient Now</button>"
									+"</div>"
								+"</div>"
								+"<br><Br><Br>"
							+"</form>"
						+"</div>"
					+"</div>"
				+"</div>"
			+"</div>";
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
public class Hospital implements Servlet {

    @Override
    public void service(ServletRequest Req, ServletResponse Res) throws ServletException, IOException {
        PrintWriter wr = Res.getWriter();
        wr.print(header()+this.loginBody()+ footer());
    }

    public String loginBody(){
        return "<div class=\"row \">"
                    +"<div class=\"col-md-12\">"
                        +"<br /><br /><br /><br /><br /><br /><br /><br />"
                        +"<div class=\"panel panel-default login\">"
                            +"<div class=\"panel-heading logintitle\">Login</div>"
                            +"<div class=\"panel-body\">"
                                +"<form class=\"form-horizontal center-block\" role=\"form\" action=\"login_validation.html\" method=\"post\">"
                                    +"<div class=\"input-group input-group-lg\">"
                                        +"<span class=\"input-group-addon\" id=\"sizing-addon1\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span></span>"
                                        +"<select class=\"form-control\" name=\"userrole\">"
                                            +"<option selected=\"selected\">Select User</option>"
                                            +"<option value=\"admin\">Admin</option>"
                                            +"<option value=\"patient\">Patient</option>"
                                        +"</select>"
                                    +"</div><br/>"
                                    +"<div>"
                                    +"</div>"
                                    +"<div class=\"input-group input-group-lg\">"
                                        +"<span class=\"input-group-addon\" id=\"sizing-addon1\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span></span>"
                                        +"<input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"example@gmail.com\" required aria-describedby=\"sizing-addon1\">"
                                    +"</div>"
                                    +"<br />"
                                    +"<div class=\"input-group input-group-lg\">"
                                        +"<span class=\"input-group-addon\" id=\"sizing-addon1\"><span class=\"glyphicon glyphicon-lock\" aria-hidden=\"true\"></span></span>"
                                        +"<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required aria-describedby=\"sizing-addon1\">"
                                    +"</div>"
                                    +"<br />"
                                    +"<div class=\"col-sm-7 col-sm-offset-2\">"
                                        +"<button type=\"submit\" class=\"btn btn-primary btn-block btn-lg\">Login</button>"
                                    +"</div>"
                                +"</form>"
                            +"</div>"
                            +"<a href=\"/hospital-management-system0/register\" style=\"text-align:Center;font-weight:bold;font-size:120%;padding: 0 2%\">Register As Patient</a>"
                        +"</div>"
                    +"</div>"
                +"</div>";
    }

    public static String header(){
        return "<!DOCTYPE html>"
                +"<html lang=\"en\">"
                +"<head>"
                    +"<meta charset=\"utf-8\">"
                    +"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">"
                    +"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
                    +"<title>Online Hospital Management System</title>"
                    +"<link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">"
                    +"<link href=\"./css/style.css\" rel=\"stylesheet\">"
                    +"<script src=\"./js/jquery.js\"></script>"
                +"</head>"
                +"<body>"
                    +"<div class=\"container-fluid\">"
                        +"<div class=\"row navbar-fixed-top\">"
                            +"<nav class=\"navbar navbar-default header\">"
                                +"<div class=\"container-fluid\">"
                                    +"<div class=\"navbar-header\">"
                                        +"<a class=\"navbar-brand logo\" href=\"#\">"
                                            +"<img alt=\"Brand\" src=\"images/logo.png\">"
                                        +"</a>"
                                        +"<div class=\"navbar-text title\">"
                                            +"<p>Hospital Management System"
                                            +"<p>"
                                        +"</div>"
                                    +"</div>"
                                +"</div>"
                            +"</nav>"
                        +"</div>";
    }

    public static String footer(){
        return "<div class=\"row footer navbar-fixed-bottom\">"
                    +"<div class=\"col-md-12\">"
                        +"<div>Botien Technologies</div>"
                        +"<p>Copyrights © 2022. All rights reserved. </p>"
                    +"</div>"
                +"</div>"
            +"</div>"
            +"<script src=\"js/bootstrap.min.js\"></script>"
        +"</body>"
        +"</html>";
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {}

    @Override
    public ServletConfig getServletConfig() {return null;}

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}