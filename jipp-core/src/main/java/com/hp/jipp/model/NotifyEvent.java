// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "notify-events" keywords.
 *
 * Also used by: "notify-events-default", "notify-events-supported", "notify-subscribed-event".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf">PWG5100.18</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf">PWG5100.22</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject12-20240517-5100.5.pdf">PWG5100.5</a>
 * @see <a href="http://www.iana.org/go/rfc3995">RFC3995</a>
 */
public class NotifyEvent {
    public static final String documentCompleted = "document-completed";
    public static final String documentConfigChanged = "document-config-changed";
    public static final String documentCreated = "document-created";
    public static final String documentFetchable = "document-fetchable";
    public static final String documentStateChanged = "document-state-changed";
    public static final String documentStopped = "document-stopped";
    public static final String jobCompleted = "job-completed";
    public static final String jobConfigChanged = "job-config-changed";
    public static final String jobCreated = "job-created";
    public static final String jobFetchable = "job-fetchable";
    public static final String jobProgress = "job-progress";
    public static final String jobStateChanged = "job-state-changed";
    public static final String jobStopped = "job-stopped";
    public static final String none = "none";
    public static final String printerConfigChanged = "printer-config-changed";
    public static final String printerCreated = "printer-created";
    public static final String printerDeleted = "printer-deleted";
    public static final String printerFinishingsChanged = "printer-finishings-changed";
    public static final String printerMediaChanged = "printer-media-changed";
    public static final String printerQueueOrderChanged = "printer-queue-order-changed";
    public static final String printerRestarted = "printer-restarted";
    public static final String printerShutdown = "printer-shutdown";
    public static final String printerStateChanged = "printer-state-changed";
    public static final String printerStopped = "printer-stopped";
    public static final String resourceCanceled = "resource-canceled";
    public static final String resourceConfigChanged = "resource-config-changed";
    public static final String resourceCreated = "resource-created";
    public static final String resourceInstalled = "resource-installed";
    public static final String resourceStateChanged = "resource-state-changed";
    public static final String systemConfigChanged = "system-config-changed";
    public static final String systemRestarted = "system-restarted";
    public static final String systemShutdown = "system-shutdown";
    public static final String systemStateChanged = "system-state-changed";
    public static final String systemStopped = "system-stopped";
}