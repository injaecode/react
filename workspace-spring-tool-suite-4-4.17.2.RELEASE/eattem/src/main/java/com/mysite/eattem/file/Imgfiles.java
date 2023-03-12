package com.mysite.eattem.file;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Imgfiles {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String oriFilename;

	@Column(nullable=false)
	private String filename;
	
	@Column(nullable=false)
	private String filePath;

	@Builder
	public Imgfiles(Long id, String oriFilename, String filename, String filePath) {
		super();
		this.id = id;
		this.oriFilename = oriFilename;
		this.filename = filename;
	}
	
}
