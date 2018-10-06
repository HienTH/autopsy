package org.sleuthkit.autopsy.timeline.ui;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline.ui}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Kéo chuột để chọn một khoảng thời gian để phóng to. <br> Nhấp chuột phải để có thêm hành động.</i>
     * @see AbstractTimelineChart
     */
    static String AbstractTimelineChart_defaultTooltip_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AbstractTimelineChart.defaultTooltip.text");
    }
    /**
     * @return <i>Lịch sử</i>
     * @see HistoryToolBar
     */
    static String HistoryToolBar_historyLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HistoryToolBar.historyLabel.text");
    }
    /**
     * @return <i>Clear Selected Interval</i>
     * @see IntervalSelector
     */
    static String IntervalSelector_ClearSelectedIntervalAction_tooltTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IntervalSelector.ClearSelectedIntervalAction.tooltTipText");
    }
    /**
     * @return <i>Zoom</i>
     * @see IntervalSelector
     */
    static String IntervalSelector_ZoomAction_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IntervalSelector.ZoomAction.name");
    }
    /**
     * @return <i>Không có sự kiện hiển thị</i>
     * @see ViewFrame
     */
    static String NoEventsDialog_titledPane_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NoEventsDialog.titledPane.text");
    }
    /**
     * @return <i>Phóng to lịch sử</i>
     * @see TimeLineChart
     */
    static String TimeLineChart_zoomHistoryActionGroup_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineChart.zoomHistoryActionGroup.name");
    }
    /**
     * @return <i>Hiển thị thời gian trong:</i>
     * @see TimeZonePanel
     */
    static String TimeZonePanel_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeZonePanel.title");
    }
    /**
     * @param start_timestamp start timestamp
     * @param end_timestamp end timestamp
     * @return <i>Nhấp đúp để phóng to vào phạm vi:<br></i>{@code start_timestamp}<i> đến </i>{@code end_timestamp}<i>.<br><br>Nhấp chuột phải để đóng.</i>
     * @see IntervalSelector
     */
    static String Timeline_ui_TimeLineChart_tooltip_text(Object start_timestamp, Object end_timestamp) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Timeline.ui.TimeLineChart.tooltip.text", start_timestamp, end_timestamp);
    }
    /**
     * @return <i>Đếm</i>
     * @see ViewFrame
     */
    static String ViewFrame_countsToggle_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.countsToggle.text");
    }
    /**
     * @return <i>Chi tiết</i>
     * @see ViewFrame
     */
    static String ViewFrame_detailsToggle_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.detailsToggle.text");
    }
    /**
     * @return <i>:Kết thúc</i>
     * @see ViewFrame
     */
    static String ViewFrame_endLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.endLabel.text");
    }
    /**
     * @return <i>Chuẩn bị</i>
     * @see ViewFrame
     */
    static String ViewFrame_histogramTask_preparing() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.histogramTask.preparing");
    }
    /**
     * @return <i>Truy vấn FB</i>
     * @see ViewFrame
     */
    static String ViewFrame_histogramTask_queryDb() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.histogramTask.queryDb");
    }
    /**
     * @return <i>Đặt lại </i>
     * @see ViewFrame
     */
    static String ViewFrame_histogramTask_resetUI() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.histogramTask.resetUI");
    }
    /**
     * @return <i>Xây dựng lại Histogram</i>
     * @see ViewFrame
     */
    static String ViewFrame_histogramTask_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.histogramTask.title");
    }
    /**
     * @return <i>Đang cập nhật giao diện người dùng</i>
     * @see ViewFrame
     */
    static String ViewFrame_histogramTask_updateUI2() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.histogramTask.updateUI2");
    }
    /**
     * @return <i>Danh sách</i>
     * @see ViewFrame
     */
    static String ViewFrame_listToggle_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.listToggle.text");
    }
    /**
     * @return <i>Không có sự kiện nào hiển thị với cài đặt thu phóng / lọc hiện tại.</i>
     * @see ViewFrame
     */
    static String ViewFrame_noEventsDialogLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.noEventsDialogLabel.text");
    }
    /**
     * @param datasource_name datasource name
     * @return <i>Phân tích đã kết thúc cho </i>{@code datasource_name}<i>. DB Timeline có thể đã lỗi thời.</i>
     * @see ViewFrame
     */
    static String ViewFrame_notification_analysisComplete(Object datasource_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.notification.analysisComplete", datasource_name);
    }
    /**
     * @param datasource_name datasource name
     * @return {@code datasource_name}<i> đã được thêm như là một nguồn dữ liệu mới. DB Timeline có thể đã lỗi thời.</i>
     * @see ViewFrame
     */
    static String ViewFrame_notification_newDataSource(Object datasource_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.notification.newDataSource", datasource_name);
    }
    /**
     * @return <i>Làm mới chế độ xem để bao gồm thông tin trong DB nhưng không được hiển thị, chẳng hạn như các thẻ mới cập nhật.</i>
     * @see ViewFrame
     */
    static String ViewFrame_refresh_longText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.refresh.longText");
    }
    /**
     * @return <i>Làm mới Chế độ xem</i>
     * @see ViewFrame
     */
    static String ViewFrame_refresh_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.refresh.text");
    }
    /**
     * @return <i>Bắt đầu:</i>
     * @see ViewFrame
     */
    static String ViewFrame_startLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.startLabel.text");
    }
    /**
     * @return <i>Thẻ đã được tạo hoặc bị xóa. Chế độ xem có thể không được cập nhật.</i>
     * @see ViewFrame
     */
    static String ViewFrame_tagsAddedOrDeleted() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.tagsAddedOrDeleted");
    }
    /**
     * @return <i>Chế độ xem:</i>
     * @see ViewFrame
     */
    static String ViewFrame_viewModeLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.viewModeLabel.text");
    }
    /**
     * @return <i>Phóng to / thu nhỏ</i>
     * @see ViewFrame
     */
    static String ViewFrame_zoomMenuButton_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewFrame.zoomMenuButton.text");
    }
    /**
     * @return <i>Phân tích cài đặt thu phóng và bộ lọc</i>
     * @see AbstractTimeLineView
     */
    static String ViewRefreshTask_preparing() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewRefreshTask.preparing");
    }
    private Bundle() {}
}
