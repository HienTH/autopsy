package org.sleuthkit.autopsy.centralrepository.ingestmodule;
/** Localizable strings for {@link org.sleuthkit.autopsy.centralrepository.ingestmodule}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Lưu thuộc tính vào kho trung tâm cho các tương quan sau</i>
     * @see IngestModuleFactory
     */
    static String IngestModuleFactory_ingestmodule_desc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModuleFactory.ingestmodule.desc");
    }
    /**
     * @return <i>Phương tiện tương quan</i>
     * @see IngestModuleFactory
     */
    static String IngestModuleFactory_ingestmodule_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModuleFactory.ingestmodule.name");
    }
    /**
     * @return <i>Central repository settings are not initialized, cannot run Correlation Engine ingest module.</i>
     * @see IngestModule
     */
    static String IngestModule_errorMessage_isNotEnabled() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.errorMessage.isNotEnabled");
    }
    /**
     * @return <i>Central Repository Not Initialized</i>
     * @see IngestModule
     */
    static String IngestModule_notfyBubble_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.notfyBubble.title");
    }
    /**
     * @return <i>Kho trung tâm</i>
     * @see IngestModule
     */
    static String IngestModule_postToBB_eamHit() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.postToBB.eamHit");
    }
    /**
     * @return <i>Tên tập tin</i>
     * @see IngestModule
     */
    static String IngestModule_postToBB_fileName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.postToBB.fileName");
    }
    /**
     * @return <i>Nguồn của bộ Băm</i>
     * @see IngestModule
     */
    static String IngestModule_postToBB_hashSetSource() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.postToBB.hashSetSource");
    }
    /**
     * @param Tên_tệp_đáng_chú_ý Tên tệp đáng chú ý
     * @return <i>Đáng chú ý: </i>{@code Tên_tệp_đáng_chú_ý}
     * @see IngestModule
     */
    static String IngestModule_postToBB_knownBadMsg(Object Tên_tệp_đáng_chú_ý) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.postToBB.knownBadMsg", Tên_tệp_đáng_chú_ý);
    }
    /**
     * @return <i>Mã MD5</i>
     * @see IngestModule
     */
    static String IngestModule_postToBB_md5Hash() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.postToBB.md5Hash");
    }
    /**
     * @return <i>Hồ sơ trước: </i>
     * @see IngestModule
     */
    static String IngestModule_prevCaseComment_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.prevCaseComment.text");
    }
    /**
     * @return <i>Thẻ trước được gán là đáng chú ý (Kho trung tâm)</i>
     * @see IngestModule
     */
    static String IngestModule_prevTaggedSet_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "IngestModule.prevTaggedSet.text");
    }
    private Bundle() {}
}
