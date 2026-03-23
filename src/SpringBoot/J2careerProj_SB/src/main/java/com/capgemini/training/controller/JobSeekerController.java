


package com.capgemini.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.capgemini.training.entity.JobSeeker;
import com.capgemini.training.repository.ApplicationRepository;
import com.capgemini.training.repository.JobSeekerRepository;
import com.capgemini.training.service.JobSeekerService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/jobseeker")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    // ✅ REGISTER
    @PostMapping("/register")
    public String register(JobSeeker js) {
        jobSeekerService.register(js);
        return "login";
    }

    // ✅ LOGIN (STORE SESSION)
//    @PostMapping("/login")
//    public String login(@RequestParam String email,
//                        @RequestParam String password,
//                        Model model,
//                        HttpSession session) {
//
//        JobSeeker js = jobSeekerService.login(email, password);
//
//        if (js != null) {
//            session.setAttribute("user", js); // 🔥 STORE USER IN SESSION
//            model.addAttribute("user", js);
//            return "dashboard/jobseeker-dashboard";
//        } else {
//            model.addAttribute("error", "Invalid Credentials");
//            return "login";
//        }
//    }
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        Model model,
                        HttpSession session) {

        JobSeeker js = jobSeekerService.login(email, password);

        if (js != null) {

            session.setAttribute("user", js); // ✅ store session

            return "redirect:/jobseeker/dashboard"; // ✅ IMPORTANT

        } else {
            model.addAttribute("error", "Invalid Credentials");
            return "login";
        }
    }

    // ✅ DASHBOARD
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {

        JobSeeker user = (JobSeeker) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login?role=JOBSEEKER";
        }

        model.addAttribute("user", user);
        return "dashboard/jobseeker-dashboard";
    }

    // ✅ SHOW EDIT PAGE
    @GetMapping("/edit")
    public String editProfile(@RequestParam Long id, Model model) {

        JobSeeker js = jobSeekerRepository.findById(id).orElse(null);
        model.addAttribute("jobSeeker", js);

        return "edit-jobseeker";
    }

    // ✅ UPDATE PROFILE
    @PostMapping("/update")
    public String update(JobSeeker js, HttpSession session) {

        JobSeeker updated = jobSeekerService.update(js);

        // 🔥 UPDATE SESSION
        session.setAttribute("user", updated);

        // 🔥 GO BACK TO DASHBOARD (NO LOGIN AGAIN)
        return "redirect:/jobseeker/dashboard";
    }

    // ✅ DELETE ACCOUNT
    @GetMapping("/delete")
    public String delete(@RequestParam Long id) {

        applicationRepository.deleteByJobSeekerId(id);
        jobSeekerRepository.deleteById(id);

        return "redirect:/login?role=JOBSEEKER";
    }
}