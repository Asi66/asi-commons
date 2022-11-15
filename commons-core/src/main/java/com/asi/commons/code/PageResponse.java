package com.asi.commons.code;

import lombok.Data;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
@Data
public class PageResponse<T> extends Response<T> {

    /**
     *  第几页
     */
    private Integer pageIndex;
    /**
     *  每页行数
     */
    private Integer pageSize;
    /**
     *  总记录数
     */
    private Integer total;

    public PageResponse(T payload, Integer pageIndex, Integer pageSize, Integer total) {
        super(payload);
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
    }
}
