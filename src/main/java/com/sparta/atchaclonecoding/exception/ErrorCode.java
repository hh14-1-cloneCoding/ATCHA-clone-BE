package com.sparta.atchaclonecoding.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INTERNAL_SERER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_SERVER_ERROR"),
    INVALID_TOKEN(HttpStatus.BAD_REQUEST, "토큰이 유효하지 않습니다."),
    DUPLICATE_IDENTIFIER(HttpStatus.BAD_REQUEST, "중복된 이메일 입니다."),
    DUPLICATE_NICKNAME(HttpStatus.BAD_REQUEST, "중복된 닉네임 입니다."),
    INVALID_PASSWORD(HttpStatus.BAD_REQUEST, "잘못된 비밀번호 입니다."),
    NOT_AUTHORIZED_USER(HttpStatus.BAD_REQUEST, "작성자만 수정,삭제할 수 있습니다."),

    //404 NOT_FOUND,
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "회원을 찾을 수 없습니다."),
    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 게시글을 찾을 수 없습니다."),
    NON_CONTENT(HttpStatus.BAD_REQUEST, "글의 내용이 없습니다."),
    EMAIL_NOT_FOUND(HttpStatus.NOT_FOUND,"해당 이메일을 찾을 수 없습니다." ),
    MOVIE_NOT_FOUND(HttpStatus.NOT_FOUND,"해당 영화를 찾을 수 없습니다." ),
    TV_NOT_FOUND(HttpStatus.NOT_FOUND,"해당 TV 프로그램을 찾을 수 없습니다." ),
    REVIEW_NOT_FOUND (HttpStatus.NOT_FOUND,"해당 리뷰를 찾을 수 없습니다." );

    private final HttpStatus httpStatus;
    private final String detail;

}
