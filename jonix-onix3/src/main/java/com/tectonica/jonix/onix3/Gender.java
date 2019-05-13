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
import com.tectonica.jonix.codelist.Genders;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Contributor gender</h1><p>An optional ONIX code specifying the gender of a personal contributor. Not repeatable.
 * Note that this indicates the gender of the contributor’s public identity (which may be pseudonymous) based on
 * designations used in ISO 5218, rather than the gender identity, biological sex or sexuality of a natural
 * person.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Fixed length, single
 * character</td></tr><tr><td>Codelist</td><td>List 229</td></tr><tr><td>Reference
 * name</td><td>&lt;Gender&gt;</td></tr><tr><td>Short tag</td><td>&lt;x524&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Example</td><td>&lt;x524&gt;f&lt;/x524&gt;
 * (public identity is female)</td></tr></table>
 */
public class Gender implements OnixElement<Genders>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "Gender";
    public static final String shortname = "x524";

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

    public Genders value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public Genders _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final Gender EMPTY = new Gender();

    public Gender() {
        exists = false;
    }

    public Gender(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = Genders.byCode(JPU.getContentAsString(element));
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
