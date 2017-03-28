package com.zblog.test.captcha;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.zblog.common.captcha.SCaptcha;
import com.zblog.common.captcha.ValidateCode;

public class TestCaptcha {
	 public static void main(String[] args) {  
	        ValidateCode vCode = new ValidateCode(120,40,5,100);  
	        try {  
	        	//注意，先检查是否创建了文件夹，否则会异常
	            String path="D:"+File.separator+"fileOrImg"+File.separator+"test"+File.separator+""+new Date().getTime();
	            String validatepath = path+"_validate.png";
	            String scaptchapath = path+"_scaptcha.png";
	            
	            vCode.write(validatepath);  
	            
	            SCaptcha scaptcha = new SCaptcha();
	            scaptcha.write(scaptchapath);
	            
	            System.out.println(vCode.getCode()+"   "+scaptcha.getCode());
	            
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }
}
