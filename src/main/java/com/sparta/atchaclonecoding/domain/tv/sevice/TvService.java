package com.sparta.atchaclonecoding.domain.tv.sevice;

import com.sparta.atchaclonecoding.domain.member.entity.Member;
import com.sparta.atchaclonecoding.domain.tv.dto.TvResponseDto;
import com.sparta.atchaclonecoding.domain.tv.entity.Tv;
import com.sparta.atchaclonecoding.domain.tv.repository.TvRepository;
import com.sparta.atchaclonecoding.util.Message;
import com.sparta.atchaclonecoding.util.StatusEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TvService {
    private final TvRepository tvRepository;

    // Tv 전체조회
    @Transactional(readOnly = true)
    public ResponseEntity<Message> getTvPrograms(Member member) {
        List<TvResponseDto> tvList = tvRepository.findAll().stream().map(TvResponseDto::new).collect(Collectors.toList());
        Message message = Message.setSuccess(StatusEnum.OK, "요청성공", tvList);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


    // Tv 상세조회
    @Transactional(readOnly = true)
    public ResponseEntity<Message> getTvProgram(Long tvId, Member member) {
        Tv tv = tvRepository.findById(tvId).orElseThrow(
                () -> new NullPointerException("해당하는 TV 프로그램 없음")
        );
        Message message = Message.setSuccess(StatusEnum.OK, "요청성공", tv);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


}
