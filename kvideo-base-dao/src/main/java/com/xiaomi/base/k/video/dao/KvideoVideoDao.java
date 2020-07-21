package com.xiaomi.base.k.video.dao;

import com.xiaomi.base.k.video.domain.KvideoVideoModel;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface KvideoVideoDao {
    int deleteByPrimaryKey(Long id);

    int insert(KvideoVideoModel record);

    int insertSelective(KvideoVideoModel record);

    KvideoVideoModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(KvideoVideoModel record);

    int updateByPrimaryKey(KvideoVideoModel record);
}