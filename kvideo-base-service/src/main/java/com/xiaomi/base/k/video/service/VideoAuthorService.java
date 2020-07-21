package com.xiaomi.base.k.video.service;

import com.xiaomi.base.k.video.domain.KvideoAuthorModel;
import com.xiaomi.base.k.video.op.OpResult;


/**
 * @author: jianglianglong
 * @Date: 2020/7/20 15:46
 */
public interface VideoAuthorService {
    /**
     * 根据作者id查询作者信息
     *
     * @param authorId
     * @return
     */
    OpResult<KvideoAuthorModel> findAuthorInfoById(Long authorId);
}
