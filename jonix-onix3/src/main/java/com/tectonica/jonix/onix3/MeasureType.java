/*
 * Copyright (C) 2012-2023 Zach Melamed
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

import com.tectonica.jonix.common.JPU;
import com.tectonica.jonix.common.OnixElement;
import com.tectonica.jonix.common.codelist.MeasureTypes;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;

import java.io.Serializable;
import java.util.function.Consumer;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Measure type code</h1>
 * <p>
 * An ONIX code indicating the dimension which is specified by an occurrence of the measure composite. Mandatory in each
 * occurrence of the &lt;Measure&gt; composite, and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed length, two digits</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 48</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;MeasureType&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;x315&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;x315&gt;01&lt;/x315&gt;</tt> (Height)</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link Measure}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Measure} ⯈ {@link MeasureType}</li>
 * <li>{@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link ProductPart} ⯈ {@link Measure} ⯈ {@link MeasureType}</li>
 * <li>{@link Product} ⯈ {@link ProductionDetail} ⯈ {@link ProductionManifest} ⯈ {@link SupplementManifest} ⯈
 * {@link Measure} ⯈ {@link MeasureType}</li>
 * </ul>
 */
public class MeasureType implements OnixElement<MeasureTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "MeasureType";
    public static final String shortname = "x315";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    public RecordSourceTypes sourcetype;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public MeasureTypes value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public MeasureTypes __v() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final MeasureType EMPTY = new MeasureType();

    public MeasureType() {
        exists = false;
    }

    public MeasureType(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcename = JPU.getAttribute(element, "sourcename");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));

        value = MeasureTypes.byCode(JPU.getContentAsString(element));
    }

    /**
     * @return whether this tag (&lt;MeasureType&gt; or &lt;x315&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    public void ifExists(Consumer<MeasureType> action) {
        if (exists) {
            action.accept(this);
        }
    }
}
