package com.zzw.springcloud.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/13 21:44
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/13 21:44
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListener {
@Value("${server.port}")
private String serverPort;

@StreamListener(Sink.INPUT)
public  void input(Message<String> message){
    System.out.println("消费者1号，----->接受到的消息: "+message.getPayload()+"\t port: "+serverPort);
}

}
