package com.liguangping.restfuldemo.util;


import com.liguangping.restfuldemo.domain.Message;

public class MsgUtil {
    public static Message getCorrectMessage(Object object){
        return new Message(1, object,"请求成功");
    }
    public static Message getErrorMessage(){
        return new Message(0, null,"未知错误");
    }
}
