package com.palmble.dal;

import java.util.List;
import java.util.Map;

import com.palmble.entity.Banner;
import com.palmble.entity.BaseMenu;

public interface BannerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

	List<Banner> getBannerList(Map<String, Object> map);
}