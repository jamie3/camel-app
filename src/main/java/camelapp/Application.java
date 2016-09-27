package camelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

/*
    @Bean(name = "mq")
    public MQQueueConnectionFactory mqConnectionFactory() throws JMSException {
        MQQueueConnectionFactory queueConnectionFactory = new MQQueueConnectionFactory();
        queueConnectionFactory.setHostName(mqHostname);
        queueConnectionFactory.setPort(mqPort);
        queueConnectionFactory.setChannel(mqChannel);
        queueConnectionFactory.setQueueManager(mqQueueManager);
        queueConnectionFactory.setTransportType(1);
        return queueConnectionFactory;
    }
*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
