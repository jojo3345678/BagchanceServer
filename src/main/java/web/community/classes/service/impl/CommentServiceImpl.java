package web.community.classes.service.impl;

import java.util.List;

import web.community.classes.bean.Comment;
import web.community.classes.bean.Explore;
import web.community.classes.dao.CommentDao;
import web.community.classes.dao.impl.CommentDaoImpl;
import web.community.classes.service.CommentService;

public class CommentServiceImpl implements CommentService{
	private CommentDao dao;
	
	public CommentServiceImpl(){
		dao = new CommentDaoImpl();
	}
	
	@Override
	public boolean insert(Comment comment) {
		int result = dao.insert(comment);
		return result > 0;
	}
	@Override
	public List<Comment> findCommentByID(Integer id) {
		return dao.selectByStoryid(id);
		
	}

	@Override
	public List<Comment> findComments() {
		return dao.selectStoryComments();
	}

}
