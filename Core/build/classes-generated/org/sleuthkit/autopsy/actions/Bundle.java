package org.sleuthkit.autopsy.actions;
/** Localizable strings for {@link org.sleuthkit.autopsy.actions}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Thẻ kết quả</i>
     * @see AddBlackboardArtifactTagAction
     */
    static String AddBlackboardArtifactTagAction_pluralTagResult() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddBlackboardArtifactTagAction.pluralTagResult");
    }
    /**
     * @return <i>Thẻ kết quả</i>
     * @see AddBlackboardArtifactTagAction
     */
    static String AddBlackboardArtifactTagAction_singularTagResult() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddBlackboardArtifactTagAction.singularTagResult");
    }
    /**
     * @return <i>Lỗi gắn thẻ</i>
     * @see AddBlackboardArtifactTagAction
     */
    static String AddBlackboardArtifactTagAction_taggingErr() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddBlackboardArtifactTagAction.taggingErr");
    }
    /**
     * @param artifactName artifactName
     * @return <i>Unable to tag </i>{@code artifactName}<i>.</i>
     * @see AddBlackboardArtifactTagAction
     */
    static String AddBlackboardArtifactTagAction_unableToTag_msg(Object artifactName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddBlackboardArtifactTagAction.unableToTag.msg", artifactName);
    }
    /**
     * @return <i>Cannot Apply Tag</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_cannotApplyTagErr() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.cannotApplyTagErr");
    }
    /**
     * @return <i>Tệp tin gắn thẻ</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_pluralTagFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.pluralTagFile");
    }
    /**
     * @return <i>Tệp tin gắn thẻ</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_singularTagFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.singularTagFile");
    }
    /**
     * @param fileName fileName
     * @param tagName tagName
     * @return {@code fileName}<i> đã được gắn thẻ là </i>{@code tagName}<i>. Không thể áp dụng lại cùng một thẻ.</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_tagExists(Object fileName, Object tagName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.tagExists", fileName, tagName);
    }
    /**
     * @return <i>Lỗi đính thẻ</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_taggingErr() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.taggingErr");
    }
    /**
     * @param fileName fileName
     * @return <i>Không thể gắn thẻ </i>{@code fileName}<i>, không phải là tệp thông thường.</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_unableToTag_msg(Object fileName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.unableToTag.msg", fileName);
    }
    /**
     * @param fileName fileName
     * @return <i>Không thể gắn thẻ </i>{@code fileName}<i>.</i>
     * @see AddContentTagAction
     */
    static String AddContentTagAction_unableToTag_msg2(Object fileName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AddContentTagAction.unableToTag.msg2", fileName);
    }
    /**
     * @return <i>Ingest Status Details</i>
     * @see ShowIngestProgressSnapshotAction
     */
    static String CTL_ShowIngestProgressSnapshotAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_ShowIngestProgressSnapshotAction");
    }
    /**
     * @return <i>Xóa thẻ</i>
     * @see DeleteBlackboardArtifactTagAction
     */
    static String DeleteBlackboardArtifactTagAction_deleteTag() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteBlackboardArtifactTagAction.deleteTag");
    }
    /**
     * @return <i>Lỗi xóa thẻ</i>
     * @see DeleteBlackboardArtifactTagAction
     */
    static String DeleteBlackboardArtifactTagAction_tagDelErr() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteBlackboardArtifactTagAction.tagDelErr");
    }
    /**
     * @param tagName tagName
     * @return <i>Không thể xóa thẻ </i>{@code tagName}<i>.</i>
     * @see DeleteBlackboardArtifactTagAction
     */
    static String DeleteBlackboardArtifactTagAction_unableToDelTag_msg(Object tagName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteBlackboardArtifactTagAction.unableToDelTag.msg", tagName);
    }
    /**
     * @return <i>Xóa thẻ</i>
     * @see DeleteContentTagAction
     */
    static String DeleteContentTagAction_deleteTag() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteContentTagAction.deleteTag");
    }
    /**
     * @return <i>Lỗi xóa thẻ</i>
     * @see DeleteContentTagAction
     */
    static String DeleteContentTagAction_tagDelErr() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteContentTagAction.tagDelErr");
    }
    /**
     * @param tagName tagName
     * @return <i>Không thể xóa thẻ </i>{@code tagName}<i>.</i>
     * @see DeleteContentTagAction
     */
    static String DeleteContentTagAction_unableToDelTag_msg(Object tagName) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteContentTagAction.unableToDelTag.msg", tagName);
    }
    /**
     * @return <i>Xóa Thẻ Kết quả</i>
     * @see DeleteFileBlackboardArtifactTagAction
     */
    static String DeleteFileBlackboardArtifactTagAction_deleteTag() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteFileBlackboardArtifactTagAction.deleteTag");
    }
    /**
     * @param artifactID artifactID
     * @return <i>Không thể bỏ gắn thẻ artifact </i>{@code artifactID}<i>.</i>
     * @see DeleteFileBlackboardArtifactTagAction
     */
    static String DeleteFileBlackboardArtifactTagAction_deleteTag_alert(Object artifactID) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteFileBlackboardArtifactTagAction.deleteTag.alert", artifactID);
    }
    /**
     * @param artifactID artifactID
     * @return <i>Không thể bỏ gắn thẻ artifact </i>{@code artifactID}<i>.</i>
     * @see DeleteFileBlackboardArtifactTagAction
     */
    static String DeleteFileBlackboardArtifactTagAction_deleteTags_alert(Object artifactID) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteFileBlackboardArtifactTagAction.deleteTags.alert", artifactID);
    }
    /**
     * @return <i>Xóa tệp gắn thẻ</i>
     * @see DeleteFileContentTagAction
     */
    static String DeleteFileContentTagAction_deleteTag() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteFileContentTagAction.deleteTag");
    }
    /**
     * @param fileID fileID
     * @return <i>Không thể bỏ gắn thẻ tệp tin </i>{@code fileID}<i>.</i>
     * @see DeleteFileContentTagAction
     */
    static String DeleteFileContentTagAction_deleteTag_alert(Object fileID) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DeleteFileContentTagAction.deleteTag.alert", fileID);
    }
    /**
     * @return <i>Đang điều tra, bạn có chắc chắn muốn thoát không?</i>
     * @see ExitAction
     */
    static String ExitAction_confirmationDialog_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExitAction.confirmationDialog.message");
    }
    /**
     * @return <i>Điều tra đang chạy</i>
     * @see ExitAction
     */
    static String ExitAction_confirmationDialog_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExitAction.confirmationDialog.title");
    }
    /**
     * @param exception_message exception message
     * @return <i>Lỗi khi đóng hồ sơ: </i>{@code exception_message}
     * @see ExitAction
     */
    static String ExitAction_messageBox_caseCloseExceptionMessage(Object exception_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ExitAction.messageBox.caseCloseExceptionMessage", exception_message);
    }
    /**
     * @return <i>Mô tả:</i>
     * @see GetTagNameDialog
     */
    static String GetTagNameDialog_descriptionLabel_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetTagNameDialog.descriptionLabel.text");
    }
    /**
     * @return <i>Thẻ cho biết mục tin  là đáng chú ý.</i>
     * @see GetTagNameDialog
     */
    static String GetTagNameDialog_notableCheckbox_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetTagNameDialog.notableCheckbox.text");
    }
    /**
     * @return <i>Mô tả thẻ không được chứa dấu phẩy (,) hoặc dấu chấm phẩy (;)</i>
     * @see GetTagNameDialog
     */
    static String GetTagNameDialog_tagDescriptionIllegalCharacters_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetTagNameDialog.tagDescriptionIllegalCharacters.message");
    }
    /**
     * @return <i>Ký tự không hợp lệ trong thẻ mô tả</i>
     * @see GetTagNameDialog
     */
    static String GetTagNameDialog_tagDescriptionIllegalCharacters_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetTagNameDialog.tagDescriptionIllegalCharacters.title");
    }
    /**
     * @return <i>Tên thẻ phải là duy nhất. Thẻ có tên này đã tồn tại.</i>
     * @see GetTagNameDialog
     */
    static String GetTagNameDialog_tagNameAlreadyExists_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetTagNameDialog.tagNameAlreadyExists.message");
    }
    /**
     * @return <i>Tên thẻ trùng lặp</i>
     * @see GetTagNameDialog
     */
    static String GetTagNameDialog_tagNameAlreadyExists_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetTagNameDialog.tagNameAlreadyExists.title");
    }
    private Bundle() {}
}
