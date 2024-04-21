package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


public interface ReportService {


    /**
     * 统计指定时间区间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    public TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
