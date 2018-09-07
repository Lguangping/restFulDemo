package com.liguangping.restfuldemo.service;



import com.liguangping.restfuldemo.domain.SysRole;
import com.liguangping.restfuldemo.domain.SysUser;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleCrudService {

    public SysUser saveOneUser(SysUser user) {
        return user;
    }

    public SysUser findOneUserById(String id) {
        List<SysRole> sysRoles=new ArrayList<>();
        sysRoles.add(new SysRole(1,"ROLE_ADMIN"));
        sysRoles.add(new SysRole(2,"ROLE_NEWROLE"));
        return new SysUser(1, "admin用户", "aa123", sysRoles);
    }

    public void deleteOneUserById(String id) {}

    public SysUser updateOneUser(SysUser user,String userId) {
        return user;
    }

    public SysUser patchOneUser(String username,String userId) {
        List<SysRole> sysRoles=new ArrayList<>();
        sysRoles.add(new SysRole(1,"ROLE_ADMIN"));
        sysRoles.add(new SysRole(2,"ROLE_NEWROLE"));
        return new SysUser(1, username.substring(1,username.length()-1), "aa123", sysRoles);
    }

}
