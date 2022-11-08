package com.saraya.mapping;

import com.saraya.dto.AppRolesDto;
import com.saraya.dto.AppUserDto;
import com.saraya.entities.AppRolesEntity;
import com.saraya.entities.AppUserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AppUserMapper {

    AppUserDto toAppUser(AppUserEntity appUserEntity);

    AppUserEntity fromAppRole(AppUserDto appUserDto);
}
