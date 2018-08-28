package com.frameweb.java;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "New%20Auth%20Form")
@SessionScoped
public class LoginController {


	public LoginController(){
		
	}

	public  login(){
		try {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			request.login(email, password);
		}
		catch (Exception e) {
			throw new LoginFailedException(e, LoginFailedReason.NO_HTTP_REQUEST);
		}
		return "/index.xhtml?faces-redirect=true";
	}
	
}