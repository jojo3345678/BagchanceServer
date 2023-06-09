package web.community.classes.dao;

import java.util.List;

import web.community.classes.bean.Comment;

public interface CommentDao {
	int insert(Comment comment);

	List<Comment> selectByStoryid(Integer id);

	List<Comment> selectStoryComments();
}
