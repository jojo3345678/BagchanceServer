//package web.community.classes.controller;
//
//import static core.util.Constants.GSON;
//import static core.util.Constants.JSON_MIME_TYPE;
//
//import java.io.BufferedReader;
//import java.io.PrintWriter;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import web.community.classes.bean.Comment;
//import web.community.classes.service.CommentService;
//import web.community.classes.service.impl.CommentServiceImpl;
//
//@WebServlet("/comment/find/*")
//public class FindController extends HttpServlet{
//	private static final long serialVersionUID = 1L;
//	private static final Gson gson = new GsonBuilder()
//	.setDateFormat("yyyy/MM/dd HH:mm:ss")
//    .create();
//	private static final CommentService SERVICE = new CommentServiceImpl();
//	private static final Integer Integer = null;
//	
//	@Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
//        try {
//            Integer id = json2Bean(req, Comment.class).getId();
//            Comment comment = SERVICE.findCommentByID(id);
//            writeJson(resp, comment);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//	
//	public static <B> B json2Bean(HttpServletRequest req, Class<B> classOfBean) {
//		try (BufferedReader br = req.getReader()) {
//			return GSON.fromJson(br, classOfBean);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	public static <B> void writeJsonBean(HttpServletResponse resp, B bean) {
//		resp.setContentType(JSON_MIME_TYPE);
//		try (PrintWriter pw = resp.getWriter()) {
//			pw.print(GSON.toJson(bean));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//    private void writeJson(HttpServletResponse resp, Comment comment) {
//        resp.setContentType(JSON_MIME_TYPE);
//        try (PrintWriter pw = resp.getWriter()) {
//            pw.print(GSON.toJson(comment));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
