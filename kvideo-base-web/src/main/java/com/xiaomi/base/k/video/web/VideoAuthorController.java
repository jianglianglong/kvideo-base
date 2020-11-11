package com.xiaomi.base.k.video.web;

import com.xiaomi.base.k.video.domain.KvideoAuthorModel;
import com.xiaomi.base.k.video.global.annotation.LogAnnotation;
import com.xiaomi.base.k.video.op.OpResult;
import com.xiaomi.base.k.video.service.VideoAuthorService;
import com.xiaomi.base.k.video.vo.KvideoAuthorVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jianglianglong
 * @Date: 2020/7/20 16:00
 */
@Slf4j
@RestController
public class VideoAuthorController {


    @Autowired
    private VideoAuthorService videoAuthorService;

    /**
     * 通过id查询作者
     *
     * @param authorId
     * @return
     */
    @RequestMapping("/getAuthor")
    @LogAnnotation
    public OpResult<KvideoAuthorModel> getVideoAuthorInfo(Long authorId) {
        log.info("获取作者：{} 的信息", authorId);
        return videoAuthorService.findAuthorInfoById(authorId);
    }

    @RequestMapping("/addAuthor")
    public OpResult<String> addAuthor(KvideoAuthorVO authorVO) {
        System.out.println(authorVO);

        return OpResult.genSuccessResult("success");
    }

}
