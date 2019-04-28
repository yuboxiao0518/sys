package com.primeton.sys.common;

/**
 * 
 * ClassName: Constant <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月17日 下午12:05:13 <br/>
 * 常量类
 * 
 * @author Jin.He (mailto:hejin@primeton.com)
 * @version
 */
public class Constant {
	/** 验证码 */
	public static final String VERIFY_CODE = "VERIFY_CODE";
	/** 登录失败次数 */
	public static final String LOGIN_ERROR_TIMES = "LOGIN_ERROR_TIMES";
	/** 缓存的KEY */
	public static final String CACHE_KEY = "CACHE_KEY";
	/** session过期时间(秒) */
	public static final int SESSION_EXPIRE_SECONDS = 180;
	/** 缓存权限信息 */
	public static final String SESSION_OPERATIONS = "SESSION_OPERATIONS";
	/** 用户登录信息 */
	public static final String SESSION_IDENTITY_KEY = "SESSION_IDENTITY_KEY";
	/** 匿名群组 */
	public static final String ROLE_ANONYMOUS = "anonymous";
	/** 上次请求地址 */
	public static final String PRE_REQUEST_PATH = "PRE_REQUEST_PATH";
	/** 上次请求时间 */
	public static final String PRE_REQUEST_TIME = "PRE_REQUEST_TIME";
	/** 非法请求次数 */
	public static final String MAL_REQUEST_TIMES = "MAL_REQUEST_TIMES";

	// topic
	public static final String TOPIC_QUEUE1 = "topic.queue1";
	public static final String TOPIC_QUEUE2 = "topic.queue2";
	public static final String TOPIC_EXCHANGE = "topic.exchange";

	// fanout
	public static final String FANOUT_QUEUE1 = "fanout.queue1";
	public static final String FANOUT_QUEUE2 = "fanout.queue2";
	public static final String FANOUT_EXCHANGE = "fanout.exchange";

	// redirect模式
	public static final String DIRECT_QUEUE1 = "direct.queue1";
	public static final String DIRECT_QUEUE2 = "direct.queue2";
	public static final String DIRECT_EXCHANGE = "direct.exchange";
}
