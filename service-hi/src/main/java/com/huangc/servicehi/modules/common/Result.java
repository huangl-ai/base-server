package com.huangc.servicehi.modules.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;

import java.util.Date;

/**
 * 通用返回结果实体类
 */
public class Result {

    public static final String OP_SUCCESS_MSG="操作成功";
    public static final String OP_FAIL_MSG="操作失败";
    public static final String SAVE_SUCCESS_MSG="保存成功";
    public static final String SAVE_FAIL_MSG="保存失败";
    public static final String BATCH_SAVE_SUCCESS_MSG="批量保存成功";
    public static final String BATCH_SAVE_FAIL_MSG="批量保存失败";
    public static final String UPDATE_SUCCESS_MSG="更新成功";
    public static final String UPDATE_FAIL_MSG="更新失败";
    public static final String BATCH_UPDATE_SUCCESS_MSG="批量更新成功";
    public static final String BATCH_UPDATE_FAIL_MSG="批量更新失败";
    public static final String DELETE_SUCCESS_MSG="删除成功";
    public static final String DELETE_FAIL_MSG="删除失败";
    public static final String VERIFIER_SUCCESS_ERR0R="验证成功";
    public static final String VERIFIER_FAIL_ERR0R="验证失败";
    public static final String APP_SUCCESS_MSG="已提交！";

    private String message;//消息
    private Object data;//返回内容
    private int status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time = new Date();


    public Result(){}

    public Result(String message){
        this.message = message;
    }

    public Result(String message, Object data){
        this.message = message;
        this.data = data;
    }

    public Result ok(){
        this.status = HttpStatus.OK.value();
        return this;
    }

    public Result ok(Object data){
        this.data = data;
        this.message = OP_SUCCESS_MSG;
        this.status = HttpStatus.OK.value();
        return this;
    }

    public Result error(){
        this.status = HttpStatus.INTERNAL_SERVER_ERROR.value();
        return this;
    }

    public Result error(int code){
        this.status = code;
        return this;
    }

    public Result forbidden(){
        this.status = HttpStatus.FORBIDDEN.value();
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public int getStatus() {
        return status;
    }

    public Date getTime() {
        return time;
    }

}
