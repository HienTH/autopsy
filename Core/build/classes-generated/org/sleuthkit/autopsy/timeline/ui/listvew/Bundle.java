package org.sleuthkit.autopsy.timeline.ui.listvew;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline.ui.listvew}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Đã xảy ra sự cố khi tải nội dung cho sự kiện đã chọn.</i>
     * @see ListTimeline
     */
    static String ListChart_errorMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListChart.errorMsg");
    }
    /**
     * @param the_number_of_events the number of events
     * @return {@code the_number_of_events}<i> sự kiện</i>
     * @see ListTimeline
     */
    static String ListTimeline_eventCountLabel_text(Object the_number_of_events) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListTimeline.eventCountLabel.text", the_number_of_events);
    }
    /**
     * @return <i>Đã xảy ra sự cố khi lấy tên bộ băm cho sự kiện đã chọn.</i>
     * @see ListTimeline
     */
    static String ListTimeline_hashHitTooltip_error() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListTimeline.hashHitTooltip.error");
    }
    /**
     * @param hash_set_names hash set names
     * @return <i>Bộ Băm:<br></i>{@code hash_set_names}
     * @see ListTimeline
     */
    static String ListTimeline_hashHitTooltip_text(Object hash_set_names) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListTimeline.hashHitTooltip.text", hash_set_names);
    }
    /**
     * @return <i>Đã xảy ra sự cố khi nhận các tên thẻ cho sự kiện đã chọn.</i>
     * @see ListTimeline
     */
    static String ListTimeline_taggedTooltip_error() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListTimeline.taggedTooltip.error");
    }
    /**
     * @param tag_names tag names
     * @return <i>Thẻ:<br></i>{@code tag_names}
     * @see ListTimeline
     */
    static String ListTimeline_taggedTooltip_text(Object tag_names) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListTimeline.taggedTooltip.text", tag_names);
    }
    /**
     * @return <i>Đang cập nhật chế độ xem danh sách</i>
     * @see ListViewPane
     */
    static String ListViewPane_loggedTask_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListViewPane.loggedTask.name");
    }
    /**
     * @return <i>Truy xuất dữ liệu sự kiện</i>
     * @see ListViewPane
     */
    static String ListViewPane_loggedTask_queryDb() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListViewPane.loggedTask.queryDb");
    }
    /**
     * @return <i>Xem populating</i>
     * @see ListViewPane
     */
    static String ListViewPane_loggedTask_updateUI() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListViewPane.loggedTask.updateUI");
    }
    /**
     * @return <i>Tập đã truy cập ( A )</i>
     * @see ListTimeline
     */
    static String ListView_EventTypeCell_accessedTooltip() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListView.EventTypeCell.accessedTooltip");
    }
    /**
     * @return <i>Tập tin bị thay đổi ( C )</i>
     * @see ListTimeline
     */
    static String ListView_EventTypeCell_changedTooltip() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListView.EventTypeCell.changedTooltip");
    }
    /**
     * @return <i>Tạo tập tin ( B, for Born )</i>
     * @see ListTimeline
     */
    static String ListView_EventTypeCell_createdTooltip() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListView.EventTypeCell.createdTooltip");
    }
    /**
     * @return <i>Tập bị sửa đổi ( M )</i>
     * @see ListTimeline
     */
    static String ListView_EventTypeCell_modifiedTooltip() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ListView.EventTypeCell.modifiedTooltip");
    }
    private Bundle() {}
}
