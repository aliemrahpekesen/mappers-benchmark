package com.ama.service;

import com.ama.entity.MemberDTO;
import com.ama.model.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author emrah.pekesen
 */
@Mapper
public interface IMapStructMemberMapper {
    IMapStructMemberMapper mapper = Mappers.getMapper(IMapStructMemberMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "middleName", target = "middleName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "birthDate", target = "birthDate"),
            @Mapping(source = "gender", target = "gender"),
            @Mapping(source = "emailList", target = "emailList")
    })
    MemberDTO toMemberDTO(Member source);
}
