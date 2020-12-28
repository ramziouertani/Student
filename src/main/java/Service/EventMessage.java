package Service;

import lombok.Synchronized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.transaction.Synchronization;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EventMessage {


    int count = 0;
    Synchronized int increment() {
        return count = count + 1;
    }
    public void executeTask() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        IntStream.range(0, 10000)
                .forEach(i -> executor.submit(this::increment));

        executor.shutdownNow();
        System.out.println(count);  // 10000
    }

    public static void main(String[] args){
        EventMessage eventMessage = new EventMessage();
        eventMessage.executeTask();
    }
}
