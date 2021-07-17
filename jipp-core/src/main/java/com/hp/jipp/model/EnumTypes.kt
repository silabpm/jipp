// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength")

package com.hp.jipp.model

import com.hp.jipp.encoding.Enum
import com.hp.jipp.encoding.EnumType

/**
 * All known [Enum] types, used for better decoding of [IppPacket] data.
 */
object EnumTypes {
    @JvmField val all: Map<String, EnumType<out Enum>> = listOf(
        Types.documentState,
        Types.outputDeviceDocumentState,
        Types.finishings,
        Types.finishingsActual,
        Types.finishingsDefault,
        Types.finishingsReady,
        Types.finishingsSupported,
        Types.jobState,
        Types.outputDeviceJobState,
        Types.outputDeviceJobStates,
        Types.operationsSupported,
        MediaCol.MediaSourceProperties.mediaSourceFeedOrientation,
        InputAttributes.inputOrientationRequested,
        Types.inputOrientationRequestedSupported,
        Types.orientationRequested,
        Types.orientationRequestedActual,
        Types.orientationRequestedDefault,
        Types.orientationRequestedSupported,
        InputAttributes.inputQuality,
        Types.inputQualitySupported,
        Types.printQuality,
        Types.printQualityActual,
        Types.printQualityDefault,
        Types.printQualitySupported,
        SystemConfiguredPrinters.printerState,
        Types.printerState,
        SystemConfiguredResources.resourceState,
        Types.resourceState,
        Types.resourceStates,
        Types.systemState,
        DestinationStatuses.transmissionStatus,
        Types.fetchStatusCode,
        Types.notifyStatusCode
    ).map { it.name to it }.toMap()
}
