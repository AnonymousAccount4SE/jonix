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

import com.tectonica.jonix.common.JPU;
import com.tectonica.jonix.common.OnixElement;
import com.tectonica.jonix.common.codelist.Languages;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;
import com.tectonica.jonix.common.codelist.SubjectSchemeIdentifiers;
import com.tectonica.jonix.common.codelist.TextCaseFlags;
import com.tectonica.jonix.common.codelist.TextFormats;
import com.tectonica.jonix.common.codelist.TransliterationSchemes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Subject scheme identifier</h1>
 * <p>
 * An ONIX code which identifies the subject scheme which is used in an occurrence of the &lt;Subject&gt; composite.
 * Mandatory in each occurrence of the composite, and non-repeating.
 * </p>
 * <p>
 * When the scheme listed in the code list display is annotated “Code”, use the associated &lt;SubjectCode&gt; element
 * to carry the value (if so required, the &lt;SubjectHeadingText&gt; element can be used simultaneously to carry the
 * text equivalent of the code). When the scheme is annotated “Text”, use the &lt;SubjectHeadingText&gt; element to
 * carry the text of the subject heading.
 * </p>
 * <p>
 * Scheme code 23 may be used for a publisher’s own subject category code, by agreement with trading partners to whom
 * product information is sent. Scheme code 24, with a name in the &lt;SubjectSchemeName&gt; element, may be used to
 * identify a proprietary scheme, <em>eg</em> one used by a bibliographic agency or wholesaler.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed-length, two numeric digits.</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 27</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;SubjectSchemeIdentifier&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;b067&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;b067&gt;03&lt;/b067&gt;</tt> LC classification</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link Subject}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link Subject} ⯈ {@link SubjectSchemeIdentifier}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentItem} ⯈ {@link Subject} ⯈
 * {@link SubjectSchemeIdentifier}</li>
 * </ul>
 */
public class SubjectSchemeIdentifier implements OnixElement<SubjectSchemeIdentifiers>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "SubjectSchemeIdentifier";
    public static final String shortname = "b067";

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

    public SubjectSchemeIdentifiers value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public SubjectSchemeIdentifiers _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final SubjectSchemeIdentifier EMPTY = new SubjectSchemeIdentifier();

    public SubjectSchemeIdentifier() {
        exists = false;
    }

    public SubjectSchemeIdentifier(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = Languages.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = SubjectSchemeIdentifiers.byCode(JPU.getContentAsString(element));
    }

    /**
     * @return whether this tag (&lt;SubjectSchemeIdentifier&gt; or &lt;b067&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
