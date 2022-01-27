package me.zixuan.hellostreams.bindings;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

public interface KafkaListenerBinding {
    String INPUT_CHANNEL = "input-channel-1";

    @Input(INPUT_CHANNEL)
    KStream<String, String> inputStream();
}
