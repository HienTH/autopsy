package org.sleuthkit.autopsy.modules.documentcheck;

public class DocumentCheckReport {
    private boolean isKnown;
    private String permaLink;

    public DocumentCheckReport() {
        this.isKnown = false;
    }

    public DocumentCheckReport(String permaLink) {
        this.permaLink = permaLink;
        this.isKnown = true;
    }

    public boolean isKnown() {
        return isKnown;
    }

    public String getPermaLink() {
        return permaLink;
    }
}