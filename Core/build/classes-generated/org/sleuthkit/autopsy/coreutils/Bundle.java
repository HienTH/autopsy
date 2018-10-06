package org.sleuthkit.autopsy.coreutils;
/** Localizable strings for {@link org.sleuthkit.autopsy.coreutils}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @param file_name file name
     * @return <i>Tạo bản xem trước cho </i>{@code file_name}
     * @see ImageUtils
     */
    static String GetOrGenerateThumbnailTask_generatingPreviewFor(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetOrGenerateThumbnailTask.generatingPreviewFor", file_name);
    }
    /**
     * @param file_name file name
     * @return <i>Tải hình thu nhỏ cho </i>{@code file_name}
     * @see ImageUtils
     */
    static String GetOrGenerateThumbnailTask_loadingThumbnailFor(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GetOrGenerateThumbnailTask.loadingThumbnailFor", file_name);
    }
    /**
     * @param file_name file name
     * @return <i>Đọc hình ảnh: </i>{@code file_name}
     * @see ImageUtils
     */
    static String ReadImageTask_mesageText(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ReadImageTask.mesageText", file_name);
    }
    /**
     * @param file_name file name
     * @return <i>trích xuất tập tin tạm </i>{@code file_name}
     * @see VideoUtils
     */
    static String VideoUtils_genVideoThumb_progress_text(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "VideoUtils.genVideoThumb.progress.text", file_name);
    }
    private Bundle() {}
}
