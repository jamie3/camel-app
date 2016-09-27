package camelapp;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProcessOrders extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("jetty:http://localhost:4000/order")
            .convertBodyTo(String.class)
            .log("${body}")
            .choice()
                .when(xpath("//order/amazon"))
                    .log("Received Amazon order")
                .otherwise()
                    .log("Received order")
                    .to("file://orders")
        ;
    }
}
