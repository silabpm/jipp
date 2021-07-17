// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-sheets-col" collection as defined in:
 * [PWG5100.7](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext20-20190816-5100.7.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobSheetsCol
constructor(
    /** May contain any keyword from [JobSheet] or a name. */
    var jobSheets: KeywordOrName? = null,
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null
) : AttributeCollection {

    /** Construct an empty [JobSheetsCol]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            jobSheets?.let { JobSheetsCol.jobSheets.of(it) },
            media?.let { JobSheetsCol.media.of(it) },
            mediaCol?.let { JobSheetsCol.mediaCol.of(it) }
        )

    /** Defines types for each member of [JobSheetsCol]. */
    companion object : AttributeCollection.Converter<JobSheetsCol> {
        override fun convert(attributes: List<Attribute<*>>): JobSheetsCol =
            JobSheetsCol(
                extractOne(attributes, jobSheets),
                extractOne(attributes, media),
                extractOne(attributes, mediaCol)
            )
        override val cls = JobSheetsCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val jobSheets = KeywordOrNameType("job-sheets")
        @JvmField val media = KeywordOrNameType("media")
        @JvmField val mediaCol = AttributeCollection.Type("media-col", MediaCol)
    }
    override fun toString() = "JobSheetsCol(${attributes.joinToString()})"
}
