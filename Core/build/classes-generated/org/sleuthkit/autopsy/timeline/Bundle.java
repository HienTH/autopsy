package org.sleuthkit.autopsy.timeline;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Không thể tạo thời gian, không có nguồn dữ liệu.</i>
     * @see OpenTimelineAction
     */
    static String OpenTimeLineAction_msgdlg_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "OpenTimeLineAction.msgdlg.text");
    }
    /**
     * @return <i>Dòng sự kiện</i>
     * @see OpenTimelineAction
     */
    static String OpenTimelineAction_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "OpenTimelineAction.displayName");
    }
    /**
     * @return <i>Không thể khởi tạo cài đặt dòng thời gian.</i>
     * @see OpenTimelineAction
     */
    static String OpenTimelineAction_settingsErrorMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "OpenTimelineAction.settingsErrorMessage");
    }
    /**
     * @return <i>Tiếp tục mà không cập nhật</i>
     * @see PromptDialogManager
     */
    static String PrompDialogManager_buttonType_continueNoUpdate() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PrompDialogManager.buttonType.continueNoUpdate");
    }
    /**
     * @return <i>Tiếp tục</i>
     * @see PromptDialogManager
     */
    static String PrompDialogManager_buttonType_showTimeline() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PrompDialogManager.buttonType.showTimeline");
    }
    /**
     * @return <i>Cập nhật DB</i>
     * @see PromptDialogManager
     */
    static String PrompDialogManager_buttonType_update() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PrompDialogManager.buttonType.update");
    }
    /**
     * @return <i>Bạn có muốn tiếp tục?</i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_confirmDuringIngest_contentText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.confirmDuringIngest.contentText");
    }
    /**
     * @return <i>Bạn đang cố gắng cập nhật Timeline DB trước khi nhập xong. DB Timeline có thể không đầy đủ.</i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_confirmDuringIngest_headerText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.confirmDuringIngest.headerText");
    }
    /**
     * @return <i>Lọc dữ liệu Dòng sự kiện</i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_progressDialog_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.progressDialog.title");
    }
    /**
     * @return <i>Chi tiết</i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_rebuildPrompt_details() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.rebuildPrompt.details");
    }
    /**
     * @return <i>DB Timeline chưa đầy đủ hoặc lỗi thời.  Một số sự kiện có thể bị thiếu hoặc không chính xác và một số tính năng có thể không khả dụng.</i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_rebuildPrompt_headerText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.rebuildPrompt.headerText");
    }
    /**
     * @return <i>Chức năng Dòng sự kiện hiện không có sẵn cho Linux.  Dòng sự kiện sẽ bị tắt. </i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_showTimeLineDisabledMessage_contentText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.showTimeLineDisabledMessage.contentText");
    }
    /**
     * @return 
     * @see PromptDialogManager
     */
    static String PromptDialogManager_showTimeLineDisabledMessage_headerText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.showTimeLineDisabledMessage.headerText");
    }
    /**
     * @return <i>Có quá nhiều tệp trong DB để đảm bảo hiệu suất hợp lý.  Dòng thời gian sẽ bị tắt. </i>
     * @see PromptDialogManager
     */
    static String PromptDialogManager_showTooManyFiles_contentText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.showTooManyFiles.contentText");
    }
    /**
     * @return 
     * @see PromptDialogManager
     */
    static String PromptDialogManager_showTooManyFiles_headerText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "PromptDialogManager.showTooManyFiles.headerText");
    }
    /**
     * @return <i>Nội dung đã nhập chỉ có thể chứa số.</i>
     * @see ShowInTimelineDialog
     */
    static String ShowInTimelineDialog_amountValidator_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ShowInTimelineDialog.amountValidator.message");
    }
    /**
     * @return <i>Xem kết quả trong Dòng sự kiện.</i>
     * @see ShowInTimelineDialog
     */
    static String ShowInTimelineDialog_artifactTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ShowInTimelineDialog.artifactTitle");
    }
    /**
     * @return <i>Bạn phải chọn một sự kiện.</i>
     * @see ShowInTimelineDialog
     */
    static String ShowInTimelineDialog_eventSelectionValidator_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ShowInTimelineDialog.eventSelectionValidator.message");
    }
    /**
     * @param file_path file path
     * @return <i>Xem </i>{@code file_path}<i> trong dòng sự kiện.</i>
     * @see ShowInTimelineDialog
     */
    static String ShowInTimelineDialog_fileTitle(Object file_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ShowInTimelineDialog.fileTitle", file_path);
    }
    /**
     * @return <i>Hiển thị Dòng thời gian</i>
     * @see ShowInTimelineDialog
     */
    static String ShowInTimelineDialog_showTimelineButtonType_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ShowInTimelineDialog.showTimelineButtonType.text");
    }
    /**
     * @return <i>Lỗi Dòng sự kiện.</i>
     * @see TimeLineController
     */
    static String TimeLineController_errorTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.errorTitle");
    }
    /**
     * @return <i>Lỗi xác định xem thời gian đã lỗi thời. Chúng tôi sẽ giả định rằng nó nên được cập nhật. Xem nhật ký để biết thêm chi tiết.</i>
     * @see TimeLineController
     */
    static String TimeLineController_outOfDate_errorMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.outOfDate.errorMessage");
    }
    /**
     * @return <i>Cơ sở dữ liệu Sự kiện đã được điền trước đó mà không có thông tin không đầy đủ: Một số tính năng có thể không khả dụng hoặc không hoạt động trừ khi bạn cập nhật cơ sở dữ liệu sự kiện.</i>
     * @see TimeLineController
     */
    static String TimeLineController_rebuildReasons_incompleteOldSchema() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.rebuildReasons.incompleteOldSchema");
    }
    /**
     * @return <i>Cơ sở dữ liệu sự kiện trước đây đã được nhập vào khi đang chạy: Một số sự kiện có thể bị thiếu, không đầy đủ hoặc không chính xác.</i>
     * @see TimeLineController
     */
    static String TimeLineController_rebuildReasons_ingestWasRunning() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.rebuildReasons.ingestWasRunning");
    }
    /**
     * @return <i>Dữ liệu sự kiện đã lỗi thời: Không phải tất cả sự kiện sẽ được hiển thị.</i>
     * @see TimeLineController
     */
    static String TimeLineController_rebuildReasons_outOfDate() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.rebuildReasons.outOfDate");
    }
    /**
     * @return <i>Không thể xác định được liệu dữ liệu thời gian đã lỗi thời.</i>
     * @see TimeLineController
     */
    static String TimeLineController_rebuildReasons_outOfDateError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.rebuildReasons.outOfDateError");
    }
    /**
     * @return <i>Không thể đánh dấu dòng sự kiện như không lỗi thời. Một số kết quả có thể đã lỗi thời hoặc thiếu.</i>
     * @see TimeLineController
     */
    static String TimeLineController_setEventsDBStale_errMsgNotStale() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.setEventsDBStale.errMsgNotStale");
    }
    /**
     * @return <i>Không thể đánh dấu dòng sự kiện là cũ. Một số kết quả có thể đã lỗi thời hoặc thiếu.</i>
     * @see TimeLineController
     */
    static String TimeLineController_setEventsDBStale_errMsgStale() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.setEventsDBStale.errMsgStale");
    }
    /**
     * @return <i>Không thể đánh dấu dòng sự kiện khi đang điều tra. Một số kết quả có thể đã lỗi thời hoặc thiếu.</i>
     * @see TimeLineController
     */
    static String TimeLineController_setIngestRunning_errMsgRunning() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineController.setIngestRunning.errMsgRunning");
    }
    /**
     * @param start_of_date_range start of date range
     * @param end_of_date_range end of date range
     * @return {@code start_of_date_range}<i> đến </i>{@code end_of_date_range}
     * @see TimeLineTopComponent
     */
    static String TimeLineResultView_startDateToEndDate_text(Object start_of_date_range, Object end_of_date_range) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineResultView.startDateToEndDate.text", start_of_date_range, end_of_date_range);
    }
    /**
     * @return <i>Sự kiện</i>
     * @see TimeLineTopComponent
     */
    static String TimeLineTopComponent_eventsTab_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineTopComponent.eventsTab.name");
    }
    /**
     * @return <i>Bộ lọc</i>
     * @see TimeLineTopComponent
     */
    static String TimeLineTopComponent_filterTab_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLineTopComponent.filterTab.name");
    }
    /**
     * @return <i>Không thể đánh dấu dòng sự kiện khi điều tra không chạy. Một số kết quả có thể đã lỗi thời hoặc thiếu.</i>
     * @see TimeLineController
     */
    static String TimeLinecontroller_setIngestRunning_errMsgNotRunning() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLinecontroller.setIngestRunning.errMsgNotRunning");
    }
    /**
     * @return <i>Bạn có muốn cập nhật cơ sở dữ liệu sự kiện ngay bây giờ?</i>
     * @see TimeLineController
     */
    static String TimeLinecontroller_updateNowQuestion() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimeLinecontroller.updateNowQuestion");
    }
    /**
     * @return <i>Đã xảy ra sự cố khi tải nội dung cho sự kiện đã chọn.</i>
     * @see TimeLineTopComponent
     */
    static String TimelineTopComponent_selectedEventListener_errorMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TimelineTopComponent.selectedEventListener.errorMsg");
    }
    /**
     * @return <i> Dòng sự kiện</i>
     * @see TimeLineController
     */
    static String Timeline_dialogs_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Timeline.dialogs.title");
    }
    private Bundle() {}
}
