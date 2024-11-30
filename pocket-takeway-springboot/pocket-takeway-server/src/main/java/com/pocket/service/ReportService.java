package com.pocket.service;

import com.pocket.vo.OrderReportVO;
import com.pocket.vo.SalesTop10ReportVO;
import com.pocket.vo.TurnoverReportVO;
import com.pocket.vo.UserReportVO;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName ReportService
 * @description
 * @date 2024-11-29
 */

public interface ReportService {

    /**
     * 统计指定时问区间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistict(LocalDate begin, LocalDate end);

    /**
     * 统计指定时问区间内的用户数据
     * @param begin
     * @param end
     * @return
     */
    UserReportVO getUserStatistict(LocalDate begin, LocalDate end);

    /**
     * 统计指定时问区间内的订单数据
     * @param begin
     * @param end
     * @return
     */
    OrderReportVO getOrdersStatistict(LocalDate begin, LocalDate end);


    /**
     * 统计指定时间区间内的销量排名（前10）
     * @param begin
     * @param end
     * @return
     */
    SalesTop10ReportVO getSalesTop10(LocalDate begin, LocalDate end);

    /**
     * 导出运营数据报表
     * @param response
     */
    void exportBusinessData(HttpServletResponse response);
}
