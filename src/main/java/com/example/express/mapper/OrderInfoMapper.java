package com.example.express.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.express.domain.bean.OrderInfo;
import com.example.express.domain.vo.CourierOrderVO;
import com.example.express.domain.vo.UserOrderVO;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
    OrderInfo selectByIdIgnoreDelete(String id);

    boolean manualDelete(@Param("id") String orderId, @Param("hasDelete") int hasDelete, @Param("deleteType") int deleteType);

    IPage<UserOrderVO> pageUserOrderVO(Page<UserOrderVO> page, @Param("sql") String selectSql, @Param("has_delete") int isDelete);

    IPage<CourierOrderVO> pageCourierOrderVO(Page<CourierOrderVO> page, @Param("sql") String sql);
}
