package web.community.classes.service;

import java.util.List;

import web.community.classes.bean.Comment;

public interface CommentService {
	boolean insert(Comment comment);
	List<Comment> findCommentByID(Integer id);
	List<Comment> findComments();
}
