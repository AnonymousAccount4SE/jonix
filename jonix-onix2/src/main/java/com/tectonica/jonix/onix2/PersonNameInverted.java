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
import com.tectonica.jonix.common.codelist.TextCaseFlags;
import com.tectonica.jonix.common.codelist.TextFormats;
import com.tectonica.jonix.common.codelist.TransliterationSchemes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Person name, inverted</h1>
 * <p>
 * The name of a person who contributed to the creation of the product, presented in inverted order, with the element
 * used for alphabetical sorting placed first. Optional and non-repeating: see Group&nbsp;PR.8 introductory text for
 * valid options.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable-length text, suggested maximum length 100 characters</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;PersonNameInverted&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;b037&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;b037&gt;Johnson, James J., III&lt;/b037&gt;</tt></td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link Name}&gt;</li>
 * <li>&lt;{@link Contributor}&gt;</li>
 * <li>&lt;{@link PersonAsSubject}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link Contributor} ⯈ {@link Name} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentItem} ⯈ {@link Contributor} ⯈ {@link Name} ⯈
 * {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link SubSeriesRecord} ⯈ {@link Contributor} ⯈ {@link Name} ⯈
 * {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link MainSeriesRecord} ⯈ {@link Contributor} ⯈ {@link Name} ⯈
 * {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link Series} ⯈ {@link Contributor} ⯈ {@link Name} ⯈
 * {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PersonAsSubject} ⯈ {@link Name} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentItem} ⯈ {@link PersonAsSubject} ⯈ {@link Name} ⯈
 * {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link Contributor} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentItem} ⯈ {@link Contributor} ⯈
 * {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link SubSeriesRecord} ⯈ {@link Contributor} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link MainSeriesRecord} ⯈ {@link Contributor} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link Series} ⯈ {@link Contributor} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link PersonAsSubject} ⯈ {@link PersonNameInverted}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContentItem} ⯈ {@link PersonAsSubject} ⯈
 * {@link PersonNameInverted}</li>
 * </ul>
 */
public class PersonNameInverted implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "PersonNameInverted";
    public static final String shortname = "b037";

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

    /**
     * Raw Format: Variable-length text, suggested maximum length 100 characters
     * <p>
     * (type: NonEmptyString)
     */
    public String value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final PersonNameInverted EMPTY = new PersonNameInverted();

    public PersonNameInverted() {
        exists = false;
    }

    public PersonNameInverted(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = Languages.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = JPU.getContentAsString(element);
    }

    /**
     * @return whether this tag (&lt;PersonNameInverted&gt; or &lt;b037&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
