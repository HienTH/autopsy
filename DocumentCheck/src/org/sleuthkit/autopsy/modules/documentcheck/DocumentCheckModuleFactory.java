package org.sleuthkit.autopsy.modules.documentcheck;

import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;
import org.sleuthkit.autopsy.coreutils.Version;
import org.sleuthkit.autopsy.ingest.FileIngestModule;
import org.sleuthkit.autopsy.ingest.IngestModuleFactory;
import org.sleuthkit.autopsy.ingest.IngestModuleFactoryAdapter;
import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettings;


@ServiceProvider(service = IngestModuleFactory.class)
public class DocumentCheckModuleFactory extends IngestModuleFactoryAdapter {

    static String getModuleName() {
        return NbBundle.getMessage(DocumentCheckModule.class,
                "DocumentCheckModule.moduleName");
    }

    static String getModuleVersion() {
        return Version.getVersion();
    }

    @Override
    public String getModuleDisplayName() {
        return getModuleName();
    }

    @Override
    public String getModuleDescription() {
        return NbBundle.getMessage(DocumentCheckModule.class,
                "DocumentCheckModule.getDesc.text");
    }

    @Override
    public String getModuleVersionNumber() {
        return getModuleVersion();
    }

    @Override
    public boolean isFileIngestModuleFactory() {
        return true;
    }
    
    @Override
    public FileIngestModule createFileIngestModule(IngestModuleIngestJobSettings settings) {
        try {
            return new DocumentCheckModule();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }
}