package com.didispace.aggregate.Sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 接收消息
 * 
 * @author niu
 *
 */
@EnableBinding(Sink.class)//绑定通道
public class SinkReceiver {
	private static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

	// 方法注册为事件监听器
	@StreamListener(Sink.INPUT)
	public void receive(Object payLoad) {
		logger.info("received: " + payLoad);
	}

}
