package org.sleuthkit.autopsy.modules.encryptiondetection;
/** Localizable strings for {@link org.sleuthkit.autopsy.modules.encryptiondetection}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Tìm các tệp tin với entropy tối thiểu được chỉ định.</i>
     * @see EncryptionDetectionModuleFactory
     */
    static String EncryptionDetectionFileIngestModule_getDesc_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EncryptionDetectionFileIngestModule.getDesc.text");
    }
    /**
     * @return <i>Phát hiện Mã hóa</i>
     * @see EncryptionDetectionModuleFactory
     */
    static String EncryptionDetectionFileIngestModule_moduleName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EncryptionDetectionFileIngestModule.moduleName.text");
    }
    /**
     * @return <i>Đầu vào entropy tối thiểu phải là một số từ 6,0 đến 8,0.</i>
     * @see EncryptionDetectionIngestJobSettingsPanel
     */
    static String EncryptionDetectionIngestJobSettingsPanel_minimumEntropyInput_validationError_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EncryptionDetectionIngestJobSettingsPanel.minimumEntropyInput.validationError.text");
    }
    /**
     * @return <i>Kích thước tệp nhập tối thiểu phải là số nguyên (bằng megabyte) là 1 hoặc lớn hơn.</i>
     * @see EncryptionDetectionIngestJobSettingsPanel
     */
    static String EncryptionDetectionIngestJobSettingsPanel_minimumFileSizeInput_validationError_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EncryptionDetectionIngestJobSettingsPanel.minimumFileSizeInput.validationError.text");
    }
    private Bundle() {}
}
