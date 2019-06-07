package jp.toastkid.spring.sandbox.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by toastkidjp on 2019/06/07.
 */
@Controller
public class AsyncWorkController {

    @Autowired
    private AsyncWorkService asyncWorkService;

    @GetMapping("/v1/async")
    public ResponseEntity<String> async() throws InterruptedException {
        asyncWorkService.invoke();
        return ResponseEntity.ok("OK");
    }
}
