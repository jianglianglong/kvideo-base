package com.xiaomi.base.k.video.service.impl;

import com.xiaomi.base.k.video.dao.KvideoAuthorDao;
import com.xiaomi.base.k.video.domain.KvideoAuthorModel;
import com.xiaomi.base.k.video.op.OpResult;
import com.xiaomi.base.k.video.service.VideoAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jianglianglong
 * @Date: 2020/7/20 15:47
 */
@Service
public class VideoAuthorServiceImpl implements VideoAuthorService {


    @Autowired
    private KvideoAuthorDao kvideoAuthorDao;


    @Override
    public OpResult<KvideoAuthorModel> findAuthorInfoById(Long authorId) {
        KvideoAuthorModel kvideoAuthorModel = kvideoAuthorDao.selectByPrimaryKey(authorId);

//        kvideoAuthorModel = null;
        //测试全局异常处理
        Short cp = kvideoAuthorModel.getCp();

        return OpResult.genSuccessResult(kvideoAuthorModel);
    }
}
