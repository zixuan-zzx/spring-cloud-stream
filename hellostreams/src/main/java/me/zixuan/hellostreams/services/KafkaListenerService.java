package me.zixuan.hellostreams.services;

import lombok.extern.log4j.Log4j2;
import me.zixuan.hellostreams.bindings.KafkaListenerBinding;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(KafkaListenerBinding.class)
@Log4j2
public class KafkaListenerService {

    @StreamListener(KafkaListenerBinding.INPUT_CHANNEL)
    public void process(KStream<String, String> input) {
        input.foreach((key, value) -> log.info(String.format("Key: %s, Value: %s", key, value)));
    }
}
