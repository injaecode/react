package com.mysite.eattem.file;

import com.mysite.eattem.file.ImgfilesRepository;

import jakarta.transaction.Transactional;

import com.mysite.eattem.file.Imgfiles;
import com.mysite.eattem.file.ImgfilesDto;
import org.springframework.stereotype.Service;


@Service
public class ImgfilesService {
	private ImgfilesRepository imgfilesRepository;
	
    public ImgfilesService(ImgfilesRepository imgfilesRepository) {
        this.imgfilesRepository = imgfilesRepository;
    }

    @Transactional
    public Long saveFile(ImgfilesDto imgfilesDto) {
        return imgfilesRepository.save(imgfilesDto.toEntity()).getId();
    }

    @Transactional
    public ImgfilesDto getFile(Long id) {
        Imgfiles imgfiles = imgfilesRepository.findById(id).get();

        ImgfilesDto imgfilesDto = ImgfilesDto.builder().id(id)
        		.oriFilename(imgfiles.getOriFilename())
        		.filename(imgfiles.getFilename())
        		.filePath(imgfiles.getFilePath())
        		.build();
        
        return imgfilesDto;
    }
}
