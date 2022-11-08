package com.saraya.controller;


import com.saraya.dto.AppRolesDto;
import com.saraya.service.AppRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class AppRoleController {

    private final AppRoleService appRoleService;

    @GetMapping
    public List<AppRolesDto> getAppRoles() {
        return appRoleService.getAppRoles();
    }

    @GetMapping("{id}")
    public AppRolesDto getAppRoleService(@PathVariable ("id") int id) {
        return appRoleService.getAppRoles(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AppRolesDto createAppRoles(@Valid @RequestBody AppRolesDto appRolesDto) {
        return appRoleService.createAppRoles(appRolesDto);
    }

    @PutMapping("{id}")
    public AppRolesDto updateAppRoles(@PathVariable ("id") int id,@Valid @RequestBody AppRolesDto appRolesDto) {
        return appRoleService.updateAppRoles(id, appRolesDto);

    }

    @DeleteMapping("{id}")
    public void deleteAppRoles(@PathVariable ("id") int id) {
        appRoleService.deleteAppRoles(id);
    }
}
