package com.xiaomi.base.k.video.web;

import com.xiaomi.base.k.video.domain.KvideoAuthorModel;
import com.xiaomi.base.k.video.op.OpResult;
import com.xiaomi.base.k.video.service.VideoAuthorService;
import com.xiaomi.base.k.video.vo.KvideoAuthorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jianglianglong
 * @Date: 2020/7/20 16:00
 */
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
    public OpResult<KvideoAuthorModel> getVideoAuthorInfo(Long authorId) {
        return videoAuthorService.findAuthorInfoById(authorId);
    }

    @RequestMapping("/addAuthor")
    public OpResult<String> addAuthor(KvideoAuthorVO authorVO) {
        System.out.println(authorVO);

        return OpResult.genSuccessResult("success");
    }

}
