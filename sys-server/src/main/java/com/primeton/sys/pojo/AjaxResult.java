package com.primeton.sys.pojo;


/**
 * 
 * ClassName: AjaxResult <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月17日 下午12:30:47 <br/>
 * 封装返回数据
 * @author Jin.He (mailto:hejin@primeton.com)
 * @version
 */
public class AjaxResult {

	private int retcode = 1;
	private String retmsg = "操作成功";
	private Object data;
	
	public AjaxResult(int retcode, String retmsg, Object data){
		this.retcode = retcode;
		this.retmsg = retmsg;
		this.data = data;
	}
	
	public AjaxResult(int retcode, String retmsg){
		this.retcode = retcode;
		this.retmsg = retmsg;
	}
	
	public AjaxResult(Object data){
		this.retmsg = "查询成功";
		this.data = data;
	}
	
	public AjaxResult(int retcode){
		this.retcode = retcode;
		this.retmsg = "操作失败";
	}
	
	public AjaxResult(String retmsg){
		this.retcode = 0;
		this.retmsg = retmsg;
	}
	
	public AjaxResult(){
		
	}

	public int getRetcode() {
		return retcode;
	}
	public void setRetcode(int retcode) {
		this.retcode = retcode;
	}
	public String getRetmsg() {
		return retmsg;
	}
	public void setRetmsg(String retmsg) {
		this.retmsg = retmsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "AjaxResult [retcode=" + retcode + ", retmsg=" + retmsg + ", data=" + data + "]";
	}
	
}
