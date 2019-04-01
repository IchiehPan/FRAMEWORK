package com.pan.framework.page;

/**
 * @author panyijie
 *
 */
public class PageBean {
    private Integer currentPageNumber = 0; // 当前页数

    private Integer pageSize = 20;// 数据数量

    private Integer totalPageNumber = 0;// 总页数

    private Integer prePageNumber = 0;// 上一页

    private Integer nextPageNumber = 0; // 下一页

    private Integer startRecordNumber = 0; // 开始记录数

    private Integer endRecordNumber = 0; // 结束记录数

    private Integer totalRecordNumber = 0; // 总记录数

    public PageBean() {
    }

    public PageBean(Integer currentPageNumber, Integer pageSize) {
        init(currentPageNumber, pageSize);
    }

    public void init(Integer currentPageNumber, Integer pageSize) {
        setCurrentPageNumber(currentPageNumber);
        setPageSize(pageSize);

        Integer startRecordNumber = pageSize * (currentPageNumber - 1);
        Integer endRecordNumber = startRecordNumber + pageSize;

        setStartRecordNumber(startRecordNumber);
        setEndRecordNumber(endRecordNumber);
    }

    /**
     * 初始化变量数据
     * 
     * @param currentPageNumber
     *            当前页数
     * @param pageSize
     *            数据数量
     * @param totalRecordNumber
     *            总页数
     */
    public void init(Integer currentPageNumber, Integer pageSize, Integer totalRecordNumber) {
        init(currentPageNumber, pageSize);
        setTotalRecordNumber(totalRecordNumber);

        Integer totalPageNumber = totalRecordNumber / pageSize;
        if (totalRecordNumber % pageSize != 0) {
            totalPageNumber += 1;
        }
        setTotalPageNumber(totalPageNumber);

        Integer prePageNumber = 0;
        if (currentPageNumber > 1) {
            prePageNumber = currentPageNumber - 1;
        }
        setPrePageNumber(prePageNumber);

        Integer nextPageNumber = 0;
        if (currentPageNumber < totalPageNumber) {
            nextPageNumber = currentPageNumber + 1;
        }
        setNextPageNumber(nextPageNumber);
    }

    public Integer getCurrentPageNumber() {
        return this.currentPageNumber;
    }

    public void setCurrentPageNumber(Integer currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public void setTotalPageNumber(Integer totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
    }

    public Integer getPrePageNumber() {
        return this.prePageNumber;
    }

    public void setPrePageNumber(Integer prePageNumber) {
        this.prePageNumber = prePageNumber;
    }

    public Integer getNextPageNumber() {
        return this.nextPageNumber;
    }

    public void setNextPageNumber(Integer nextPageNumber) {
        this.nextPageNumber = nextPageNumber;
    }

    public Integer getStartRecordNumber() {
        return this.startRecordNumber;
    }

    public void setStartRecordNumber(Integer startRecordNumber) {
        this.startRecordNumber = startRecordNumber;
    }

    public Integer getEndRecordNumber() {
        return this.endRecordNumber;
    }

    public void setEndRecordNumber(Integer endRecordNumber) {
        this.endRecordNumber = endRecordNumber;
    }

    public Integer getTotalRecordNumber() {
        return this.totalRecordNumber;
    }

    public void setTotalRecordNumber(Integer totalRecordNumber) {
        this.totalRecordNumber = totalRecordNumber;
    }
}
