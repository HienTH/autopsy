package org.sleuthkit.autopsy.modules.embeddedfileextractor;
/** Localizable strings for {@link org.sleuthkit.autopsy.modules.embeddedfileextractor}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Không thể tạo thư mục đầu ra.</i>
     * @see EmbeddedFileExtractorIngestModule
     */
    static String CannotCreateOutputFolder() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CannotCreateOutputFolder");
    }
    /**
     * @return <i>Không thể chạy phát hiện loại tệp.</i>
     * @see EmbeddedFileExtractorIngestModule
     */
    static String CannotRunFileTypeDetection() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CannotRunFileTypeDetection");
    }
    /**
     * @return <i>Giải nén các tệp nhúng (doc, docx, ppt, pptx, xls, xlsx, zip, rar, arj, 7z, gzip, bzip2, tar).</i>
     * @see EmbeddedFileExtractorModuleFactory
     */
    static String EmbeddedFileExtractorIngestModule_ArchiveExtractor_moduleDesc_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EmbeddedFileExtractorIngestModule.ArchiveExtractor.moduleDesc.text");
    }
    /**
     * @return <i>Trình trích xuất tệp nhúng</i>
     * @see EmbeddedFileExtractorModuleFactory
     */
    static String EmbeddedFileExtractorIngestModule_ArchiveExtractor_moduleName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EmbeddedFileExtractorIngestModule.ArchiveExtractor.moduleName");
    }
    /**
     * @return <i>Không thể lập chỉ mục mã hoá đã phát hiện cho tìm kiếm từ khóa.</i>
     * @see SevenZipExtractor
     */
    static String SevenZipExtractor_indexError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SevenZipExtractor.indexError.message");
    }
    /**
     * @return <i>Không thể khởi tạo thư viện 7zip.</i>
     * @see EmbeddedFileExtractorIngestModule
     */
    static String UnableToInitializeLibraries() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UnableToInitializeLibraries");
    }
    private Bundle() {}
}
