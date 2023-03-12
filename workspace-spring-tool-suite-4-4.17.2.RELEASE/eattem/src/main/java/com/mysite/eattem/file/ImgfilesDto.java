package com.mysite.eattem.file;

import groovy.transform.ToString;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ImgfilesDto {
	private Long id;
    private String oriFilename;
    private String filename;
    private String filePath;
    
    
    public Imgfiles toEntity() {
        Imgfiles build = Imgfiles.builder()
                .id(id)
                .oriFilename(oriFilename)
                .filename(filename)
                .filePath(filePath)
                .build();
        return build;
    }

    @Builder
    public ImgfilesDto (Long id, String oriFilename, String filename, String filePath) {
        this.id = id;
        this.oriFilename = oriFilename;
        this.filename = filename;
        this.filePath = filePath;
    }


}
