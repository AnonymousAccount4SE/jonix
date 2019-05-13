/*
 * Copyright (C) 2012 Zach Melamed
 *
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.onix3;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Collection sequence number</h1><p>A number which specifies the ordinal position of the product in a collection.
 * The ordinal position may be a simple number (1st, 2nd, 3rd <i>etc</i>) or may be multi-level (<i>eg</i> 3.2) if the
 * collection has a multi-level structure (<i>ie</i> there are both collection and sub-collection title elements).
 * Mandatory and non-repeating within the &lt;CollectionSequence&gt; composite.</p><p><span style="color: deeppink;
 * font-weight: bold">New in 3.0.4</span> A hyphen may be used in place of an integer within a multi-level number, where
 * a particular level of the hierarchy is unnumbered, for example -.3 where a product is the third in a sub-collection,
 * and the sub-collection is unnumbered within the collection.</p><table border='1'
 * cellpadding='3'><tr><td>Format</td><td>Variable length string of one or more positive integers or hyphens, each
 * successive integer or hyphen being separated by a period character, suggested maximum length 50
 * characters</td></tr><tr><td>Reference name</td><td>&lt;CollectionSequenceNumber&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;x481&gt;</td></tr><tr><td>Cardinality</td><td>1</td></tr><tr><td>Example</td><td>&lt;CollectionSequenceNumber&gt;2.4&lt;/CollectionSequenceNumber&gt;</td></tr></table>
 */
public class CollectionSequenceNumber implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "CollectionSequenceNumber";
    public static final String shortname = "x481";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: Variable length string of one or more positive integers or hyphens, each successive integer or hyphen
     * being separated by a period character, suggested maximum length 50 characters<p> (type:
     * dt.MultiLevelNumberOrHyphen)
     */
    public String value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final CollectionSequenceNumber EMPTY = new CollectionSequenceNumber();

    public CollectionSequenceNumber() {
        exists = false;
    }

    public CollectionSequenceNumber(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = JPU.getContentAsString(element);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
