package com.xiaomi.base.k.video.service;

import com.xiaomi.base.k.video.KvideoBaseTest;
import com.xiaomi.base.k.video.domain.KvideoAuthorModel;
import com.xiaomi.base.k.video.op.OpResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lianglong jiang
 * @date 2020/10/27 5:43 下午
 */


public class VideoAuthorServiceTest extends KvideoBaseTest {

    @Autowired
    private VideoAuthorService videoAuthorService;

    @Test
    public void testFindAuthorInfoById() {
        Long authorId = 2L;
        OpResult<KvideoAuthorModel> authorInfo = videoAuthorService.findAuthorInfoById(authorId);
        System.out.println(authorInfo);

    }
}
