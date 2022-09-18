package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dto.phonedto.phoneAddDto;
import org.example.dto.phonedto.phoneItemDto;
import org.example.entities.Phones;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.core.io.Resource;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import org.example.mapper.ApplicationMapper;

@RestController
@RequiredArgsConstructor
public class HomeController {
//    private final ApplicationMapper mapper;
//    @GetMapping("/")
//    public List<phoneItemDto> index() {
//        List<phoneItemDto> items =  mapper.phonesToParentsAllDto();
//        return items;
//    }

}
