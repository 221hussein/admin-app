package com.saraya.service;

import com.saraya.dao.IAppRoleRepository;
import com.saraya.dto.AppRolesDto;

import com.saraya.exceptions.APIException;
import com.saraya.exceptions.EntityNotFoundException;
import com.saraya.exceptions.RequestException;
import com.saraya.mapping.AppRoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.MessageSource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "appRoles")
public class AppRoleService {

    private final IAppRoleRepository iAppRoleRepository;
    private final AppRoleMapper appRoleMapper;
    MessageSource messageSource;


    @Transactional(readOnly = true)
    public List <AppRolesDto> getAppRoles() {
        return StreamSupport.stream(iAppRoleRepository.findAll().spliterator(),false)
                .map(appRoleMapper ::toAppRoles)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AppRolesDto getAppRoles(int id) {
        return  appRoleMapper.toAppRoles(iAppRoleRepository.findById(id).orElseThrow(()->
                 new EntityNotFoundException(messageSource.getMessage("role.notfound",
                         new Object[] {id}, Locale.getDefault()))));
    }

    @Transactional
    public AppRolesDto createAppRoles(AppRolesDto appRolesDto) {
        return appRoleMapper.toAppRoles(iAppRoleRepository.save(appRoleMapper.fromAppRole(appRolesDto)));
    }

    @Transactional
    public AppRolesDto updateAppRoles(int id ,AppRolesDto appRolesDto) {
        return iAppRoleRepository.findById(id)
                .map(entity -> {
                    appRolesDto.setId(id);
                    return appRoleMapper.toAppRoles(
                            iAppRoleRepository.save(appRoleMapper.fromAppRole(appRolesDto)));
                }).orElseThrow(() -> new EntityNotFoundException(messageSource.getMessage("role.notfound",new Object[]{id},
                        Locale.getDefault())));
    }


    @Transactional
    public void deleteAppRoles(int id) {
        try {
            iAppRoleRepository.deleteById(id);
        }catch (Exception e) {
            throw new RequestException(messageSource.getMessage(
                    "role.errordeletion",
                    new Object[]{id},Locale.getDefault()),
                    HttpStatus.CONFLICT);
        }
    }

}
