package org.sleuthkit.autopsy.livetriage;
/** Localizable strings for {@link org.sleuthkit.autopsy.livetriage}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Make Live Triage Drive</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CTL_CreateLiveTriageDriveAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_CreateLiveTriageDriveAction");
    }
    /**
     * @return <i>Đã hoàn thành tạo đĩa triage trực tiếp</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CopyFilesWorker_done_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CopyFilesWorker.done.text");
    }
    /**
     * @return <i>Lỗi khi sao chép các tập tin triage trực tiếp</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CopyFilesWorker_error_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CopyFilesWorker.error.text");
    }
    /**
     * @return <i>Không thể định vị thư mục ứng dụng</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_appPathError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.appPathError.message");
    }
    /**
     * @return <i>Lỗi khi tạo tệp hàng loạt</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_batchFileError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.batchFileError.message");
    }
    /**
     * @return <i>Không thể sao chép ứng dụng. Chỉ hoạt động trên phiên bản đã cài đặt.</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_copyError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.copyError.message");
    }
    /**
     * @return <i>Lỗi khi tạo đĩa triage trực tiếp</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_error_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.error.title");
    }
    /**
     * @return <i>Không thể tìm thấy phần thực thi</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_exenotfound_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.exenotfound.message");
    }
    /**
     * @param drivePath drivePath
     * @return <i>Sao chép tệp tin lưu trữ trực tiếp sang </i>{@code drivePath}
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_progressBar_text(Object drivePath) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.progressBar.text", drivePath);
    }
    /**
     * @return <i>Vui lòng đợi</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_progressBar_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.progressBar.title");
    }
    /**
     * @return <i>Đã tạo phân vùng động trực tiếp. Sử dụng RunFromUSB.bat để chạy ứng dụng</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_success_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.success.message");
    }
    /**
     * @return <i>Thành công</i>
     * @see CreateLiveTriageDriveAction
     */
    static String CreateLiveTriageDriveAction_success_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CreateLiveTriageDriveAction.success.title");
    }
    /**
     * @return <i>Tên đĩa</i>
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_diskTable_column1_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.diskTable.column1.title");
    }
    /**
     * @return <i>Dung lượng đĩa</i>
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_diskTable_column2_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.diskTable.column2.title");
    }
    /**
     * @return <i>Đĩa không được phát hiện. Trên một số hệ thống, nó đòi hỏi quyền admin</i>
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_errLabel_disksNotDetected_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.errLabel.disksNotDetected.text");
    }
    /**
     * @return <i>Không phát hiện đĩa.</i>
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_errLabel_disksNotDetected_toolTipText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.errLabel.disksNotDetected.toolTipText");
    }
    /**
     * @return 
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_localDiskModel_loading_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.localDiskModel.loading.msg");
    }
    /**
     * @return <i>Không thể tìm thấy phần thực thi</i>
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_localDiskModel_nodrives_msg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.localDiskModel.nodrives.msg");
    }
    /**
     * @return <i>Tạo ổ đĩa Triage Trực tiếp</i>
     * @see SelectDriveDialog
     */
    static String SelectDriveDialog_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectDriveDialog.title");
    }
    private Bundle() {}
}
