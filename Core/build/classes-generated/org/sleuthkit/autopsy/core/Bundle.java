package org.sleuthkit.autopsy.core;
/** Localizable strings for {@link org.sleuthkit.autopsy.core}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Đang chạy điều tra, có chắc bạn muốn thoát?</i>
     * @see Installer
     */
    static String Installer_closing_confirmationDialog_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Installer.closing.confirmationDialog.message");
    }
    /**
     * @return <i>Đang chạy điều tra</i>
     * @see Installer
     */
    static String Installer_closing_confirmationDialog_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Installer.closing.confirmationDialog.title");
    }
    /**
     * @param exception_message exception message
     * @return <i>Lỗi khi kết thúc hồ sơ: </i>{@code exception_message}
     * @see Installer
     */
    static String Installer_closing_messageBox_caseCloseExceptionMessage(Object exception_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Installer.closing.messageBox.caseCloseExceptionMessage", exception_message);
    }
    private Bundle() {}
}
