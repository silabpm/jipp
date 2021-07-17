// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2021-05-04
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-resolvers-supported" collection as defined in:
 * [PWG5100.13](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobResolversSupported
constructor(
    var resolverName: String? = null
) : AttributeCollection {

    /** Construct an empty [JobResolversSupported]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            resolverName?.let { JobResolversSupported.resolverName.of(it) }
        )

    /** Defines types for each member of [JobResolversSupported]. */
    companion object : AttributeCollection.Converter<JobResolversSupported> {
        override fun convert(attributes: List<Attribute<*>>): JobResolversSupported =
            JobResolversSupported(
                extractOne(attributes, resolverName)?.value
            )
        override val cls = JobResolversSupported::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val resolverName = NameType("resolver-name")
    }
    override fun toString() = "JobResolversSupported(${attributes.joinToString()})"
}
