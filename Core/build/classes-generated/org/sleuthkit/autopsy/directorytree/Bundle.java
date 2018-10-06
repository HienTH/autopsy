package org.sleuthkit.autopsy.directorytree;
/** Localizable strings for {@link org.sleuthkit.autopsy.directorytree}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Xem kết quả nguồn</i>
     * @see DataResultFilterNode
     */
    static String DataResultFilterNode_viewSourceArtifact_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataResultFilterNode.viewSourceArtifact.text");
    }
    /**
     * @return <i>Dữ liệu không tồn tại. Khởi động module nhận dạng tập tin.</i>
     * @see DirectoryTreeTopComponent
     */
    static String DirectoryTreeTopComponent_emptyMimeNode_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DirectoryTreeTopComponent.emptyMimeNode.text");
    }
    /**
     * @return <i>Danh sách</i>
     * @see DirectoryTreeTopComponent
     */
    static String DirectoryTreeTopComponent_resultsView_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DirectoryTreeTopComponent.resultsView.title");
    }
    /**
     * @return <i>Không có trình soạn thảo liên quan cho tệp kiểu này hoặc ứng dụng liên quan không khởi chạy.</i>
     * @see ExternalViewerAction
     */
    static String ExternalViewerAction_actionPerformed_failure_IO_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExternalViewerAction.actionPerformed.failure.IO.message");
    }
    /**
     * @return <i>Tệp không còn tồn tại.</i>
     * @see ExternalViewerAction
     */
    static String ExternalViewerAction_actionPerformed_failure_missingFile_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExternalViewerAction.actionPerformed.failure.missingFile.message");
    }
    /**
     * @return <i>Quyền để mở tệp đã bị từ chối.</i>
     * @see ExternalViewerAction
     */
    static String ExternalViewerAction_actionPerformed_failure_permission_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExternalViewerAction.actionPerformed.failure.permission.message");
    }
    /**
     * @return <i>Nền tảng này (hệ điều hành) không hỗ trợ mở một tệp trong trình soạn thảo theo cách này.</i>
     * @see ExternalViewerAction
     */
    static String ExternalViewerAction_actionPerformed_failure_support_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExternalViewerAction.actionPerformed.failure.support.message");
    }
    /**
     * @return <i>Không thể mở tệp tin</i>
     * @see ExternalViewerAction
     */
    static String ExternalViewerAction_actionPerformed_failure_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExternalViewerAction.actionPerformed.failure.title");
    }
    /**
     * @return <i>Lỗi khi giải nén không gian phân bổ không được gán từ ảnh ổ đĩa</i>
     * @see ExtractUnallocAction
     */
    static String ExtractUnallocAction_imageError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractUnallocAction.imageError");
    }
    /**
     * @return <i>Không tìm thấy tệp không được định vị trên ổ đĩa</i>
     * @see ExtractUnallocAction
     */
    static String ExtractUnallocAction_noFiles() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractUnallocAction.noFiles");
    }
    /**
     * @return <i>Lỗi khi giải nén không gian chưa phân bổ từ ổ đĩa</i>
     * @see ExtractUnallocAction
     */
    static String ExtractUnallocAction_volumeError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractUnallocAction.volumeError");
    }
    /**
     * @param fileName fileName
     * @return <i>Đã giải nén không gian chưa được gán vào </i>{@code fileName}<i> - sẽ bỏ qua ổ đĩa này</i>
     * @see ExtractUnallocAction
     */
    static String ExtractUnallocAction_volumeInProgress(Object fileName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExtractUnallocAction.volumeInProgress", fileName);
    }
    /**
     * @return <i>Chi tiết về tập tin hệ thống</i>
     * @see FileSystemDetailsAction
     */
    static String FileSystemDetailsAction_title_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "FileSystemDetailsAction.title.text");
    }
    /**
     * @return <i>Nguồn dữ liệu</i>
     * @see SelectionContext
     */
    static String SelectionContext_dataSources() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectionContext.dataSources");
    }
    /**
     * @return <i>Xem</i>
     * @see SelectionContext
     */
    static String SelectionContext_views() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelectionContext.views");
    }
    /**
     * @return <i>Không tìm được thư mục.</i>
     * @see ViewContextAction
     */
    static String ViewContextAction_errorMessage_cannotFindDirectory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewContextAction.errorMessage.cannotFindDirectory");
    }
    /**
     * @return <i>Không thể chọn thư mục trong cây.</i>
     * @see ViewContextAction
     */
    static String ViewContextAction_errorMessage_cannotSelectDirectory() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ViewContextAction.errorMessage.cannotSelectDirectory");
    }
    private Bundle() {}
}
