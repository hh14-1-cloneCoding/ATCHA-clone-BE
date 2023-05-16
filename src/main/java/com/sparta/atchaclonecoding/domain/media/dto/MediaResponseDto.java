package com.sparta.atchaclonecoding.domain.media.dto;

import com.sparta.atchaclonecoding.domain.media.entity.Media;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MediaResponseDto {
    private Long id;
    private String image;
    private String title;
    private String genre;
    private double star;

    public MediaResponseDto(Media media){
        this.id = media.getId();
        this.image = media.getImage();
        this.title = media.getTitle();
        this.genre = media.getGenre();
        this.star = media.getStar();
    }
}
