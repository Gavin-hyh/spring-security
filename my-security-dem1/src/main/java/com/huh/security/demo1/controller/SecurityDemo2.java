package com.huh.security.demo1.controller;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

/**
 * @author HouYiHeng 16/12/2023
 */
public class SecurityDemo2 implements SecurityFilterChain {

	@Override
	public boolean matches(HttpServletRequest request) {
		return false;
	}

	@Override
	public List<Filter> getFilters() {
		return null;
	}
}

