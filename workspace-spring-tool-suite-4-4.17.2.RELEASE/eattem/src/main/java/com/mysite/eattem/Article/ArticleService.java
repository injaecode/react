package com.mysite.eattem.Article;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {
	private final ArticleRepository articleRepository;
	//private final ImgService imgService;
	//private final ImgRepository imgRepository;
	
	public Article saveArticle(Article article){

		
		return articleRepository.save(article);
	}
	
}
