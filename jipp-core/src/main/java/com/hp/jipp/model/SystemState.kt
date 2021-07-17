// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "system-state" enum as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
data class SystemState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [SystemState] attribute. */
    class Type(name: String) : EnumType<SystemState>(name, { get(it) })

    /** An [AttributeType] for multiple [SystemState] attributes. */
    class SetType(name: String) : EnumType.Set<SystemState>(name, { get(it) })

    object Code {
        const val idle = 3
        const val processing = 4
        const val stopped = 5
    }

    companion object {
        @JvmField val idle = SystemState(Code.idle, "idle")
        @JvmField val processing = SystemState(Code.processing, "processing")
        @JvmField val stopped = SystemState(Code.stopped, "stopped")

        @JvmField val all = listOf(
            idle,
            processing,
            stopped
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): SystemState =
            all[value] ?: SystemState(value, "???")
    }
}
