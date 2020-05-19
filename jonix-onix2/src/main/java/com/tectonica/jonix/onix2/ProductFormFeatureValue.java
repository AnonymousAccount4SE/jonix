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
 * <h1>Product form feature value</h1>
 * <p>
 * A controlled value that describes a product form feature. Presence or absence of this element depends on the
 * &lt;ProductFormFeatureType&gt;, since some product form features (<em>eg</em> thumb index) do not require an
 * accompanying value, while others (<em>eg</em> text font) require free text in &lt;ProductFormFeatureDescription&gt;.
 * Non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Dependent on the scheme specified in &lt;ProductFormFeatureType&gt;</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>Dependent on the scheme specified in &lt;ProductFormFeatureType&gt;</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>For binding color, see List 98</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>For page edge color, see List 98</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>For text font, use free text in &lt;ProductFormFeatureDescription&gt;, which may include font name and/or
 * size</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>For special cover material, see List 99</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>For DVD region codes, see List 76</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>Further features with corresponding code lists may be added from time to time without a re-issue of this
 * document: see the latest release of Code List 79.</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;ProductFormFeatureValue&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;b335&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;b335&gt;BLK&lt;/b335&gt;</tt> Black (binding color)</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link ProductFormFeature}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ProductFormFeature} ⯈ {@link ProductFormFeatureValue}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link ContainedItem} ⯈ {@link ProductFormFeature} ⯈
 * {@link ProductFormFeatureValue}</li>
 * <li>{@link ONIXMessage} ⯈ {@link Product} ⯈ {@link RelatedProduct} ⯈ {@link ProductFormFeature} ⯈
 * {@link ProductFormFeatureValue}</li>
 * </ul>
 *
 * @since Onix-2.1
 */
public class ProductFormFeatureValue implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "ProductFormFeatureValue";
    public static final String shortname = "b335";

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
     * This is the raw content of ProductFormFeatureValue. Could be null if {@code exists() == false}. Use
     * {@link #value()} instead if you want to get this as an {@link java.util.Optional}.
     * <p>
     * Raw Format: Dependent on the scheme specified in &lt;ProductFormFeatureType&gt;
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
    public static final ProductFormFeatureValue EMPTY = new ProductFormFeatureValue();

    public ProductFormFeatureValue() {
        exists = false;
    }

    public ProductFormFeatureValue(org.w3c.dom.Element element) {
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
     * @return whether this tag (&lt;ProductFormFeatureValue&gt; or &lt;b335&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
