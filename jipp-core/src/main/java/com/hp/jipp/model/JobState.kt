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
 * "job-state" enum as defined in:
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class JobState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [JobState] attribute. */
    class Type(name: String) : EnumType<JobState>(name, { get(it) })

    /** An [AttributeType] for multiple [JobState] attributes. */
    class SetType(name: String) : EnumType.Set<JobState>(name, { get(it) })

    object Code {
        const val pending = 3
        const val pendingHeld = 4
        const val processing = 5
        const val processingStopped = 6
        const val canceled = 7
        const val aborted = 8
        const val completed = 9
    }

    companion object {
        @JvmField val pending = JobState(Code.pending, "pending")
        @JvmField val pendingHeld = JobState(Code.pendingHeld, "pending-held")
        @JvmField val processing = JobState(Code.processing, "processing")
        @JvmField val processingStopped = JobState(Code.processingStopped, "processing-stopped")
        @JvmField val canceled = JobState(Code.canceled, "canceled")
        @JvmField val aborted = JobState(Code.aborted, "aborted")
        @JvmField val completed = JobState(Code.completed, "completed")

        @JvmField val all = listOf(
            pending,
            pendingHeld,
            processing,
            processingStopped,
            canceled,
            aborted,
            completed,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): JobState =
            all[value] ?: JobState(value, "???")
    }
}
