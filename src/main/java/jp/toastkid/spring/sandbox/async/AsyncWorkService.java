package jp.toastkid.spring.sandbox.async;

import org.springframework.scheduling.annotation.Async;

/**
 * Created by toastkidjp on 2019/06/07.
 */
public interface AsyncWorkService {
    @Async
    void invoke() throws InterruptedException;
}
