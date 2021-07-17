// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-media-sheets-col" collection as defined in:
 * [XEROX20150505](https://ftp.pwg.org/pub/pwg/ipp/registrations/xerox-counters-20150505.txt).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobMediaSheetsCol
constructor(
    var blank: Int? = null,
    var fullColor: Int? = null,
    var highlightColor: Int? = null,
    var monochrome: Int? = null
) : AttributeCollection {

    /** Construct an empty [JobMediaSheetsCol]. */
    constructor() : this(null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            blank?.let { JobMediaSheetsCol.blank.of(it) },
            fullColor?.let { JobMediaSheetsCol.fullColor.of(it) },
            highlightColor?.let { JobMediaSheetsCol.highlightColor.of(it) },
            monochrome?.let { JobMediaSheetsCol.monochrome.of(it) }
        )

    /** Defines types for each member of [JobMediaSheetsCol]. */
    companion object : AttributeCollection.Converter<JobMediaSheetsCol> {
        override fun convert(attributes: List<Attribute<*>>): JobMediaSheetsCol =
            JobMediaSheetsCol(
                extractOne(attributes, blank),
                extractOne(attributes, fullColor),
                extractOne(attributes, highlightColor),
                extractOne(attributes, monochrome)
            )
        override val cls = JobMediaSheetsCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val blank = IntType("blank")
        @JvmField val fullColor = IntType("full-color")
        @JvmField val highlightColor = IntType("highlight-color")
        @JvmField val monochrome = IntType("monochrome")
    }
    override fun toString() = "JobMediaSheetsCol(${attributes.joinToString()})"
}
