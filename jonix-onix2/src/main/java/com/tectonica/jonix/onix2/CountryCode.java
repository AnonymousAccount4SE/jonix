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
import com.tectonica.jonix.codelist.CountryCodes;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Country code</h1><p>A code identifying a country in which the price given in &lt;PriceAmount&gt; applies. This
 * allows a supplier to list different prices for specific countries by repeating the &lt;Price&gt; composite rather
 * than having to repeat the whole of the &lt;SupplyDetail&gt; composite. Optional, and repeatable if a single price
 * applies to multiple countries.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Fixed-length, two letters.
 * [Note that ISO 3166-1 specifies that country codes shall be sent as upper case only.]</td></tr><tr><td>Codelist</td><td>ISO
 * 3166-1 two-letter country codes - List 91</td></tr><tr><td>Reference name</td><td>&lt;CountryCode&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;b251&gt;</td></tr><tr><td>Example</td><td>&lt;b251&gt;GB&lt;/b251&gt;</td></tr></table>
 */
public class CountryCode implements OnixElement<CountryCodes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "CountryCode";
    public static final String shortname = "b251";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    public TextFormats textformat;

    public TextCaseFlags textcase;

    public LanguageCodes language;

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

    public CountryCodes value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public CountryCodes _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final CountryCode EMPTY = new CountryCode();

    public CountryCode() {
        exists = false;
    }

    public CountryCode(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = CountryCodes.byCode(JPU.getContentAsString(element));
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
