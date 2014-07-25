package com.proavos.training.onlinetkt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mouly on 7/25/14.
 */
@Controller
public class LanguageController {

	public final static String SELECTED_LANGUAGE = "language";

	private static final String HOME_VIEW = "home";

	@RequestMapping(value = "/{languageCode}/home", method = RequestMethod.GET)
	public ModelAndView handleHomePage(HttpServletRequest request, @PathVariable String languageCode) {
		ModelAndView homeModelAndView = new ModelAndView(HOME_VIEW);
		HttpSession session = request.getSession();
		session.setAttribute(SELECTED_LANGUAGE, languageCode);
		return homeModelAndView;
	}
}
