package com.mysite.eattem.Article;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor 
public class ArticleController {
	private final ArticleRepository articleRepository;
	
	
	@GetMapping("/eattem/upload")
	public String itemPage(Model model) {
		model.addAttribute("FormDto", new ArticleFormDto());
		return "admin_upload_form";
	}
	
	@PostMapping("/eattem/create")
	public String createPage(ArticleFormDto form) {
		Article article=form.toEntity();
		Article saved= articleRepository.save(article);
		System.out.println(saved.toString());
		
		return "redirect:/";
	}
}
