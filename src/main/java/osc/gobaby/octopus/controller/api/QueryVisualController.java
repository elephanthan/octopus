package osc.gobaby.octopus.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import osc.gobaby.octopus.controller.api.vo.ApiResponse;
import osc.gobaby.octopus.controller.api.vo.ApiResponseFactory;
import osc.gobaby.octopus.service.query.visual.QueryVisualService;
import osc.gobaby.octopus.service.query.visual.entity.NativeQuery;

/**
 * Created by ShinHyun.Kang on 2018. 9. 9..
 */
@Controller
@RequestMapping(value = "/api/v1.0/query/visual")
public class QueryVisualController {

    @Autowired
    private QueryVisualService queryVisualService;

    @ResponseBody
    @RequestMapping(value = "/{userId}/nativeQuery", method = RequestMethod.POST)
    public ApiResponse nativeQuery(@PathVariable String userId, @RequestBody NativeQuery nativeQuery) {
        return ApiResponseFactory.createSuccess(queryVisualService.reqeustNativeQuery(userId, nativeQuery.getNativeQuery()));
    }
}
