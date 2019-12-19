package org.pomelo.observer;

import lombok.Data;

@Data
public class ResponseResult {

    public Boolean result;

    public String message;

    public ResponseResult(){
        this.result = true;
        this.message = "success";
    }
}
