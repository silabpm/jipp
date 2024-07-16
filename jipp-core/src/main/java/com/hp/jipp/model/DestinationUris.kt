// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "destination-uris" collection as defined in:
 * [PWG5100.15](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf),
 * [PWG5100.17](https://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DestinationUris
constructor(
    var destinationAttributes: List<UntypedCollection>? = null,
    var destinationUri: java.net.URI? = null,
    var postDialString: String? = null,
    var preDialString: String? = null,
    var t33Subaddress: Int? = null,
) : AttributeCollection {

    /** Construct an empty [DestinationUris]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            destinationAttributes?.let { DestinationUris.destinationAttributes.of(it) },
            destinationUri?.let { DestinationUris.destinationUri.of(it) },
            postDialString?.let { DestinationUris.postDialString.of(it) },
            preDialString?.let { DestinationUris.preDialString.of(it) },
            t33Subaddress?.let { DestinationUris.t33Subaddress.of(it) },
        )

    /** Defines types for each member of [DestinationUris]. */
    companion object : AttributeCollection.Converter<DestinationUris> {
        override fun convert(attributes: List<Attribute<*>>): DestinationUris =
            DestinationUris(
                extractAll(attributes, destinationAttributes),
                extractOne(attributes, destinationUri),
                extractOne(attributes, postDialString)?.value,
                extractOne(attributes, preDialString)?.value,
                extractOne(attributes, t33Subaddress),
            )
        override val cls = DestinationUris::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val destinationAttributes = UntypedCollection.SetType("destination-attributes")
        @JvmField val destinationUri = UriType("destination-uri")
        @JvmField val postDialString = TextType("post-dial-string")
        @JvmField val preDialString = TextType("pre-dial-string")
        @JvmField val t33Subaddress = IntType("t33-subaddress")
    }
    override fun toString() = "DestinationUris(${attributes.joinToString()})"
}
