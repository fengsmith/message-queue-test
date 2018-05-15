mq 文档:http://rocketmq.apache.org/docs/quick-start/
mq 启动

1. cd /Users/shifengqiang/Downloads/rocketmq-all-4.2.0/distribution/target/apache-rocketmq
2. nohup sh bin/mqnamesrv &
3. tail -f ~/logs/rocketmqlogs/namesrv.log
4. nohup sh bin/mqbroker -n localhost:9876 &
5. tail -f ~/logs/rocketmqlogs/broker.log
