package web.community.classes.controller;
import static core.util.CommonUtil.writeJsonBean;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import web.community.classes.service.ExploreServiceImpl;
import web.community.classes.service.impl.ExploreService;


@WebServlet("/explore/*")
public class ExploreController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Gson gson = new GsonBuilder()
	.setDateFormat("yyyy/MM/dd HH:mm:ss")
    .create();
	private static final ExploreService SERVICE = new ExploreServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("resp: " + resp);
		try {
			
			writeJsonBean(resp, SERVICE.selectByUid());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
