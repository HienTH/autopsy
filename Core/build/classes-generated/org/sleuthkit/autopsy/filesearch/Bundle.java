package org.sleuthkit.autopsy.filesearch;
/** Localizable strings for {@link org.sleuthkit.autopsy.filesearch}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Ngày kết thúc phải sau ngày bắt đầu.</i>
     * @see DateSearchFilter
     */
    static String DateSearchFilter_errorMessage_endDateBeforeStartDate() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DateSearchFilter.errorMessage.endDateBeforeStartDate");
    }
    /**
     * @return <i>Phải chọn ít nhất một loại ngày.</i>
     * @see DateSearchFilter
     */
    static String DateSearchFilter_errorMessage_noCheckboxSelected() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DateSearchFilter.errorMessage.noCheckboxSelected");
    }
    /**
     * @return <i>Dữ liệu Băm trống.</i>
     * @see HashSearchFilter
     */
    static String HashSearchFilter_errorMessage_emptyHash() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashSearchFilter.errorMessage.emptyHash");
    }
    /**
     * @return <i>MD5 chứa ký tự hex không hợp lệ.</i>
     * @see HashSearchFilter
     */
    static String HashSearchFilter_errorMessage_wrongCharacter() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashSearchFilter.errorMessage.wrongCharacter");
    }
    /**
     * @param hash_data_length hash data length
     * @return <i>Độ dài đầu vào (</i>{@code hash_data_length}<i>), không khớp với chiều dài MD5 (32).</i>
     * @see HashSearchFilter
     */
    static String HashSearchFilter_errorMessage_wrongLength(Object hash_data_length) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashSearchFilter.errorMessage.wrongLength", hash_data_length);
    }
    /**
     * @return <i>Phải chọn ít nhất một trạng thái đã biết.</i>
     * @see KnownStatusSearchFilter
     */
    static String KnownStatusSearchFilter_errorMessage_noKnownStatusCheckboxSelected() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "KnownStatusSearchFilter.errorMessage.noKnownStatusCheckboxSelected");
    }
    /**
     * @return <i>Phải chọn ít nhất một loại MIME.</i>
     * @see MimeTypeFilter
     */
    static String MimeTypeFilter_errorMessage_emptyMimeType() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MimeTypeFilter.errorMessage.emptyMimeType");
    }
    /**
     * @return <i>Vui lòng nhập tên để tìm kiếm.</i>
     * @see NameSearchFilter
     */
    static String NameSearchFilter_errorMessage_emtpyName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "NameSearchFilter.errorMessage.emtpyName");
    }
    /**
     * @return <i>Kích thước đầu vào là một số âm.</i>
     * @see SizeSearchFilter
     */
    static String SizeSearchFilter_errorMessage_nonNegativeNumber() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SizeSearchFilter.errorMessage.nonNegativeNumber");
    }
    /**
     * @return <i>Kích thước đầu vào không phải là số.</i>
     * @see SizeSearchFilter
     */
    static String SizeSearchFilter_errorMessage_notANumber() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SizeSearchFilter.errorMessage.notANumber");
    }
    private Bundle() {}
}
