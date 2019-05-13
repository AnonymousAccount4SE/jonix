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

package com.tectonica.jonix.onix2;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.Countrys;
import com.tectonica.jonix.codelist.Languages;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Supply-to country excluded</h1><p>One or more ISO standard codes identifying a country which is excluded from a
 * territory specified in &lt;SupplyToTerritory&gt;. Successive codes may be separated by spaces. Thus, a single
 * occurrence of the element can carry an unlimited number of country codes. For upwards compatibility, the element
 * remains repeatable, so that multiple countries can be listed as multiple occurrences of the whole element. Optional
 * and repeatable.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>One or more fixed-length codes, each with
 * two upper case letters, successive codes being separated by spaces. Suggested maximum length 300 characters. [Note
 * that ISO 3166-1 specifies that country codes shall be sent as upper case only.]</td></tr><tr><td>Codelist</td><td>ISO
 * 3166-1 two-letter country codes - List 91</td></tr><tr><td>Reference name</td><td>&lt;SupplyToCountryExcluded&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;j140&gt;</td></tr><tr><td>Example</td><td>&lt;SupplyToCountryExcluded&gt;US
 * CA&lt;/SupplyToCountryExcluded&gt;</td></tr></table>
 */
public class SupplyToCountryExcluded implements OnixElement<java.util.Set<Countrys>>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "SupplyToCountryExcluded";
    public static final String shortname = "j140";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    public TextFormats textformat;

    public TextCaseFlags textcase;

    public Languages language;

    public TransliterationSchemes transliteration;

    /**
     * (type: DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public java.util.Set<Countrys> value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public java.util.Set<Countrys> _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final SupplyToCountryExcluded EMPTY = new SupplyToCountryExcluded();

    public SupplyToCountryExcluded() {
        exists = false;
    }

    public SupplyToCountryExcluded(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = Languages.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = new java.util.HashSet<>();
        for (String split : JPU.getContentAsString(element).trim().split(" +")) {
            value.add(Countrys.byCode(split));
        }
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
