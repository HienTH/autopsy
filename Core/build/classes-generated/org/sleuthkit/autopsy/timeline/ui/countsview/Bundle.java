package org.sleuthkit.autopsy.timeline.ui.countsview;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline.ui.countsview}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Không có độ phân giải thời gian nhỏ hơn Seconds. \n Bạn có muốn chuyển sang chế độ xem Chi tiết?</i>
     * @see EventCountsChart
     */
    static String CountsViewPane_detailSwitchMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.detailSwitchMessage");
    }
    /**
     * @return <i>"Chuyển sang chế độ xem chi tiết?</i>
     * @see EventCountsChart
     */
    static String CountsViewPane_detailSwitchTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.detailSwitchTitle");
    }
    /**
     * @return <i>Linear</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_linearRadio_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.linearRadio.text");
    }
    /**
     * @return <i>Logarithmic</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_logRadio_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.logRadio.text");
    }
    /**
     * @return <i>Updating Counts View</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_loggedTask_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.loggedTask.name");
    }
    /**
     * @return <i>Populating view</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_loggedTask_updatingCounts() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.loggedTask.updatingCounts");
    }
    /**
     * @param scale_name scale name
     * @return <i>Số lượng sự kiện (</i>{@code scale_name}<i>)</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_numberOfEvents(Object scale_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.numberOfEvents", scale_name);
    }
    /**
     * @return <i>Các quy mô tuyến tính là tốt cho nhiều trường hợp sử dụng. Khi lựa chọn quy mô này, chiều cao của thanh tượng trưng cho số đếm theo kiểu tuyến tính, một-một, và trục y được gắn nhãn với các giá trị. Khi phạm vi giá trị rất lớn, các khoảng thời gian có số lượng thấp có thể có thanh quá nhỏ để xem. Để giúp người dùng phát hiện ra điều này, nhãn của ngày với các sự kiện được in đậm. Để xem các thanh quá nhỏ, có ba tùy chọn: điều chỉnh kích thước cửa sổ để khoảng thời gian có khoảng cách đứng hơn, điều chỉnh phạm vi thời gian được hiển thị để khoảng thời gian với thanh lớn hơn bị loại trừ hoặc điều chỉnh cài đặt tỷ lệ thành lôgarít.</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_scaleHelpLinear() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.scaleHelpLinear");
    }
    /**
     * @return <i>Quy mô lôgarít đại diện cho số sự kiện theo một cách phi tuyến tính nén sự khác biệt giữa số lớn và số nhỏ. Lưu ý rằng ngay cả với quy mô logarithmic, một sự khác biệt rất lớn trong đếm vẫn có thể sản xuất thanh quá nhỏ để xem. Trong trường hợp này, lựa chọn duy nhất có thể là lọc các sự kiện để giảm sự khác biệt về số lượng. Chú ý: Do thang đo logarithmic được áp dụng cho từng loại sự kiện riêng biệt, ý nghĩa của chiều cao của thanh kết hợp không trực quan, và để nhấn mạnh điều này, không có nhãn được hiển thị trên trục y với thang logarithmic. Cần sử dụng quy mô lôgarít để nhanh chóng so sánh số lượng</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_scaleHelpLog() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.scaleHelpLog");
    }
    /**
     * @return <i>across time within a type, or across types for one time period, but not both.</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_scaleHelpLog2() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.scaleHelpLog2");
    }
    /**
     * @return <i> Số lượng thực tế (có sẵn trong chú giải công cụ hoặc trình xem kết quả) nên được sử dụng để so sánh tuyệt đối. Sử dụng quy mô lôgarít với sự cẩn thận.</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_scaleHelpLog3() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.scaleHelpLog3");
    }
    /**
     * @return <i>Tỉ lệ:   </i>
     * @see CountsViewPane
     */
    static String CountsViewPane_scaleHelp_label_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.scaleHelp.label.text");
    }
    /**
     * @return <i>Tỉ lệ:</i>
     * @see CountsViewPane
     */
    static String CountsViewPane_scaleLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.scaleLabel.text");
    }
    /**
     * @param count count
     * @param event_type_displayname event type displayname
     * @param start_date_time start date time
     * @param end_date_time end date time
     * @return {@code count}<i> </i>{@code event_type_displayname}<i> sự kiện<br>giữa </i>{@code start_date_time}<i><br>và    </i>{@code end_date_time}
     * @see EventCountsChart
     */
    static String CountsViewPane_tooltip_text(Object count, Object event_type_displayname, Object start_date_time, Object end_date_time) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CountsViewPane.tooltip.text", count, event_type_displayname, start_date_time, end_date_time);
    }
    /**
     * @return <i>Linear</i>
     * @see CountsViewPane
     */
    static String ScaleType_Linear() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ScaleType.Linear");
    }
    /**
     * @return <i>Logarithmic</i>
     * @see CountsViewPane
     */
    static String ScaleType_Logarithmic() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ScaleType.Logarithmic");
    }
    /**
     * @return <i>Chọn loại sự kiện</i>
     * @see EventCountsChart
     */
    static String Timeline_ui_countsview_menuItem_selectEventType() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Timeline.ui.countsview.menuItem.selectEventType");
    }
    /**
     * @return <i>Chọn Khoảng thời gian</i>
     * @see EventCountsChart
     */
    static String Timeline_ui_countsview_menuItem_selectTimeRange() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Timeline.ui.countsview.menuItem.selectTimeRange");
    }
    /**
     * @return <i>Chọn Thời gian và Loại</i>
     * @see EventCountsChart
     */
    static String Timeline_ui_countsview_menuItem_selectTimeandType() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Timeline.ui.countsview.menuItem.selectTimeandType");
    }
    /**
     * @return <i>Phóng to Khoảng thời gian</i>
     * @see EventCountsChart
     */
    static String Timeline_ui_countsview_menuItem_zoomIntoTimeRange() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Timeline.ui.countsview.menuItem.zoomIntoTimeRange");
    }
    private Bundle() {}
}
