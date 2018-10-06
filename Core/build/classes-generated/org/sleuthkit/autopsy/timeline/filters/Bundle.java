package org.sleuthkit.autopsy.timeline.filters;
/** Localizable strings for {@link org.sleuthkit.autopsy.timeline.filters}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Nguồn dữ liệu</i>
     * @see DataSourcesFilter
     */
    static String DataSourcesFilter_displayName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DataSourcesFilter.displayName.text");
    }
    /**
     * @return <i>Loại trừ</i>
     * @see DescriptionFilter
     */
    static String DescriptionFilter_mode_exclude() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DescriptionFilter.mode.exclude");
    }
    /**
     * @return <i>Bao gồm</i>
     * @see DescriptionFilter
     */
    static String DescriptionFilter_mode_include() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DescriptionFilter.mode.include");
    }
    /**
     * @param sub_filter_displaynames sub filter displaynames
     * @return <i>Giao nhau</i>{@code sub_filter_displaynames}
     * @see IntersectionFilter
     */
    static String IntersectionFilter_displayName_text(Object sub_filter_displaynames) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IntersectionFilter.displayName.text", sub_filter_displaynames);
    }
    /**
     * @return <i>Bộ lọc văn bản</i>
     * @see TextFilter
     */
    static String TextFilter_displayName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TextFilter.displayName.text");
    }
    /**
     * @return <i>Loại sự kiện</i>
     * @see TypeFilter
     */
    static String TypeFilter_displayName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TypeFilter.displayName.text");
    }
    /**
     * @return <i>Bộ dữ liệu băm</i>
     * @see HashHitsFilter
     */
    static String hashHitsFilter_displayName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "hashHitsFilter.displayName.text");
    }
    /**
     * @return <i>Ẩn tệp đã biết</i>
     * @see HideKnownFilter
     */
    static String hideKnownFilter_displayName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "hideKnownFilter.displayName.text");
    }
    /**
     * @return <i>Thẻ</i>
     * @see TagsFilter
     */
    static String tagsFilter_displayName_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "tagsFilter.displayName.text");
    }
    private Bundle() {}
}
