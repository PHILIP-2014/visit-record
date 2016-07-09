package com.church.visit.exception;

/**
 * Created by wangfl on 2016/7/9.
 */
public class ServiceException extends Exception {

  public ServiceException() {
    super();
  }

  public ServiceException(String msg){
    super(msg);
  }

  public ServiceException(String msg, Throwable cause){
    super(msg, cause);
  }

}
