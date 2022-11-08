package com.saraya.mapping;

import com.saraya.dto.AppRolesDto;
import com.saraya.entities.AppRolesEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AppRoleMapper {

    AppRolesDto toAppRoles(AppRolesEntity appRolesEntity);

    AppRolesEntity fromAppRole(AppRolesDto appRolesDto);
}
