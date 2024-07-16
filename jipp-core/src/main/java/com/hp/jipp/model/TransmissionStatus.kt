// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "transmission-status" enum as defined in:
 * [PWG5100.15](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
data class TransmissionStatus(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [TransmissionStatus] attribute. */
    class Type(name: String) : EnumType<TransmissionStatus>(name, { get(it) })

    /** An [AttributeType] for multiple [TransmissionStatus] attributes. */
    class SetType(name: String) : EnumType.Set<TransmissionStatus>(name, { get(it) })

    object Code {
        const val pending = 3
        const val pendingRetry = 4
        const val processing = 5
        const val canceled = 7
        const val aborted = 8
        const val completed = 9
    }

    companion object {
        @JvmField val pending = TransmissionStatus(Code.pending, "pending")
        @JvmField val pendingRetry = TransmissionStatus(Code.pendingRetry, "pending-retry")
        @JvmField val processing = TransmissionStatus(Code.processing, "processing")
        @JvmField val canceled = TransmissionStatus(Code.canceled, "canceled")
        @JvmField val aborted = TransmissionStatus(Code.aborted, "aborted")
        @JvmField val completed = TransmissionStatus(Code.completed, "completed")

        @JvmField val all = listOf(
            pending,
            pendingRetry,
            processing,
            canceled,
            aborted,
            completed,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): TransmissionStatus =
            all[value] ?: TransmissionStatus(value, "???")
    }
}
