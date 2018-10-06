package org.sleuthkit.autopsy.centralrepository.datamodel;
/** Localizable strings for {@link org.sleuthkit.autopsy.centralrepository.datamodel}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Error executing query when attempting to delete organization by id.</i>
     * @see AbstractSqlEamDb
     */
    static String AbstractSqlEamDb_deleteOrganization_errorDeleting_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AbstractSqlEamDb.deleteOrganization.errorDeleting.message");
    }
    /**
     * @return <i>Can not delete organization which is currently in use by a case or reference set in the central repository.</i>
     * @see AbstractSqlEamDb
     */
    static String AbstractSqlEamDb_deleteOrganization_inUseException_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "AbstractSqlEamDb.deleteOrganization.inUseException.message");
    }
    /**
     * @return <i>Tên miền</i>
     * @see CorrelationAttribute
     */
    static String CorrelationType_DOMAIN_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CorrelationType.DOMAIN.displayName");
    }
    /**
     * @return <i>Địa chỉ Email</i>
     * @see CorrelationAttribute
     */
    static String CorrelationType_EMAIL_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CorrelationType.EMAIL.displayName");
    }
    /**
     * @return <i>Tập tin</i>
     * @see CorrelationAttribute
     */
    static String CorrelationType_FILES_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CorrelationType.FILES.displayName");
    }
    /**
     * @return <i>Số điện thoại</i>
     * @see CorrelationAttribute
     */
    static String CorrelationType_PHONE_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CorrelationType.PHONE.displayName");
    }
    /**
     * @return <i>Thiết bị USB</i>
     * @see CorrelationAttribute
     */
    static String CorrelationType_USBID_displayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CorrelationType.USBID.displayName");
    }
    /**
     * @return <i>Xấu</i>
     * @see CorrelationAttributeInstance
     */
    static String EamArtifactInstances_knownStatus_bad() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamArtifactInstances.knownStatus.bad");
    }
    /**
     * @return <i>Nổi tiếng</i>
     * @see CorrelationAttributeInstance
     */
    static String EamArtifactInstances_knownStatus_known() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamArtifactInstances.knownStatus.known");
    }
    /**
     * @return <i>không xác định</i>
     * @see CorrelationAttributeInstance
     */
    static String EamArtifactInstances_knownStatus_unknown() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamArtifactInstances.knownStatus.unknown");
    }
    /**
     * @return <i>Địa chỉ Email</i>
     * @see EamArtifactUtil
     */
    static String EamArtifactUtil_emailaddresses_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamArtifactUtil.emailaddresses.text");
    }
    /**
     * @return <i>Case Name: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_caseDisplayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.caseDisplayName");
    }
    /**
     * @return <i>Case Number: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_caseNumber() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.caseNumber");
    }
    /**
     * @return <i>Case UUID: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_caseUUID() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.caseUUID");
    }
    /**
     * @return <i>Creation Date: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_creationDate() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.creationDate");
    }
    /**
     * @return <i>Examiner Email: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_examinerEmail() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.examinerEmail");
    }
    /**
     * @return <i>Examiner Name: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_examinerName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.examinerName");
    }
    /**
     * @return <i>Examiner Phone: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_examinerPhone() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.examinerPhone");
    }
    /**
     * @return <i>Notes: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_notes() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.notes");
    }
    /**
     * @return <i>Organization: </i>
     * @see CorrelationCase
     */
    static String EamCase_title_org() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EamCase.title.org");
    }
    private Bundle() {}
}
