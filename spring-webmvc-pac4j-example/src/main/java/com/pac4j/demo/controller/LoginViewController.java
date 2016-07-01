package com.pac4j.demo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pac4j.core.context.J2EContext;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.profile.ProfileManager;
import org.pac4j.core.profile.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginViewController {
	
	@RequestMapping(value = "/login")
	public String displayLoginPage(ModelMap model){
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "index";
	}
	
	@RequestMapping(value = "/callback")
	public String displayLandingPage(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map){
		//model.addAttribute("message", "Hello Spring MVC Framework!");
		final WebContext context = new J2EContext(request, response);
        map.put("profiles", getProfiles(context));
        
		return "index";
	}

	private UserProfile getProfiles(final WebContext context) {
        final ProfileManager manager = new ProfileManager(context);
        return manager.get(true);
    }
}
