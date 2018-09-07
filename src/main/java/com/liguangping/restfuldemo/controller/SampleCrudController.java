package com.liguangping.restfuldemo.controller;


import com.liguangping.restfuldemo.domain.Message;
import com.liguangping.restfuldemo.domain.SysUser;
import com.liguangping.restfuldemo.service.SampleCrudService;
import com.liguangping.restfuldemo.util.MsgUtil;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 这个才是RestFul 的演示类
 */
@RestController
@RequestMapping(path = "/sample", produces = "application/json; charset=UTF-8")
public class SampleCrudController {

    @Resource
    private SampleCrudService sampleCrudService;

    @PostMapping(path = "/user")
    public Message save(@RequestBody SysUser user) {
        try{
            return MsgUtil.getCorrectMessage(sampleCrudService.saveOneUser(user));
        }catch (Throwable throwable){
            return MsgUtil.getErrorMessage();
        }
    }

    @GetMapping(path = "/users/{userId}")
    public Message findUserById(@PathVariable String userId) {
        try{
            return MsgUtil.getCorrectMessage(sampleCrudService.findOneUserById(userId));
        }catch (Throwable throwable){
            return MsgUtil.getErrorMessage();
        }
    }

    @DeleteMapping(path = "/users/{userId}")
    public Message delete(@PathVariable String userId) {
        try{
            return MsgUtil.getCorrectMessage(null);
        }catch (Throwable throwable){
            return MsgUtil.getErrorMessage();
        }
    }

    @PutMapping(path = "/users/{userId}")
    public Message update(@RequestBody SysUser user,@PathVariable String userId) {
        try{
            return MsgUtil.getCorrectMessage(sampleCrudService.updateOneUser(user,userId));
        }catch (Throwable throwable){
            return MsgUtil.getErrorMessage();
        }
    }

    @PatchMapping(path = "/users/{userId}")
    public Message patch(@RequestBody String username,@PathVariable String userId) {
        try{
            return MsgUtil.getCorrectMessage(sampleCrudService.patchOneUser(username,userId));
        }catch (Throwable throwable){
            return MsgUtil.getErrorMessage();
        }
    }

    @GetMapping(path = "/error")
    public Message findError() {
            return MsgUtil.getErrorMessage();
    }

}
