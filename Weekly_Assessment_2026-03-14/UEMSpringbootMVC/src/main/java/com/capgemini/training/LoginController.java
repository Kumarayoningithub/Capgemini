//package com.capgemini.training;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class LoginController {
//
//    @GetMapping("/")
//    public String loginPage() {
//        return "login.jsp";
//    }
//
//    @PostMapping("/login")
//    public String validate(String username, String password) {
//
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//
//        return "home.jsp";
//    }
//
//    @GetMapping("/register")
//    public String registerPage() {
//        return "register.jsp";
//    }
//
//    @PostMapping("/registerEmployee")
//    public String register(Employee emp) {
//
//        System.out.println("Employee Id: " + emp.getEmpId());
//        System.out.println("Employee Name: " + emp.getEmpName());
//        System.out.println("Employee Email: " + emp.getEmpEmail());
//
//        return "login.jsp";
//    }
//    
//    @GetMapping("/forgetpassword")
//    public String forgotPasswordPage() {
//        return "forgotpassword.jsp";
//    }
//
//    @PostMapping("/forgetpassword")
//    public String resetPassword(String email, String newPassword, String confirmPassword) {
//
//        System.out.println(email);
//        System.out.println(newPassword);
//        System.out.println(confirmPassword);
//
//        return "login.jsp";
//    }
//}
package com.capgemini.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login.jsp";
    }

    @PostMapping("/login")
    public String validate(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        return "home.jsp";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register.jsp";
    }

    @PostMapping("/registerEmployee")
    public String register(Employee emp) {

        System.out.println("Employee Id: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Email: " + emp.getEmpEmail());

        return "login.jsp";
    }

    @GetMapping("/forgetpassword")
    public String forgotPasswordPage() {
        return "forgetpassword.jsp";
    }

    @PostMapping("/forgetpassword")
    public String resetPassword(String email, String newPassword, String confirmPassword) {

        System.out.println("Email: " + email);
        System.out.println("New Password: " + newPassword);
        System.out.println("Confirm Password: " + confirmPassword);

        return "login.jsp";
    }
}