package org.sleuthkit.autopsy.timeline.db;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline.db}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Đã xảy ra sự cố khi điền vào biểu đồ thời gian.  Không phải tất cả các sự kiện có thể có mặt hoặc chính xác.</i>
     * @see EventsRepository
     */
    static String msgdlg_problem_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "msgdlg.problem.text");
    }
    /**
     * @return <i>Ủy thác cơ sở dữ liệu sự kiện</i>
     * @see EventsRepository
     */
    static String progressWindow_msg_commitingDb() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "progressWindow.msg.commitingDb");
    }
    /**
     * @return <i>Thu thập dữ liệu sự kiện</i>
     * @see EventsRepository
     */
    static String progressWindow_msg_gatheringData() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "progressWindow.msg.gatheringData");
    }
    /**
     * @return <i>Nạp các sự kiện thời gian MAC cho các tệp</i>
     * @see EventsRepository
     */
    static String progressWindow_msg_populateMacEventsFiles() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "progressWindow.msg.populateMacEventsFiles");
    }
    /**
     * @return <i>Làm mới các thẻ tập tin</i>
     * @see EventsRepository
     */
    static String progressWindow_msg_refreshingFileTags() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "progressWindow.msg.refreshingFileTags");
    }
    /**
     * @return <i>Làm mới các thẻ kết quả</i>
     * @see EventsRepository
     */
    static String progressWindow_msg_refreshingResultTags() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "progressWindow.msg.refreshingResultTags");
    }
    /**
     * @param event_type_ event type 
     * @return <i>Phổ biến </i>{@code event_type_}<i> sự kiện</i>
     * @see EventsRepository
     */
    static String progressWindow_populatingXevents(Object event_type_) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "progressWindow.populatingXevents", event_type_);
    }
    private Bundle() {}
}
