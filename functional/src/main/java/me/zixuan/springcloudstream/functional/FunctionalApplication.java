package me.zixuan.springcloudstream.functional;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class FunctionalApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(FunctionalApplication.class);
//    }

    public Consumer<KStream<Void, String>> process() {
        return input ->
                input.foreach((key, value) ->
                        System.out.println("Key: " + key + ", Value:" + value)
        );
    }
}
