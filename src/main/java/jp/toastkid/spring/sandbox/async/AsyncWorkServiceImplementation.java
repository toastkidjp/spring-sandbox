package jp.toastkid.spring.sandbox.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by toastkidjp on 2019/06/07.
 */
@Service
public class AsyncWorkServiceImplementation implements AsyncWorkService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncWorkServiceImplementation.class);

    @Override
    @Async
    public void invoke() throws InterruptedException {
        LOGGER.info("An async work has started.");
        Thread.sleep(5000L);
        LOGGER.info("An async work has ended.");
    }
}
