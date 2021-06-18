package com.deltaqin.bilibili.mqfromcanal;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.otter.canal.protocol.Message;
import com.alibaba.otter.canal.protocol.FlatMessage;
import com.deltaqin.bilibili.redis.jedis.RedisService;
import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.support.DefaultRocketMQListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * 不保证实时一致性
 * 但是保证最终一致性
 *
 * @author deltaqin
 * @date 2021/6/18 下午3:06
 */
@Component
@RocketMQMessageListener(
        // 主题
        topic = "bilibili",
        consumerGroup = "bilibili",
        // tag ：子分类，默认*
        selectorExpression = "*",
        consumeMode = ConsumeMode.ORDERLY,
        messageModel = MessageModel.CLUSTERING,
        consumeThreadMax = 1
)
@Slf4j
public class MqConsumer implements RocketMQListener<String> {


    @Autowired
    private RedisService redisService;

    @Override
    public void onMessage(String msg) {
        //System.out.println(msg);

        if (!JSONUtil.isJson(msg)) {
            return;
        }
        JSONObject msgJsonObject = JSONUtil.parseObj(msg);
        String database = msgJsonObject.getStr("database");

        if (!database.equals("bilibili2")) {
            return;
        }
        String table = msgJsonObject.getStr("table");

        redisService.deleteWithScan("*" + table + "*");
    }
}

        //String sqlType = msgJsonObject.getStr("type");
        //switch (sqlType) {
        //    case "UPDATE":
        //    case "INSERT":
        //    case "DELETE":
        //        break;
        //    default:
        //        System.out.println("不同步的消息类型：" + sqlType);
        //        return;
        //}

        //System.out.println(msgJsonObject.toStringPretty());
        //
        //JSONArray data = msgJsonObject.getJSONArray("data");
        //JSONArray pkNames = msgJsonObject.getJSONArray("pkNames");
        //
        //System.out.println("表名为:" + msgJsonObject.getStr("table") + ",sql类型为：" + sqlType);
        //if ("UPDATE".equals(sqlType) || "INSERT".equals(sqlType)) {

            //for (int i = 0; i < data.size(); i++) {
            //    JSONObject object = data.getJSONObject(i);
            //    String key = object.getStr(pkNames.getStr(i), "0");
            //    redisTemplate.opsForHash().put(table, key, object);
            //}
        //
        //    return;
        //}
        //if ("DELETE".equals(sqlType)) {
            //for (int i = 0; i < data.size(); i++) {
            //    JSONObject object = data.getJSONObject(i);
            //    String key = object.getStr(pkNames.getStr(i), "0");
            //    redisTemplate.opsForHash().delete(table, key);
            //}
        //}
    //}

    //@Override
    //public void onMessage(Message message) {
    //    System.out.println(message.toString());
    //}

    //@Override
    //public void onMessage(FlatMessage flatMessage) {
    //    String table = flatMessage.getTable();
    //    System.out.println(table);
    //    //System.out.println("数据库为：" + flatMessage.getDatabase());
    //}
//}
//
//
//import com.alibaba.fastjson.JSON;
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
//import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.nio.charset.Charset;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class MqConsumer {
    //private DefaultMQPushConsumer consumer;

    //@Value("${mq.nameserver.addr}")
    //private String nameServerAddr;
    //
    //@Value("${mq.topicname}")
    //private String topicName;


    //@PostConstruct
    //public void init() throws MQClientException {
    //    consumer = new DefaultMQPushConsumer("bilibili");
    //    consumer.setNamesrvAddr("118.195.132.110:9876");
    //    consumer.subscribe("bilibili", "*");
    //    consumer.registerMessageListener(new MessageListenerConcurrently() {
    //
    //        @Override
    //        public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
    //            Message message = list.get(0);
    //            String jsonString = new String(message.getBody());
    //            Map map = JSON.parseObject(jsonString, Map.class);
    //            //Integer goodsId = (Integer) map.get("goodsId");
    //            //Integer count = (Integer) map.get("count");
    //            //itemStockMapper.decreaseStock(goodsId, count);
    //            System.out.println(jsonString);
    //            //System.out.println(m);
    //
    //            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    //        }
    //    });
    //
    //    consumer.start();
    //}
    //
    //@PostConstruct
    //public void init() throws MQClientException {
    //    consumer = new DefaultMQPushConsumer("bilibili");
    //    consumer.setNamesrvAddr("118.195.132.110:9876");
    //    consumer.subscribe("bilibili", "*");
    //    consumer.registerMessageListener(new MessageListenerConcurrently() {
    //
    //        @Override
    //        public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
    //            Message message = list.get(0);
    //            String jsonString = new String(message.getBody(), Charset.forName("UTF-8"));
    //            System.out.println();
    //            //Map map = JSON.parseObject(jsonString, Map.class);
    //            //Integer goodsId = (Integer) map.get("goodsId");
    //            //Integer count = (Integer) map.get("count");
    //            //itemStockMapper.decreaseStock(goodsId, count);
    //            System.out.println(jsonString);
    //            //System.out.println(m);
    //
    //            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    //        }
    //    });
    //
    //    consumer.start();
    //}

//
//}



