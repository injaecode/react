package com.mysite.eattem.Article;

import java.util.Arrays;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleFormDto {


	@NotEmpty
	private String pdName;
	
	@NotEmpty
	private String pdInfo;
	
	@NotEmpty
	private String manufacturer;
	
	@NotEmpty
	private String[] vender;
	
	@NotEmpty
	private int price;

	private String[] taste;

	@Override
	public String toString() {
		return "ArticleFormDto [pdName=" + pdName + ", pdInfo=" + pdInfo + ", manufacturer=" + manufacturer
				+ ", vender=" + Arrays.toString(vender) + ", price=" + price + ", taste=" + Arrays.toString(taste)
				+ "]";
	}
	public Article toEntity() {
		return new Article(null, pdName, pdInfo, manufacturer, vender, price, taste);
	}
}
