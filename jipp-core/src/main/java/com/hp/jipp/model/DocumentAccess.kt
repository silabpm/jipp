// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "document-access" collection as defined in:
 * [DEPURI](https://ftp.pwg.org/pub/pwg/ipp/registrations/reg-ippdepuri10-20211215.pdf),
 * [IPPWG20180620](https://ftp.pwg.org/pub/pwg/ipp/registrations/ippwg-access-x509-certificate-obsolete-20180620.txt),
 * [PWG5100.18](https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DocumentAccess
constructor(
    var accessOauthToken: List<ByteArray>? = null,
    var accessOauthUri: java.net.URI? = null,
    var accessPassword: String? = null,
    var accessPin: String? = null,
    var accessUserName: String? = null,
) : AttributeCollection {

    /** Construct an empty [DocumentAccess]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            accessOauthToken?.let { DocumentAccess.accessOauthToken.of(it) },
            accessOauthUri?.let { DocumentAccess.accessOauthUri.of(it) },
            accessPassword?.let { DocumentAccess.accessPassword.of(it) },
            accessPin?.let { DocumentAccess.accessPin.of(it) },
            accessUserName?.let { DocumentAccess.accessUserName.of(it) },
        )

    /** Defines types for each member of [DocumentAccess]. */
    companion object : AttributeCollection.Converter<DocumentAccess> {
        override fun convert(attributes: List<Attribute<*>>): DocumentAccess =
            DocumentAccess(
                extractAll(attributes, accessOauthToken),
                extractOne(attributes, accessOauthUri),
                extractOne(attributes, accessPassword)?.value,
                extractOne(attributes, accessPin)?.value,
                extractOne(attributes, accessUserName)?.value,
            )
        override val cls = DocumentAccess::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val accessOauthToken = OctetsType.Set("access-oauth-token")
        @JvmField val accessOauthUri = UriType("access-oauth-uri")
        @JvmField val accessPassword = TextType("access-password")
        @JvmField val accessPin = TextType("access-pin")
        @JvmField val accessUserName = TextType("access-user-name")
    }
    override fun toString() = "DocumentAccess(${attributes.joinToString()})"
}
