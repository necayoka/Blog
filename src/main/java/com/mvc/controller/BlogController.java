package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.dao.Repository;
import com.mvc.model.Blog;
import com.mvc.model.Feedback;

@Controller
public class BlogController {

	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("feedback")
	public String feedback() {
		return "feedback.jsp";
	}
	
	@RequestMapping("addFeedback")
	public String addFedback(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("message") String message, @RequestParam("rating") int rating) {
		Feedback feedback = new Feedback();
		
		feedback.setName(name);
		feedback.setEmail(email);
		feedback.setMessage(message);
		feedback.setRating(rating);
		
		Repository.saveFb(feedback);
		
		return "home.jsp";
	}
	
	@RequestMapping("blog")
	public String blog() {
		return "blog.jsp";
	}
	
	@RequestMapping("addBlog")
	public String addBlog(@RequestParam("title") String title, @RequestParam("text") String text) {
		Blog blog = new Blog();
		
		blog.setTitle(title);
		blog.setText(text);
		
		Repository.saveBlog(blog);
		
		return "home.jsp";
	}
	
//	public String blogs() {}
	
}
