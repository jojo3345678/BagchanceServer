package web.community.classes.service.impl;

import java.util.List;

import web.community.classes.bean.Explore;
import web.community.classes.dao.ExploreDao;
import web.community.classes.dao.impl.ExploreDaoImpl;
import web.community.classes.service.ExploreService;





public class ExploreServiceImpl implements ExploreService {
	private ExploreDao dao;
	
	 public ExploreServiceImpl() {
		 dao = new ExploreDaoImpl();
	}
	 @Override
	public List<Explore> selectByUid(){
		return dao.selectByUid();
	}
}
