package com.zzg.mybatis.generator.exception;

/**
 * database driver loading exception
 *
 * @author mj
 * @date 2017/8/15 12:10
 */
public class DbDriverLoadingException extends RuntimeException {
   
    public DbDriverLoadingException(String msg){
        super(msg);
    }
}
