package org.example.mapper;
import org.example.dto.phonedto.phoneAddDto;
import org.example.dto.phonedto.phoneItemDto;
import org.example.entities.Phones;

import java.util.List;

public interface ApplicationMapper {
    Phones ParentByPhoneAddDto(phoneAddDto dto);
    phoneItemDto phoneToParentItemDto(Phones Phone);
    List<phoneItemDto> phonesToParentsAllDto(List<Phones> phones);
}
