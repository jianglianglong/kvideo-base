package com.xiaomi.base.k.video.dao;

import com.xiaomi.base.k.video.domain.KvideoAuthorModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KvideoAuthorDao {
    int deleteByPrimaryKey(Long id);

    int insert(KvideoAuthorModel record);

    int insertSelective(KvideoAuthorModel record);

    KvideoAuthorModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(KvideoAuthorModel record);

    int updateByPrimaryKey(KvideoAuthorModel record);
}