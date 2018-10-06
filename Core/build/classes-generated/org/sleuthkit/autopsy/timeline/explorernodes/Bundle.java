package org.sleuthkit.autopsy.timeline.explorernodes;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline.explorernodes}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Lỗi khi nhận hành động</i>
     * @see EventNode
     */
    static String EventNode_getAction_errorTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EventNode.getAction.errorTitle");
    }
    /**
     * @return <i>Đã xảy ra sự cố khi nhận các hành động cho kết quả đã chọn.  Hành động 'Xem tệp trong Dòng thời gian' sẽ không có sẵn.</i>
     * @see EventNode
     */
    static String EventNode_getAction_linkedFileMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EventNode.getAction.linkedFileMessage");
    }
    /**
     * @param maximum_number_of_events_to_display maximum number of events to display
     * @param the_number_of_events_that_is_too_many the number of events that is too many
     * @return <i>Quá nhiều sự kiện để hiển thị. Tối đa = </i>{@code maximum_number_of_events_to_display}<i>. Nhưng có </i>{@code the_number_of_events_that_is_too_many}<i> để hiển thị.</i>
     * @see EventRootNode
     */
    static String EventRoodNode_tooManyNode_displayName(Object maximum_number_of_events_to_display, Object the_number_of_events_that_is_too_many) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EventRoodNode.tooManyNode.displayName", maximum_number_of_events_to_display, the_number_of_events_that_is_too_many);
    }
    /**
     * @return <i>Base Type</i>
     * @see EventNode
     */
    static String NodeProperty_displayName_baseType() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NodeProperty.displayName.baseType");
    }
    /**
     * @return <i>Date/Time</i>
     * @see EventNode
     */
    static String NodeProperty_displayName_dateTime() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NodeProperty.displayName.dateTime");
    }
    /**
     * @return <i>Description</i>
     * @see EventNode
     */
    static String NodeProperty_displayName_description() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NodeProperty.displayName.description");
    }
    /**
     * @return <i>Icon</i>
     * @see EventNode
     */
    static String NodeProperty_displayName_icon() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NodeProperty.displayName.icon");
    }
    /**
     * @return <i>Known</i>
     * @see EventNode
     */
    static String NodeProperty_displayName_known() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NodeProperty.displayName.known");
    }
    /**
     * @return <i>Sub Type</i>
     * @see EventNode
     */
    static String NodeProperty_displayName_subType() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NodeProperty.displayName.subType");
    }
    private Bundle() {}
}
