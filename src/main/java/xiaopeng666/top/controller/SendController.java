package xiaopeng666.top.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import xiaopeng666.top.entity.ResponseMessage;

import java.util.Map;

/**
 * 微信开放平台API运用
 */
@CrossOrigin
@RestController
public class SendController extends BasicController {

    // logger
    private static final Logger logger = LoggerFactory.getLogger(SendController.class);

    @Autowired
    ResponseMessage responseMessage;

    /**
     * test 数据
     *
     * @param test 内容
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseMessage testGet(@RequestParam String test) {
        return successMessage(test);
    }

    /**
     * test 数据
     *
     * @param date 内容
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseMessage testPost(@RequestBody Map date) {

        return successMessage(date);
    }


}
