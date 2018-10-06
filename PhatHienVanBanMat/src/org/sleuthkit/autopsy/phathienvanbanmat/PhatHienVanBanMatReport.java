/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sleuthkit.autopsy.phathienvanbanmat;

public class PhatHienVanBanMatReport {
    private boolean isKnown;
    private String permaLink;

    public PhatHienVanBanMatReport() {
        this.isKnown = false;
    }

    public PhatHienVanBanMatReport(String permaLink) {
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