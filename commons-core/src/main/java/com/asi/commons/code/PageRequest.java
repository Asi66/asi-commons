package com.asi.commons.code;

import java.io.Serializable;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
public class PageRequest extends BaseRequest implements Serializable {

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 页行数
     */
    private Integer pageSize;

    /**
     * 总条数
     */
    private Integer totalCount;

    private Integer offset;

    public Integer getPageNum() {
        return pageNum == null || pageNum <= 0 ? 1 : pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize == null || pageSize <= 0 ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getOffset() {
        return (getPageNum() - 1) * getPageSize();
    }
}
