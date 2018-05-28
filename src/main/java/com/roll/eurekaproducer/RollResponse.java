package com.roll.eurekaproducer;

import java.io.Serializable;

/**
 * Created by haozq
 * Date: 2018/5/28 下午5:55
 */
public class RollResponse implements Serializable {

	private static final long serialVersionUID = -8723117450318193784L;
	private static final int status_ok = 200;
	private static final int status_no_ok = 500;

	/**
	 * 状态码
	 */
	private int code = status_ok;

	/**
	 * 返回信息
	 */
	private String Message = "ok";

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "RollResponse{" +
				"code=" + code +
				", Message='" + Message + '\'' +
				'}';
	}
}
