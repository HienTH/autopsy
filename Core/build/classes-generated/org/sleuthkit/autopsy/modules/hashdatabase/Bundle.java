package org.sleuthkit.autopsy.modules.hashdatabase;
/** Localizable strings for {@link org.sleuthkit.autopsy.modules.hashdatabase}. */
@javax.annotation.Generated(value="org.netbeans.modules.openide.util.NbBundleProcessor")
class Bundle {
    /**
     * @return <i>Error creating new hash set</i>
     * @see HashDbCreateDatabaseDialog
     */
    static String HashDbCreateDatabaseDialog_databaseCreationError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbCreateDatabaseDialog.databaseCreationError");
    }
    /**
     * @return <i>Error accessing central repository</i>
     * @see HashDbCreateDatabaseDialog
     */
    static String HashDbCreateDatabaseDialog_databaseLookupError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbCreateDatabaseDialog.databaseLookupError");
    }
    /**
     * @return <i>A hashset with this name already exists</i>
     * @see HashDbCreateDatabaseDialog
     */
    static String HashDbCreateDatabaseDialog_duplicateName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbCreateDatabaseDialog.duplicateName");
    }
    /**
     * @return <i>An organization must be selected</i>
     * @see HashDbCreateDatabaseDialog
     */
    static String HashDbCreateDatabaseDialog_missingOrg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbCreateDatabaseDialog.missingOrg");
    }
    /**
     * @return <i>Failure loading organizations.</i>
     * @see HashDbCreateDatabaseDialog
     */
    static String HashDbCreateDatabaseDialog_populateOrgsError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbCreateDatabaseDialog.populateOrgsError.message");
    }
    /**
     * @return <i>Error accessing central repository</i>
     * @see HashDbImportDatabaseDialog
     */
    static String HashDbImportDatabaseDialog_databaseLookupError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbImportDatabaseDialog.databaseLookupError");
    }
    /**
     * @return <i>A hashset with this name and version already exists</i>
     * @see HashDbImportDatabaseDialog
     */
    static String HashDbImportDatabaseDialog_duplicateName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbImportDatabaseDialog.duplicateName");
    }
    /**
     * @return <i>An organization must be selected</i>
     * @see HashDbImportDatabaseDialog
     */
    static String HashDbImportDatabaseDialog_missingOrg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbImportDatabaseDialog.missingOrg");
    }
    /**
     * @return <i>A version must be entered</i>
     * @see HashDbImportDatabaseDialog
     */
    static String HashDbImportDatabaseDialog_missingVersion() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbImportDatabaseDialog.missingVersion");
    }
    /**
     * @return <i>A hash set name must be entered.</i>
     * @see HashDbImportDatabaseDialog
     */
    static String HashDbImportDatabaseDialog_mustEnterHashSetNameMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbImportDatabaseDialog.mustEnterHashSetNameMsg");
    }
    /**
     * @return <i>Failure loading organizations.</i>
     * @see HashDbImportDatabaseDialog
     */
    static String HashDbImportDatabaseDialog_populateOrgsError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbImportDatabaseDialog.populateOrgsError.message");
    }
    /**
     * @return <i>Failed to index hashset hit artifact for keyword search.</i>
     * @see HashDbIngestModule
     */
    static String HashDbIngestModule_indexError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbIngestModule.indexError.message");
    }
    /**
     * @return <i>Notable file search will not be executed.</i>
     * @see HashDbIngestModule
     */
    static String HashDbIngestModule_knownBadFileSearchWillNotExecuteWarn() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbIngestModule.knownBadFileSearchWillNotExecuteWarn");
    }
    /**
     * @return <i>Known file search will not be executed.</i>
     * @see HashDbIngestModule
     */
    static String HashDbIngestModule_knownFileSearchWillNotExecuteWarn() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbIngestModule.knownFileSearchWillNotExecuteWarn");
    }
    /**
     * @return <i>No notable hash database set.</i>
     * @see HashDbIngestModule
     */
    static String HashDbIngestModule_noKnownBadHashDbSetMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbIngestModule.noKnownBadHashDbSetMsg");
    }
    /**
     * @return <i>No known hash database set.</i>
     * @see HashDbIngestModule
     */
    static String HashDbIngestModule_noKnownHashDbSetMsg() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbIngestModule.noKnownHashDbSetMsg");
    }
    /**
     * @return <i>Error loading organization</i>
     * @see HashDbManager
     */
    static String HashDbManager_CentralRepoHashDb_orgError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbManager.CentralRepoHashDb.orgError");
    }
    /**
     * @return <i>Error loading central repository hash sets</i>
     * @see HashDbManager
     */
    static String HashDbManager_centralRepoLoadError_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbManager.centralRepoLoadError.message");
    }
    /**
     * @param database_name database name
     * @return <i>Couldn't get valid database path for: </i>{@code database_name}
     * @see HashDbManager
     */
    static String HashDbManager_noDbPath_message(Object database_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashDbManager.noDbPath.message", database_name);
    }
    /**
     * @return <i>Global Hash Lookup Settings</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.Title");
    }
    /**
     * @return <i>Central Repository</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_centralRepo() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.centralRepo");
    }
    /**
     * @return <i>Editable</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_editable() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.editable");
    }
    /**
     * @return <i>N/A</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_notApplicable() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.notApplicable");
    }
    /**
     * @return <i>Read only</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_readOnly() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.readOnly");
    }
    /**
     * @param hash_lookup_name hash lookup name
     * @return <i>Failed to remove hash lookup: </i>{@code hash_lookup_name}
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_removeDatabaseFailure_message(Object hash_lookup_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.removeDatabaseFailure.message", hash_lookup_name);
    }
    /**
     * @return <i>Couldn't save hash db settings.</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_saveFail_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.saveFail.message");
    }
    /**
     * @return <i>Save Fail</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_saveFail_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.saveFail.title");
    }
    /**
     * @return <i>Error reading status</i>
     * @see HashLookupSettingsPanel
     */
    static String HashLookupSettingsPanel_updateStatusError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HashLookupSettingsPanel.updateStatusError");
    }
    /**
     * @return <i>Error parsing hash set file</i>
     * @see ImportCentralRepoDbProgressDialog
     */
    static String ImportCentralRepoDbProgressDialog_errorParsingFile_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ImportCentralRepoDbProgressDialog.errorParsingFile.message");
    }
    /**
     * @return <i> hashes processed</i>
     * @see ImportCentralRepoDbProgressDialog
     */
    static String ImportCentralRepoDbProgressDialog_linesProcessed_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ImportCentralRepoDbProgressDialog.linesProcessed.message");
    }
    /**
     * @return <i>Central Repository Import Progress</i>
     * @see ImportCentralRepoDbProgressDialog
     */
    static String ImportCentralRepoDbProgressDialog_title_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ImportCentralRepoDbProgressDialog.title.text");
    }
    private Bundle() {}
}
